import java.util.*;
public class attendance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       LinkedHashSet<String> students = new LinkedHashSet<>();
       while(true)
       {
         System.out.println("Enter the name of the student type exit to leave: ");
         String student = sc.nextLine();
         if(student.equals("exit"))
         {
            break;
         }

         else
         {
            students.add(student);
         }

       }

       //Students enrolled are as follows
       for(String name: students)
       {
        System.out.println(name);
       }

    }
}