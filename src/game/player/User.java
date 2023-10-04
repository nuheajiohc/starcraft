package game.player;

import game.race.Race;

public class User extends Player {

    public User(Race race) {
        super(race);
    }

    public void selectUnitsToBattle(int myUnitIndex, Player player, int anotherUnitIndex) {
        race.selectUnitsToBattle(myUnitIndex, player.race, anotherUnitIndex);
    }

    public boolean canAttack(int myUnitIndex, Player player, int anotherUnitIndex) {
        return race.canAttack(myUnitIndex, player.race, anotherUnitIndex);
    }

    public int getNumberOfSpawnUnit(){
        return race.getNumberOfSpawnUnit();
    }
}
