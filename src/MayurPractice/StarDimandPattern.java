package MayurPractice;

public class StarDimandPattern {

    public static void main(String[] args) {
        int line = 4;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
