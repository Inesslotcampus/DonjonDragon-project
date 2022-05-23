package Case;

import Enemy.Dragon;
import Enemy.Goblin;
import Enemy.Witch;

import Character.Character;

public abstract class Case implements  InterractiveObject {
    protected String name;
    protected String frenchName;
    protected int strong;
    protected int level;


    public int interract(Character hero){
        System.out.println("y a pas");
        return 0;
    };



    public Case(String name, String frenchName){

        this.name =name;
        this.frenchName =frenchName;

    }
    public Case(String name, int strong,String frenchName){
        this.name =name;
        this.frenchName =frenchName;
        this.strong = strong;


    }
    public Case(String name, String frenchName,int level){
        this.name =name;
        this.frenchName =frenchName;
        this.level = level;


    }



    public Case(String name, int strong, int level,String frenchName){
        this.name =name;
        this.frenchName =frenchName;
        this.strong = strong;
        this.level = level;

    }





    public String getName(){
        return name;
    }



    public int getLevel(){
        return level;
    }



}
