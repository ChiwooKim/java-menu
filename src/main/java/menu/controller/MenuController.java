package menu.controller;

import java.util.List;
import menu.service.MenuService;
import menu.domain.Coach;
import menu.domain.Coaches;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final InputView inputView;
    private final OutputView outputView;
    private final MenuService menuService;

    public MenuController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.menuService = new MenuService();
    }

    public void choose() {
        List<String> coaches = getCoaches();
        Coaches coachesInfo = getInfo(coaches);
        Coaches result = menuService.getResult(coachesInfo);
        outputView.printResult(result);
    }

    private List<String> getCoaches() {
        outputView.printStartMessage();
        outputView.printReadCoach();
        return inputView.readCoach();
    }

    private Coaches getInfo(List<String> coaches) {
        Coaches coachesInfo = new Coaches();
        for (String name : coaches) {
            outputView.printReadMenuNotEaten(name);
            List<String> menus = inputView.readMenuNotEaten();
            Coach coach = Coach.of(name, menus);
            coachesInfo.addCoach(coach);
        }
        return coachesInfo;
    }
}
