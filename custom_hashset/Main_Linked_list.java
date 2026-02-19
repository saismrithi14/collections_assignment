public class Main_Linked_list {

    public static void main(String [] args)
    {
        custom_hashset_linked_list<Integer> number_set = new custom_hashset_linked_list<>();
        number_set.Add(1);
        number_set.Add(2);
        number_set.Add(2);

        System.out.println("Does the set contain 5? " + number_set.Contains(5));
        number_set.Add(5);
        System.out.println("Does the set contain 5? " + number_set.Contains(5));
        number_set.Remove(5);
        System.out.println("Does the set contain 5? " + number_set.Contains(5));


        //Trying with strings now
        custom_hashset_linked_list<String> css = new custom_hashset_linked_list<>();
        css.Add("Alice");
        css.Add("Bob");
        css.Add("Polly");
        css.Add("Bob");

        css.Display();
        System.out.println("Does the set contain Smrithi? " + css.Contains("Smrithi"));
        css.Add("Smrithi");
        css.Display();
        css.Remove("Smrithi");
        System.out.println("Does the set contain Smrithi? " + css.Contains("Smrithi"));
        css.Display();
    
    }
    
}
