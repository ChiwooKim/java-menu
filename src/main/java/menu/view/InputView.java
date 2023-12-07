package menu.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import menu.util.CoachValidator;
import menu.util.MenuValidator;

public class InputView {

    private static final String DELIMITER = ",";

    public List<String> readCoach() {
        CoachValidator coachValidator = new CoachValidator();
        while (true) {
            try {
                String input = input();
                coachValidator.validate(input);
                return Arrays.asList(input.split(DELIMITER));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<String> readMenuNotEaten() {
        MenuValidator menuValidator = new MenuValidator();
        while (true) {
            try {
                String input = input();
                menuValidator.validate(input);
                return Arrays.asList(input.split(DELIMITER));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String input() {
        return Console.readLine();
    }
}
