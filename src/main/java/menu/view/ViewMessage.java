package menu.view;

public enum ViewMessage {
    START_MESSAGE("점심 메뉴 추천을 시작합니다."),
    INPUT_COACH_MESSAGE("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_MENU_MESSAGE("%s(이)가 못 먹는 메뉴를 입력해 주세요.%n"),
    RESULT_MESSAGE("메뉴 추천 결과입니다."),
    BRACKETS("[ %s ]%n"),
    DIVISION("구분"),
    CATEGORY("카테고리"),
    FORM(" | "),
    FINISH("추천을 완료했습니다.");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
