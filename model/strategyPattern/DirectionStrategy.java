package model.strategyPattern;

import model.SnakeNode;

public interface DirectionStrategy {

    void move(SnakeNode head, int gridSize);
}
