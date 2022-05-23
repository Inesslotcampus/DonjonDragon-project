import java.lang.*;
import java.util.Scanner;

public class Exit {

    public String Exit;
    public Scanner myObj = new Scanner(System.in);
    public void chooseExit(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Es tu sur de vouloir continuer? Tape sur n(non) si tu veux partir sinon tape sur o(oui)");

         Exit = myObj.nextLine();

        if(Exit.equals("n")){
            System.exit(0);
        }


    }


    public static interface CharacterHoroOrEnemy {

    }
}
