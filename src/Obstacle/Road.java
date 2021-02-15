package Obstacle;

import Alive.IAlive;

public class Road implements IObstacle{
    private float length;

    public Road(float length) {
        this.length = length;
    }

    @Override
    public boolean check(IAlive alive) {
        return alive.run(length);
    };
}
