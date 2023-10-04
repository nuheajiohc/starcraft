package game.race;

import game.factory.Factory;
import game.factory.ZergFactory;
import game.unit.Unit;

public class Zerg extends Race {
    private static final int NUMBER_OF_SPAWN_UNIT = 8;

    public Zerg() {
        this.spawnedUnits = new Unit[NUMBER_OF_SPAWN_UNIT];
        setSpawnedUnits();
    }

    protected void setSpawnedUnits() {
        Factory zergFactory = new ZergFactory();
        for (int i = 0; i < NUMBER_OF_SPAWN_UNIT; i++) {
            int randomIndex = (int) (Math.random() * numberOfUnitType);
            this.spawnedUnits[i] = zergFactory.createUnit(randomIndex);
        }
    }

    public int getNumberOfSpawnUnit() {
        return NUMBER_OF_SPAWN_UNIT;
    }
}
