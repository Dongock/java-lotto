package study.step2.domain;

import java.util.List;
import java.util.stream.Collectors;

import static study.step2.domain.Lotto.validateNumbers;

public class WinningNumbers {

    private final List<LottoNumber> winningNumbers;

    public WinningNumbers(List<Integer> numbers) {
        validateNumbers(numbers);
        this.winningNumbers = numbers.stream()
            .map(LottoNumber::new)
            .collect(Collectors.toList());
    }

    public List<Integer> toIntegers() {
        return winningNumbers.stream()
            .map(LottoNumber::lottoNumber)
            .collect(Collectors.toList());
    }

}