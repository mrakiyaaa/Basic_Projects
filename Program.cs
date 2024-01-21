using System;

class program
{
    static void Main(String[] args)
    {
        Console.WriteLine(" Enter Side A: ");
        double a = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine(" Enter Side b: ");
        double b = Convert.ToDouble(Console.ReadLine());

        double c = Math.Sqrt((a * a) + (b * b));

        Console.WriteLine("The hypotenuse is: " + c);

    }
}