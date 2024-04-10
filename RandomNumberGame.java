import java.util.*;

public class RandomNumberGame {

    public static void Game() {
        Scanner sc = new Scanner(System.in);
        int RandomNumber = (int) (Math.random() * 101);
        // System.out.println(RandomNumber);
        
        int count = 0;
        while (true) {

            System.out.println("Enter your Number : ");
            int n = sc.nextInt();
            count++;
            if (n == RandomNumber) {
                System.out.println("You guess right number \n\n");
                if (count == 1) {
                    System.out.print("Cogratulation \n\n You won");
                    System.out.print("\n\n Rs. 2.00cr  ");
                }
                else if (count > 5) {
                    System.out.println("Cogratulation \n\n You get 10rs Diary Milk");
                }
                else if (count > 1) {
                    System.out.println("Cogratulation \n\n You get flat 90% OFF Any Online Shopping");
                }
                break;
            } else if (n < RandomNumber) {
                System.out.println("Enter greater number");
            } else if (n > RandomNumber) {
                System.out.println("Enter Smaller number");
            }
        }
        System.out.print("\nYour guess time is " + count);
        System.out.println();
    }

    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create account");
        System.out.println("2. Login account");
        System.out.println("0. Exit");
        String Username = "";
        String Password = "";
        while (true) {

            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                System.out.print("Create unique User Name : ");
                Username = sc.nextLine();
                System.out.print("Create Password : ");
                Password = sc.nextLine();
                    System.out.println("Your Account has been Created Successfully\n\n");
                    break;

                case 2:
                        
                        System.out.print("Enter your user name : ");
                        String EnterUserName = sc.nextLine();
                        System.out.print("Enter Password : ");
                        String EnterPassword = sc.nextLine();
                        if (EnterUserName.equals(Username) && EnterPassword.equals(Password)) {
                            System.out.print("Login Successfully\n\n");

                            System.out.println("If you want to start game press \"1\" ");
                            System.out.println("If you want to Exit press \"0\" ");

                            int ch1 = sc.nextInt();

                            switch (ch1) {
                                case 1:
                                    Game();
                                    break;

                                case 0:
                                    return;

                                default:
                                    System.out.print("\n Invalid key \n\n press a valid key");
                                    break;
                            }
                        } else {
                            System.out.print(" Invalid User Name or Password !\n\n please try again");
                        }
                        
                    

                case 0:
                    return;

                default:
                    System.out.print("\n Invalid key \n\n press a valid key");
                    break;
            }

        }
    }
}