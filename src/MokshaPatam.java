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

        for(int i = 1; i <= boardsize + 1; i++){
            // Set each square to lead to itself by default
            layout[i] = i;
        }

        // Create a queue of an array of ints[]
        // Create list of booleans to keep track visited squares
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visitedSquare = new boolean[boardsize + 1];

        // Set up BFS queue: --> first in first out
        // Start with square 1 and add it to the queue
        // Set that square to true

        // loop for BFS
        // While loop --> while queue is not empty:
            // int square = current
            // if square = boardsize then that means that the end has been reached

            // For loop to try every role between 1-6
                // Make sure that role does not exceed boardsize

        return 0;
    }
}
