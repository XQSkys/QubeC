void setup() {
  
    fill(0);
  size(1000, 1000, P3D);
  background(0);

 
  }
  
   int beanx=0;
  int beany=0;
  
    int mx1=0;
     int my1=0;
     int mx2=0;
     int my2=0;
     
     color ship1=color(0,0,200);
     color ship2 =color(200,0,0);
     int sap=0;
     
     int shrink=180;
  int score=180;   
     int score2=200;
void draw()

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

     mx1=(int)mouseoverx1;
     my1=(int)mouseovery1;
     
     mx2=(int)mouseoverx2;
     my2=(int)mouseovery2;
    
    
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


   


 
  if (mousePressed && (mouseButton == LEFT)&&beanx==1) {


  
if(get(mouseX,mouseY)==ship1){sap=1;shrink++;}else {sap=0;shrink--;beanx=1;}
    strokeWeight(4);
       stroke(0,0,255);
    translate(20, 20,20);
  line (0, 0,  mx1, my1);  



  translate(0, 0); 
  strokeWeight(4);
   stroke(200,0,0,150);
  box(mx2,my2,(mx2+my2)/2);


    }


  if (mousePressed && (mouseButton == RIGHT)&&beanx==1) {
   if(get(mouseX,mouseY)==ship2) {sap=1;shrink++;}else {sap=0;shrink--;beanx=1;}

    strokeWeight(4);
       stroke(255,0,0);
    translate(20, 20,20);
  line (0, 0,  mx1, my1);  

  translate(0, 0); 
  strokeWeight(4);
  stroke(0,0,200,150);
  box(mx2,my2,(mx2+my2)/2);

  }

if(beanx==0&&beany==0){
if (((int)random(1,13)==2)){
 stroke(ship1);
  fill(ship1);
    


rect(random(100,400)+400, random(100,400)+400,random(100,400) +300-shrink,random(100,400) +300-shrink);  // Black rectangle
beanx=1;
beany=1;
sap=0;

}
}






if(beanx==0&&beany==0){
if (((int)random(1,13)==2)){
  stroke(ship2);
  
  fill(ship2);
  
rect(random(100,400)+400, random(100,400)+400,random(100,400) +300-shrink,random(100,400)+300-shrink );  // Black rectangle
beanx=1;
beany=1;
sap=0;


}



}

//if()
if(beanx==0&&beany==0){
if (((int)random(1,13)==2)){
 stroke(ship1);
  fill(ship1);
    


rect(random(100,400), random(100,400)+400,random(100,400) +300-shrink,random(100,400) +300-shrink);  // Black rectangle
beanx=1;
beany=1;
sap=0;

}
}






if(beanx==0&&beany==0){
if (((int)random(1,13)==2)){
  stroke(ship2);
  
  fill(ship2);
  
rect(random(100,400), random(100,400)+400,random(100,400) +300-shrink,random(100,400)+300-shrink );  // Black rectangle
beanx=1;
beany=1;
sap=0;


}



}else 
if(beanx==0&&beany==0){
if (((int)random(1,13)==2)){
 stroke(ship1);
  fill(ship1);
    


rect(random(100,400)+400,random(100,400),random(100,400) +300-shrink,random(100,400) +300-shrink);  // Black rectangle
beanx=1;
beany=1;
sap=0;

}
}






if(beanx==0&&beany==0){
if (((int)random(1,13)==2)){
  stroke(ship2);
  
  fill(ship2);
  
rect(random(100,400)+400, random(100,400),random(100,400) +300-shrink,random(100,400)+300 -shrink);  // Black rectangle
beanx=1;
beany=1;
sap=0;


}



}




if(sap==1){
   noStroke();
  fill(0);
  rect(00,500,500,500);
 noStroke();
  fill(0);
  rect(500,00,500,500);
  
noStroke();
  fill(0);
  rect(500,500,1000,1900);
delay(300);
sap=0;

beanx=0;
beany=0;




}


  score2=shrink-score;
  fill(0);
  rect(0,970,150,30);
  
  fill(255);
  text("Score:"+score2+"/100",10,985);

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
    }

  }
 

  
