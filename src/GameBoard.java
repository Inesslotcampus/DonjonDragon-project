import Case.Case;
import Case.Empty;


//potion
import Case.Potion.BigPotion;
import Case.Potion.StandardPotion;

// enemy
import Enemy.Dragon;
import Enemy.Goblin;
import Enemy.Witch;
//weapon

import Case.Weapon.Club;
import Case.Weapon.Sword;

//sort
import Case.Sort.FireBall;
import Case.Sort.Zeus;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    public List list = addCaselist();


    public List addCaselist() {

        ArrayList<Case> list = new ArrayList<>();


        Empty empty = new Empty();
        Witch witch = new Witch();
        Dragon dragon = new Dragon();
        StandardPotion standardPotion = new StandardPotion();
        FireBall fireBall = new FireBall();
        Zeus zeus = new Zeus();
        Club club = new Club();
        Sword sword = new Sword();
        Goblin goblin = new Goblin();
        BigPotion bigPotion = new BigPotion();


        list.add(empty);
        list.add(witch);
        list.add(zeus);
        list.add(fireBall);
        list.add(sword);
        list.add(dragon);
        list.add(standardPotion);
        list.add(club);
        list.add(goblin);
        list.add(bigPotion);
        list.add(empty);
        list.add(witch);
        list.add(zeus);
        list.add(fireBall);
        list.add(sword);
        list.add(dragon);
        list.add(standardPotion);
        list.add(club);
        list.add(goblin);
        list.add(bigPotion);
        list.add(empty);
        list.add(witch);
        list.add(zeus);
        list.add(fireBall);
        list.add(sword);
        list.add(dragon);
        list.add(standardPotion);
        list.add(club);
        list.add(goblin);
        list.add(bigPotion);


        return list;


    }


}
