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
//x was incremented after y was assigned its value, so when you print x, it shows the incremented value, which is 27.
//y was assigned 26 before x was incremented, so y still holds the value 26.
// x = 27
//y = 26

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

