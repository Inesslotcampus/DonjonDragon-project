import java.util.Scanner;

public class Game {


    public int position=0;
    public int compt= 0;



    public int randomResultDice(){

        int max=6;
        int min =1;
        int dice= (int) Math.floor(Math.random() * (max - min + 1) + min);
        return dice;


    }

    public int heroMove(){

        int diceResult= this.randomResultDice();
        return position =position +diceResult;




    }

    public void playGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ok, nous pouvons commencer ...");

        while (position <64) {

            System.out.println("Appuie sur d pour lancer le dé");
            String dice = sc.nextLine();


            while (!dice.equals("d")) {
                System.out.println("Appuie sur d pour lancer le dé");
                dice = sc.nextLine();
            }

            if (dice.equals("d")) {
                compt++;
                System.out.println( "TOUR "+compt);

                int move=heroMove();
                System.out.println(move);


            }

        }
        System.out.println("TU GAGNE!");









    }

}
