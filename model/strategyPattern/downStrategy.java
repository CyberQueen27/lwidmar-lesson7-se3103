package model.strategyPattern;

import model.SnakeNode;

public class downStrategy implements DirectionStrategy{

    @Override
    public void move(SnakeNode head, int gridSize) {
        head.y += gridSize;
    }
    
}
