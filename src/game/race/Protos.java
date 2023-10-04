package game.race;

import game.unit.Unit;
import game.unit.protos.ProtosUnit;

public class Protos extends Race {
    public static final int NUMBER_OF_SPAWN_UNIT = 4;

    public Protos() {
        super(NUMBER_OF_SPAWN_UNIT);
    }

    public Unit selectRandomUnit(int index) {
        int randomIndex = (int) (Math.random() * numberOfUnitType);
        return ProtosUnit.values()[randomIndex].getUnit();
    }

    public int getNumberOfSpawnUnit(){
        return NUMBER_OF_SPAWN_UNIT;
    }
}
