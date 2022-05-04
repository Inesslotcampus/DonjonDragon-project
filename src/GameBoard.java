public class GameBoard {

    public int randomResultDice(){

        int max=6;
        int min =1;
         int dice= (int) Math.floor(Math.random() * (max - min + 1) + min);
        return dice;


    }

    public int  heroMove(){
        int position =0;
        int diceResult= this.randomResultDice();
        return position =position +diceResult;




    }
    void heroPosition(){

        int position=heroMove();

        int[] gameBoard = new int[64];
        while(gameBoard[position]<gameBoard[63]){

            System.out.println(gameBoard[position]);

        }

    }




}
