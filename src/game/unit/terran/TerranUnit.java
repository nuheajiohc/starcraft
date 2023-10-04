package game.unit.terran;

import game.unit.Unit;
import game.unit.terran.airUnit.BattleCruzer;
import game.unit.terran.airUnit.Valkyrie;
import game.unit.terran.airUnit.Wraith;
import game.unit.terran.groundUnit.Goliath;
import game.unit.terran.groundUnit.Marine;
import game.unit.terran.groundUnit.Tank;

public enum TerranUnit {

    MARINE {
        public Unit getUnit() {
            return new Marine();
        }
    }, TANK {
        public Unit getUnit() {
            return new Tank();
        }
    }, GOLIATH {
        public Unit getUnit() {
            return new Goliath();
        }
    }, WRAITH {
        public Unit getUnit() {
            return new Wraith();
        }
    }, VALKYRIE {
        public Unit getUnit() {
            return new Valkyrie();
        }
    }, BATTLECRUZER {
        public Unit getUnit() {
            return new BattleCruzer();
        }
    };

    public abstract Unit getUnit();
}
