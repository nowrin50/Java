// basic
import java.util.*;
class Main {
    public static void main (String[] args){
        int[] numbers = new int [5] ;
        numbers [0] = 1;
        numbers[1] = 2;
        System.out.println (Arrays.toString(numbers));
    }
}



//short cut
import java.util.*;
class Main {
    public static void main (String[] args){
        int[] numbers = {1, 2,3,4,5} ;
        System.out.println(numbers.length);
       
    }
}


// sort length
import java.util.*;
class Main {
    public static void main (String[] args){
        int[] numbers = {1,3,2,4,5} ;
        Arrays.sort(numbers);
        System.out.println(numbers.length);
       
    }
}

//2D array
import java.util.*;
class Main {
    public static void main (String[] args){
        int[][] numbers = new int [2] [3] ;
        numbers[0] [0] =1;
        System.out.println(Arrays.deepToString(numbers));
       
    }
}


//shortcut
import java.util.*;
class Main {
    public static void main (String[] args){
        int[][] numbers = { {1,2,3}, {4,5,6} }  ;
       
        System.out.println(Arrays.deepToString(numbers));
       
    }
}
