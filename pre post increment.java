//post 

class Main {
    public static void main (String[] args) {
        int x =26 ;
     x++;
     System.out.println (x); 
    }
}

// pre
class Main {
    public static void main (String[] args) {
        int x =26 ;
     ++x;
     System.out.println (x); 
    }
}

// with another value 
class Main {
    public static void main (String[] args) {
        int x =26 ;
     int y = x++ ; 
        System.out.println (x); 
        System.out.println (y); 
    }
}

// result 27, 26

// with another value but pre
class Main {
    public static void main (String[] args) {
        int x =26 ;
     int y = ++x ; 
        System.out.println (x); 
        System.out.println (y); 
    }
}
// result 27 27 

