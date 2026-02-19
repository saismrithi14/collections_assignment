public class Main_Array {
    public static void main(String[] args) {
        System.out.println("\nTesting hashset of integers");
        custom_hashset_array<Integer> csa = new custom_hashset_array<>();

        // Add elements (trigger resizing)
        csa.Add(10);
        csa.Add(20);
        csa.Add(30);
        csa.Add(40);
        csa.Add(50);
        csa.Add(60); // Should trigger resizing
        csa.Display();
        csa.Add(35);
        csa.Add(78);
        csa.Add(23);
        csa.Display();

        // Add duplicates
        csa.Add(20); // Duplicate
        csa.Add(50); // Duplicate
        csa.Display();

        // Remove elements
        csa.Remove(30); // Present
        csa.Remove(70);
        csa.Remove(23); 
        csa.Display();

        System.out.println("\nTesting hashset with strings");
        custom_hashset_array<String> csas = new custom_hashset_array<>();

        // Add elements (trigger resizing)
        csas.Add("Alice");
        csas.Add("Bob");
        csas.Add("Charlie");
        csas.Add("David");
        csas.Add("Eve");
        csas.Add("Frank"); // Should trigger resizing
        csas.Display();

        // Add duplicates
        csas.Add("Alice");   // Duplicate
        csas.Add("David");   // Duplicate
        csas.Display();

        // Remove elements
        csas.Remove("Charlie"); // Present
        csas.Remove("Zoe");     // Not present
        csas.Display();

        // Re-add removed elements
        csas.Add("Charlie");
        csas.Add("Alice"); // Duplicate
        csas.Display();
    }
}


