public class hello {
    public static void main(String[] args) {
        // Basic Hello World program
        System.out.println("Hello, World!");
        
        // Basic variable declarations
        int age = 25;
        double salary = 50000.50;
        String name = "Java Developer";
        boolean isActive = true;
        
        // Display variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Active: " + isActive);
        
        // Basic method call
        greetUser(name);
        
        // Simple calculation
        int result = addNumbers(10, 20);
        System.out.println("10 + 20 = " + result);
    }
    
    // Basic method
    public static void greetUser(String username) {
        System.out.println("Welcome, " + username + "!");
    }
    
    // Basic method with parameters and return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
