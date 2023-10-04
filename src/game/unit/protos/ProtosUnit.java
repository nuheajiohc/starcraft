package game.unit.protos;

import game.unit.Unit;
import game.unit.protos.airUnit.Carrier;
import game.unit.protos.airUnit.Corsair;
import game.unit.protos.airUnit.Scout;
import game.unit.protos.groundUnit.Dragoon;
import game.unit.protos.groundUnit.HighTempler;
import game.unit.protos.groundUnit.Zealot;

public enum ProtosUnit {

    ZEALOT {
        public Unit getUnit() {
            return new Zealot();
        }
    }, DRAGOON {
        public Unit getUnit() {
            return new Dragoon();
        }
    }, HIGHTEMPLER {
        public Unit getUnit() {
            return new HighTempler();
        }
    }, SCOUT {
        public Unit getUnit() {
            return new Scout();
        }
    }, COURSAIR {
        public Unit getUnit() {
            return new Corsair();
        }
    },CARRIER{
        public Unit getUnit() {
            return new Carrier();
        }
    }

    ;

    public abstract Unit getUnit();

    }
