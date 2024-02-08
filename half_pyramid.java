import java.util.*;

public class half_pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total_rows = n;
        int stars = 1;
        int spaces = n - 1;

        int row = 1;
        while(row<=total_rows){
            //first print spaces
            for(int i=0;i<spaces;i++){
                System.out.print("  ");
            }
            //print stars
            for(int i=0;i<stars;i++){
                System.out.print("* ");
            }
            //go to next row(make changes)
            System.out.println();
            row++;
            spaces--;
            stars++;
        }
    }

}
