import java.util.*;
public class highest
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) 
        { 
            System.out.println("Enter a number, type -1 to leave");
            int num = sc.nextInt();
            if(num == -1)
            {
                break;
            }

            else
            {
                numbers.add(num);
            }
        }

        Collections.sort(numbers);
        System.out.println("The highest score so far is: " + numbers.get(numbers.size() - 1));

    }
}