package menu.service;

import menu.domain.Category;
import menu.domain.Coaches;
import menu.domain.Day;
import menu.domain.Menu;

public class MenuService {

    public Coaches getResult(Coaches coaches) {
        Category category = new Category();
        for (int i = 0; i < Day.values().length; i++) {
            Menu categoryName = category.selectCategory();
            coaches.pickMenu(categoryName);
        }
        return coaches;
    }
}
