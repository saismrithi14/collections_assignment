import java.util.*;
public class custom_hashset<T extends Comparable<T>>
{
    private HashMap<Integer, TreeSet<T>> map; //declared a hashmap
    private int N;

    public custom_hashset()
    {
        map = new HashMap<>(); 
        N = 50;
    }

    public void add(T x)
    {
        //step 1: map the value to a key
        int key = Math.abs(x.hashCode()) % N;

        /*
        If the key is not in the hashmap, add the key and a new treeset with the element added in it
         */

        if(!map.containsKey(key))
        {
            TreeSet<T> t1 = new TreeSet<>();
            t1.add(x);
            map.put(key,t1);
            System.out.println("Element " + x + " added to the set");
        }

        else
        {
           if(map.get(key).contains(x))
           {
            System.out.println("Element " + x + " is already in the set. Duplicate elements are not allowed");
           }

           else
           {
                map.get(key).add(x);
                System.out.println("Element " + x + " added to the set");
           }
        }
    }

    public boolean Contains(T x)
    {
        int key = Math.abs(x.hashCode()) % N;
        if(!map.containsKey(key))
        {
            return false;
        }

        else if(map.containsKey(key))
        {
            if(map.get(key).contains(x))
            {
                return true;
            }
        }

        return false;
    }

    public void remove(T x)
    {
        int key = Math.abs(x.hashCode()) % N;
        if(!map.containsKey(key))
        {
            System.out.println("The element "  + x + " doesn't exist in the set as its key doesn't exist");
        }

        else
        {
            if(map.get(key).contains(x))
            {
                map.get(key).remove(x);
                System.out.println("Element " + x + " is removed from the set");
                if(map.get(key).size() == 0)
                {
                    map.remove(key);
                }
            }

            else
            {
                System.out.println("The element " +  " doesn't exist in the set even though the key exists");
            }
        }
    }

    public void display() {
    System.out.println("Custom HashSet contents:");
    for (Map.Entry<Integer, TreeSet<T>> entry : map.entrySet()) {
        System.out.print("Bucket " + entry.getKey() + ": ");
        for (T element : entry.getValue()) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

}


