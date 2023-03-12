# 문자열 덧셈 계산기

## 요구사항

1. 문자열 체크 : 빈 값 또는 공백 여부 체크.
2. 구분자 체크 : 기본 구분자인지, 커스텀 구분자인지 체크하여 구분자를 리턴.
3. 피연산자 파싱 : 구분자 체크에서 리턴된 구분자로 입력된 문자열 분리 후, 리스트로 리턴.
4. 계산 : 피연산자 리스트를 가지고 덧셈 계산.

## 객체

- Operand
  - [x] 연산자 변수
  - [x] 생성자
  - [x] 연산자 값(음수) 체크 함수
  - [x] 연산자 배열 변환 함수

- Seperator
  - [x] 기본 분리자 상수
  - [x] 분리된 문자열 배열 변수
  - [x] 분리된 문자열 배열 Getter
  - [x] 구분자 판단 및 분리 함수
  - [x] 문자열 내 구분자 영역 이외의 값 추출 함수
  - [x] 구분자 예외 처리(개행 등의 추가 문자 체크)

- Operands
  - [x] 리스트 연산자 변수
  - [x] 생성자
  - [x] 리스트 연산자 합계 함수

- Calculator
  - [x] 덧셈 함수
  - [x] 연산자 배열 합계 함수
  - [x] 공백 및 빈 값 체크 함수
  - [x] 한 글자 체크 함수
  - [x] 콤마 구분자 만 있는 경우 체크 함수

# 로또(자동)

## 요구사항
- 금액을 입력하면, 1000원 기준으로 로또를 구매한다.
- 구매하는 로또는 중복되지 않는 숫자 7개(1~45) 이다.
- 당첨 번호는 중복되지 않는 숫자 7개(1~45) 이며, 추가 숫자(보너스볼)이 존재한다.
- 구매했던 로또는 전부 저장하고 있으며, 당첨번호 및 보너스 볼과 비교하여 일치하는 갯수를 판단한다.
- 판단 결과를 가지고 통계를 내어 보여준다.
- 판단 결과의 통계를 기반으로 1을 기준으로 수익률을 계산한다.

## 객체

### 최초 생성

- [x] 로또 메인 함수
- [x] 로또
  - [x] 로또 번호 리스트
  - [x] 당첨 순위 
  - [x] 생성자
  - [x] 로또 반환 함수
  - [x] 로또 당첨 순위 반환 함수
- [x] 복권 구매자
  - [x] 지갑
  - [x] 구매 함수
  - [x] 지갑 반환 함수
- [x] 로또 번호 생성기
  - [x] 로또 번호
  - [x] 로또 번호 생성 함수
  - [x] 랜덤으로 7개 숫자 뽑아 반환하는 함수
- [x] 복권 구매자의 지갑
  - [x] 구매한 복권 전체 저장 변수
  - [x] 생성자
  - [x] 사용자의 구매한 로또 반환 함수
  - [x] 사용자의 로또 대입 함수
- [x] 동행복권 당첨 확인
  - [x] 로또 순위 enum 객체
    - [x] 순위 변수들
    - [x] 상금
    - [x] 생성자
    - [x] 순위에 따른 상금 리턴 함수
    - [x] 로또 당첨 상태 출력 함수
  - [x] 로또 구매 함수
  - [x] 구매자의 지갑 로또 당첨 순위 체크 함수
  - [x] 사용자 지갑의 로또 총 수익률 계산 함수
  - [x] 사용자 지갑의 로또 순위 체크 함수
  - [x] 로또 당첨 순위 반환 함수

### 23.03.11 객체 변경

- [x] 로또구매고객(Customer)
  - [x] 지갑 변수
  - [x] 로또 구매 함수
  - [x] 지갑 반환 함수
- [x] 로또(Lotto)
  - [x] 로또 리스트 변수
  - [x] 로또 당첨 등수
  - [x] 로또 생성자
  - [x] 로또 반환 함수
  - [x] 로또 당첨 순위 반환 함수
- [x] 로또 생성기(LottoGenerator)
  - [x] 로또 번호 리스트
  - [x] 로또 번호 생성 함수
  - [x] 로또 번호 무작위 추출 함수
- [x] 로또 순위 enum 객체(LottoGrade)
  - [x] 맞힌 번호 개수 변수
  - [x] 당첨 순위 상금 변수
  - [x] 보너스 볼 당첨 여부 변수
  - [x] 로또 순위 생성자
  - [x] 당첨 순위에 따른 상금 리턴 함수
  - [x] 변수 생성자
- [x] 로또 회사 객체(LottoOrganizer)
  - [x] 로또 구매 함수
  - [x] 구매자 지갑의 로또 당첨 순위 체크 함수
  - [x] 로또 1개의 순위 체크 함수
  - [x] 로또 당첨 순위 반환 함수
- [x] 메인 클래스(LottoPurchaseDay)
- [x] UI 출력 클래스(TextView)
  - [x] 로또 당첨 상태 출력 함수
  - [x] 생성된 로또 번호 출력 함수
  - [x] 로또 최종 결과를 출력하는 함수
  - [x] 지갑의 총 상금 계산 함수
  - [x] 구매한 모든 로또의 당첨 결과 출력 함수
  - [x] 수익률 출력 함수
- [x] 사용자 지갑 객체(Wallet)
  - [x] 지갑에 들어있는 모든 로또 리스트 변수
  - [x] 사용자의 로또 리스트 반환 함수
  - [x] 사용자의 로또 리스트 대입 함수
  - [x] 생성자
- [x] 상금 상수 클래스(WinnerPrize)
