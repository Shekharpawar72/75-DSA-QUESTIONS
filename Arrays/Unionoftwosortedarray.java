import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Unionoftwosortedarray {
     public static ArrayList<Integer> findunion(int arr1[], int arr2[]){
           Set<Integer> set = new TreeSet();

           for( int i=0; i<arr1.length; i++){
               set.add(arr1[i]);
           }
              for( int i=0; i<arr2.length; i++){
                set.add(arr2[i]);
              }

              ArrayList<Integer> res = new ArrayList<>(set);
              return res ;
        }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};

        ArrayList<Integer> union = findunion(arr1, arr2);
        for( int i=0; i<union.size(); i++){
            System.out.print(union.get(i) + " ");
        }   
    }
}
