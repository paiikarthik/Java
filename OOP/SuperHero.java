//Assigns values to object variables


package practice.javaa;

class Super {
    String name;
    int age;
    
    void display(){
        System.out.println("Name is: "+name+ " age is: "+age);
    }
}


public class Superhero{
  public static void main(String[] args){
      
      Super s1=new Super();
      s1.name="Chandra";
      s1.age=24;
      s1.display();
      
      Super s2=new Super();
      s2.name="Krish";
      s2.age=44;
      s2.display();
  }  
}
