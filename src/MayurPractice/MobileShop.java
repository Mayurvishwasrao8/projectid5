import java.util.Scanner;
public class MobileShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("WELCOME TO WORLDCLASS  MOBAILCARE");
        System.out.println("if you have like idia then press 1");
        System.out.println("if you have like jio then press 2");
        System.out.println("if you have like airtal then press 3");
        System.out.println("if you have like vadafone then press 4");
        int a = input.nextInt();
        int b =  input.nextInt();


        switch (a) {
            case 1:
                System.out.println("welcome in world of idia");
                System.out.println("You have to buy new SIMCARD then press 1");
                System.out.println("You have to port SIMCARD then press 2");
                System.out.println("You have to buy new recharge plan then press 3");
                System.out.println("You have to buy only datapack then press 4");
                System.out.println("You have to buy Hotstar subscription then press 5");
                System.out.println("You have to call to  customercare  then press 6");

                optionsForIdia (b);
                break;
            case 2:
                System.out.println("welcome in world of jio");
                System.out.println("You have to buy new SIMCARD then press 1");
                System.out.println("You have to port SIMCARD then press 2");
                System.out.println("You have to buy new recharge plan then press 3");
                System.out.println("You have to buy only datapack then press 4");
                System.out.println("You have to buy Hotstar subscription then press 5");
                System.out.println("You have to call to  customercare  then press 6");

                optionsForIdia (b);
                break;
            case 3:
                System.out.println("welcome in world of airtal");
                System.out.println("You have to buy new SIMCARD then press 1");
                System.out.println("You have to port SIMCARD then press 2");
                System.out.println("You have to buy new recharge plan then press 3");
                System.out.println("You have to buy only datapack then press 4");
                System.out.println("You have to buy Hotstar subscription then press 5");
                System.out.println("You have to call to  customercare  then press 6");

                optionsForIdia (b);
                break;
            case 4:
                System.out.println("welcome in world of vadafone");
                System.out.println("You have to buy new SIMCARD then press 1");
                System.out.println("You have to port SIMCARD then press 2");
                System.out.println("You have to buy new recharge plan then press 3");
                System.out.println("You have to buy only datapack then press 4");
                System.out.println("You have to buy Hotstar subscription then press 5");
                System.out.println("You have to call to  customercare  then press 6");

                optionsForIdia (b);
                break;
            default:
                System.out.println("your choise is wrong");
        }
    }
       public static void optionsForIdia(int b)
        {



            switch (b){
                case 1:
                          System.out.println("Give me $500 & take your new SIMCARD" );
                          break;
                case 2:
                          System.out.println("Give me your OTP. your simcard is ported");
                          break;
                case 3:
                          System.out.println("which reacharge plan do you choise");
                          break;
                case 4:
                          System.out.println("which DATAPACK do you want?");
                          break;
                case 5:
                          System.out.println("give me $399 for subscription ");
                          break;
                case 6:
                          System.out.println(" I am from idia costomercare service what is your problem sir? ");
                          break;
                default:
                          System.out.println("wrong choise");
            }
        }
}
