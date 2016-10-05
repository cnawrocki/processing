  import processing.sound.*;
  SoundFile sound;
void setup(){
size(600,600);
  fill (225,204,187);
  ellipse (300,300,500,500);
  fill (225,000,017);
  ellipse (300,300,430,430);
  fill (238,238,017);
  ellipse (300,300,400,400);
  
  PImage sink = loadImage("sink.gif");
  image(sink,280,360);
  image(sink,370,280);
  image(sink,432,222);
  image(sink,147,180);
  PImage kit = loadImage("kit.gif");
  kit.resize(80,80);
  image(kit,300,201);
    sound = new SoundFile(this, "meow.wav");
  sound.play();
  PImage hamm = loadImage("hamm.gif");
  hamm.resize(75,75);
  image(hamm,144,367);

  
  
}
void draw(){
  
  
}
