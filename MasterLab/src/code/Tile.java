package code;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;

public class Tile extends Board{
	
	public Tile(){
	//	final Color TileColor = new Color(214,217,223);
		
		
	}
	
	


	public static void addInitialTileDesign(int y, int x, int corner, int straight, int tshape) {
		// TODO Auto-generated method stub
		
	
		
		
		
		if (y % 2 == 0 && x % 2 == 0){
			if((x==0 && y==0)){
			buttons[y][x]=new JButton("SE ");
			typeOfTile[y][x]=2; //2 can be used for cannot move
			tilePathways[y][x]= 8; //south east movement
			buttons[y][x].setBackground(Color.red);
			board.add(buttons[y][x]);
		}
			if((x==0 && (y==2 || y==4))||(x==2 && (y==4))){
				buttons[y][x]=new JButton("SEW");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 6; //south east west movement
				buttons[y][x].setBackground(Color.orange);
				board.add(buttons[y][x]);
			}	
			if((x==0 && (y==6))){
				buttons[y][x]=new JButton("SW ");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 7; //south west movement
				buttons[y][x].setBackground(Color.red);
				board.add(buttons[y][x]);
			}	
			if((x==2 && (y==2 || y==0)) || (x==4 && y==0)){
				buttons[y][x]=new JButton("NSE");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 4; //north south east movement
				buttons[y][x].setBackground(Color.orange);
				board.add(buttons[y][x]);
			}
			if((x==2 && (y==6))||(x==4 && y==6) || (x==4 && y==4)){
				buttons[y][x]=new JButton("NSW");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 3; //north south west movement
				buttons[y][x].setBackground(Color.orange);
				board.add(buttons[y][x]);
			}
			if((x==4 && (y==2))||(x==6 && y==2) || (x==6 && y==4)){
				buttons[y][x]=new JButton("NEW");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 5; //north east west movement
				buttons[y][x].setBackground(Color.orange);
				board.add(buttons[y][x]);
			}
			if((x==6 && (y==0))){
				buttons[y][x]=new JButton("SE ");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 10; //south east movement
				buttons[y][x].setBackground(Color.red);
				board.add(buttons[y][x]);
			}
			if((x==6 && (y==6))){
				buttons[y][x]=new JButton("SW ");
				typeOfTile[y][x]=2; //2 can be used for cannot move
				tilePathways[y][x]= 9; //south west movement
				buttons[y][x].setBackground(Color.red);
				board.add(buttons[y][x]);
			}
		}
			
			
		else{
			typeOfTile[y][x]=1; //can move
			Random rand = new Random();
			Random randDirection = new Random();
			System.out.println(corner);
			System.out.println(straight);
			System.out.println(tshape);
		//	if(corner ==1){corner=(0);}
		//	if(tshape ==1){tshape=(0);}
		//	if(straight ==1){straight=(0);}
			int randomNum = (rand.nextInt(corner + straight + tshape));

			System.out.println("rand:" + randomNum);
			if(randomNum>-1 && randomNum < (corner)){
				//corner = (corner -1);
				buttons[y][x]=new JButton("Cor");
				int randomDir = (randDirection.nextInt(3));
				buttons[y][x].setBackground(Color.blue);
				board.add(buttons[y][x]);
				tilePathways[y][x]= (7+randomDir); //south west movement THIS NEEDS TO BE RANDOM TOO
				System.out.println("Good 1");
				return; //corner;
		}
			if(randomNum>corner-1 && randomNum < (corner+straight)){
				//straight = (straight -1);
				buttons[y][x]=new JButton("Str");
				int randomDir = (randDirection.nextInt(1));
				buttons[y][x].setBackground(Color.green);
				board.add(buttons[y][x]);
				tilePathways[y][x]= (1+randomDir); //south west movement
				System.out.println("Good 2");
			//	System.out.println(straight);
				return; //straight;
		
		}
			if(randomNum>(corner+straight-1)&& randomNum < (corner+straight+tshape)){
				//tshape = (tshape -1);
				buttons[y][x]=new JButton("Tsh");
				int randomDir = (randDirection.nextInt(3));
				buttons[y][x].setBackground(Color.CYAN);
				System.out.println("Good 3");
				tilePathways[y][x]= (3+randomDir); //south west movement
				board.add(buttons[y][x]);
				return;// tshape;
		}
		}
		return; ///0;
			
			
	//	buttons[y][x]=new JButton("   ");
	//	typeOfTile[y][x]=1; //1 can be used for tile can move
	//	buttons[y][x].setBackground(Color.blue);
	//	board.add(buttons[y][x]);}
	}




	
	
	
}