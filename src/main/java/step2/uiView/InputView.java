package step2.uiView;

import step2.enums.InputMessage;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    //로또를 구매할 금액을 입력받는다.
    public int inputMoney() {
        System.out.println(InputMessage.INPUT_MONEY.message());
        return scanner.nextInt();
    }

    //로또 당첨숫자를 입력받는다.
    public String inputPrizeNum() {
        System.out.println(InputMessage.INPUT_PRIZE_NUM.message());
        if (scanner.hasNextLine()) { // 버퍼에 남아 있는 \n 제거
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

}
