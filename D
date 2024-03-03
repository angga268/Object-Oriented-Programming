public class Session3{
    public static void main(String[]args)throws Exception{
        int maxLoop = 6;
        int a= 0;
        int b= 1;
        System.out.println(a + " "+ b + " " );
        for(int n= 2; n < maxLoop; n++ ){
            int next = a + b;
            System.out.println(next+ " ");
            a = b;
            b = next;
        }
    }
}
