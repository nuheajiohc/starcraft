package game.controller;

import game.RaceSelection;
import game.View.InputView;
import game.View.OutputView;
import game.player.Computer;
import game.player.Player;
import game.player.User;

public class SelectionController {
    RaceSelection raceSelection;

    public SelectionController() {
        this.raceSelection = new RaceSelection();
    }

    public Player selectRaceByUser() {
        String raceInput;
        while (true) {
            raceInput = InputView.inputRaceSelection();
            boolean isValidInput = raceSelection.containRaceInput(raceInput);
            if (isValidInput) {
                return new User(raceSelection.selectRace(raceInput));
            }
            OutputView.printReInputMessage();
        }
    }

    public Player selectRaceByComputer() {
        return new Computer(raceSelection.selectRaceByRandom());
    }
}
