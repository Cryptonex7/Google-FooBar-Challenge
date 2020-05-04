package level2.number_station_coded_messages;

public class Solution {
    public static int[] solution(int[] l, int t) {
        for(int i = 0; i < l.length; i++ ){
            int sum = 0;
            for(int k = i; k < l.length; k++ ){
                sum += l[k];
                if(sum == t)
                    return new int[] {i, k};
            }
        }
        return new int[] {-1, -1};
    }
}