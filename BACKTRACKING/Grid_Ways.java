
public class Grid_Ways {

    public static int grid_ways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = grid_ways(i + 1, j, n, m);
        int w2 = grid_ways(i, j + 1, n, m);
        return w1+w2;
    }

    public static int fact(int num){
        if(num==0 ||num==1){
            return 1;
        }
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("In Exponential time complexity: "+grid_ways(0, 0, n, m));
        int ans=fact(n-1+m-1)/(fact(n-1)*fact(m-1));
        System.out.println("In Linear Time Complexity::"+ans);
    }
}
