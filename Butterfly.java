import java.util.*;
public class Butterfly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total_rows=n;
        int stars=1;
        int spaces=n-2;

        int row=1;

        while(row<=total_rows){
            //print stars
            for(int i = 0;i<stars;i++){
                System.out.print("* ");

            }
            //print spaces
            for(int i=0;i<spaces;i++){
                System.out.print("  ");
            }
            //print stars
            for(int i =0;i<stars;i++){
                System.out.print("* ");
            }
            //go to next row
            System.out.println();
            if(row<(n/2)){
                stars++;
                spaces=spaces-2;
                row++;
            }
            else if(row==(n/2)){//nothing because for next row values of star and spaces are same
                row++;

            }else{
                stars--;
                spaces=spaces+2;
                row++;
            }
        }
    }
    
}
