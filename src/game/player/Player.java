package game.player;

import game.race.Race;

public class Player {
    protected Race race;

    protected Player(Race race) {
        this.race = race;
    }

    public String getRaceState() {
        String camp = this instanceof User ? "아군" : "적군";
        return String.format("%s : %s%n%s", camp, race.getClass().getSimpleName(), race.getRaceState());
    }

    public boolean isDeadUnit(int index) {
        return race.isDead(index);
    }

    public boolean isAllDead() {
        return race.isAllDead();
    }
}
