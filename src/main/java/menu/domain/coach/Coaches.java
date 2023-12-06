package menu.domain.coach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import menu.domain.Menu;

public class Coaches {

    private final List<Coach> info;
    private final List<String> categories;

    public Coaches() {
        this.info = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public void addCoach(Coach coach) {
        info.add(coach);
    }

    public void pickMenu(Menu category) {
        categories.add(category.getCategoryName());
        for (Coach coach : info) {
            coach.selectMenu(category);
        }
    }

    public List<Coach> getInfo() {
        return info;
    }

    public List<String> getCategories() {
        return Collections.unmodifiableList(categories);
    }
}
