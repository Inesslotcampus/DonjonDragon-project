package Enemy;

import Case.InterractiveObject;
import Character.CharacterEnemy;

import Character.Character;

import java.util.Scanner;

public  class  Enemy extends Case.Case  {

    public Enemy(String name, int strong, int level, String frenchName){
        super(name, strong, level, frenchName);

    }


    public String getName() {
        return super.getName();
    }


    public int getStrong() {
        return strong;
    }


    public int getLifeLevel() {
        return level;
    }

    public void setLifeLevel(int level) {
        this.level = level;
    }

   @Override
    public int interract(Character hero) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bats toi ma puuuuuuce ");

        System.out.println("Tu veux te battre ?(o) pour oui et (f) pour fuir ");

        String choiceFight = sc.nextLine();


        while (!choiceFight.equals("o") && !choiceFight.equals("f")) {
            System.out.println("Tu veux te battre ?(o) pour oui et (f) pour fuir ");

            choiceFight = sc.nextLine();

        }


        if (choiceFight.equals("o")) {

            while (hero.getLifeLevel() > 0) {



                if (this.getLevel() <= 0) {

                    System.out.println("le héro a gagné!!!");
                    break;

                } else {
                    System.out.println("le hero lance son attaque");

                    int enemyStrong = this.getStrong();

                    int heroStrong=hero.getStrong();


                    this.setLifeLevel(this.getLevel()-heroStrong);

                    System.out.println("le méchant contre attaque");

                    int heroLifeLevel = hero.getLifeLevel();

                    System.out.println("Le héro perd " + enemyStrong + " point de vie");

                    heroLifeLevel = heroLifeLevel - enemyStrong;

                    hero.setLifeLevel(heroLifeLevel);




                }
            }

            return 0;

        } else   {


            return -1;


        }


    }
}
