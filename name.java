import java.util.*;
public class name
{
    public static void main(String[] args)
    {
        ArrayList<String> name_list;
        name_list = get_names();
        Collections.sort(name_list);

        System.out.println("Printing the names in alphabetical order");
        for(String name: name_list)
        {
            System.out.println(name);
        }

    }

    public static ArrayList<String> get_names()
    {
        ArrayList<String> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 
        while (true) 
        { 
          System.out.println("Enter a name, type exit to leave");
          String name = sc.nextLine().trim();
          if(name.equals("exit"))
          {
            break;
          }  

          else
          {
            a1.add(name);
          }

        }

        return a1;
    }
}