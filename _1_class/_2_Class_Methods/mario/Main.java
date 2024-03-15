package _2_Class_Methods.mario;
import _2_Class_Methods.mario.game.MarioGame;
import _2_Class_Methods.mario.game.GameRunner;
public class Main {

    public static void main(String[] args){
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();


    }

}
