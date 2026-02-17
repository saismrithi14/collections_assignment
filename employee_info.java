import java.util.*;
public class employee_info
{
    public static void main(String [] args)
    {
        HashMap<Integer, String> employee = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println("Would you like to leave the program? Y/N ");
                String ans = sc.nextLine().trim();
                if(ans.equals("Y"))
                {
                    break;
                }
                System.out.println("Enter the employee_id");
                int id = sc.nextInt();
                sc.nextLine();
                if(employee.containsKey(id))
                {
                    throw new DuplicateKeyException("Key already exists in employee. Please try again");
                }

                System.out.println("Enter a name: ");
                String name = sc.nextLine().trim();
                employee.put(id,name);
            }

            catch(DuplicateKeyException de)
            {
                System.out.println(de.getMessage());
                continue;
            }
        }

        //Printing the contents of the hashmap
        for(Map.Entry<Integer, String> entry : employee.entrySet())
        {
            System.out.println("Employee id: " + entry.getKey() + " Employee name: " + entry.getValue());
        }
    }

}

class DuplicateKeyException extends Exception
{
    public DuplicateKeyException(String message)
    {
        super(message);
    }
}