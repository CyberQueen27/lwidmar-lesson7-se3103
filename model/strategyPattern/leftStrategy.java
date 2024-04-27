package model.strategyPattern;

import model.SnakeNode;

public class leftStrategy implements DirectionStrategy {

    @Override
    public void move(SnakeNode head, int gridSize) {
        head.x -= gridSize;
    }
    

    
}
