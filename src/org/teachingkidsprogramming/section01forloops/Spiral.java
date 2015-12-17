package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Blues;
import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    //Tortoise.setX(650);
    //Tortoise.setY(400);
    Tortoise.turn(-30);
    ColorWheel.addColor(Blues.Cyan);
    ColorWheel.addColor(Pinks.DeepPink);
    ColorWheel.addColor(Blues.Cyan);
    ColorWheel.addColor(Greens.Lime);
    Tortoise.getBackgroundWindow().setBackground(Grays.Black);
    Tortoise.hide();
    Tortoise.setPenWidth(10);
    Tortoise.setSpeed(10);
    for (int i = 10; i < 5000000; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.turn(100000000 / 4444);
      Tortoise.move(i);
    }
  }
}
