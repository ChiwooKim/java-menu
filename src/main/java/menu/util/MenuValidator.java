package menu.util;

import java.util.Arrays;
import java.util.List;
import menu.domain.Menu;
import menu.exception.ErrorMessage;

public class MenuValidator extends Validator {

    private static final String DELIMITER = ",";
    private static final int MAX_SIZE = 2;

    @Override
    public void validate(String input) {
        List<String> menus = Arrays.asList(input.split(DELIMITER));
        validateInvalidMenu(menus);
        validateSize(menus);
    }

    private void validateInvalidMenu(List<String> menus) {
        for (String menu : menus) {
            if (!Menu.isExistMenu(menu)) {
                throw ErrorMessage.INVALID_MENU_NAME.makeException();
            }
        }
    }

    private void validateSize(List<String> menus) {
        if (menus.size() > MAX_SIZE) {
            throw ErrorMessage.INVALID_MENU_NUMBER.makeException();
        }
    }
}
