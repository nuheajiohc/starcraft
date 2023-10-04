package game.unit.protos.groundUnit;

import game.interfaces.Shootable;
import game.unit.GroundUnit;

public class Dragoon extends GroundUnit implements Shootable {
    private static final int SETTING_ATTACK_POWER = 3;
    private static final int SETTING_DEFENSE_POWER = 15;

    public Dragoon() {
        super(SETTING_ATTACK_POWER, SETTING_DEFENSE_POWER);
    }
}
