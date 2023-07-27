# JAVA8 in Action



## 용어정리

- CPT2
  - 동작 파라미터화(behavior parameterization)
  - DRY(don't repeat yourself), 같은 것을 반복하지 말 것
  - 프레디케이트(predicate), 찬반형
  - 익명 클래스(anonymous class)
  - 지역 클래스(local class)
  - 코드전달기법
  - 함수형 인터페이스(@FunctionalInterface)
  - 디폴트 메서드란 인터페이스의 메서드를 구현하지 않은 클래스를 고려해서 기본 귷녀을 제공하는 바디를 포함하는 메서드
  - 많은 디폴트 메서드가 있더라도 추상 메서드가 오직 하나면 함수형 인터페이스이다.
- CPT3
  - 람다는 파라미터 리스트, 화살표, 람다의 바디로 구분 (ex (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());)
  - 람다 문법상 중괄호를 사용할 경우, 구문(statement)는 중괄호 내에 존재할 수 없고 표현식(expression)은 중괄호 안에 return 과 함께 존재하여야 한다.
  - 함수형 인터페이스의 추상 메서드 시그니처(signature)는 람다 표현식의 시그너처를 가르킨다.
  - 람다 표현식의 시그너처를 서술하는 메서드를 함수 디스크립터(function descriptor)라고 부른다.
  - Runnable 인터페이스의 유일한 추상메서드 run()은 인수와 반환값이 없으므로 Runnable 인터페이스는 인수와 반환값이 없는 시그너처로 생각할 수 있다.
  - 자바8은 java.util.function 패키지로 여러 가지 새로운 함수형 인터페이스를 제공한다.
  - Predicate<T> 인터페이스는 boolean test(T t)라는 추상 메서드를 정의한다.
  - Consumer<T> 인터페이스는 void accept(T t)라는 추상 메서드를 정의한다. (ex T 형식의 객체를 인수로 받아서 어떤 동작을 수행하고 싶을 때)
  - Function<T, R> 인터페이스는 R apply(T t)라는 추상 메서드를 정의한다. (ex T 형식의 객체를 인수로 받아서 R 객체로 변환하고 싶을 때)
  - 참조형(reference type)(ex Byte, Integer, Object, List)
  - 기본형(primitive type)(ex int, double, byte, char)
  - 기본형을 참조형으로 변환하는 기능은 박싱(boxing)
  - 참조형을 기본형으로 변환하는 기능은 언박싱(unboxing)
  - 박싱과 언박싱이 자동으로 이루어지는 기능은 오토박싱(autoboxing)

