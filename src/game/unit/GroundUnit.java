package game.unit;

import game.interfaces.Unflyable;

public class GroundUnit extends Unit implements Unflyable {

    public GroundUnit(int attackPower, int defensePower) {
        super(attackPower, defensePower);
    }

}
