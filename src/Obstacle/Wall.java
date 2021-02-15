package Obstacle;

import Alive.IAlive;

public class Wall implements IObstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean check(IAlive alive) {
        return alive.jump(height);
    };
}
