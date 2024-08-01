class Overload {
    // Method to display a string message
    public void display(String message) {
        System.out.println("Message: " + message);
    }

    // Method to display an integer number
    // Corrected the parameter name from "number" to "Number"
    protected void display(int number) {
        System.out.println("Number: " + number);
    }

    // Method to display a double value
    void display(double value) {
        System.out.println("Value: " + value);
    }
}

// Main class to test the Overload class
public class Main { // Corrected the class name "Class" to "class"
    public static void main(String[] args) {
        Overload obj = new Overload(); // Corrected the syntax error
        obj.display("hello"); // Calls the display method with a string argument
        obj.display(42); // Calls the display method with an integer argument
        obj.display(3.50); // Calls the display method with a double argument
    }
}
