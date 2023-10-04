package game.unit.zerg.airUnit;

import game.unit.AirUnit;

public class Guardian extends AirUnit {
    private static final int SETTING_ATTACK_POWER = 3;
    private static final int SETTING_DEFENSE_POWER = 6;
    public Guardian() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
