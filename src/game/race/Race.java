package game.race;

import game.factory.Factory;
import game.interfaces.Flyable;
import game.interfaces.Shootable;
import game.interfaces.Unflyable;
import game.unit.Unit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Race {

    protected Unit[] spawnedUnits;

    protected int numberOfUnitType = 6;

    protected Race() {
    }

    protected abstract void setSpawnedUnits();

    public void selectUnitsToBattle(int myUnitIndex, Race anotherRace, int anotherUnitIndex) {
        this.spawnedUnits[myUnitIndex].attack(anotherRace.spawnedUnits[anotherUnitIndex]);
    }

    public boolean canAttack(int myUnitIndex, Race anotherRace, int anotherUnitIndex) {
        return this.spawnedUnits[myUnitIndex] instanceof Shootable ||
                this.spawnedUnits[myUnitIndex] instanceof Flyable ||
                anotherRace.spawnedUnits[anotherUnitIndex] instanceof Unflyable;
    }

    public String getRaceState() {
        StringBuilder raceState = new StringBuilder();
        for (int i = 0; i < spawnedUnits.length; i++) {
            String unitState = spawnedUnits[i].getUnitState();
            if (unitState == null) {
                continue;
            }
            raceState.append(String.format("%d. %s%n", i, unitState));
        }
        return raceState.toString();
    }

    public int getSpawnedUnitsLength() {
        return spawnedUnits.length;
    }

    public abstract int getNumberOfSpawnUnit();

    public boolean isDead(int index) {
        return this.spawnedUnits[index].isDead();
    }

    public boolean isAllDead() {
        return Arrays.stream(this.spawnedUnits).allMatch(Unit::isDead);
    }
}
