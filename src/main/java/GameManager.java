import pro.learnup.javaqa.group2.chernykh3.Game;

public class GameManager extends SpeedyGame {

    public Game manager;

    public GameManager(int maxSpeed, boolean isGreenLight, Game manager) {
        super(maxSpeed, isGreenLight);
        this.manager = manager;
    }

    public int getRound(int[] playerSpeeds) {
        int i = 0;
        for (int speed : playerSpeeds) {
            if (!isGreenLight) {
                if (speed <= maxSpeed) {
                    i++;
                } else {
                    continue;
                }
            } else {
                i++;
            }
        }
        return i;
    }


}
