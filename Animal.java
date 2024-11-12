
package javaapplication31;
class Animal1 {
    void eat() {
        System.out.println("Eating");
    }
}
class Mammal extends Animal1{
    void walk() {
        System.out.println("Walking");
    }
}
class Dog extends Mammal{
    void bark() {
        System.out.println("Barking");
    }
}
public class Animal {
    public static void main(String[] args){
       Dog dog=new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
        
    
    }
    
}
