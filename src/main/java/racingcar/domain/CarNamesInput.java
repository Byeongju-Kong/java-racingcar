package racingcar.domain;

import racingcar.exception.CarNameDuplicateException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarNamesInput {
    private static final String DELIMITER = ",";

    private List<String> carNames;

    private CarNamesInput(String input) {
        carNames = Arrays.asList(input.split(DELIMITER));
        validateCarNameDuplicate();
    }

    public static CarNamesInput valueOf(String input) {
        return new CarNamesInput(input);
    }

    public List<String> getCarNames() {
        return Collections.unmodifiableList(carNames);
    }

    private void validateCarNameDuplicate() {
        if (carNames.stream().distinct().count() != carNames.size()) {
            throw new CarNameDuplicateException();
        }
    }
}