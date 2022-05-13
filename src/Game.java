import java.util.ArrayList;
import java.util.Scanner;

import Case.Case;
import Case.Potion.Potion;
import Case.Sort.Sort;
import Exception.CharacterOut;
import Character.Character;
import Character.Wizard;
import Character.Warrior;
import Case.Weapon.Weapon;
import Enemy.Enemy;


public class Game {


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

    public void interaction(Object obj){
        if (obj instanceof Potion){
            System.out.println("Le héro a plus de vies ");

        }else if(obj instanceof Sort && hero instanceof Wizard){
            System.out.println("Le héro a plus de force ");

        }else if(obj instanceof Weapon && hero instanceof Warrior){
            System.out.println("Le héro a plus de force ");
        }else if(obj instanceof Enemy){
            System.out.println("Bats toi ma puuuuuuce ");

        }
        else {
            System.out.println("Y a pas");
        }




    }


    public void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ok, nous pouvons commencer ...");
        position = 1;

        while (position < 64) {

            System.out.println("Appuie sur d pour lancer le dé");
            String dice = sc.nextLine();


            while (!dice.equals("d")) {
                System.out.println("Appuie sur d pour lancer le dé");
                dice = sc.nextLine();
            }

            if (dice.equals("d")) {
                compt++;
                System.out.println("----TOUR " + compt + "----");

                try {

                    int move = heroMove();
                    inputException(move);


                    System.out.println(hero.getName() + "est à la case " + move);

                    Object obj = gameBoard.list.get(position);
                    System.out.println(obj);

                    interaction(obj);






                } catch (CharacterOut e) {
                    this.position = 1;


                }


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
