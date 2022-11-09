import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner mt=new Scanner(System.in);

        System.out.println("enter the number");
        int a=mt.nextInt();
        System.out.println("enter the number");
        int b = mt.nextInt();

        if(a<b){
            System.out.println("A is less then B");

        }else {
            System.out.println("B is less than A");
        }
    }
}
