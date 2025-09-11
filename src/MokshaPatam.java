import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Math.*;
/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Vikram Saluja
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {

        int[] layout = new int[boardsize + 1];

        for(int i = 1; i <= boardsize; i++){
            // Set each square to lead to itself by default
            layout[i] = i;
        }

        // Update all squares that have ladders
        for(int[] ladder : ladders){
            layout[ladder[0]] = ladder[1];
        }
        // Update all squares that have snakes
        for(int[] snake : snakes){
            layout[snake[0]] = snake[1];
        }

        // Create a queue of an array of ints[]
        // Create list of booleans to keep track visited squares
        Queue<int[]> queue = new LinkedList<>();
        // if true that means that the square has already been visited
        boolean[] visitedSquare = new boolean[boardsize + 1];

        // Set up BFS queue: --> first in first out
        // Start with square 1 and add it to the queue
        // Set that square to true
        queue.add(new int[]{1,0});
        visitedSquare[1] = true;

        // loop for BFS
        // While loop --> while queue is not empty:
            // int square = current
            // if square = boardsize then that means that the end has been reached

            // For loop to try every role between 1-6
                // Make sure that role does not exceed boardsize

        while(!queue.isEmpty()){
            // Get next square from queue
            int[] currentS = queue.remove();
            int square = currentS[0];
            int numRolls = currentS[1];

            // If reached final square, return answer
            if(square == boardsize){
                return numRolls;
            }

            // Try every dice roll from 1-6
            for(int dice = 1; dice <= 6; dice++){
                int position = square + dice;

                // Ignore roll if it moves off the board
                if(position <= boardsize){
                    // Apply a ladder or snake if there is one at the spot
                    position = layout[position];

                    // If the square has not been visited add it to the queue
                    if(!visitedSquare[position]){
                        visitedSquare[position] = true;
                        queue.add(new int[]{position, numRolls + 1});
                    }
                }
            }
        }

        return -1;

    }
}
