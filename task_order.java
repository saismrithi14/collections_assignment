import java.util.*;
public class task_order
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> task_list = new LinkedHashSet<>();
        while (true) 
        { 
            System.out.println("Enter a task, type exit to leave");
            String task = sc.nextLine();
            if(task.equals("exit"))
            {
                break;
            }

            else
            {
                task_list.add(task);
            }
        }

        //printing the contents of the linked_list
        for(String task: task_list)
        {
            System.out.println(task);
        }
    }
}