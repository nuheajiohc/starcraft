package game.unit.zerg;

import game.unit.Unit;
import game.unit.zerg.airUnit.Guardian;
import game.unit.zerg.airUnit.Mutalisk;
import game.unit.zerg.airUnit.Queen;
import game.unit.zerg.groundUnit.Hydralisk;
import game.unit.zerg.groundUnit.Ultralisk;
import game.unit.zerg.groundUnit.Zergling;

public enum ZergUnit {

    ZERGLING {
        public Unit getUnit() {
            return new Zergling();
        }
    }, HYDRALISK {
        public Unit getUnit() {
            return new Hydralisk();
        }
    }, ULTRALISK {
        public Unit getUnit() {
            return new Ultralisk();
        }
    }, MUTALISK {
        public Unit getUnit() {
            return new Mutalisk();
        }
    }, GUARDIAN {
        public Unit getUnit() {
            return new Guardian();
        }
    }, QUEEN {
        public Unit getUnit() {
            return new Queen();
        }
    };

    public abstract Unit getUnit();
}
