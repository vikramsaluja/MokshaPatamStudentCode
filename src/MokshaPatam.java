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
        int sideLength = (int) sqrt(boardsize);

        // Create a queue of an array of ints[]
        // Create lost of booleans to keep track visited squares

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
