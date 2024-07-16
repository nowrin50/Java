class Animal {

public void animalSound () {

System.out.println ("Animals make sound") ;

} 

}

class Pig extends Animal {

public void animalSound() {
System.out.println (" pig says wee wee") ; 

}
}

class Dog extends Animal {
public void animalSound() {
System.out.println ("dog says bow bow");
}
} 

class Main {
public static void main (String[] args) {

Animal myAnimal = new Animal();
Animal myPig = new Pig();
Animal myDog = new Dog();

myAnimal.animalSound();
myPig.animalSound();
myDog.animalSound();
}
}
