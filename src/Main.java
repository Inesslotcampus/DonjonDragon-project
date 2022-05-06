

import Hero.Character;

public class Main {





    public static void main(String[] args) {




        Menu menu=new Menu();

        menu.beginGame();

        menu.exit();

        Game game=new  Game();
        game.playGame();
        menu.exit();
        game.playGame();




    }
}
