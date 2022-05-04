import Hero.Character;
import Hero.Warrior;
import Hero.Wizard;


import java.util.Scanner;

public class Menu {



    public  void ChooseTypeOfHero() {
        Scanner sc = new Scanner(System.in);




        System.out.println("Quel hero es tu? (g = guerrier, m = magicien )");
        String choice = sc.nextLine();




            System.out.println("Comment tu t'appelle?");

            String nameHero = sc.nextLine();

            System.out.println("Force?");

            int strongHero = sc.nextInt();

            System.out.println("Vie");

            int life = sc.nextInt();

            if (choice.equals("m")) {

                System.out.println("Hero: Magicien");

                Wizard wizard = new Wizard();

                setAttributHero(wizard, nameHero, strongHero, life);


            } else if (choice.equals("g")) {

                System.out.println("Hero: Guerrier");

                Warrior warrior = new Warrior();
                setAttributHero(warrior, nameHero, strongHero, life);


            }



    }


        public void setAttributHero (Character hero, String nameHero,int strong, int level){

            hero.setName(nameHero);
            hero.setStrong(strong);
            hero.setLifeLevel(level);
            System.out.println("nom: " + hero.getName() + " | force: " + hero.getStrong() + " | Vie: " + hero.getLifeLevel());

        }


        public void getMinMax ( int attribut, int defaultAttribut, int min, int max){
            if (attribut < min || attribut > max) {
                attribut = defaultAttribut;
            }

        }

        public void exit() {

        Exit exit = new Exit();
        exit.chooseExit();
    }

    public void playGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ok, nous pouvons commencer ...");
        System.out.println("Appuie sur d pour lancer le dé");

        String dice = sc.nextLine();
        GameBoard gameBoard= new GameBoard();

        if(dice.equals("d")){

            gameBoard.heroPosition();

        }





    }




}
