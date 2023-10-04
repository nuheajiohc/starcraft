package game.unit.protos.airUnit;

import game.unit.AirUnit;

public class Scout extends AirUnit {
    private static final int SETTING_ATTACK_POWER = 5;
    private static final int SETTING_DEFENSE_POWER = 10;

    public Scout() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
