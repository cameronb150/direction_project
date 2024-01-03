import java.util.Scanner;

public class Solution {
    final static int DIRECTION_NORTH = 0;
    final static int DIRECTION_SOUTH = 1;
    final static int DIRECTION_EAST = 2;
    final static int DIRECTION_WEST = 3;


    private static int[] readPosition(Scanner scn) {
        // TODO implement readPosition


        int x = scn.nextInt();

        int y = scn.nextInt();

        int facingDirection = scn.nextInt();

        if(facingDirection == 0){
            System.out.print("Starting at "+ "(" + x + ", " + y + ")" + "facing NORTH");

        }


        return new int[0];
    }

    private static String directionAsString(int direction) {
        // TODO implement directionAsString
        return "NORTH";
    }

    private static boolean processInstructions(String[] instructions, int[] position) {
        // TODO implement processInstructions
        return true;
    }

    private static void moveForward(int[] position) {
        // TODO implement moveForward
    }

    private static void turnLeft(int[] position) {
        // TODO implement turnLeft
    }

    private static void turnRight(int[] position) {
        // TODO implement turnRight
    }

    private static void found(int[] position) {
        // TODO implement found
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        // TODO implement main
    }

}