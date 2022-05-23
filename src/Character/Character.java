package Character;

import Enemy.Enemy;

public abstract class Character implements CharacterEnemy {

    private String name;
    private int lifeLevel;
    private int strong;


    public Character() {
        this.name = "Harry";
        this.strong = 5;
        this.lifeLevel = 5;

    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() == 0) {
            this.name = "AucunEffort";

        } else {

            this.name = name;
        }

    }

    @Override
    public int getStrong() {
        return strong;
    }

    /**
     * @param strong
     */


    public void setStrong(int strong) {
        if (strong < 5) {
            this.strong = 5;
        } else if (strong > 15) {
            this.strong = 15;

        } else {
            this.strong = strong;
        }
    }

    @Override
    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int level) {
        if (level < 0) {
            this.lifeLevel = 0;
            System.out.println("---GAME OVER---");
            System.exit(0);

        } else if (level > 10) {
            this.lifeLevel = 8;

        } else {
            this.lifeLevel = level;
        }
    }




}
