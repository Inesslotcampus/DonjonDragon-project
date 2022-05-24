package Case.Potion;

import Case.InterractiveObject;

import Character.Character;


import Case.Case;

public abstract class Potion extends Case  {

    public Potion(String name, String frenchName, int level) {
        super(name, frenchName, level);

    }

    @Override
    public int interract(Character hero) {

        int pv = this.getLevel();


        int levelHero = hero.getLifeLevel();

        System.out.println("WoW! Tu deviens super pompette. Tu gagne " + pv + " points de vie ");
        levelHero += pv;

        hero.setLifeLevel(levelHero);


        return 0;
    }

    ;


}
