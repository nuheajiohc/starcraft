package game.unit.protos.groundUnit;

import game.unit.GroundUnit;

public class HighTempler extends GroundUnit {
    private static final int SETTING_ATTACK_POWER = 10;
    private static final int SETTING_DEFENSE_POWER = 2;

    public HighTempler() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
