package MayurPractice;

public class StarHolwRect {
    //star pattern 5 by 6 hollowrectangle
    public static void main(String[]args){
        int line=5;
        int star=6;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=star;j++){
                if(i==1||j==1||i==5||j==6){
                    System.out.print("  *  ");
                }else{
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}
