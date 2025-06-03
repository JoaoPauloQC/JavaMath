package com.Snake;

import com.board.Board;

public class Snake {

    public String name;
    public int size;
    public String direction;
    public int x;
    public int y;
    public Board board;

    public Snake(Board board){
        x = 0;
        y = 0;
        this.board = board;
    }

    public boolean barrerX(String parameter){
        if (parameter == "init")
            return x > 0 ;
        else {
            return x < board.board.length - 1;

        }
    }

    public boolean barrerY(String parameter){
        if (parameter == "init")
            return y > 0 ;
        else {
            return y < board.board.length - 1;

        }
    }

    public void move() {
        if (getDirection() == "up" || getDirection() == "down") {
            if (getDirection() == "up" && barrerY("final")) {
                y += 1;
            } else if (getDirection() == "down" && barrerY("init")) {
                y -= 1;
            }
        }

        else {
            if (getDirection() == "right" && barrerX("final")) {
                x += 1;
            } else if (getDirection() == "left" && barrerX("init")) {
                x -= 1;
            }
        }

    }

    public void getBigger(){
        size +=1;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public void right(){
        setDirection("right");
    }
    public void left(){
        setDirection("left");
    }
    public void up(){
        setDirection("up");
    }
    public void down(){
        setDirection("down");
    }

    public String[] getDirectionsList(){
        String[] directions = new String[]{"up", "down" ,"right", "left"};
        return directions;
    }

    public String getDirection() {
            return direction;
    }
}
