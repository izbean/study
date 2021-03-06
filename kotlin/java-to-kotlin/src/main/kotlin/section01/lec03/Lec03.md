- Any
  - Java 의 Object 역할 (모든 객체의 최상위 타입)
  - 모든 Primitive Type 의 최상위 타입도 Any 이다.
  - Any 자체로는 null 을 포함 할 수 없어 null 을 포함하고 싶다면 Any? 로 표현.
  - Any 에 equals / hashCode / toString 존재
- Unit
  - Java 의 void 역할
  - void 와 다르게 Unit 은 그 자체로 타입 인자로 사용 가능하다.
  - 함수형 프로그래밍에서 Unit 은 단 하나의 인스턴스만 갖는 타입을 의미. 코틀린은 실제 존재하는 타입
- Nothing
  - Nothing 은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
  - 무조건 예외를 반환하는 함수 / 무한 루프 함수

---

- 코틀린의 변수는 초기값을 보고 타입을 추론하며, 기본 타입들 간의 변환은 명시적으로 이루어진다.
- 코틀린에서는 is, !is, as, as? 를 이용해 타입을 확인하고 캐스팅한다.
- 코틀린의 Any 는 Java 의 Object 와 같은 최상위 타입이다.
- 코틀린의 Unit 은 자바의 void 와 동일하다.
- 문자열을 가공할때 ${변수}, """내용""" 를 사용하면 깔끔한 코딩이 가능하다.
- 문자열에서 문자를 가져올때에 Java 의 배열처럼 [] 를 사용한다.
