import java.util.*;
public class custom_hashset_linked_list<T>
{
    private LinkedList<T> [] buckets;
    private int N;

    public custom_hashset_linked_list()
    {
        N = 50;
        buckets = (LinkedList<T> [])new LinkedList[N]; 
        
    }

    public void Add(T x)
    {
       int key = Math.abs(x.hashCode()) % N;
       if(buckets[key] == null)
       {
         buckets[key] = new LinkedList<T>();
         buckets[key].add(x);
         System.out.println("Element " + x + " has been added to the set");
         
       }

       else
       {
        if(buckets[key].contains(x))
        {
            System.out.println("The element " + x + " is already in the set");
        }
        else
        {
            buckets[key].add(x);
            System.out.println("Element " + x + " has been added to the set");
        }
       }

    }

    public boolean Contains(T x)
    {
        int key = Math.abs(x.hashCode()) % N;
        if(buckets[key] == null)
        {
            return false;
        }

        else
        {
            if(buckets[key].contains(x))
            {
                return true;
            }

            else
            {
                return false;
            }
        }
    }


    public void Remove(T x)
    {
        int key = Math.abs(x.hashCode()) % N;
        if(buckets[key] == null)
        {
            System.out.println("The element doesn't exists because the key doesn't exist");
        }

        else if(buckets[key].contains(x))
        {
            buckets[key].remove(x);
            System.out.println("Element " + x + " has been removed");
        }

        else
        {
            System.out.println("The element doesn't exist in the array, even though the key exists");
        }
    }

    public void Display()
    {
        for(int i = 0; i < N; i++)
        {
            if(buckets[i] == null)
            {
                continue;
            }
            for(T n: buckets[i])
            {
                System.out.print(n+ " ");
            }

        }

        System.out.println();
    }

}