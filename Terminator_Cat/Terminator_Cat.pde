void setup(){                                   
size(800,900);
PImage owlPic = loadImage("hoot.jpg");
owlPic.resize(800,900);
background(owlPic);     
}
void draw(){
  ellipse(273,290,60,60);
  fill(221,000,017);
  ellipse(550,290,60,60);
}
void keyPressed(){
    int x=0;
    int y=0;
    x= x+100;
    y= y+100     ;
    noStroke();
}


