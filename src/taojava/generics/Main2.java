package taojava.generics;

import java.io.PrintWriter;

public class Main2
{
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    Box<String> box1 = new Box<String>("String 1.");
    Box<String> box1Reference1 = box1;
    Box<String> box1Reference2 = box1;
    pen.println(box1.toString() + " " + box1Reference1.toString() + " " + box1Reference2.toString());
    
    box1Reference1.set("New String.");
    pen.println(box1.toString() + " " + box1Reference1.toString() + " " + box1Reference2.toString());
    pen.println();
    
    Box<Integer> box2 = new Box<Integer>(100);
    Box<Integer> box2Reference1 = box2;
    Box<Integer> box2Reference2 = box2;
    pen.println(box2.toString() + " " + box2Reference1.toString() + " " + box2Reference2.toString());
    
    box2Reference1.set(box2Reference1.get() + 100);
    pen.println(box2.toString() + " " + box2Reference1.toString() + " " + box2Reference2.toString());
    pen.println();
    
    Box<Object> box3 = new Box<Object>(100);
    Box<Object> box3Reference1 = box3;
    Box<Object> box3Reference2 = box3;
    pen.println(box3 + " " + box3Reference1 + " " + box3Reference2);
    
    box3Reference1.set("String!");
    pen.println(box3 + " " + box3Reference1 + " " + box3Reference2);
    box3Reference1.set(200);
    pen.println(box3 + " " + box3Reference1 + " " + box3Reference2);
    pen.println();
  }
}
