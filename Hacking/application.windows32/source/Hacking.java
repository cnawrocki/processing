import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Hacking extends PApplet {

int y = 100; 
int x = 50;
int line;
int index;
int keyCount = 0;
boolean cursorBlink = true;
ArrayList<String> text = new ArrayList<String>();
ArrayList<String> hackerText = new ArrayList<String>();
int cursorColor = 0;
int loadBar = 0;
public void setup() {
  size(800, 800);
  //Add your text to the hackerTextList
  hackerText.add("");
  hackerText.add("for(int i = ");
  hackerText.add("");
  hackerText.add("void initiate ");
  hackerText.add("~~~");
  hackerText.add("Initiating access ");
  hackerText.add("password ");
  hackerText.add("***");
  hackerText.add("***");
  hackerText.add("*** ");
  hackerText.add("");
  hackerText.add("ArrayList<String> alphabetList = new ArrayList<String>();");
  hackerText.add("");
  hackerText.add("int position = -1 ");
}
public void draw() {
  background(0);

  displayText();
  if (keyCount> 50) {
    accessDenied();
  }
  if (keyCount> 190){
    accessGranted();
  }   
  if (keyCount> 250) {
    System.exit(0);
  }
}

public void keyPressed() {
  text.add(hackerText.get(index%hackerText.size()));
  index++;

  keyCount++;
}

public void displayText() {
  int yOffset = 0;
  int xOffset = 0;
  fill(0, 255, 0);
  textSize(20);
  for (String str : text) {
    if (text.indexOf(str)%4==0) {
      yOffset+=30;
      xOffset=0;
    }
    text(str, x+xOffset, y+yOffset);
    if (y+yOffset > height-50) {
      y-=100;
    }
    xOffset += textWidth(str);
  }
  drawCursor(xOffset, yOffset);
  yOffset=0;
}


public void drawCursor(int xOffset, int offset) {
  strokeWeight(1);
  int m = millis();
  if (m%1000<500) {
    cursorColor = 255;
  } else {
    cursorColor = 0;
  }
  stroke(0, cursorColor, 0);
  line(x+xOffset, y+offset+5, x+xOffset, y+offset-18);
}

public void accessGranted() {
 
  fill(cursorColor, 0, 0);
  //textSize(80);
  
   String access = "Access Granted";

    fill(0, cursorColor, 0);
  
  if (cursorColor == 255)
    text(access, width/3, height/4);
  noFill();
  strokeWeight(1);
  rect(width/3, height /6, textWidth(access), 80);
}

public void accessDenied() {
  String access = "Access Denied";  
  fill(cursorColor, 0, 0);
  loadBar++;
  strokeWeight(20);
  stroke(255, 0, 0);
  line(width/3, height /2, width/3+(loadBar%(width/4)), height/2);
  textSize(60);
  if (cursorColor == 255)
    text(access, width/3, height/4);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "Hacking" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
