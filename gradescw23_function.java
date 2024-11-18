import java.util.Scanner;
public class gradescw23_function 
{
    public static void main(String[] args) 
    {
        int number, total;
        double average;
        Scanner k = new Scanner(System.in);
        number = getNumGrades(k);
        total = getTotal(k, number);
        average = getAverage(number, total);
        displayValues(number, total, average);
        System.out.print("Hello");
    }
    public static void displayInfo()
    {
        System.out.println("");
        System.out.println("Jamil Winkey");
        System.out.println("11/18/24");
        System.out.println("cw grades 123456");
        System.out.println("this program will use functions to find a grade");
        System.out.println("");

    }
    public static int getNumGrades(Scanner k)
    {
        int num;
        System.out.print("Enter number of grades to average: ");
        num = k.nextInt();
        return num;
    }
    public static int getTotal(Scanner k, int num)
    {
        int i, grade, total = 0;
        for(i=0; i < num; i++)
        {
            System.out.print("Enter a grade: ");
            grade = k.nextInt();
            total += grade;
        }
        return total;
    }
    public static double getAverage(int num, double tot)
    {
        return tot / num;
    }
    public static void displayValues(int num, int total, double average)
    {
        System.out.println("Number of grades is " + num);
        System.out.println("Number of grades: " + total);
        System.out.println("Average of grades: " + average);
    }
}
