package Case.Weapon;

import Case.Case;

public abstract class Weapon extends Case {

    public Weapon(String name, int strong, int level, String frenchName){
        super(name, strong, level, frenchName);

    }
    public String toString(){
        return "Tu tombe sur "+frenchName;
    }


}


