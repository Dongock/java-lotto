package lotto.view;

import lotto.domain.LottoNumber;
import lotto.domain.Money;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String SEPARATOR = ", ";

    Scanner scanner = new Scanner(System.in);

    public Money inputMoney() {
        return new Money(scanner.nextLine());
    }

    public LottoNumber inputLottoNumber() {
        return new LottoNumber(Arrays.asList(scanner.nextLine().split(SEPARATOR)).stream().map(Integer::parseInt).collect(Collectors.toList()));
    }
}
