package Monster;

import Monster.Monster;

public class FireMonster extends Monster {
    public FireMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
