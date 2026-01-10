   package Arrays;
   
   public class AmstrongNumber {
     
     public static boolean isArmstrong(int num) {
             int org =num;
             int sum =0;

             while(num >0){
                 int digit = num % 10;
                 sum = sum + digit * digit * digit;
                    num = num /10;
             }
              return sum == org;
     }
   
    public static void main(String[] args) {
        int number = 143;
        boolean result = isArmstrong(number);
        System.out.println(number + " is Armstrong number: " + result);
    }
   }