package MayurPractice;

public class StarPattern1 {
    //star pattern from 1 to 4
    public static void main(String[] args) {
        int line = 4;

        for (int i=1;i<=line;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
       }
    }
}
