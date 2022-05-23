import Enemy.Goblin;
import Case.Case;

import javax.lang.model.element.Name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

//     JDBC jdbc = new JDBC();
//       jdbc.connectToBDD("Warrior", "Zebi",5,5);
//
//
//
//
   }
}
