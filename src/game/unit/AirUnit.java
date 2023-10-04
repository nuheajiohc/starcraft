package game.unit;

import game.interfaces.Flyable;

public class AirUnit extends Unit implements Flyable {
    public AirUnit(int attackPower, int defensePower) {
        super(attackPower, defensePower);
    }
}