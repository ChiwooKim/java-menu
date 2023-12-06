package menu.view;

import static menu.view.ViewMessage.*;

import menu.domain.coach.Coach;
import menu.domain.coach.Coaches;
import menu.domain.Day;

public class OutputView {

    public void printStartMessage() {
        System.out.println(START_MESSAGE.getMessage());
    }

    public void printReadCoach() {
        System.out.println(INPUT_COACH_MESSAGE.getMessage());
    }

    public void printReadMenuNotEaten(String name) {
        System.out.printf(INPUT_MENU_MESSAGE.getMessage(), name);
    }

    public void printResult(Coaches result) {
        System.out.println(RESULT_MESSAGE.getMessage());
        printDay();
        printCategory(result);
        printMenus(result);
        System.out.println(FINISH.getMessage());
    }
    
    private void printDay() {
        StringBuilder message = new StringBuilder(DIVISION.getMessage());
        for (Day value : Day.values()) {
            message.append(FORM.getMessage());
            message.append(value.getName());
        }
        System.out.printf(BRACKETS.getMessage(), message);
    }

    private void printCategory(Coaches result) {
        StringBuilder message = new StringBuilder(CATEGORY.getMessage());
        for (String category : result.getCategories()) {
            message.append(FORM.getMessage());
            message.append(category);
        }
        System.out.printf(BRACKETS.getMessage(), message);
    }
    
    private void printMenus(Coaches result) {
        for (Coach coach : result.getInfo()) {
            StringBuilder message = new StringBuilder(coach.getName());
            coach.getMenus().forEach(menu ->
                    message.append(FORM.getMessage()).append(menu));
            System.out.printf(BRACKETS.getMessage(), message);
        }
    }
}
