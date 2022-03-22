import java.util.Arrays;
import pro.learnup.javaqa.group2.chernykh3.Game;
import pro.learnup.javaqa.group2.chernykh3.Statistics;

public class Main {

    public static void main(String[] args) {

        int[] speeds = {9, 6, 0, 10, 8};
        String[] playersName = {"Nick 9", "Leo 6", "Chris 0", "Alex 10", "Jen 8"};
        int[] playerSpeeds = {0, 0, 0, 12, 8, 0, 2};

        Statistics statistics = new Statistics(true);
        statistics.maxSpeed = 7;

        Game game = new Game (true);

        SpeedyGame speedyGame = new SpeedyGame(7, true);
        speedyGame.setLight(true);

        Game game1 = new Game(game.isGreenLight);

        game1.setLight(true);
        GameManager player = new GameManager(0, true, game1);
        player.getRound(playerSpeeds);


        System.out.println("Количество выбывших игроков: " + statistics.droppedOut(speeds));
        System.out.println("Скорость выбывших игроков: " + Arrays.toString(statistics.speedDroppedOut(speeds)));
        System.out.println("Скорость выживших игроков: " + Arrays.toString(statistics.speedStayedIn(speeds)));
        System.out.println("Имена выживших игроков: " +  Arrays.toString(statistics.survivors(playersName)));

        System.out.println("Проиграл ли игрок?: " + game.isFailed(5, true));
        System.out.println("Проиграл ли игрок?: " + speedyGame.isFailed(5, true));

        System.out.println("Игрок продержался: " + player.getRound(playerSpeeds) + " раундов");


    }

}
