package game.unit.terran.airUnit;

import game.unit.AirUnit;

public class BattleCruzer extends AirUnit {
    private static final int SETTING_ATTACK_POWER = 20;
    private static final int SETTING_DEFENSE_POWER = 30;

    public BattleCruzer() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
