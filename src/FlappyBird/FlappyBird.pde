int score;
int birdY;
int yspd = 0;
int pipeX = 800;
int pipeT = (int) random(100,400);
int gamestate;
void draw(){
  background(180,220,255);
  fill(255,50,50);
  stroke(0,0,0);
  if(gamestate==0){
  ellipse(100,birdY,50,50);
  fill(50,255,50);
    if(pipeX<-100){
    pipeX = 800;
    pipeT = (int) random(100,500);
    score++;
  }
  
  rect(pipeX,pipeT+200,100,600-pipeT);
  rect(pipeX,-1,100,pipeT);
  pipeX = pipeX -5;

  
  yspd = yspd+1;
  birdY = birdY + yspd;
  if(keyPressed){
   yspd = -10; 
  }
  fill(0,0,0);
  text(score,400,50);
  }
  if(birdY-25 < pipeT && pipeX > 15 && pipeX < 125){
    gamestate = 1;
    fill(255,0,0);
    text(score,400,50);
  }
  if(birdY > pipeT + 175 && pipeX > 15 && pipeX < 125){
   gamestate = 1; 
   fill(255,0,0);
   text(score,400,50);
  }
  
  //birdX is always 100
  //bird has 25 radius
}
void setup(){
size(800,800);
}