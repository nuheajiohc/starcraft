package game.unit.terran.airUnit;

import game.unit.AirUnit;

public class Wraith extends AirUnit {

    private static final int SETTING_ATTACK_POWER = 3;
    private static final int SETTING_DEFENSE_POWER = 10;


    public Wraith() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
