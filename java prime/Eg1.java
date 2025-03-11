import java.util.Scanner;
class Eg1{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%3==0){
          System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}