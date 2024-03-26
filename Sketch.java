// A program that uses loops to draw 8 drawings of silly rectangular grids
/* @author T.Chu
*/

import processing.core.PApplet;

public class Sketch extends PApplet {
 
 public void settings() {
   size(1200, 600);
 }

 public void setup() {
   background(45, 150, 207);
 }

 public void draw() {
   draw_section_outlines();
   draw_section1();
   draw_section2();
   draw_section3();
   draw_section4();
  
   draw_section5();
   draw_section6();
   draw_section7();
   draw_section8();
 }

 /**
  * Draw the outlines for all sections
  */
 public void draw_section_outlines() {
   stroke(0);
   noFill();

   // Draw bottom row boxes
   rect(0, 300, 300, 300);
   rect(300, 300, 300, 300);
   rect(600, 300, 300, 300);
   rect(900, 300, 300, 300);


   // Draw top row boxes
   rect(0, 0, 300, 300);
   rect(300, 0, 300, 300);
   rect(600, 0, 300, 300);
   rect(900, 0, 300, 300);
 }
  /**
  * Draws the bottom left section
  */
 public void draw_section1() {
   int intX = 0;
   int intY = 0;


   for (int intRow = 0; intRow < 30; intRow++) {
     for (int intColumn = 0; intColumn < 30; intColumn++) {
       intX = 3 + intRow * 10;  
       intY = 300 + 3 + intColumn * 10; 


       fill(255);
       noStroke();
       rect(intX, intY, 5, 5);
     }
   }
 }


  /**
  * Draws the bottom second section
  */
 public void draw_section2() {
   int intX = 0;
   int intY = 0;


   for (int intRow = 0; intRow < 30; intRow++) {
     for (int intColumn = 0; intColumn < 30; intColumn++) {
       intX = 3 + 300 + intRow * 10;  
       intY = 300 + 3 + intColumn * 10; 
     if (intRow % 2 ==0)
       fill(255);
     else
       fill (0);
       noStroke();
       rect(intX, intY, 5, 5);
     }
   }
 }


  /**
  * Draws the bottom third section
  */
 public void draw_section3() {
   int intX = 0;
   int intY = 0;


   for (int intRow = 0; intRow < 30; intRow++) {
     for (int intColumn = 0; intColumn < 30; intColumn++) {
       intX = 3 + 300 + 300 + intRow * 10; 
       intY = 300 + 3 + intColumn * 10; 
     if (intColumn % 2 ==0)
       fill(0);
     else
       fill (255);
       noStroke();
       rect(intX, intY, 5, 5);
     }
   }


 }
  /**
  * Draws the bottom fourth section
  */
 public void draw_section4() {
   int intX = 0;
   int intY = 0;


   for (int intRow = 0; intRow < 30; intRow++) {
     for (int intColumn = 0; intColumn < 30; intColumn++) {
       intX = 3 + 300 + 300 + 300 + intRow * 10;  
       intY = 300 + 3 + intColumn * 10; 
     if (intColumn % 2 ==1 && intRow % 2 == 0)
       fill(255);
     else
       fill (0);
       noStroke();
       rect(intX, intY, 5, 5);
     }
   }


 }
  /**
  * Draws the bottom top fifth section
  */
 public void draw_section5() {
   int intX = 0;
   int intY = 0;


   for (int intRow = 0; intRow < 30; intRow++) {
     for (int intColumn = 0; intColumn < intRow; intColumn++) {
       intX = 3 + intRow * 10; 
       intY = 3 + intColumn * 10; 


       fill(255);
       noStroke();
       rect(intX, 296-intY, 5, 5);
     }
   }


 }

  /**
  * Draws the top sixth section
  */
 public void draw_section6() {

  int intX = 0;
  int intY = 0;

  for (int intColumn = 0; intColumn < 31; intColumn++) {
    for (int intRow = 0; intRow < intColumn; intRow++) {
      intX = 3 + 300 + intRow * 10; 
      intY = 3 + intColumn * 10; 


      fill(255);
      noStroke();
      rect(intX, intY - 10, 5, 5);
    }
  }

 }

  /**
  * Draws the top seventh section
  */
 public void draw_section7() {
  int intX = 0;
  int intY = 0;

  for (int intRow = 0; intRow < 31; intRow++) {
    for (int intColumn = 0; intColumn < intRow; intColumn++) {
      intX = 3 + 900 - intRow * 10;
      intY = 3 + intColumn * 10;

      fill(255);
      noStroke();
      rect(intX , intY, 5, 5);
     }
   }
  

 }
   /**
  * Draws the top eigtht section
  */
  public void draw_section8() {
   int intX = 0;
   int intY = 0;


   for (int intRow = 0; intRow < 32; intRow++) {
     for (int intColumn = 0; intColumn < intRow; intColumn++) {
       intX = 3 + 900 + intRow * 10;  
       intY = 3 + intColumn * 10; 


       fill(255);
       noStroke();
       rect(intX - 10, intY, 5, 5);
     }
   }
 }
}
