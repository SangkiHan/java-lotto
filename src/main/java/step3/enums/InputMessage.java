package step3.enums;

public enum InputMessage {

    INPUT_MONEY("구입금액을 입력해 주세요."),
    INPUT_PRIZE_NUM("지난 주 당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUM("보너스 볼을 입력해 주세요."),
    INPUT_MANUAL_LOTTO_NUM("수동으로 구매할 로또 수를 입력해 주세요."),
    INPUT_MANUAL_LOTTO("수동으로 구매할 번호를 입력해 주세요.");

    InputMessage(String message) {
        this.message = message;
    }

    private final String message;

    public String message() {
        return message;
    }

}
