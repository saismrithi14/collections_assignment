import java.util.*;
public class duplicates
{
    public static void main(String[] args)
    {
        ArrayList<Integer> duplicate_numbers = new ArrayList<>();
        ArrayList<Integer> number_list;
        HashSet<Integer> set = new HashSet<>();
        number_list = get_numbers();

        //finding the duplicate numbers
        for(int n: number_list)
        {
            if(set.contains(n))
            {
                duplicate_numbers.add(n);
            }

            else
            {
                set.add(n);

            }
        }

        System.out.println("Duplicate nubers are as follows");
        //printing the duplicate numbers
        for(int n: duplicate_numbers)
        {
            System.out.println(n);
        }

    }

    public static ArrayList<Integer> get_numbers()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        while (true) 
        { 
            System.out.println("Enter a number, enter -1 to exit :");
            int id = sc.nextInt();
            sc.nextLine();  
            
            if(id == -1)
            {
                break;
            }

            else
            {
                a1.add(id);
            }
        }

        return a1;

    }
}