package code;

/*@author Xixian Zhu
 * */

public class Playingfigure extends Board{

	class Point{
    int a;
    int b;
    //boolean hasVisited;
    String d;//the direction to next point;
    public Point() {
      this.a = 2;
      this.b = 4;  
      }
    
    public Point(int a, int b,String d) {
      this.a = a;
      this.b = b;
      this.d = d;
      }
    
      public void Playingfigure () {}
      

      public void Pawn() {
      Point out = new Point(-1, -1,"Not Exist");  
      Point in = new Point(2,4,"Player 1");  //Enter Point;
      Point curPawn = in;    //Current Pawn is the Enter Point
      Point nextPawn = null; //Next Pawn 
      while(!curPawn.equals(out)) {
       nextPawn = new Point(curPawn.a,curPawn.b,curPawn.d);   //Set Next Pawn is the Current Pawn, easy for the next move;
       if((tilePathways[a][b]==1 & tilePathways[a+1][b]== 3) || (tilePathways[a][b]==1 & tilePathways[a+1][b]== 1)
    		   ||(tilePathways[a][b]==1 & tilePathways[a+1][b]== 4) ||(tilePathways[a][b]==1 & tilePathways[a+1][b]== 5) 
    		   ||(tilePathways[a][b]==1 & tilePathways[a+1][b]== 9) ||(tilePathways[a][b]==1 & tilePathways[a+1][b]== 10)
    		   ||(tilePathways[a][b]==3 & tilePathways[a+1][b]== 1) ||(tilePathways[a][b]==3 & tilePathways[a+1][b]== 3)
    		   ||(tilePathways[a][b]==3 & tilePathways[a+1][b]== 4) ||(tilePathways[a][b]==3 & tilePathways[a+1][b]== 5)
    		   ||(tilePathways[a][b]==3 & tilePathways[a+1][b]== 9) ||(tilePathways[a][b]==3 & tilePathways[a+1][b]== 10)
    		   ||(tilePathways[a][b]==4 & tilePathways[a+1][b]== 1) ||(tilePathways[a][b]==4 & tilePathways[a+1][b]== 3)
    		   ||(tilePathways[a][b]==4 & tilePathways[a+1][b]== 4) ||(tilePathways[a][b]==4 & tilePathways[a+1][b]== 5)
    		   ||(tilePathways[a][b]==4 & tilePathways[a+1][b]== 9) ||(tilePathways[a][b]==4 & tilePathways[a+1][b]== 10)
    		   ||(tilePathways[a][b]==6 & tilePathways[a+1][b]== 1) ||(tilePathways[a][b]==6 & tilePathways[a+1][b]== 3)
    		   ||(tilePathways[a][b]==6 & tilePathways[a+1][b]== 4) ||(tilePathways[a][b]==6 & tilePathways[a+1][b]== 5)
    		   ||(tilePathways[a][b]==6 & tilePathways[a+1][b]== 9) ||(tilePathways[a][b]==6 & tilePathways[a+1][b]== 10)
    		   ||(tilePathways[a][b]==7 & tilePathways[a+1][b]== 1) ||(tilePathways[a][b]==7 & tilePathways[a+1][b]== 3)
    		   ||(tilePathways[a][b]==7 & tilePathways[a+1][b]== 4) ||(tilePathways[a][b]==7 & tilePathways[a+1][b]== 5)
    		   ||(tilePathways[a][b]==7 & tilePathways[a+1][b]== 9) ||(tilePathways[a][b]==7 & tilePathways[a+1][b]== 10)
    		   ||(tilePathways[a][b]==8 & tilePathways[a+1][b]== 1) ||(tilePathways[a][b]==8 & tilePathways[a+1][b]== 3)
    		   ||(tilePathways[a][b]==8 & tilePathways[a+1][b]== 4) ||(tilePathways[a][b]==8 & tilePathways[a+1][b]== 5)
    		   ||(tilePathways[a][b]==8 & tilePathways[a+1][b]== 9) ||(tilePathways[a][b]==8 & tilePathways[a+1][b]== 10)){  
           curPawn.d="↓";
           nextPawn.a++; 
           System.out.println(curPawn.d);
           return;

       } else if((tilePathways[a][b]==2 & tilePathways[a][b+1]== 2) ||(tilePathways[a][b]==2 & tilePathways[a][b+1]== 5) || 
    		   (tilePathways[a][b]==2 & tilePathways[a][b+1]== 6) ||(tilePathways[a][b]==2 & tilePathways[a][b+1]== 7) ||
    		   (tilePathways[a][b]==2 & tilePathways[a][b+1]== 8) ||(tilePathways[a][b]==1 & tilePathways[a][b+1]== 9) ||
    		   (tilePathways[a][b]==4 & tilePathways[a][b+1]== 2) ||(tilePathways[a][b]==4 & tilePathways[a][b+1]== 3) ||
    		   (tilePathways[a][b]==4 & tilePathways[a][b+1]== 5) ||(tilePathways[a][b]==4 & tilePathways[a][b+1]== 6) ||
    		   (tilePathways[a][b]==4 & tilePathways[a][b+1]== 7) ||(tilePathways[a][b]==1 & tilePathways[a][b+1]== 9) ||
    		   (tilePathways[a][b]==5 & tilePathways[a][b+1]== 2) ||(tilePathways[a][b]==5 & tilePathways[a][b+1]== 3) ||
    		   (tilePathways[a][b]==5 & tilePathways[a][b+1]== 5) ||(tilePathways[a][b]==5 & tilePathways[a][b+1]== 6) ||
    		   (tilePathways[a][b]==5 & tilePathways[a][b+1]== 7) ||(tilePathways[a][b]==5 & tilePathways[a][b+1]== 9) ||
    		   (tilePathways[a][b]==6 & tilePathways[a][b+1]== 2) ||(tilePathways[a][b]==6 & tilePathways[a][b+1]== 3) ||
    		   (tilePathways[a][b]==6 & tilePathways[a][b+1]== 5) ||(tilePathways[a][b]==6 & tilePathways[a][b+1]== 6) ||
    		   (tilePathways[a][b]==6 & tilePathways[a][b+1]== 7) ||(tilePathways[a][b]==6 & tilePathways[a][b+1]== 9) ||
    		   (tilePathways[a][b]==8 & tilePathways[a][b+1]== 2) ||(tilePathways[a][b]==8 & tilePathways[a][b+1]== 3) ||
    		   (tilePathways[a][b]==2 & tilePathways[a][b+1]== 3) ||(tilePathways[a][b]==8 & tilePathways[a][b+1]== 5) ||
    		   (tilePathways[a][b]==8 & tilePathways[a][b+1]== 6) ||(tilePathways[a][b]==8 & tilePathways[a][b+1]== 7) ||
    		   (tilePathways[a][b]==8 & tilePathways[a][b+1]== 9) ||(tilePathways[a][b]==10 & tilePathways[a][b+1]== 2) ||
    		   (tilePathways[a][b]==10 & tilePathways[a][b+1]== 3) ||(tilePathways[a][b]==10 & tilePathways[a][b+1]== 5) ||
    		   (tilePathways[a][b]==10 & tilePathways[a][b+1]== 6) ||(tilePathways[a][b]==10 & tilePathways[a][b+1]== 7) ||
    		   (tilePathways[a][b]==10 & tilePathways[a][b+1]== 9)) {  
    	   curPawn.d="→";
           nextPawn.b++;      
           System.out.println(curPawn.d);
           return;

       } else if((tilePathways[a][b]==2 & tilePathways[a-1][b]== 2) ||(tilePathways[a][b]==2 & tilePathways[a-1][b]== 4) ||
    		   (tilePathways[a][b]==2 & tilePathways[a-1][b]== 5) ||(tilePathways[a][b]==2 & tilePathways[a-1][b]== 6) ||
    		   (tilePathways[a][b]==2 & tilePathways[a-1][b]== 8) ||(tilePathways[a][b]==2 & tilePathways[a-1][b]== 10) ||
    		   (tilePathways[a][b]==3 & tilePathways[a-1][b]== 2) ||(tilePathways[a][b]==3 & tilePathways[a-1][b]== 4) ||
    		   (tilePathways[a][b]==3 & tilePathways[a-1][b]== 5) ||(tilePathways[a][b]==3 & tilePathways[a-1][b]== 6) ||
    		   (tilePathways[a][b]==3 & tilePathways[a-1][b]== 8) ||(tilePathways[a][b]==3 & tilePathways[a-1][b]== 10) ||
    		   (tilePathways[a][b]==5 & tilePathways[a-1][b]== 2) ||(tilePathways[a][b]==5 & tilePathways[a-1][b]== 4) ||
    		   (tilePathways[a][b]==5 & tilePathways[a-1][b]== 5) ||(tilePathways[a][b]==5 & tilePathways[a-1][b]== 6) ||
    		   (tilePathways[a][b]==5 & tilePathways[a-1][b]== 8) ||(tilePathways[a][b]==5 & tilePathways[a-1][b]== 10) ||
    		   (tilePathways[a][b]==6 & tilePathways[a-1][b]== 2) ||(tilePathways[a][b]==6 & tilePathways[a-1][b]== 4) ||
    		   (tilePathways[a][b]==6 & tilePathways[a-1][b]== 5) ||(tilePathways[a][b]==6 & tilePathways[a-1][b]== 6) ||
    		   (tilePathways[a][b]==6 & tilePathways[a-1][b]== 8) ||(tilePathways[a][b]==6 & tilePathways[a-1][b]== 10) ||
    		   (tilePathways[a][b]==7 & tilePathways[a-1][b]== 2) ||(tilePathways[a][b]==7 & tilePathways[a-1][b]== 4) ||
    		   (tilePathways[a][b]==7 & tilePathways[a-1][b]== 5) ||(tilePathways[a][b]==7 & tilePathways[a-1][b]== 6) ||
    		   (tilePathways[a][b]==7 & tilePathways[a-1][b]== 8) ||(tilePathways[a][b]==7 & tilePathways[a-1][b]== 10) ||
    		   (tilePathways[a][b]==9 & tilePathways[a-1][b]== 2) ||(tilePathways[a][b]==9 & tilePathways[a-1][b]== 4) ||
    		   (tilePathways[a][b]==9 & tilePathways[a-1][b]== 5) ||(tilePathways[a][b]==9 & tilePathways[a-1][b]== 6) ||
    		   (tilePathways[a][b]==9 & tilePathways[a-1][b]== 8) ||(tilePathways[a][b]==9 & tilePathways[a-1][b]== 10)) {  
           curPawn.d="←";
           nextPawn.a--;  
           System.out.println(curPawn.d);
           return;}
           else if((tilePathways[a][b]==1 & tilePathways[a][b-1]== 1) ||(tilePathways[a][b]==1 & tilePathways[a][b-1]== 3) ||
        		   (tilePathways[a][b]==1 & tilePathways[a][b-1]== 4) ||(tilePathways[a][b]==1 & tilePathways[a][b-1]== 6) ||
        		   (tilePathways[a][b]==1 & tilePathways[a][b-1]== 7) ||(tilePathways[a][b]==1 & tilePathways[a][b-1]== 8) ||
        		   (tilePathways[a][b]==3 & tilePathways[a][b-1]== 1) ||(tilePathways[a][b]==3 & tilePathways[a][b-1]== 3) ||
        		   (tilePathways[a][b]==3 & tilePathways[a][b-1]== 4) ||(tilePathways[a][b]==3 & tilePathways[a][b-1]== 6) ||
        		   (tilePathways[a][b]==3 & tilePathways[a][b-1]== 7) ||(tilePathways[a][b]==3 & tilePathways[a][b-1]== 8) ||
        		   (tilePathways[a][b]==4 & tilePathways[a][b-1]== 1) ||(tilePathways[a][b]==4 & tilePathways[a][b-1]== 3) ||
        		   (tilePathways[a][b]==4 & tilePathways[a][b-1]== 4) ||(tilePathways[a][b]==4 & tilePathways[a][b-1]== 6) ||
        		   (tilePathways[a][b]==4 & tilePathways[a][b-1]== 7) ||(tilePathways[a][b]==4 & tilePathways[a][b-1]== 8) ||
        		   (tilePathways[a][b]==5 & tilePathways[a][b-1]== 1) ||(tilePathways[a][b]==5 & tilePathways[a][b-1]== 3) ||
        		   (tilePathways[a][b]==5 & tilePathways[a][b-1]== 4) ||(tilePathways[a][b]==5 & tilePathways[a][b-1]== 6) ||
        		   (tilePathways[a][b]==5 & tilePathways[a][b-1]== 7) ||(tilePathways[a][b]==5 & tilePathways[a][b-1]== 8) ||
        		   (tilePathways[a][b]==9 & tilePathways[a][b-1]== 1) ||(tilePathways[a][b]==9 & tilePathways[a][b-1]== 3) ||
        		   (tilePathways[a][b]==9 & tilePathways[a][b-1]== 4) ||(tilePathways[a][b]==9 & tilePathways[a][b-1]== 6) ||
        		   (tilePathways[a][b]==9 & tilePathways[a][b-1]== 7) ||(tilePathways[a][b]==9 & tilePathways[a][b-1]== 8) ||
        		   (tilePathways[a][b]==10 & tilePathways[a][b-1]== 1) ||(tilePathways[a][b]==10 & tilePathways[a][b-1]== 3) ||
        		   (tilePathways[a][b]==10 & tilePathways[a][b-1]== 4) ||(tilePathways[a][b]==10 & tilePathways[a][b-1]== 6) ||
        		   (tilePathways[a][b]==10 & tilePathways[a][b-1]== 7) ||(tilePathways[a][b]==10 & tilePathways[a][b-1]== 8)
        		   ){
               curPawn.d="↑";
               nextPawn.b--;     
               System.out.println(curPawn.d);
               return;
       
       } 
       else {  //This the situation that no way to move 
         System.out.println("Non Way to Move");
         return;
        }
      }
       curPawn = nextPawn;   //move to the next point;
      	}
	}
}