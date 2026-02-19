public class Main {
    public static void main(String[] args)
    {
        //Trying with different types
        //1) Integer set
        custom_hashset<Integer> csi = new custom_hashset<>();
        System.out.println("Test cases for custom_hashset which takes an Integer as its type");
        csi.add(2);
        csi.display();
        csi.add(3);
        csi.display();
        csi.add(3);
        csi.display();
        csi.add(1);
        csi.display();

        csi.remove(3);
        csi.display();
        csi.remove(4);
        csi.display();
        System.out.println("Does the set contain 5: " + csi.Contains(5));
        csi.add(5);
        csi.display();
        System.out.println("Does the set contain 5: " + csi.Contains(5));
        csi.remove(5);
        csi.display();
        System.out.println("Does the set contain 5: " + csi.Contains(5));
        csi.display();


        //Trying to create a hashset of strings
        System.out.println("Trying to create a hashset of strings");
        custom_hashset<String> css = new custom_hashset<>();
        css.add("Alice");
        css.display();
        css.add("Bob");
        css.display();
        css.add("Carol");
        css.display();
        css.add("Carol");
        css.display();

        System.out.println("Does the hashset contain Smrithi " + css.Contains("Smrithi"));
        System.out.println("Does the set contain Carol? " + css.Contains("Carol"));
        css.add("Smrithi");
        css.display();
        System.out.println("Does the hashset contain Smrithi " + css.Contains("Smrithi"));
        css.remove("Naina");
        css.display();
        css.remove("Smrithi");
        css.display();
        System.out.println("Does the hashset contain Smrithi " + css.Contains("Smrithi"));


    }
}
