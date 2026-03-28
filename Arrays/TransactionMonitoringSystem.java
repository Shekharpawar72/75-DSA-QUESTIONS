package Arrays;
import java.util.*;


public class TransactionMonitoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        int prevtime =-1;
        for( int i=0; i<n; i++){
               String sneder = sc.next();
                String receiver = sc.next();
                int time = sc.nextInt();
                int amount = sc.nextInt();
                   String key = sneder+" "+receiver;
                if(set.contains(key)){
                    System.out.println("Suspicious transaction detected: " );
                    return;
                }
                 set.add(key);

                 if(prevtime != -1 && (time - prevtime) > 60){
                     System.out.println("Suspicious transaction detected: " );
                    return;
                 }
                 prevtime= time; // update the previous transaction time

                 
                 
        }
                 System.out.println("Transaction is valid " + "Sender: " + set + " Receiver: " + set + " Time: " + prevtime);


    }
}
