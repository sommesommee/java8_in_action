package pe.inuk.book.jaction.ctp1.data.common.predicate;

@FunctionalInterface //컴파일러가 해당 인터페이스가 실제로 함수형 인터페이스임을 확인하고, 추상 메서드의 개수를 체크하여 오류를 발생
public interface Predicate<T> {
    public boolean test(T t);
}
