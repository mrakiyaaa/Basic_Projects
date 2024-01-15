import java.util.Scanner;

public class calculator 
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //getting opertor
        while (true) 
        {
            System.out.println("Choose an operation do you want: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            
            if (choice == 5)
            {
                System.out.println("exiting the calculator, Good byee!");
                break;
            }

            System.out.println("Enter the 1st number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the 2nd number");
            double num2 = scanner.nextDouble();

            double result = 0;

            //Choices 
            switch (choice)
            {
                case 1 :
                    result = add(num1, num2);
                    break;

                case 2 :
                    result = substract(num1, num2);
                    break;

                case 3 :
                    result = multiply(num1, num2);
                    break;

                case 4 :
                    if (num2 != 0) 
                    {
                        result = divide(num1, num2);
                    }

                    else 
                    {
                        System.out.println("Sorry: Cannot divide by Zero");
                    }

                    break;

                default:
                    System.out.println("Invalid choice...!");

                
            }
            //Output
            System.out.println("Result is " + result);
        }

        }
        
        private static double add(double a, double b)
        {
            return a + b;
        }

        private static double substract(double a, double b)
        {
            return a - b;
        }

        private static double multiply(double a, double b)
        {
            return a * b;
        }

        private static double divide(double a, double b)
        {
            return a / b;
        }

    }

