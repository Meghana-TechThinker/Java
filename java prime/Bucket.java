import java.util.Scanner;
class Bucket{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int w=obj.nextInt();//initially bucket has
        int x=obj.nextInt();//max capacity
        int y=obj.nextInt();//filling per hour
        int z=obj.nextInt();//time
        int res=(w+y*z);
        if (res<x){
            System.out.println("unfilled");
        }
        else if(res>x){
            System.out.println("overflow");
        }
        else{
            System.out.println("filling");
        }
    }    
}