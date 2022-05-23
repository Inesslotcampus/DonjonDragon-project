import Case.*;
import Case.Empty;

//potion
import Case.Potion.*;

// enemy
import Enemy.*;
//weapon
import Case.Weapon.*;
//sort
import Case.Sort.*;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    public List list = addCaselist();


    public List addCaselist() {

        ArrayList<Case> list = new ArrayList<>();


        for (int i = 0; i < 64; i++) {


            int index = i;



            switch (index) {




                case 45, 52, 56, 62:
                    list.add(new Dragon());
                    break;

                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47:
                    list.add(new Witch());
                    break;
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    list.add(new Goblin());
                    break;

                case 2, 11, 5, 22, 38:
                    list.add(new Club());
                    break;
                case 19, 26, 42, 53:
                    list.add(new Sword());
                    break;
                case 1, 4, 8, 17, 23:
                    list.add(new Zeus());
                    break;

                case 48, 49:
                    list.add(new FireBall());
                    break;
                case 7, 13, 31, 33, 39, 43:
                    list.add(new StandardPotion());
                    break;

                case 28, 41:
                    list.add(new BigPotion());
                    break;


                default:
                list.add(new Empty());

            }
        }


        return list;


    }


}
