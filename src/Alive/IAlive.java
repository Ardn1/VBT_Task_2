package Alive;

import Obstacle.IObstacle;

public interface IAlive {
    boolean doAction(IObstacle obstacle);
    boolean jump(float height);
    boolean run(float height);
}
