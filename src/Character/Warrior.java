

package Character;


import Character.Character;

public class Warrior extends Character {
    public String Arm;
    public String shield;

    public Warrior(String name, int strong, int liveLevel ) {
        this.setName(name);
        this.setStrong(strong);
        this.setLifeLevel(liveLevel);
    }


}
