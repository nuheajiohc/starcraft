package game.factory;

import game.unit.Unit;

public interface Factory {
    Unit createUnit(int kindOfUnit);
}
