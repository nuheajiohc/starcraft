package game.factory;

import game.unit.Unit;
import game.unit.protos.airUnit.Carrier;
import game.unit.protos.airUnit.Corsair;
import game.unit.protos.airUnit.Scout;
import game.unit.protos.groundUnit.Dragoon;
import game.unit.protos.groundUnit.HighTempler;
import game.unit.protos.groundUnit.Zealot;

public class ProtosFactory implements Factory {

    @Override
    public Unit createUnit(int kindOfUnit) {
        switch (kindOfUnit) {
            case 0:
                return new Carrier();
            case 1:
                return new Corsair();
            case 2:
                return new Scout();
            case 3:
                return new Dragoon();
            case 4:
                return new HighTempler();
            case 5:
                return new Zealot();
            default:
                return null;
        }
    }
}
