package taojava.generics;

import java.io.PrintWriter;

public class NestingBoxesMain
{
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    String s1 = "Hello";
    Box<String> box1 = new Box<String>(s1);
    pen.println(box1);
    Box<Box<String>> bbox1 = new Box<Box<String>>(box1);
    pen.println("box1=" + box1 + " bbbox1=" + bbox1);

    bbox1.get().set("SOMETHING NEW!");
    pen.println("box1=" + box1 + " bbbox1=" + bbox1);

  }
}
