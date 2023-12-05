package menu.exception;

public enum ErrorMessage {
    INVALID_COACH("코치 이름은 2글자 이상 4글자 이하 입니다. 다시 입력해 주세요."),
    INVALID_COACH_NUMBER("코치 수는 2명 이상 5명 이하 입니다. 다시 입력해 주세요."),
    INVALID_MENU_NAME("유효하지 않은 메뉴 입니다. 다시 입력해 주세요."),
    INVALID_MENU_NUMBER("못먹는 메뉴는 최대 3개 입니다. 다시 입력해 주세요.");

    private static final String ERROR_MESSAGE = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_MESSAGE + message;
    }

    public IllegalArgumentException makeException() {
        return new IllegalArgumentException(this.getMessage());
    }
}
