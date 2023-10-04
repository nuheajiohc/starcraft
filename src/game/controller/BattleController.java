package game.controller;

import game.View.InputView;
import game.View.OutputView;
import game.player.Computer;
import game.player.User;

public class BattleController {

    private Computer computer;
    private User user;

    public BattleController(Computer computer, User user) {
        this.computer = computer;
        this.user = user;
    }

    public void battle() {
        printRaceState();
        while (true) {
            attackEnemy();
            printRaceState();
            if (this.computer.isAllDead()) {
                printRaceState();
                OutputView.printWinMessage();
                break;
            }

            OutputView.printComputerTurnNotice();
            beAttackedByEnemy();
            printRaceState();
            if (this.user.isAllDead()) {
                printRaceState();
                OutputView.printLoseMessage();
                break;
            }
        }
    }

    private void printRaceState() {
        OutputView.printRaceState(this.computer);
        OutputView.printRaceState(this.user);
    }

    private void attackEnemy() {
        String[] unitsIndex = InputView.inputUnitSelection();
        int myUnitIndex = Integer.parseInt(unitsIndex[0]);
        int enemyUnitIndex = Integer.parseInt(unitsIndex[1]);


        boolean isInIndex = this.user.getNumberOfSpawnUnit() > myUnitIndex || this.user.getNumberOfSpawnUnit() < 0 ||
                this.user.getNumberOfSpawnUnit() > enemyUnitIndex;
        if (!isInIndex) {
            attackEnemy();
        }

        if (this.user.isDeadUnit(myUnitIndex) || this.computer.isDeadUnit(enemyUnitIndex)) {
            OutputView.printDeadUnitNotice();
            attackEnemy();
        }
        if (!this.user.canAttack(myUnitIndex, this.computer, enemyUnitIndex)) {
            OutputView.printCanNotAttackNotice();
            return;
        }

        this.user.selectUnitsToBattle(myUnitIndex, this.computer, enemyUnitIndex);
    }

    private void beAttackedByEnemy() {
        try {
            this.computer.selectUnitsToBattleByRandom(this.user);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
