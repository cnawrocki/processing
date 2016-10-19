void setup() {
  size(1000, 1000);
  PImage eye = loadImage ("eye.jpg");
  image(eye, 0, 0);
}
void draw() { 
  if (mouseX<500) {
    fill(68, 0, 17);
  } else {

    fill(111, 67, 99);
  }
  ellipse(584, 180, 80, 80);
  ellipse(738, 190, 80, 80);
  print(mouseX, mouseY);
}

