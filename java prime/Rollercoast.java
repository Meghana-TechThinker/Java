import java.util.Scanner;
class Candies{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int n=obj.nextInt();
        if (x>=n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}