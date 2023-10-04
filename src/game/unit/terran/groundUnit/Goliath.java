package game.unit.terran.groundUnit;

import game.interfaces.Shootable;
import game.unit.GroundUnit;

public class Goliath extends GroundUnit implements Shootable {

    private static final int SETTING_ATTACK_POWER = 5;
    private static final int SETTING_DEFENSE_POWER = 15;

    public Goliath() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
