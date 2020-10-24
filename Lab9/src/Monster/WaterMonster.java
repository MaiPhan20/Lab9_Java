package Monster;

import Monster.Monster;

public class WaterMonster extends Monster {
    public WaterMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
