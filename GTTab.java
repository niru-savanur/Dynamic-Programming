import java.util.*;


public class GTTab {
    static long gtTab(int a, int b){
        long[][] arr = new long[a+1][b+1];
        Arrays.stream(arr).forEach(ar -> Arrays.fill(ar, 0));
        arr[1][1] = 1;
        for(int i = 0;i<=a; i++){
            for(int j = 0; j<=b; j++){
                long temp = arr[i][j];
                if((i+1) <= a) arr[i+1][j] += temp;
                if ((j + 1) <= b) arr[i][j+1] += temp;
            }
        }
        return arr[a][b];
    }
    public static void main(String[] args) {
        System.out.println(gtTab(2,3));
        System.out.println(gtTab(4, 4));
        System.out.println(gtTab(2, 34));
        System.out.println(gtTab(18, 18));
    }
}
