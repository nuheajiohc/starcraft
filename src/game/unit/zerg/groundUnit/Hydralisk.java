package game.unit.zerg.groundUnit;

import game.interfaces.Shootable;
import game.unit.GroundUnit;

public class Hydralisk extends GroundUnit implements Shootable {
    private static final int SETTING_ATTACK_POWER = 3;
    private static final int SETTING_DEFENSE_POWER = 7;

    public Hydralisk() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
