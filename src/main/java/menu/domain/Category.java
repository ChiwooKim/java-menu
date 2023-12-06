package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

public class Category {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 5;
    private static final int PICK_LIMIT = 2;
    private final EnumMap<Menu, Integer> checkCategory;

    public Category() {
        this.checkCategory = new EnumMap<>(Menu.class);
    }

    public Menu selectCategory() {
        while (true) {
            Menu category = pickCategory();
            if (!checkCategory.containsKey(category)) {
                checkCategory.put(category, 1);
                return category;
            }
            if (checkCategory.get(category) < PICK_LIMIT) {
                checkCategory.put(category, checkCategory.get(category) + 1);
                return category;
            }
        }
    }

    private Menu pickCategory() {
        int number = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
        return Arrays.stream(Menu.values())
                .filter(menu -> menu.getCategoryNumber() == number)
                .findAny().get();
    }
}
