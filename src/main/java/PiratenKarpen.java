import pk.Dice;
import pk.Faces;
import pk.Game;
import pk.Player;
import pk.Roll;

public class PiratenKarpen {

    public static void main(String[] args) {
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("I'm rolling the dice");
        Player player1 = new Player();
        player1.skulls = 0; player1.dice = 8; player1.score = 0; player1.result = false;
        Player player2 = new Player();
        player2.skulls = 0; player2.dice = 8; player2.score = 0; player2.result = false;
        
        for (int i = 0; i<42; i++){
            Game.game(player1,player2);
            if (player1.result == true){
                player1.num_wins++;
            }
            if (player2.result == true){
                player2.num_wins++;
            }
        }

        System.out.println("Player 1: " + player1.num_wins); System.out.println("Player 2: " + player2.num_wins);
        System.out.println("That's all folks!");
    }
    
}
