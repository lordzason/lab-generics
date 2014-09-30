package taojava.generics;

public class Main
{
  public static void main(String[] args)
  {
    BoxedObject box1 = new BoxedObject("I am box 1.");
    BoxedObject box1Reference1 = box1;
    BoxedObject box1Reference2 = box1;
    System.out.println(box1);
    System.out.println(box1Reference1);
    System.out.println(box1Reference2);
    
    box1Reference1.set("I am a new box 1.");
    System.out.println(box1);
    System.out.println(box1Reference1);
    System.out.println(box1Reference2);
    
    System.out.println();
    BoxedObject box2 = new BoxedObject(100);
    BoxedObject box2Reference1 = box2;
    BoxedObject box2Reference2 = box2;
    System.out.println(box2);
    System.out.println(box2Reference1);
    System.out.println(box2Reference2);
    
    box2Reference1.set( (int) box2Reference1.get() + 100);
    System.out.println(box2);
    System.out.println(box2Reference1);
    System.out.println(box2Reference2);
    
    System.out.println();
    BoxedObject box3 = new BoxedObject(100);
    BoxedObject box3Reference1 = box3;
    box3Reference1.set(100);
    BoxedObject box3Reference2 = box3;
    box3Reference2.set("String!");
    System.out.println(box2);
    System.out.println(box3Reference1);
    System.out.println(box3Reference2);
    
    //A ClassCastException is thrown because a string is stored instead
    //of an int. You cannot add 100 to a string.
    box3Reference1.set( (int) box3Reference1.get() + 100);
    System.out.println(box3);
    System.out.println(box3Reference1);
    System.out.println(box3Reference2);
  }
}
