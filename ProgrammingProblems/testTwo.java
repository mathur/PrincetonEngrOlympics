public class Practice67 {
    public static void main(String[] args){
        int arr[][] = {{0,0,0,0,0},
                       {0,0,0,0,0},
                       {0,1,1,1,0},
                       {0,0,0,0,0},
                       {0,0,0,0,0}};
        
        System.out.println(findPaths(arr, 4, 4, 0));       
    }

    public boolean path(int[][] arr,int a,int b,int count){
        
        if(1 == a && 1 == b){
            count++;
            return true;
        }
        if(b > 0 && arr[a][b-1] != 0){
            count = path(arr, a, b-1, count);
        }
        if(a>;0 && arr[a-1][b] != 0){
            count = path(arr, a-1, b, count);
        }
        if (count > 0)
            return true;
        else
            return false;
    }
}