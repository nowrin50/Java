

class Supporter {
    void cheer () { // method display 
        System.out.println ("may the best team win");
    }
}

class ArgentinaSupporter extends Supporter {
    void cheer () {  // Override the cheer method to provide a specific cheer for Argentina
        System.out.println ("vamos argentina ");
    }
}

class ColombianSupporter extends Supporter {
    void cheer () {
        System.out.println ("good luck colombia");
    }
}


public class PolymorphismDemo {
    public static void main (String [] args) {
        Supporter supporter1 = new ArgentinaSupporter () ; // Supporter object 
        Supporter supporter2 = new ColombianSupporter () ; 
        
        supporter1.cheer(); //Call the cheer method on supporter1
        // This will call the overridden cheer method in ArgentinaSupporter
        supporter2.cheer() ; 
    }
}
