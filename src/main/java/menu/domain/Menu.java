package menu.domain;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Menu {
    JAPANESE(1,
            List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼")),
    KOREAN(2,
            List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음")),
    CHINESE(3,
            List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채")),
    ASIAN(4,
            List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜")),
    WESTERN(5,
            List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"));

    private static final List<String> ALL_MENU = Stream.of(JAPANESE.categoryMenus, KOREAN.categoryMenus,
                    CHINESE.categoryMenus, ASIAN.categoryMenus, WESTERN.categoryMenus)
            .flatMap(Collection::stream)
            .collect(Collectors.toUnmodifiableList());
    private final int categoryNumber;
    private final List<String> categoryMenus;

    Menu(int categoryNumber, List<String> categoryMenus) {
        this.categoryNumber = categoryNumber;
        this.categoryMenus = categoryMenus;
    }

    public static boolean isExistMenu(String menu) {
        return ALL_MENU.contains(menu);
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public List<String> getCategoryMenus() {
        return categoryMenus;
    }
}
