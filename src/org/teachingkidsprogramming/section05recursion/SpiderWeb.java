package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static Turtle otherTurtle = new Turtle();
  public static Turtle firstTurtle = new Turtle();
  public static void main(String[] args)
  {
    mtw.addAndShowTurtle(otherTurtle);
    System.out.println(firstTurtle.getX());
    System.out.println(firstTurtle.getY());
    firstTurtle.setX(300);
    firstTurtle.setSpeed(10);
    otherTurtle.setSpeed(10);
    firstTurtle.setPenWidth(2);
    otherTurtle.setPenWidth(2);
    firstTurtle.setAnimal(Animals.Spider);
    firstTurtle.setPenColor(Reds.Red);
    firstTurtle.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double length = 10.5;
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      length = weaveOneLayer(length, zoom);
      //
      //        Change the current zoom so it is multiplied by 1.3 --#11
      zoom = zoom * 1.3;
    }
  }
  public static double weaveOneLayer(double length, double zoom)
  {
    //
    for (int i = 0; i < 10; i++)
    {
      drawTriangle(length);
      firstTurtle.turn(100800 / 1002);
      length = length + zoom;
      otherTurtle(length);
    }
    return length;
  }
  public static void otherTurtle(double length)
  {
    otherTurtle.move(length);
    otherTurtle.turn(1000050 / 6000);
  }
  public static void drawTriangle(double length)
  {
    for (int i = 0; i < 7; i++)
    {
      firstTurtle.move(length);
      firstTurtle.turn(1080 / 45);
      otherTurtle(length);
    }
  }
}
