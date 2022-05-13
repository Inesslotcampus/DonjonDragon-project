package Character;

public abstract class Character {

    private String name;
    private int lifeLevel;
    private int strong;


public  Character(){
    this.name= "Harry";
    this.strong = 5;
    this.lifeLevel= 5;

}
    public void setName(String name) {

    if(name.length()==0){
        this.name="AucunEffort";

    }
    else {

        this.name = name;
    }

    }

    public void setLifeLevel(int level) {
         if(level<3){
             this.lifeLevel=3;
         } else if (level>6) {
             this.lifeLevel=3;

         } else {
             this.lifeLevel = level;
         }
    }

    public void setStrong(int strong) {
        if(strong<5){
            this.strong=5;
        } else if (strong>10) {
            this.strong=5;

        }
        else{
            this.strong = strong;
        }
    }

    public String getName(){

    return name;
    }

    public int getStrong(){
    return strong;
    }

    public int getLifeLevel(){
        return lifeLevel;
    }


}
