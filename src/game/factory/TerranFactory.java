package game.factory;

import game.unit.Unit;
import game.unit.terran.airUnit.BattleCruzer;
import game.unit.terran.airUnit.Valkyrie;
import game.unit.terran.airUnit.Wraith;
import game.unit.terran.groundUnit.Goliath;
import game.unit.terran.groundUnit.Marine;
import game.unit.terran.groundUnit.Tank;

public class TerranFactory implements Factory {

    @Override
    public Unit createUnit(int kindOfUnit) {
        switch (kindOfUnit) {
            case 0:
                return new BattleCruzer();
            case 1:
                return new Valkyrie();
            case 2:
                return new Wraith();
            case 3:
                return new Goliath();
            case 4:
                return new Marine();
            case 5:
                return new Tank();
            default:
                return null;
        }
    }
}
