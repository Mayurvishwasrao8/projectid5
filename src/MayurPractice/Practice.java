package MayurPractice;

public class Practice {
    public static void main(String[] args) {
        Crops c1=new Crops();
        c1.area(34);
        c1.sugarcane(265);



    }
}
class Farm {

    public int area(int a) {
        System.out.println("Area of our farm is " + a + " hector.");
    return (a);
    }

}
class Crops extends Farm{

    public static int sugarcane(int z){

        System.out.println("varity of our sugar cane is " + z);
        return (z);


    }
}
