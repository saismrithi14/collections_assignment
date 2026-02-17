import java.util.*;
public class remove_duplicates
{
    public static void main(String [] args)
    {
        ArrayList<Integer> a1;
        HashSet<Integer> set = new HashSet<>();
        a1 = get_numbers();
        for(int num: a1)
        {
            set.add(num);
        }

        //Iterating through the list of numbers with duplicates removed
        System.out.println("The numbers without duplicates are as follows: ");
        for(int num: set)
        {
            System.out.println(num);
        }
    }

    public static ArrayList<Integer> get_numbers()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        while(true)
        {
            System.out.println("Enter a number, type -1 to leave");
            int number = sc.nextInt();
            if(number == -1)
            {
                break;
            } 

            else
            {
                a1.add(number);
            }
        }

        return a1;
    }
}