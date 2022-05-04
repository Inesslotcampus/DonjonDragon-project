import java.lang.*;
import java.util.Scanner;

public class Exit {

    public void chooseExit(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Continuer ou quitter l'aventure? Tape sur e si tu veux partir sinon tape sur y");

        String Exit = myObj.nextLine();

        if(Exit.equals("e")){
            System.exit(0);
        }




    }


}
