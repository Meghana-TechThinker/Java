import java.util.Scanner;
class Candies{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if (n%2==0 && n%7==0){
            System.out.println("Alice takes");
        }
        else if(n%2==1 && n%9==0){
            System.out.println("Bob likes");
        }
        else{
            System.out.println("charlie takes");
        }
    }
}