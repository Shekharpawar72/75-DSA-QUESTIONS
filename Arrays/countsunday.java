import java.util.Scanner;

public class countsunday {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of days   ");
        int n  = sc.nextInt();  // this is the number of years we want to count the number of Sundays in.
        
         System.out.println("starting day is " );
        String  stratingday = sc.next(); // this is the starting day of the year, we will use this to calculate the number of Sundays in the year.
       

        String days[] = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
         int startingdayindex = 0;

         for( int i=0; i<7; i++){
              if(days[i].equals(stratingday)){
                startingdayindex = i;
                break;
              }
         }
           int count =0;
           int daytosunday = (7-startingdayindex)%7; // this is the number of days we need to add to the starting day to get to the next sunday.
            
           if( daytosunday <n){
                count = 1 + (n - daytosunday) / 7; // this is the number of Sundays in the year, we add 1 to count the first Sunday, and then we divide the remaining days by 7 to get the number of Sundays in the remaining days.
           }
   
           System.out.println( "Number of Sundays: " + count);
   
    }


   
}