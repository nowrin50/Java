
class Calculator {
// encap 
    private int intResult ;
    private double doubleResult ; 

  //constructor 
    public Calculator() {
        intResult = 0;
        doubleResult = 0.0 ;
    }

// overload 
    public void add (int a, int b) {
        intResult = a+b ;
        System.out.println (" Sum of integers:" + intResult); 
    }
    
    public void add (double a, double b) {
        doubleResult = a + b;
        System.out.println ("Sum of doubles:" + doubleResult); 
    }

// get method 
    public int getIntResult() {
        return intResult ; 
    }
    
    public double getDoubleResult() {
        return doubleResult ; 
    }
}

/* Private fields (intResult and doubleResult) are used for encapsulation.
The constructor initializes both results to 0 and 0.0.
There are overloaded add methods to handle both integer and double addition.
Getter methods (getIntResult and getDoubleResult) correctly return the values of intResult and doubleResult */ 
