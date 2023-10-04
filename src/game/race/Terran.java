package game.race;

import game.factory.Factory;
import game.factory.TerranFactory;
import game.unit.Unit;

public class Terran extends Race {
    public static final int NUMBER_OF_SPAWN_UNIT = 5;

    public Terran(){
        this.spawnedUnits = new Unit[NUMBER_OF_SPAWN_UNIT];
        setSpawnedUnits();
    }
    protected void setSpawnedUnits() {
        Factory terranFactory = new TerranFactory();
        for (int i = 0; i < NUMBER_OF_SPAWN_UNIT; i++) {
            int randomIndex = (int) (Math.random() * numberOfUnitType);
            this.spawnedUnits[i] = terranFactory.createUnit(randomIndex);
        }
    }

    public int getNumberOfSpawnUnit() {
        return NUMBER_OF_SPAWN_UNIT;
    }
}
