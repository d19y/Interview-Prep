import java.lang.Math;

public class Solution {
    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int a = Integer.parseInt(v1[0]);
        int b=0;
        if(v1.length > 1)
            b = Integer.parseInt(v1[1]);

        int c = Integer.parseInt(v2[0]);
        int d = 0;
        if(v2.length > 1)
            d = Integer.parseInt(v2[1]);

        int result=-5;

        if(a > c){
            result = 1;
        }else if(a < c){
            result = -1;
        }else if(a == c){

            if(b > d){
                result = 1;
            }else if(b < d){
                result = -1;
            }else if(b == d){
                result = 0;
            }
        }

        return result;
    }

    public static void main(String args[]){

        Solution soln = new Solution();
        System.out.println(soln.compareVersion("1.0", "1.1"));
    }
}
