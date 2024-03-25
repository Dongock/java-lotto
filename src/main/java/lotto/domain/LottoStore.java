package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lotto.domain.LottoNumber.*;

public class LottoStore {

    private static final Integer PRICE = 1000;

    private final List<Integer> lottoNumberPool;

    public LottoStore() {
        this.lottoNumberPool = IntStream.rangeClosed(START_INCLUSIVE, END_INCLUSIVE)
                .boxed()
                .collect(Collectors.toList());
    }

    public PickedLottoNumbers buy(Money money, LottoGenerateStrategy lottoPickStrategy) {
        List<LottoNumbers> pickedLottoNumbers = IntStream.generate(() -> 0) // 무한 스트림 생성
                .mapToObj(i -> lottoPickStrategy.generateLottoNumbers(this.lottoNumberPool)) // generateLottoNumbers() 메소드를 이용해 로또 번호 생성
                .limit(money.getMoney() / PRICE) // money를 PRICE로 나눈 값만큼 번호를 생성하여 제한
                .collect(Collectors.toList()); // 생성된 번호들을 리스트로 변환

        return new PickedLottoNumbers(pickedLottoNumbers);
    }
}