package Alive;

import Alive.IAlive;
import Obstacle.IObstacle;

public class Robot implements IAlive {
    static final float JUMP_HEIGHT = 30;
    static final float RUN_LENGTH = 30;
    @Override
    public boolean doAction(IObstacle obstacle) {
        return obstacle.check(this);
    }

    @Override
    public boolean jump(float height) {
        if (JUMP_HEIGHT >= height) {
            System.out.println("Успешно перепрыгнул");
            return true;
        } else {
            System.out.println("Не перепрыгнул");
            return false;
        }
    }

    @Override
    public boolean run(float length) {
        if (RUN_LENGTH >= length) {
            System.out.println("Успешно пробежал");
            return true;
        } else {
            System.out.println("Не пробежал");
            return false;
        }
    }
}
