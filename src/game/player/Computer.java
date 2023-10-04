package game.player;

import game.View.OutputView;
import game.race.Race;

public class Computer extends Player {
    public Computer(Race race) {
        super(race);
    }

    public void selectUnitsToBattleByRandom(Player player) {
        int myUnitIndex;
        do {
            myUnitIndex = (int) (Math.random() * this.race.getSpawnedUnitsLength());
        } while (this.race.isDead(myUnitIndex));

        int anotherUnitIndex;
        do {
            anotherUnitIndex = (int) (Math.random() * player.race.getSpawnedUnitsLength());
        } while (player.race.isDead(anotherUnitIndex));

        if(!race.canAttack(myUnitIndex,player.race,anotherUnitIndex)){
            throw new IllegalArgumentException("공격할 수 없는 유닛을 공격했으므로 차례가 넘어갑니다.");
        }

        if (this.isDeadUnit(myUnitIndex) || player.isDeadUnit(anotherUnitIndex)) {
            selectUnitsToBattleByRandom(player);
        }
        race.selectUnitsToBattle(myUnitIndex, player.race, anotherUnitIndex);
    }
}
