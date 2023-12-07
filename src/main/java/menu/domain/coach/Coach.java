package menu.domain.coach;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import menu.domain.Menu;

public class Coach {

    private static final int PICK_NUMBER = 0;
    private final String name;
    private final List<String> menusNotEaten;
    private final List<String> menus;

    private Coach(String name, List<String> menusNotEaten) {
        this.name = name;
        this.menusNotEaten = menusNotEaten;
        this.menus = new ArrayList<>();
    }

    public static Coach of(String name, List<String> menusNotEaten) {
        return new Coach(name, menusNotEaten);
    }

    public void selectMenu(Menu category) {
        while (true) {
            String menu = Randoms.shuffle(category.getCategoryMenus()).get(PICK_NUMBER);
            if ((!menusNotEaten.contains(menu)) && (!menus.contains(menu))) {
                menus.add(menu);
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getMenus() {
        return Collections.unmodifiableList(menus);
    }
}
