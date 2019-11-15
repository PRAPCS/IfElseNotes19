
/**
 * Write a description of class IfElseExamples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        int age = 5;
        int grade = 95;
        String letter = "F";
        //  <, >, <= less than or equal, >= greater to or equal, == equal, != not equal
        if(age >= 18)
        {
            System.out.println("You can Vote");
            System.out.println("I like ice cream");
        }
        else
        {
            System.out.println("You cannot vote");
            System.out.println("No ice cream for you");
            if(age < 5)
            {
                System.out.println("No ipad for you"); 
            }
        }

        //cascading if
        if (grade >=90)
            letter = "A";
        else if (grade >=80)
            letter = "B";
        else if (grade >=70)
            letter = "C";
        else if (grade >=60)
            letter = "D";
        else
            letter = "F";

        System.out.println("Your Grade is an: "+letter);
    }
}