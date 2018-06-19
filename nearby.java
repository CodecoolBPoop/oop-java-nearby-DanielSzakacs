import java.util.*;

public class nearby{
    static Scanner userInput = new Scanner(System.in);
    public static int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };


    public static void main(String[] args) {
        int x = userInput.nextInt();
        int y = userInput.nextInt();
        int toMiss = multi[x][y] ;
        int range = userInput.nextInt();
        int rangeCount = y + range;

        if (range == 1){
            System.out.println(multi[x][y + 1]);

        }else{
            y = 0;
            while (y != rangeCount) {
                if (multi[x][y] == toMiss) {
                    y++;
                }
                System.out.print(multi[x][y] + ", ");
                y++;
            }
            System.out.println(multi[x][y]);
        }
    }
}