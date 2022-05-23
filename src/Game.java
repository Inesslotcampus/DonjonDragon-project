import java.util.ArrayList;
import java.util.Scanner;

import Case.Case;
import Case.Potion.BigPotion;
import Case.Potion.Potion;
import Case.Potion.StandardPotion;
import Case.Sort.FireBall;
import Case.Sort.Sort;
import Case.Weapon.Club;
import Exception.CharacterOut;
import Character.Character;
import Character.Wizard;
import Character.*;
import Case.Weapon.Weapon;
import Enemy.Enemy;
import Case.Empty;
import Enemy.SuperStrength;


import com.sun.source.tree.WhileLoopTree;


public class Game {

    public Scanner sc = new Scanner(System.in);
    public int position;
    public int compt = 0;

    public GameBoard gameBoard = new GameBoard();

    public Menu menu = new Menu();

    Character hero = menu.chooseTypeOfHero();

    public int randomResultDice() {

        int max = 6;
        int min = 1;
        int dice = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return dice;


    }

    public int heroMove() {

        int diceResult = this.randomResultDice();
        return position = position + diceResult;


    }

    public void interaction(Object obj, int compt) {
        
        
        if (obj instanceof Potion && hero instanceof Character) {

            String potionName = ((Potion) obj).getName();

            int potion = ((Potion) obj).getLevel();


            int levelHero = interractPotion(obj, potion);


            hero.setLifeLevel(levelHero);


        } else if (obj instanceof SuperStrength superStrength) {


            int objWithStrength = superStrength.strength();

            int heroStrong = hero.getStrong();


            System.out.println("Tu gagne " + objWithStrength + " de force");

            heroStrong = heroStrong + objWithStrength;

            hero.setStrong(heroStrong);

            if(compt>15){

                int objWithSuperStrength = superStrength.superStrength();
                System.out.println("Wow encore plus de force");
                heroStrong = heroStrong + objWithSuperStrength;

                hero.setStrong(heroStrong);


            }





        } else if (obj instanceof Enemy enemy) {


            System.out.println("Bats toi ma puuuuuuce ");





            System.out.println("Tu veux te battre ?(o) pour oui et (f) pour fuire ");

            String choiceFight = sc.nextLine();



            while (!choiceFight.equals("o") && !choiceFight.equals("f")) {
                System.out.println("Tu veux te battre ?(o) pour oui et (f) pour fuir ");

                choiceFight = sc.nextLine();

            }


            if (choiceFight.equals("o")) {

                while (hero.getLifeLevel() > 0) {



                    if (enemy.getLevel() <= 0) {

                        System.out.println("le héro a gagné!!!");
                        break;

                    } else {
                        System.out.println("le hero lance son attaque");

                        int enemyStrong = enemy.getStrong();

                        int heroStrong=hero.getStrong();


                        enemy.setLifeLevel(enemy.getLevel()-heroStrong);

                        System.out.println("le méchant contre attaque");

                        int heroLifeLevel = hero.getLifeLevel();

                        System.out.println("Le héro perd " + enemyStrong + " point de vie");

                        heroLifeLevel = heroLifeLevel - enemyStrong;

                        hero.setLifeLevel(heroLifeLevel);


                    }
                }

            } else if (choiceFight.equals("f")) {

                returnToCase();


            }


        } else if (obj instanceof Empty) {
            System.out.println("Y a rien");


        } else {
            System.out.println("Y a pas");


        }


    }


    public void returnToCase() {
        int random = randomResultDice();
        position = position - random;

        System.out.println("tu es à la case " + position);
    }

    public int interractPotion(Object potion, int levelPotion) {

        int levelHero = hero.getLifeLevel();

        System.out.println("WoW! Tu deviens super pompette. Tu gagne " + levelPotion + " points de vie ");
        return levelHero = levelHero + levelPotion;


    }




    public void playGame() {

        System.out.println("Ok, nous pouvons commencer ...");
        position = 1;

        while (position < 63) {

            System.out.println("Appuie sur d pour lancer le dé sinon vois les info sur ton hero (o)");
            String dice = sc.nextLine();


            while (!dice.equals("d") && !dice.equals("o")) {
                System.out.println("Appuie sur d pour lancer le dé");
                dice = sc.nextLine();
            }

            if (dice.equals("d")) {
                compt++;
                System.out.println("----TOUR " + compt + "----");

                try {

                    int move = heroMove();
                    inputException(move);


                    System.out.println(hero.getName() + " est à la case " + move);


                    System.out.println(gameBoard.list.get(position));


                    interaction(gameBoard.list.get(position),compt);


                } catch (CharacterOut e) {

                    System.out.println("Tu as dépassé la ligne d'arrivé ");
                    Menu menu = new Menu();
                    menu.exit();
                    position = 1;


                }


            } else if (dice.equals("o")) {
                System.out.println(" Nom: " + hero.getName() + " Vie: " + hero.getLifeLevel() + " Force: " + hero.getStrong());
            }

        }

        System.out.println("TU GAGNE!");


    }

    public void inputException(int move) throws CharacterOut {
        if (move > 63) {
            throw new CharacterOut("Vous avez dépassé l'arrivée");

        }


    }


}
