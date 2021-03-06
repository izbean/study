### 코틀린에서 다양한 함수를 다루는 방법
1. 확장함수
2. infix 함수
3. inline 함수
4. 지역 함수
---
- 확장함수
  - 확장 함수는 원본 클래스의 private, protected 멤버 접근이 안된다
  - 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
  - 확장 함수는 현재 타입을 기준으로 호출된다.
  - 확장 함수는 확장 프로퍼티로도 생각 할 수 있다.
---
- Java 코드가 있는 상황에서, Kotlin 코드로 추가 기능을 개발하기 위해 확장함수와 확장프로퍼티가 등장했다.
- 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다
- 멤버함수, 확장함수 중 멤버 함수에 우선권이 있다
- 확장 함수는 현재 타입을 기준으로 호출된다
- Java 에서는 Static 함수를 사용하는것처럼 Kotlin 확장 함수를 사용 할 수 있다.
- 함수 호출 방식을 바꿔주는 infix 함수가 존재한다
- 함수를 복사-붙여넣기 하는 inline 함수가 존재한다
- Kotlin 에서는 함수 안에 함수를 선언 할 수 있고 지역함수라고 부른다.