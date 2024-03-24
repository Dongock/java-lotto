package lotto.view;

import lotto.domain.*;

import java.util.Arrays;
import java.util.StringJoiner;

public class ResultView {


    public static final String DELIMITER = ", ";

    public void printMoney() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printWinningLotto() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
    }

    public void printWinningStatic(WinningInfo winningInfo, Money money) {
        System.out.println("당첨 통계");
        System.out.println("----------");

        Rank[] ranks = Rank.values();

        Arrays.stream(ranks)
                .filter(rank -> rank != Rank.NOT_MATCH)
                .forEach(rank -> printWinningCount(winningInfo, rank));

        System.out.println("총 수익률은 " + money.calculateRate(winningInfo.totalWinningMoney())+"입니다.");
    }

    private void printWinningCount(WinningInfo winningInfo, Rank rank) {
        System.out.printf("%d개 일치 (%d원)-%d개%n", rank.getMatchCount(), rank.getWinningMoney(), winningInfo.count(rank));
    }

    public void printPickedLottoNumbers(PickedLottoNumbers pickedLottoNumbers) {
        for (LottoNumbers lottoNumbers : pickedLottoNumbers) {
            System.out.print("[");
            printLottoNumbers(lottoNumbers);
            System.out.println("]");
        }
    }

    private void printLottoNumbers(LottoNumbers lottoNumbers) {
        StringJoiner stringJoiner = new StringJoiner(DELIMITER);
        for (LottoNumber lottoNumber : lottoNumbers) {
            stringJoiner.add(String.valueOf(lottoNumber.getNumber()));
        }
        System.out.print(stringJoiner);
    }
}
