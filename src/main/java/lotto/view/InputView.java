package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoAmount;

import java.util.Scanner;

public class InputView {

    public LottoAmount inputLottoAmount() {

        Scanner sc = new Scanner(System.in);
        return new LottoAmount(sc.nextLine());
    }

    public Lotto inputWinningLotto() {

        Scanner sc = new Scanner(System.in);
        return new Lotto(sc.nextLine());
    }
}
