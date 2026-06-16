
import java.util.*;
public class sensorReading{
    public static boolean isInc(int[] arr,int idx){
        if(idx == arr.length-1) return true;
        if(arr[idx]>=arr[idx+1]) return false;

        return isInc(arr,idx+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(isInc(arr,0));
        }
    }
}