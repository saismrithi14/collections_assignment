import java.util.*;
public class shopping_cart
{
    public static void main(String [] args)
    {
        ArrayList<String> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter an item you want to put to cart, exit to leave the program: ");
            String item = sc.nextLine();
            if(item.equals("exit"))
            {
                break;
            }

            else
            {
                cart.add(item);
            }
        }

        System.out.println("The items in the cart are as follows: ");
        for(String item: cart)
        {
            System.out.println(item);
        }
        
            
    }
 }


    
