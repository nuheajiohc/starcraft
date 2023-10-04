package game.View;

import game.player.Player;

public final class OutputView {

    private OutputView() {
    }

    public static void printGameStartMessage() {
        System.out.println("콘솔 기반 턴 게임을 시작합니다.");
    }

    public static void printReInputMessage() {
        System.out.println("입력값이 잘못되었습니다.");
    }

    public static void printRaceState(Player player) {
        System.out.println(player.getRaceState());
    }

    public static void printComputerTurnNotice() {
        System.out.println("이번 턴에는 컴퓨터가 유저를 공격합니다.");
    }

    public static void printDeadUnitNotice() {
        System.out.println("선택한 유닛들 중에 죽은 유닛이 있습니다.");
    }

    public static void printCanNotAttackNotice() {
        System.out.println("공격할 수 없는 유닛을 공격했으므로 차례가 넘어갑니다.");
    }

    public static void printWinMessage() {
        System.out.println("승리하였습니다!!");
    }

    public static void printLoseMessage() {
        System.out.println("패배하였습니다.");
    }
}
