package lotto.controller;

import lotto.domain.*;
import lotto.view.InputView;
import lotto.view.ResultView;

import java.util.List;
import java.util.Map;

public class LottoGame {

    public static void main(String[] args) {
        int money = InputView.getLottoMoney();                       // 구입 금액을 입력해주세요
        int customLottoCount = InputView.getCustomInputLottoCount(); // 수동으로 구매할 로또 수를 입력해 주세요.

        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.initializeLottoCount(money, customLottoCount);
        List<Lotto> lottos = lottoMachine.generateLottos(InputView.getCustomLottos(customLottoCount));

        ResultView.printPurchaseNumber(lottos.size());             // 개를 구입했습니다.
        ResultView.printGeneratedLottos(lottos);                   // 생성된 로또 목록

        List<Integer> winningLottoNumbers = InputView.getWinningNumbers(); // 당첨 번호를 입력해주세요
        int bonusBall = InputView.getBonusBall();                          // 보너스 볼을 입력해 주세요.
        WinningLotto winningLotto = WinningLotto.generate(new Lotto(winningLottoNumbers), bonusBall);

        Map<WinningType, Integer> matchResult = LottoCalculation.calculateResult(winningLotto, lottos); // 로또 결과 계산
        ResultView.printResult(matchResult, money);                                                     // 로또 결과 출력
    }
}
