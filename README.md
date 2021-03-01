# 로또(lotto package)

## 요구사항 정리

* 로또 구매자로부터 값을 입력받는다.
    * 로또 구입금액을 입력받는다.
    * 로또 당첨 번호를 입력받는다.
    * 보너스 볼 번호를 입력받는다. 
* 랜덤 로또 티켓을 발급한다.
* 당첨 통계를 계산한다. 
* 로또 구매자의 수익률을 계산한다.
* 출력한다.
    * 당첨 통계를 출력한다. 
    * 수익률을 출력한다.

## 구현

- __LottoMain__
  - LottoMachine 실행
  - LottoNumbers 받음
  - LottoCalculation

- __LottoMachine__
  - 가격 받음 
  - 로또 갯수 계산
  - 갯수에 맞는 로또 번호 생성
  
- __LottoCalculation__
  - 로또 당첨 번호 확인
  - 보너스볼 번호 확인
  
- __Lotto__ (일급 컬렉션)

## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
