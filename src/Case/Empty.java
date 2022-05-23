package Case;
import Case.InterractiveObject;
import Character.Character;

public class Empty extends Case {
    public Empty(){
        super("empty", "une case vide");

    }
    public String toString(){
        return "Tu tombe sur "+frenchName;
    }


}
