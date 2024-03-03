public class Session3{
    public static void main(String[]args)throws Exception{
        int[] arr = new int[7];
        arr[0]=0;
        arr[1]=1;
        System.out.println(arr[0]+ " " + arr[1]+ " ");
        for (int a = 2; a < 7; a++){
            if (a == 2){
                arr[a] = arr[a-1];
            }else {
                arr [a] = arr[a-1]+arr[a-2]+arr[a-3];
            }
            System.out.println(arr[a]+ " ");
        }
    }
}
