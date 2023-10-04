package game.unit.zerg.groundUnit;

import game.unit.GroundUnit;

public class Zergling extends GroundUnit {
    private static final int SETTING_ATTACK_POWER = 2;
    private static final int SETTING_DEFENSE_POWER = 2;

    public Zergling() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
