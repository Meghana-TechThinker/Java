import java.util.Scanner;
class Control{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thurday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not a day");
                break;
            
        }
        System.out.println("Hello");
    }
}
