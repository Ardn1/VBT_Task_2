import Alive.IAlive;
import Alive.Man;
import Alive.Robot;
import Obstacle.IObstacle;
import Obstacle.Road;
import Obstacle.Wall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAlive> aliveList = new ArrayList<>();
        aliveList.add(new Man());
        aliveList.add(new Robot());
        List<IObstacle> obstacleList = new ArrayList<>();
        obstacleList.add(new Wall(3));
        obstacleList.add(new Road(9));
        obstacleList.add(new Wall(14));
        obstacleList.add(new Road(12));

        for (var alive : aliveList) {
            boolean isContinue = true;
            System.out.println(alive.getClass().getName());
            for (int i = 0; i < obstacleList.size() && isContinue; i++) {
                isContinue = alive.doAction(obstacleList.get(i));
            }
        }
    }
}
