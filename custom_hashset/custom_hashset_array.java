public class custom_hashset_array<T> {
    private T[][] buckets;
    private int rows;
    private int cols;
    private int[] bucketSize;

    public custom_hashset_array()
    {
        rows = 5;
        cols = 5;
        buckets = (T[][]) new Object[rows][cols];
        bucketSize = new int[rows]; //array of all the index pointers

    } 
    
    public void Add(T x)
    {
        int key = Math.abs(x.hashCode()) % rows;
        
        //we first will check if the element is already present in thr array first
        int flag = 0;
        for(int i = 0; i < buckets[key].length; i++)
        {
            if(buckets[key][i] != null && buckets[key][i].equals(x))
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
        {
            System.out.println(x + " already exists in the set");
        }

        else
        {
            //Now we check if the array is full or not
            int index_ptr = bucketSize[key];
            if(index_ptr >= buckets[key].length)
            {
                T[] arr = resizeArray(buckets[key]);
                buckets[key] = arr;
            }
                buckets[key][index_ptr] = x;
                bucketSize[key] ++;
                System.out.println(x + " added into the set");

        }

    }

   public T[] resizeArray(T[] t1)
   {
      int old_length = t1.length;
      T[] t2 = (T[]) new Object[old_length * 2];
      for(int i = 0; i < old_length; i++)
      {
        t2[i] = t1[i];
      }
      return t2;
   }

   public void Remove(T x)
   {
      int key = Math.abs(x.hashCode()) % rows;
      int index = 0, flag = 0;
      // iterate through the array to check if the element exists in the array
      for(int i = 0; i < bucketSize[key]; i ++)
      {
        if(buckets[key][i] != null && buckets[key][i].equals(x))
        {
            flag = 1;
            index = i;
            break;
        }
      }

      if(flag == 0)
      {
        System.out.println("The element doesn't exists in the set so cannot be removed");
      }

      else
      {
        remove_element(index, key);
        bucketSize[key] -= 1;
      }
   }

   public void remove_element(int index, int key)
   {
        T[] array = buckets[key];
       for(int i = index; i < bucketSize[key] - 1; i++)
       {
         array[i] = array[i+1];
       }

       array[bucketSize[key] - 1] = null;
   }

   public void Display() {
    System.out.println("Custom HashSet Contents:");
    for (int i = 0; i < rows; i++) {
        System.out.print("Bucket " + i + " (size " + bucketSize[i] + "): ");
        for (int j = 0; j < bucketSize[i]; j++) {
            System.out.print(buckets[i][j] + " ");
        }
        System.out.println();
    }
}

}
