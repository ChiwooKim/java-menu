package menu.util;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import menu.exception.ErrorMessage;

public class CoachValidator extends Validator {

    private static final int MIN_NUMBER = 2;
    private static final int MAX_NUMBER = 5;
    private static final String DELIMITER = ",";
    private static final Pattern COACH_NAME_PATTERN = Pattern.compile("^[a-zA-Z가-힣]{2,4}$");

    @Override
    public void validate(String input) {
        List<String> coaches = Arrays.asList(input.split(DELIMITER));
        validateName(coaches);
        validateLength(coaches);
    }

    private void validateName(List<String> coaches) {
        for (String coach : coaches) {
            if (!COACH_NAME_PATTERN.matcher(coach).matches()) {
                throw ErrorMessage.INVALID_COACH.makeException();
            }
        }
    }

    private void validateLength(List<String> coaches) {
        if (coaches.size() < MIN_NUMBER || MAX_NUMBER < coaches.size()) {
            throw ErrorMessage.
        }
    }
}
