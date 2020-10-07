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

public class QubeC_V_0_2_0_1_Alfa extends PApplet {

public void setup() {
  
    fill(0);
  
  background(0);

 
  }
  
   int beanx=0;
  int beany=0;
  
    float mx1=0;
     float my1=0;
    float mx2=0;
     float my2=0;
     
     int ship1=color(0,0,200);
     int ship2 =color(200,0,0);
      int shipx1=color(0,0,200);
     int shipx2 =color(200,0,0);
     
     
     int sap=0;
     int pop=0;
     int shrink=180;
  int score=180;   
     int score2=200;
     
     
     int run=0;
public void draw()

{
  


 noStroke();
  fill(0);
  rect(0,0,550,550);
  
      float  mouseovery2;
  float  mouseoverx2;
   
   


      float  mouseovery1;
  float  mouseoverx1;
    

     
     mouseovery2 = mouseY;
  mouseoverx2 = mouseX;
   
   mouseovery1 = mouseY;
  mouseoverx1 = mouseX;
     
     
     
     
//stroke(255, 200); // Linienfarbe ist weiss und nicht ganz deckend   
// Linienbreite zwei Pixel
smooth();         // Anti-Aliasing einschalten
 //  if ((mouseoverx >= 650 && mouseoverx <= 790) && (mouseovery  >= 50 && mouseovery  <=100)) {//??
  
  // clear out all the transformations

  // draw another box at the same (x, y, z) coordinate as the other

     mx1=mouseoverx1;
     my1=mouseovery1;
     
     mx2=mouseoverx2;
     my2=mouseovery2;
    
    
 fill(140,0,0,100);
  stroke(20,10,200,150);
  translate(0, 0); 
  strokeWeight(4);

  box(mx2,my2,(mx2+my2)/2);

//pushMatrix();
//translate(30, 20);
//fill(0);  
//rect(0, 0, 50, 50);  // Black rectangle
//popMatrix();


   


 
  if (mousePressed && (mouseButton == LEFT)&&pop==1) {


  
if(ship1==get((int)mouseoverx1,(int)mouseovery1)){sap=1;shrink++;delay(40);

  strokeWeight(4);
       stroke(0,0,255);
    translate(20, 20,20);
  line (0, 0,  mx1, my1);  



  translate(0, 0); 
  strokeWeight(4);
   stroke(200,0,0,150);
  box(mx2,my2,(mx2+my2)/2);




}else {delay(40);sap=0;shrink--;
    strokeWeight(4);
       stroke(0,0,255);
    translate(20, 20,20);
  line (0, 0,  mx1, my1);  



  translate(0, 0); 
  strokeWeight(4);
   stroke(200,0,0,150);
  box(mx2,my2,(mx2+my2)/2);
pop=1;
sap=0;
}
  }
    


  if (mousePressed && (mouseButton == RIGHT)&&pop==1) {
    
   
   if(ship2==get((int)mouseoverx1,(int)mouseovery1)) {sap=1;shrink++;delay(40);
 
     strokeWeight(4);
       stroke(255,0,0);
    translate(20, 20,20);
  line (0, 0,  mx1, my1);  

  translate(0, 0); 
  strokeWeight(4);
  stroke(0,0,200,150);
  box(mx2,my2,(mx2+my2)/2);
 
 
 
 
 
 }else {delay(40);sap=0;shrink--;

    strokeWeight(4);
       stroke(255,0,0);
    translate(20, 20,20);
  line (0, 0,  mx1, my1);  

  translate(0, 0); 
  strokeWeight(4);
  stroke(0,0,200,150);
  box(mx2,my2,(mx2+my2)/2);
  pop=1;
sap=0;
 }
  }
  
  if(run==0){sap=0;pop=0;run=1;}
  
  if(sap==0&&pop==0){
  pop=1;
int num = (int)random(0,6);

switch(num) {
  case 0:  { stroke(ship1);
  fill(ship1);
    rect(random(100,400), random(100,400)+400,random(100,400) +300-shrink,random(100,400) +300-shrink);  // Black rectangle


;}; break;


 case 1:   { stroke(ship2);
  
  fill(ship2);
  
rect(random(100,400), random(100,400)+400,random(100,400) +300-shrink,random(100,400)+300-shrink );  // Black rectangle





};

break;
    case 2:   {stroke(ship1);
  fill(ship1);
    


rect(random(100,400)+400,random(100,400),random(100,400) +300-shrink,random(100,400) +300-shrink);  // Black rectangle


}; break;
 case 3:   {stroke(ship2);
  
  fill(ship2);
  
rect(random(100,400)+400, random(100,400),random(100,400) +300-shrink,random(100,400)+300 -shrink);  // Black rectangle



}; break;
  case 4:   {   stroke(ship1);
  fill(ship1);
    


rect(random(100,400)+400, random(100,400)+400,random(100,400) +300-shrink,random(100,400) +300-shrink);  // Black rectangle

}; break;
  case 5:   {   {stroke(ship2);
  
  fill(ship2);
  
rect(random(100,400)+400, random(100,400),random(100,400) +300-shrink,random(100,400)+300 -shrink);  // Black rectangle



};  break;

 
}
}

  }

delay(40);
 if(run==1){sap=1;run=2;pop=0;}

if(sap==1){
   noStroke();
  fill(0);
  rect(00,500,500,500);
 noStroke();
  fill(0);
  rect(500,00,500,500);
  
noStroke();
  fill(0);
  rect(500,500,500,500);

sap=0;
pop=0;





}











  score2=shrink-score;
  fill(0);
  rect(0,970,150,30);
  
  fill(255);
  text("Score:"+score2+"/100",10,985);
//fill(ship1);
 // rect(120,970,30,30);
  
  
  
if (shrink==280) {  

          float winkel;
      float laenge; 
      float dx;  
      float dy;     
      stroke(255, 200);  
      strokeWeight(2);  
      smooth();         
int i = 0;   
      while ( i < 200 ) { 
        
        
        
        i++;  
        winkel = random(2*PI);    
        laenge = random(min(width/2, height/2));    
        dx = cos(winkel)*laenge;    
        dy = sin(winkel)* laenge; 
              stroke(200, 0, 0, 150);
        line (width/2, height/2, width/2+dx, height/2-dy);  
      noStroke();
  fill(0);
  rect(0,0,1000,1000);
      }
    }else
sap=0;
}
  public void settings() {  size(1000, 1000, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "QubeC_V_0_2_0_1_Alfa" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
