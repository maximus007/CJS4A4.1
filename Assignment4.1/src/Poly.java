class A
{
public void m1(int a) // Function with method m1//
{
    System.out.println("First"); 
}
}

class B extends A // Class B inherits from class A
{
public void m1(int a , int b) //  Overloading Function with same method but different signature
{
    System.out.println("Second");
}

}

class C
{
public void m3(int c) // Function with method m3
{
    System.out.println("Third");
}
        }
class D extends C // Class C inherits from class B
{
    @Override
    public void m3(int c) // Overriding function with same method and same signature
    {
        System.out.println("Fourth");
    }
}
public class Poly {

    
    public static void main(String[] args) { // main function
        
    B obj=new B();  //object of class B
    obj.m1(2); // calling Class A & passing a value.
    obj.m1(3,4);// calling Class B & passing both values.
    
    D obj2=new D(); //object of class D
    obj2.m3(6); // calling Class D as D overrides C
    
    
    
    }
   
    
    
}
