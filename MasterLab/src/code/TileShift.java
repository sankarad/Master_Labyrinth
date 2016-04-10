package code;

import java.util.Random;

import javax.swing.JButton;
/*@author Clayton, Sankara, Stephanie, Xixian
 * TileShift shifts the board exactly one space 
 * in the direction determined by the user. The last tile
 * is saved and the game shifts each tile also adding the
 * new orientation of each tile.
 * */
public class TileShift extends Board{

	
	public TileShift(){
		}
	/*TileShiftRight
	 * Shifts the tile to the right direction by one as well as 
	 * saves the shape that is being popped out at the end
	 * @param y Accepts the y-value of the tile that is being removed
	 * @param x Accepts the x-value of the tile that is being removed
	 * @param corner  Accepts the value of the tile that is being removed
	 * @param straight Accepts the value of the tile that is being removed
	 * @param tshape Accepts the integer of the tile that is being removed
	 * */
	public void TileShiftRight(int x, int y, int corner, int straight, int tshape){
		JButton tempButton = new JButton("");
		int tempTileType;
		tempTileType = typeOfTile[x][6];
		tempButton=Board.buttons[x][6];
		if(x%2==0 && y%2==0){System.out.println("Error cannot place tile here");}else{
		Board.buttons[y][6]=Board.buttons[y][5];
		Board.buttons[y][5]=Board.buttons[y][4];
		Board.buttons[y][4]=Board.buttons[y][3];
		Board.buttons[y][3]=Board.buttons[y][2];
		Board.buttons[y][2]=Board.buttons[y][1];
		Board.buttons[y][1]=Board.buttons[y][0];
		tilePathways[y][0]=randomDirectionNewButton(y,0,corner,straight,tshape);
		replacetempButton(tempTileType);
		}
	}
	/*TileShiftLeft
	 * Shifts the tile to the left direction by one as well as 
	 * saves the shape that is being popped out at the end
	 * @param y Accepts the y-value of the tile that is being removed
	 * @param x Accepts the x-value of the tile that is being removed
	 * @param corner  Accepts the value of the tile that is being removed
	 * @param straight Accepts the value of the tile that is being removed
	 * @param tshape Accepts the integer of the tile that is being removed
	 * */
	public void TileShiftLeft(int x, int y, int corner, int straight, int tshape){
		JButton tempButton = new JButton("");
		int tempTileType;
		tempTileType = typeOfTile[x][0];
		tempButton=Board.buttons[x][0];
		if(x%2==0 && y%2==0){System.out.println("Error cannot place tile here");}else{
		Board.buttons[y][0]=Board.buttons[y][1];
		Board.buttons[y][1]=Board.buttons[y][2];
		Board.buttons[y][2]=Board.buttons[y][3];
		Board.buttons[y][3]=Board.buttons[y][4];
		Board.buttons[y][4]=Board.buttons[y][5];
		Board.buttons[y][5]=Board.buttons[y][6];
		tilePathways[y][6]=randomDirectionNewButton(y,6,corner,straight,tshape);
		replacetempButton(tempTileType);
		}
	}
	/*TileShiftUp
	 * Shifts the tile upwards by one as well as 
	 * saves the shape that is being popped out at the end
	 * @param y Accepts the y-value of the tile that is being removed
	 * @param x Accepts the x-value of the tile that is being removed
	 * @param corner  Accepts the value of the tile that is being removed
	 * @param straight Accepts the value of the tile that is being removed
	 * @param tshape Accepts the integer of the tile that is being removed
	 * */
	public void TileShiftUp(int x, int y, int corner, int straight, int tshape){
		JButton tempButton = new JButton("");
		int tempTileType;
		tempTileType = typeOfTile[6][x];
		tempButton=Board.buttons[6][x];
		if(x%2==0 && y%2==0){System.out.println("Error cannot place tile here");}else{
		Board.buttons[6][x]=Board.buttons[5][x];
		Board.buttons[5][x]=Board.buttons[4][x];
		Board.buttons[4][x]=Board.buttons[3][x];
		Board.buttons[3][x]=Board.buttons[2][x];
		Board.buttons[2][x]=Board.buttons[1][x];
		Board.buttons[1][x]=Board.buttons[0][x];
		tilePathways[0][x]=randomDirectionNewButton(0,x,corner,straight,tshape);
		replacetempButton(tempTileType);
		}
	}
	/*TileShiftDown
	 * Shifts the tile downwards direction by one as well as 
	 * saves the shape that is being popped out at the end
	 * @param y Accepts the y-value of the tile that is being removed
	 * @param x Accepts the x-value of the tile that is being removed
	 * @param corner  Accepts the value of the tile that is being removed
	 * @param straight Accepts the value of the tile that is being removed
	 * @param tshape Accepts the integer of the tile that is being removed
	 * */
	public void TileShiftDown(int x, int y, int corner, int straight, int tshape){
		JButton tempButton = new JButton("");
		int tempTileType;
		tempTileType = typeOfTile[6][x];
		tempButton=Board.buttons[6][x];
		if(x%2==0 && y%2==0){System.out.println("Error cannot place tile here");}else{
		Board.buttons[0][x]=Board.buttons[1][x];
		Board.buttons[1][x]=Board.buttons[2][x];
		Board.buttons[2][x]=Board.buttons[3][x];
		Board.buttons[3][x]=Board.buttons[4][x];
		Board.buttons[4][x]=Board.buttons[5][x];
		Board.buttons[5][x]=Board.buttons[6][x];
		tilePathways[6][x]=randomDirectionNewButton(6,x,corner,straight,tshape);
		replacetempButton(tempTileType);
		}
	}
	
	
	/*replacetempButton
	 * Takes the value of the tile that is being removed from the board 
	 * as well as increments the tile to the count of tiles that was initially left
	 * @param tempTileType Holds the value of the file that has been removed 
	 * */
	private void replacetempButton(int tempTileType) {
		if(tempTileType==1 || tempTileType == 2){
			straight=(straight+1);
		}
		if(tempTileType==3 || tempTileType == 4|| tempTileType == 5|| tempTileType == 6){
			tshape=(tshape+1);
		}
		if(tempTileType==7 || tempTileType == 8 || tempTileType == 9 || tempTileType == 10){
			corner=(corner+1);
		}
	}
	/*randomDirectionNewButton
	 *Determines the tile that is removed from the
	 * direction and decrements it from the total count thereby 
	 * giving the user said extra tile.
	 * @param y Accepts the y-value of the tile that is being removed
	 * @param x Accepts the x-value of the tile that is being removed
	 * @param corner  Accepts the value of the tile that is being removed
	 * @param straight Accepts the value of the tile that is being removed
	 * @param tshape Accepts the integer of the tile that is being removed
	 * @return tilePathways */
	public int randomDirectionNewButton(int y, int x,int corner,int straight,int tshape){
		Random rand = new Random();

		if(corner==1){
			int randomNum = (rand.nextInt(3));
			tilePathways[y][x]= (7+randomNum);
			corner=(corner-1);
		}
		if(straight==1){
			int randomNum = (rand.nextInt(3));
			tilePathways[y][x]= (1+randomNum);
			straight=(straight-1);
		}
		if(tshape==1){
			int randomNum = (rand.nextInt(3));
			tilePathways[y][x]= (3+randomNum);
			tshape=(tshape-1);
		}
		
		
		int newButtonDirection = tilePathways[y][0];
		return tilePathways[y][0];
		
	}
	
	
	
	
	
	
}