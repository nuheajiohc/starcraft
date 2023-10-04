package game.unit;

public class Unit {

    protected final int settingAttackPower;
    protected final int settingDefensePower;

    protected int currentDefensePower;

    public Unit(int attackPower, int defensePower) {
        this.settingAttackPower = attackPower;
        this.settingDefensePower = defensePower;
        this.currentDefensePower = defensePower;
    }

    public void attack(Unit anotherUnit) {
        anotherUnit.currentDefensePower -= this.settingAttackPower;
        if(anotherUnit.currentDefensePower<0){
            anotherUnit.currentDefensePower=0;
        }
    }

    public String getUnitState() {
        if(this.currentDefensePower==0){
            return null;
        }
        return String.format("%-10s - 현재 방어력 [%d / %d]", this.getClass().getSimpleName(), this.currentDefensePower,
                this.settingDefensePower);
    }

    public boolean isDead() {
        return currentDefensePower == 0;
    }
}
