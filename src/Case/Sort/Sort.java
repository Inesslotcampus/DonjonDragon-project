package Case.Sort;

import Enemy.SuperStrength;

public class Sort extends Case.Case implements SuperStrength {

    public Sort(String name, int strong,  String frenchName){
            super(name, strong, frenchName);

        }



    @Override
    public int superStrength(){

        return  3;

    }

    @Override
    public int strength(){


        return strong;
    }




}
