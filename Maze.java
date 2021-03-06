import java.util.Scanner;

public class Maze
{
    public static final int EMPTY = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int END = 3;
    public static final int VISITED = 4;
    
    public static final char NORTH = 'n';
    public static final char EAST = 'e';
    public static final char SOUTH = 's';
    public static final char WEST = 'w';

    public static void main(String[] args)
    {
        int[][] grid = {
            { WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL, WALL},
            { END , EMPTY,  WALL,  WALL, EMPTY, EMPTY, EMPTY, EMPTY,  WALL, WALL},
            { WALL, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,  WALL, EMPTY,  WALL, WALL},
            { WALL,  WALL,  WALL,  WALL, EMPTY,  WALL, EMPTY,  WALL, EMPTY, WALL},
            { WALL, EMPTY, EMPTY, EMPTY, EMPTY,  WALL, EMPTY, EMPTY, EMPTY, WALL},
            { WALL,  WALL, EMPTY,  WALL,  WALL, EMPTY, EMPTY,  WALL, EMPTY, WALL},
            { WALL,  WALL, EMPTY, EMPTY, EMPTY, EMPTY,  WALL,  WALL, EMPTY,START},
            { WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL, WALL},
        };
        GridViewer.view(grid);
        String solution;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find a solution to get from ^^ to $$, using the characters " 
            + "'" + NORTH + "', '" + EAST + "', '" + SOUTH + "' and '" + WEST + "'"
            + " (for north, east, south and west).");
        System.out.print("Your solution: ");
        solution = sc.nextLine();
        
        int currentRow = 1;
        int currentCol = 0;
        boolean done = false;
        boolean solved = false;
        int charIndex = 0;
        int solutionLength = solution.length();
        
        while(!done && charIndex < solutionLength)
        {
            char direction = solution.charAt(charIndex);
            System.out.println("Location: (" + currentRow + ", " + currentCol 
                + "), next direction: '" + direction + "'");
            
            switch(direction)
            {
                case Maze.NORTH:
                    currentRow--;
                    break;
                
                case Maze.EAST:
                    currentCol++;
                    break;
                    
                case Maze.SOUTH:
                    currentRow++;
                    break;
                    
                case Maze.WEST:
                    currentCol--;
                    break;
            
                default:
                    System.out.println("You have no idea where you're going"); // Invalid direction.
            }
            
            if(Row < 0 || Col < 0
                || Row >= grid.length || Col >= grid[Row].length)
            {
                done = true;
                System.out.println("You fall into the chasm of doom"); // Out of bounds.
            }
            else
            {
            switch(grid[Row][Col])
	    {
		    caseMaze.EMPTY:
			    grid[Row][Col]=Maze.VISITED;
		    break;
                    caseMaze.WALL:
			    System.out.println("Youstumbleblindlyintoasolidconcretewall.");
		    break;
		    caseMaze.END:
		    done=true;
		    System.out.println("SOLVED!");
		    break;
		    
		    default:
		    //Donothing
		    }
            }
            
            charIndex++;
        }
        
        if(!solved)
        {
            System.out.println("You have failed to escape. Future archeologists gaze upon your remains in bafflement."); // Did not reach the end.
        }
        GridViewer.view(grid);
    }
}
