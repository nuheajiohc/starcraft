package game;

import game.race.Protos;
import game.race.Race;
import game.race.Terran;
import game.race.Zerg;
import java.util.Arrays;

public class RaceSelection {
    private String[] races = {"zerg", "terran", "protos"};

    public Race raceList(String race) {
        switch (race) {
            case "zerg":
                return new Zerg();
            case "terran":
                return new Terran();
            case "protos":
                return new Protos();
        }
        return null;
    }

    public Race selectRaceByRandom() {
        String race = this.races[(int) (Math.random() * this.races.length)];
        return raceList(race);
    }

    public Race selectRace(String race) {
        return raceList(race);
    }

    public boolean containRaceInput(String input) {
        return Arrays.asList(races).contains(input);
    }
}
