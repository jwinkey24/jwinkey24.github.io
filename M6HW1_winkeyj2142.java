import java.util.Scanner;
public class M6HW1_winkeyj2142 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String fname;
        double rate, hours, grosspay;
        char tinue = 'y';
        
        while(tinue == 'y')
        {
            System.out.print("What is your first name?");
            fname = keyboard.next();
            System.out.print("How many hours did you work?: ");
            hours = keyboard.nextDouble();
            System.out.print("What is your hourly rate?:$ ");
            rate = keyboard.nextDouble();
            grosspay = rate * hours;
            System.out.println("Your name is: " + fname);
            System.out.println("Hourly Rate:$ " + rate );
            System.out.println("Hours Worked: " + hours);
            System.out.println("Your Gross Pay is:$ " + grosspay);
        
        
        System.out.print("Would you like to run the program again?  Enter y or n: ");
        tinue = keyboard.next().charAt(0);
        tinue = Character.toLowerCase(tinue);
        }

        
      

        

    }
}
