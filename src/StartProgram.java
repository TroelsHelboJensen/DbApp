import java.util.Scanner;

public class StartProgram
{
    private static SqlConnector connector = new SqlConnector();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Eventuelt login
        // By card pin code and card number

        // Menu
        String choice = "";
        System.out.println("Menu");
        System.out.println(
                "1. See details\n" +
                "2. Make transaction\n");
        System.out.println("What do you want!!??");
        choice = input.nextLine();

        switch (choice) {
            case "1":
                connector.getCustomerForLogin();
                break;
            case "2":
                break;
            default:
                break;
        }
    }
}