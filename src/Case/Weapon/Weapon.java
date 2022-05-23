package Case.Weapon;

import Case.Case;
import Enemy.SuperStrength;

public abstract class Weapon extends Case implements SuperStrength {

    public Weapon(String name, int strong, String frenchName){
        super(name, strong, frenchName);

    }


    public String toString(){
        return "Tu tombe sur "+frenchName;
    }
    @Override
    public int superStrength(){

        return  3;

    }
    @Override
    public int strength(){
        return strong;
    }


}


