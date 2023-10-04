package game.race;

import game.unit.Unit;
import game.unit.zerg.ZergUnit;

public class Zerg extends Race {
    private static final int NUMBER_OF_SPAWN_UNIT = 8;

    public Zerg() {
        super(NUMBER_OF_SPAWN_UNIT);
    }

    public Unit selectRandomUnit(int index) {
        int randomIndex = (int) (Math.random() * numberOfUnitType);
        return ZergUnit.values()[randomIndex].getUnit();
    }

    public int getNumberOfSpawnUnit(){
        return NUMBER_OF_SPAWN_UNIT;
    }
}
