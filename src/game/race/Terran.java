package game.race;

import game.unit.Unit;
import game.unit.terran.TerranUnit;

public class Terran extends Race{
    public static final int NUMBER_OF_SPAWN_UNIT = 5;

    public Terran() {
        super(NUMBER_OF_SPAWN_UNIT);
    }

    public Unit selectRandomUnit(int index) {
        int randomIndex = (int) (Math.random() * numberOfUnitType);
        return TerranUnit.values()[randomIndex].getUnit();
    }

    public int getNumberOfSpawnUnit(){
        return NUMBER_OF_SPAWN_UNIT;
    }
}
