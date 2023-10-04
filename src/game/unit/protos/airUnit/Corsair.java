package game.unit.protos.airUnit;

import game.unit.AirUnit;

public class Corsair extends AirUnit {

    private static final int SETTING_ATTACK_POWER = 4;
    private static final int SETTING_DEFENSE_POWER = 12;

    public Corsair() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
