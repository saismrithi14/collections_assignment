import java.util.*;
public class queue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue<String> hospital = new LinkedList<>();
        while (true)
        { 
            System.out.println("Enter the patient, type exit to leave");
            String patient = sc.nextLine();
            if(patient.equals("exit"))
            {
                break;
            }

            else
            {
                hospital.add(patient);
            }
        }

        //Printing the patients in queue
        while(!hospital.isEmpty())
        {
            System.out.println("Patient: " + hospital.remove());
        }
    }
}