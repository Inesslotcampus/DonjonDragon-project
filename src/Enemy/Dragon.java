package Enemy;

import java.awt.*;

public class Dragon extends Enemy{

    Menu menu = new Menu();
    public Dragon(){
        super("Dragon",5, 5, "Mouchou(si t'as pas la ref tu meurs)");
    }
    public String toString(){
        return "Petite odeur de brulé..." +
                "Tu tombe sur "+frenchName;




    }
}
