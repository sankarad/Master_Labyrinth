package code;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Board {
	//15 corner, 13 straight, 6 T's
	//4 corners, 8 t's facing in on edge 

	int corner = 15;
	int straight = 13;
	int tshape = 6;
	
	static JFrame board=new JFrame("Labyrinth Game"); //creates board
	
	static JButton[][] buttons; //creates grid of buttons
	static int[][] typeOfTile; //uses a number to store the type of tile it is
	static int[][] tilePathways;
	public Board(){
		
		buttons=new JButton[7][7]; //set size of grid, replace with numbers
		typeOfTile=new int[7][7];
		tilePathways=new int[7][7];
		for(int x=0;x<7;x++){
			for(int y=0;y<7;y++){
				
				//adds to board
				Tile.addInitialTileDesign(y,x,corner, straight, tshape);//bring the 3 over here
				
				if(typeOfTile[y][x]==1){
				//System.out.println(tilePathways[y][x]);
				if(tilePathways[y][x]==1 || tilePathways[y][x]==2){
					if(straight>0){straight = removeOne(straight);}
				//	else{Tile.addInitialTileDesign(y,x,corner, straight, tshape);}
				//	straight=(straight-1);
				}
				if(tilePathways[y][x]==3 || tilePathways[y][x]==4|| tilePathways[y][x]==5|| tilePathways[y][x]==6){
					//tshape=(tshape-1);
					if(tshape>0){tshape = removeOne(tshape);}
				//	else{Tile.addInitialTileDesign(y,x,corner, straight, tshape);}
				}
				if(tilePathways[y][x]==7 || tilePathways[y][x]==8|| tilePathways[y][x]==9|| tilePathways[y][x]==10){
					//corner=(corner-1);
					if(corner>0){corner = removeOne(corner);}
				//	else{Tile.addInitialTileDesign(y,x,corner, straight, tshape);}
				}
				}
				
				
			}
		}
		board.getContentPane().setLayout(new FlowLayout());
		
		
		board.setSize(460,280);
		//board.pack();
		board.setVisible(true);//set board visibility here
		
		
	}
	
	
	

	private int removeOne(int pieceCount) {
		// TODO Auto-generated method stub
		pieceCount=(pieceCount-1);
		return pieceCount;
	}




	public static void main(String[] args) {
		new Board(); //makes new Board
	}
	
}