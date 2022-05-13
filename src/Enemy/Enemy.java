package Enemy;

public class Enemy extends Case.Case {

    public Enemy(String name, int strong, int level, String frenchName){
        super(name, strong, level, frenchName);

    }
    public void displayName(){
        System.out.println(frenchName);

    }




}
