package game.unit.zerg.airUnit;

import game.unit.AirUnit;

public class Mutalisk extends AirUnit {

    private static final int SETTING_ATTACK_POWER = 2;
    private static final int SETTING_DEFENSE_POWER = 8;

    public Mutalisk() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
