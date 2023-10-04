package game.unit.protos.groundUnit;

import game.unit.GroundUnit;

public class Zealot extends GroundUnit {
    private static final int SETTING_ATTACK_POWER = 5;
    private static final int SETTING_DEFENSE_POWER = 20;

    public Zealot() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }

}
