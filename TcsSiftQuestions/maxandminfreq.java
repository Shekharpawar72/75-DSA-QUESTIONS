package TcsSiftQuestions;

import java.util.*;



public class maxandminfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.replaceAll("[^0-9-]"," ").trim();
        String [] parts = input.split("\\s+");
        
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i=0; i<parts.length; i++){
           int num = Integer.parseInt(parts[i]);
           map.put(num , map.getOrDefault(num, 0)+1);
        }


        int minfreq = Integer.MAX_VALUE;
        int maxfreq= Integer.MIN_VALUE;

        int minelement =-1;
        int maxelement =-1;

        for( Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int freq=  entry.getValue();


            if(freq>maxfreq){
                    maxfreq= freq;
                    maxelement= element;
            }
            if(freq<minfreq){
                 minfreq=freq;
                 minelement=element;
            }

        }

        System.out.println(minelement + "->"+minfreq);
        System.out.println(maxelement+"->"+maxfreq);
    }
}
