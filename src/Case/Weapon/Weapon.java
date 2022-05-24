package Case.Weapon;
import Case.InterractiveObject;
import Character.Character;
import Character.Warrior;

import Case.Case;
import Enemy.SuperStrength;

public abstract class Weapon extends Case implements InterractiveObject {

    public Weapon(String name, int strong, String frenchName){
        super(name, strong, frenchName);

    }


    public String toString(){
        return "Tu tombe sur "+frenchName;
    }

    public int getStrength(){


        return strong;
    }


    @Override
    public int interract(Character hero) {

        if(hero instanceof Warrior) {
            int objWithStrength = this.getStrength();

            int heroStrong = hero.getStrong();


            System.out.println("Tu gagne " + objWithStrength + " de force");

             heroStrong += objWithStrength;

            hero.setStrong(heroStrong);
        }

        return 0;




    }




}


