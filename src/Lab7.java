import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author jwright
 */
public class Lab7 {
    public static void main(String[] args)
    {
        /**
         * Question 1 - in the space below write a while loop that will display the numbers 1 - 10 on the screen
         */
        System.out.println("Question 1: ");
        int i=1;
        while (i<=10)
        {
            System.out.printf("%d%n",i);
            i++;
        }
        /**
         * Question 2 - in the space below write a while loop that will display the numbers 0 - 10 on the same line, going up by 2's
         * for example 0, 2, 4, 6, 8, 10
         */
        System.out.println("Question 2: ");
        int b=0;
        while (b <=10)
        {
            System.out.printf("%d%n",b);
            b= b + 2;
        }
        /**
         * Question 3 - in the space below write a while loop that will display the numbers 3-33 on the screen, going up by 3's
         * for example 3, 6, 9, ... 33
         */
        System.out.printf("Question 3: ");
        int c=0;
        while (c <=33)
        {
            System.out.printf("%d%n",c);
            c=c+3;
        }

        /**
         * Question 4 - in the space below write a while loop that will display the numbers 33-3 on the screen, going down by 3's
         * for example 33, 30, 27, ... , 6, 3
         */
        System.out.printf("Question 4: ");
        int d=33;
        while (d >=0)
        {
            System.out.printf("%d%n",d);
            d= d-3;
        }

        /**
         * Question 5 - in the space below write a do...while loop that will display the numbers 1-10 on the screen, going up by 1's
         * for example 1, 2, 3, ... 10
         */
        System.out.printf("Question 5:%n");
        int e=1;
        do {
           System.out.printf("%d%n",e);
           e++;
        }
        while (e<=10);
        /**
         * Question 6 - in the space below write a do...while loop that will display the numbers 0-12 on the screen, going up by 4's
         * for example 0, 4, 8, 12
         */
        System.out.printf("Question 6:%n");
        int f=0;
        do {
            System.out.printf("%d%n",f);
            f= f +4;
        }
        while (f<=12);
        /**
         * Question 7 - in the space below write a for loop that will display the numbers 1 - 10 on the screen
         */
        System.out.printf("Question 7:%n");
        for (int g=1; g<=10; g++)
        {
            System.out.printf("%d%n",g);
        }
        /**
         * Question 8 - in the space below write a for loop that will display the numbers 0 - 10 on the screen, going up by 2's
         * for example 0, 2, 4, 6, 8, 10
         */
        System.out.printf("Question 8:%n");
        for (int a=0; a<=10; a= a+2)
        {
            if (a!=10)
                System.out.printf("%d%n", a);
            else
                System.out.printf("%d%n",a);
        }

        /**
         * Question 9 - in the space below write a for loop that will display the numbers 3-33 on the screen, going up by 3's
         *          * for example 3, 6, 9, ... 33
         */
        System.out.printf("Question 9:%n");
        for (int h=0; h<=33; h= h +3)
        {
            if (h!=33)
                System.out.printf("%d%n",h);
            else
                System.out.printf("%d%n",h);
        }

        /**
         * Question 10 - in the space below write a for loop that will display the numbers 33-3 on the screen, going down by 3's
         * for example 33, 30, 27, ... , 6, 3
         */
        System.out.printf("Question 10:%n");
        for (int j=33; j>=0; j= j-3)
        {
            if (j!=0)
                System.out.printf("%d%n",j);
            else
                System.out.printf("%d%n",j);
        }

        /**
         * Question 11 - create a method called "invalidPassword" accepts a String as an argument and returns true if the password is invalid, false otherwise.  The
         * valid password is "happy".
         */
        invalidPassword();
        invalidPassword2();
        invalidPassword3();
        System.out.println("Question 14:");

        Scanner keyboard = new Scanner(System.in);
        int number;
        int count=0;
        int x;
        SecureRandom rng = new SecureRandom();
        x = rng.nextInt(10)+1;

        do {
            System.out.println("Enter a number(guess it): ");
            number = keyboard.nextInt();
            count++;
        }
        while ((number != x));
        System.out.printf("correct, it took you %d attempts to guess correctly",count);

        System.out.println("Question 15:");
        System.out.println("Enter a number: ");
        int n = keyboard.nextInt();
        System.out.println("Enter a number: ");
        int n1 = keyboard.nextInt();
        System.out.println("Enter a number: ");
        int n2 = keyboard.nextInt();
        hasTeen(n, n1, n2);
        prompt();
    }
    public static void invalidPassword() {

        System.out.println("Question 11:");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password= keyboard.nextLine();

        if (password.equals("happy"))
            System.out.println("Success!");
        else
            System.out.println("Wrong password, try again.");
    }
        /**
         * Question 12 - using a while loop and the invalidPassword method from question 7, setup a loop that will keep asking the user
         * for a password until they put in the correct password
         */
        public static void invalidPassword2()
        {
            System.out.println("Question 12:");

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a password:");
            String password = keyboard.nextLine();

            while (!password.equals("happy")) {
                System.out.print("False, try again: ");
                password = keyboard.nextLine();
        }
        System.out.println("True");
        }
        /**
         * Question 13 - using a do .... while loop and the invalidPassword method from question 7, setup a loop that will keep asking the user
         * for a password until they put in the correct password
         */
        public static void invalidPassword3()
        {
            System.out.println("Question 13:");

            Scanner keyboard= new Scanner (System.in);
            System.out.print("Enter a password:");
            String password;
            do {
               password = keyboard.nextLine();
            }
            while (!password.equals("happy"));
            System.out.print("Success!");
        }
        /**
         * Question 14 - this will be a simple number guessing game.  Have the computer select a random number between 1 and 10.  Continuously
         * ask the user to guess the number.  If the user guesses the correct number, the screen should display "correct, it took you X attempts to guess
         * correctly" (where X is the # of attempts)
         */

        //public int randomNumber()
        //{
            //SecureRandom rng = new SecureRandom();
            //return rng.nextInt(10)+1;
        //}
        /**
         * Question 15 - Write a method called "hasTeen".  The method should accept 3 integers as arguments.  The method should return true
         * if any of the arguments are in the range 13-19, false otherwise.  Use the code below to test your method.
         */
        public static String hasTeen(int n, int n1, int n2)
        {

            if ((n >= 13 && n <=19) || (n1 >= 13 && n1 <=19) || (n2 >= 13 && n2 <=19))
                return "True";

            else
                return "False";
        }


        //System.out.printf("The method hasTeen(10, 40, 17) returns %b (should be true)%n", hasTeen(10,40,17));
        //System.out.printf("The method hasTeen(10, 17, 50) returns %b (should be true)%n", hasTeen(10,17,50));
        //System.out.printf("The method hasTeen(13, 10, 50) returns %b (should be true)%n", hasTeen(13,10,50));
        //System.out.printf("The method hasTeen(13, 17, 19) returns %b (should be true)%n", hasTeen(13,17,19));
        //System.out.printf("The method hasTeen(12, 20, 6)  returns %b (should be false)%n", hasTeen(12,20,6));




        /**
         * Question 16 - Create a method that will prompt the user to enter 10 numbers.
         * There should be a prompt for each number.  Once the user has entered
         * all 10 numbers, the computer should return the highest number entered
         */
        public static void prompt()
        {
            System.out.println("Question 16:");
            Scanner keyboard = new Scanner (System.in);

            System.out.println("Enter a number: ");
            int n = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n1 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n2 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n3 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n4 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n5 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n6 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n7 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n8 = keyboard.nextInt();
            System.out.println("Enter a number: ");
            int n9 = keyboard.nextInt();

            System.out.printf("The highest number was: %d", n, n1, n2, n3, n4, n5, n6, n7, n8, n9);

        }

}
