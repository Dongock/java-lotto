package controller;

import model.Calculation;
import model.NumberSentence;
import model.Validator;
import view.InputView;
import view.ResultView;

public class Calculator {
    private static final String SEPARATOR = " ";

    private final InputView inputView;
    private final ResultView resultView;
    private final Validator validator;

    public Calculator(InputView inputView, ResultView resultView, Validator validator) {
        this.inputView = inputView;
        this.resultView = resultView;
        this.validator = validator;
    }

    public void start() {
        resultView.printInputNumberSentence();

        String inputNumberSentence = inputView.inputNumberSentence();
        validator.nullCheck(inputNumberSentence);

        String[] numberSentences = inputNumberSentence.split(SEPARATOR);

        validator.validate(numberSentences);

        NumberSentence numberSentence = new NumberSentence(numberSentences);

        int resultNumber = Calculation.calculate(numberSentence);

        resultView.printResultNumber(resultNumber);
    }
}
