# 계산기
## 기능 요구사항
- [x] 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- [x] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
- [x] 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
- [x] 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- [x] 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

### 기능 상세분리
- [x] null과 빈공백이 들어왔을 때, IllegalArgumentException Throw 한다.
- [x] 빈 공백을 기준으로 split 처리
- [x] 사칙연산 기능 구현
- [x] 사칙연산이 들어오지 않을 때, IllegalArgumentException Throw 한다.
- [x] 숫자가 아니면, IllegalArgumentException Throw 한다.


# 로또(2단계)
## 프로그래밍 요구사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.

### 상세 요구사항
- [x] 인풋값을 숫자로 받아야된다.
- [x] 인풋값을 1000원으로 나누어서 몇 장의 로또를 살지 구해야된다.
- [x] 로또의 장수만큼 로또를 만들어야 된다.
  - [x] 1에서 45사이의 랜덤 숫자를 뽑는 객체가 필요하다.
- [x] 당첨번호를 받는다.
- [x] 당첨번호와 로또를 비교하여 같은 숫자의 개수를 구해야한다.
- [x] 같은 숫자의 개수로 등수를 나누어야 된다.
- [x] 등수별로 당첨금을 매겨서 낸돈의 수익률을 구한다.



# 로또(3단계)
## 프로그래밍 요구사항
- [x] 2등을 위해 추가 번호를 하나 더 추첨한다.
- [x] 당첨 통계에 2등도 추가해야 한다.

### 상세 요구사항
- [x] Rank는 Enum으로 만들어서 사용한다.
- [x] 당첨 번호와 보너스 번호를 별개로 만들어준다.
- [x] 당첨 번호를 먼저 처리 후 보너스 번호와 맞는 지 여부를 확인한다.
- [x] 일급 콜렉션을 활용하여 만든다.
- [x] 2등일 때와 3등일때 처리를 다르게 해준다.


# 로또(4단계)
## 프로그래밍 요구사항
- [x] 로또를 수동으로 생성할 수 있다.
- [x] 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야한다.
- [x] 일급컬렉션을 이용한다.
