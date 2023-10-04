package game.unit.zerg.airUnit;

import game.unit.AirUnit;

public class Queen extends AirUnit {

    private static final int SETTING_ATTACK_POWER = 25;
    private static final int SETTING_DEFENSE_POWER = 40;

    public Queen() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
