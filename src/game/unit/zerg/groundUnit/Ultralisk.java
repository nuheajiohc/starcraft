package game.unit.zerg.groundUnit;

import game.unit.GroundUnit;

public class Ultralisk extends GroundUnit {
    private static final int SETTING_ATTACK_POWER = 5;
    private static final int SETTING_DEFENSE_POWER = 15;

    public Ultralisk(){
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }


}
