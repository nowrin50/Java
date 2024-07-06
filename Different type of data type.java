import java.util.Scanner ;

class Input {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
       
        System.out.print("Enter Float:");
        float myFloat = input.nextFloat() ;
        System.out.println (" Float entered = " + myFloat);
       
        System.out.print ("Enter double:");
        double myDouble = input.nextDouble() ;
        System.out.println ("Double entered =" + myDouble );
       
        System.out.print("Enter String:");
        String myString = input.next();
        System.out.println ("String entered =" + myString);
    }
}
