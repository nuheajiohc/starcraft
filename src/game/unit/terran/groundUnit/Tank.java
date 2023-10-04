package game.unit.terran.groundUnit;

import game.unit.GroundUnit;

public class Tank extends GroundUnit {

    private static final int SETTING_ATTACK_POWER = 7;
    private static final int SETTING_DEFENSE_POWER = 15;

    public Tank() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
