package game.race;

import game.factory.Factory;
import game.factory.ProtosFactory;
import game.unit.Unit;

public class Protos extends Race {
    public static final int NUMBER_OF_SPAWN_UNIT = 4;


    public Protos() {
        this.spawnedUnits = new Unit[NUMBER_OF_SPAWN_UNIT];
        setSpawnedUnits();
    }

    protected void setSpawnedUnits() {
        Factory protosFactory = new ProtosFactory();
        for (int i = 0; i < NUMBER_OF_SPAWN_UNIT; i++) {
            int randomIndex = (int) (Math.random() * numberOfUnitType);
            this.spawnedUnits[i] = protosFactory.createUnit(randomIndex);
        }
    }

    public int getNumberOfSpawnUnit() {
        return NUMBER_OF_SPAWN_UNIT;
    }
}
