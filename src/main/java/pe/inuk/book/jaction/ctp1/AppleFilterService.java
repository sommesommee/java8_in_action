package pe.inuk.book.jaction.ctp1;

import pe.inuk.book.jaction.ctp1.data.apple.Apple;
import pe.inuk.book.jaction.ctp1.data.apple.formatter.AppleFormatter;
import pe.inuk.book.jaction.ctp1.data.apple.predicate.ApplePredicate;
import pe.inuk.book.jaction.ctp1.data.common.predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class AppleFilterService {

    //첫 번째 시도 : 녹색 사과 필터링
    //다양한 색의 필터링이 불가
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    //두 번째 시도 : 다양한 색의 필터링
    //다른 조건의 필터링이 불가
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(color.equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    //세 번째 시도 : 모든 속성의 필터링
    //가독성이 떨어지고 확장성이 없음
    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            if (flag && color.equals(apple.getColor())
                    || !flag && apple.getWeight() > weight) {
                result.add(apple);
            }
        }

        return result;
    }

    //네 번째 시도 : 추상적 조건을 활용한 프레디케이트 인터페이스 필터링
    //filterApples 메서드의 동작 파라미터화
    //여러 클래스를 정의하고 인스턴스화 해야하는 번거로운 작업이 발생
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

    //퀴즈 2-1
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter f){
        for(Apple apple : inventory){
            String output = f.accept(apple);
            System.out.println(output);
        }
    }

    //다섯 번째 시도 : 익명 클래스를 사용한 프레디케이트 구현
    //코드가 장황하고 익숙하지 못함
    public static List<Apple> filterApplesByColorWithAnonymousClass(List<Apple> inventory){
        List<Apple> result = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });

        return result;
    }

    //여섯 번째 시도 : 람다를 사용한 구현
    public static List<Apple> filterApplesByColorWithLambda(List<Apple> inventory){

        List<Apple> result = filterApples(inventory, (Apple apple) -> {
            return "green".equals(apple.getColor());
        });

        return result;

    }

    //일곱 번째 시도 : 리스트 형식으로 추상화
    //다양한 필터링이 작동하도록 형식 파라미터 T 를 사용한 리스트 필터 작성
    public static <T> List<T> listFilter(List<T> list, Predicate<T> p){

        List<T> result = new ArrayList<>();

        for(T t : list){
            if(p.test(t)){
                result.add(t);
            }
        }

        return result;
    }
    public static List<Apple> filterWithLambda(List<Apple> list){

        List<Apple> result = listFilter(list, (Apple apple) -> {
            return "green".equals(apple.getColor());
        });

        return result;

    }

}
