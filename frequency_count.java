import java.util.*;
public class frequency_count
{
    public static void main(String [] args)
    {
        HashMap<String, Integer> product_count = new HashMap<>();
        ArrayList<String> items;
        items = get_items();
        for(String item: items)
        {
            if(product_count.containsKey(item))
            {
                int count = product_count.get(item);
                product_count.put(item, count+1);
            }

            else
            {
                product_count.put(item,1);
            }
        }

        //Printing out the contents of the hashmap
        for(Map.Entry<String, Integer> entry : product_count.entrySet())
        {
            System.out.println("Product_name: " + entry.getKey() + " product count: " + entry.getValue());
        }


    }

    public static ArrayList<String> get_items()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<>();
        while(true) 
        { 
            System.out.println("Enter the product, type exit to leave");
            String item = sc.nextLine();
            if(item.equals("exit"))
            {
                break;
            }

            else
            {
                a1.add(item);
            }
        }

        return a1;
    }
}