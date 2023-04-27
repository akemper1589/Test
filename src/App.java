import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // question 4.
        int sum = 0;
        int counter = 1;

        System.out.println("Enter a number please");
        sum = input.nextInt();

        while (sum <= 100)
        {
            System.out.println("Enter a number please");
            sum = sum + input.nextInt();
            counter++;
        }

        System.out.println(sum + " " + "you entered" + " " + counter + "numbers");

        // question 5.
        int userInput = 0;
        System.out.println("ENter a number again please");
        userInput = input.nextInt();

        for (int x = 0; x < userInput; x++)
        {
            System.out.println("Programming is fun");
        }

        // question 6.
        System.out.println("Please enter a temp in fahrenheit");
        double f = input.nextDouble();
        double c = (f - 32) / 1.8;

        //question 7.
        int userInputv2 = 0;
        System.out.println("Please enter a number, other than 4");
        userInputv2 = input.nextInt();

        while (userInputv2 != 4)
        {
            System.out.println("Please enter a number, you can enter 4 to stop");
            userInputv2 = input.nextInt();
        }

        // question 12.
        for (int a = 2; a <= 100; a += 2)
        {
                System.out.println(a);
        }
        
        // question 13.
        for (int b = 1; b <= 99; b += 2)
        {
            System.out.println(b);
        }

        
    }

    // question ec 1.
    public static void extraCredit (String string)
    {
        char x = string.charAt(3);
        System.out.println(x * 3);
    }

    // question 1.
    public static boolean isEven(int num)
    {
        // return num % 2 == 0;

        if (num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //question 2.
    public static String calcGrade(double grade)
    {
        if (grade >= 90)
        {
            return "A";
        }
        else if (grade >= 80 && grade <= 89)
        {
            return "B";
        }
        else if (grade >= 70 && grade <= 79)
        {
            return "C";
        }
        else if (grade >= 60 && grade <= 69)
        {
            return "D";
        }
        else 
        {
            return "F";
        }
    }

    // question 3.
    public static void largerNum(int num1, int num2)
    {
        if (num1 == num2)
        {
            System.out.println("Numbers are equal");
        }
        else if (num1 > num2)
        {
            System.out.println("Number 1 is larger");
        }
        else 
        {
            System.out.println("Number 2 is larger");
        }

        // else { System.out.println(Math.Max(num1, num2))}
    }

    // question 11.
    public static void bmiCalc(int height, int weight)
    {
        System.out.println((weight * 703) / (Math.pow(height, 2)));
    }

}
