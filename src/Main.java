import Enemy.Goblin;
import Case.Case;
public class Main {





    public static void main(String[] args) {




        GameBoard board = new GameBoard();
        board.addCaselist();

        Menu menu=new Menu();

        menu.beginGame();

        menu.exit();

        Game game=new  Game();
        game.playGame();
        menu.exit();








    }
}
