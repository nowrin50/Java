
class MathOperation {
    
    public int add (int a, int b) {
        return a+b ; 
    }
    
    public int add (int a, int b, int c ) { // overload 
        return a+b+c ; 
    }
    
    public double add (double a, double b) {
        return a+b ; 
    }
}

public class  Main {
    public static void main (String[] args) {
        MathOperation math = new MathOperation () ; 
        
        System.out.println (math.add(2, 3)) ;
        System.out.println (math.add(2, 3, 4));
        System.out.println (math.add(1.4, 2.5));
    }
}
