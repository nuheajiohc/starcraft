package game.unit.terran.groundUnit;

import game.unit.GroundUnit;

public class Marine extends GroundUnit {
    private static final int SETTING_ATTACK_POWER = 10;
    private static final int SETTING_DEFENSE_POWER = 3;

    public Marine() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}