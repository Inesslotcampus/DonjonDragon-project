import java.util.Scanner;

import Case.InterractiveObject;
import Case.Potion.Potion;
import Exception.CharacterOut;
import Character.Character;

import Enemy.Enemy;
import Case.Empty;
import Enemy.SuperStrength;


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

    public void interaction(InterractiveObject obj) {

            int result = obj.interract(hero);

            if (result<0){
                returnToCase();
            }



    }


    public void returnToCase() {
        int random = randomResultDice();
        position = position - random;

        System.out.println("tu es à la case " + position);
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


                    interaction(gameBoard.list.get(position));


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
