package game.controller;

import game.View.OutputView;
import game.player.Computer;
import game.player.User;

public class StarcraftGame {

    private User user;
    private Computer computer;


    public void run() {
        OutputView.printGameStartMessage();
        bringSelectionController();
        bringBattleController();
    }

    private void bringSelectionController() {
        SelectionController selectionController = new SelectionController();
        this.user = (User) selectionController.selectRaceByUser();
        this.computer = (Computer) selectionController.selectRaceByComputer();
    }

    private void bringBattleController() {
        BattleController battleController = new BattleController(this.computer, this.user);
        battleController.battle();
    }

}

