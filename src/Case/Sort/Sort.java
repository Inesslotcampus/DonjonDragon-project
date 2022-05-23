package Case.Sort;
import Character.Character;
import Case.InterractiveObject;
import Enemy.SuperStrength;

import Character.Wizard;

public class Sort extends Case.Case  {

    public Sort(String name, int strong,  String frenchName){
            super(name, strong, frenchName);

        }






    public int getStrength(){


        return strong;
    }

    @Override
    public int interract(Character hero) {

        if(hero instanceof Wizard) {
            int objWithStrength = this.getStrength();

            int heroStrong = hero.getStrong();


            System.out.println("Tu gagne " + objWithStrength + " de force");

            heroStrong = heroStrong + objWithStrength;

            hero.setStrong(heroStrong);
        }

        return 0;


    }
}
