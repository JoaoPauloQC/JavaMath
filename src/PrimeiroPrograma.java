import java.io.Console;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Random;
import java.util.Scanner;

import com.board.Board;
import com.math.Math;
import com.user.User;
import com.Snake.Snake;
public class PrimeiroPrograma {

    public static void main(String[] args){


        String[][] tabuleiro = new String[5][5];





        Board board = new Board(tabuleiro);
        Snake snake = new Snake(board);
        snake.direction = "right";
        int incrementer = 0;
        while (incrementer < 10 ) {
            OffsetDateTime now = OffsetDateTime.now();
            try {
                Thread.sleep(1000); // Espera 1 segundo (1000 milissegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }



            snake.setDirection((snake.getDirectionsList()[Math.generate(0,3)]));

            snake.move();
            board.drawBoard(snake.y, snake.x);
            incrementer += 1;
        }
        }



    static double getAndPrint(double wiw){
        System.out.println(wiw);
        return wiw;
    }



}

