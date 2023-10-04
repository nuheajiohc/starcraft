package game.unit.terran.airUnit;

import game.unit.AirUnit;

public class Valkyrie extends AirUnit {

    private static final int SETTING_ATTACK_POWER = 4;
    private static final int SETTING_DEFENSE_POWER = 12;

    public Valkyrie() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
