package Enemy;

import Character.CharacterEnemy;

public  class  Enemy extends Case.Case implements CharacterEnemy {

    public Enemy(String name, int strong, int level, String frenchName){
        super(name, strong, level, frenchName);

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getStrong() {
        return strong;
    }

    @Override
    public int getLifeLevel() {
        return level;
    }

    public void setLifeLevel(int level) {
        this.level = level;
    }









}
