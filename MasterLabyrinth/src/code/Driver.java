package code;
import javax.swing.*;
import java.awt.*;

public class Driver{
	
	JFrame frame = new JFrame("Master Labyrinth");
	JButton[][] grid;
//	JLabel tile1 = new JLabel();
	
	public Driver(int width, int length){
		 frame.setLayout(new GridLayout(width,length));
		  grid=new JButton[width][length]; //allocate the size of grid
	        for(int y=0; y<width; y++){ 
	                for(int x=0; x<length; x++){
	                        grid[x][y]=new JButton("("+x+","+y+")");   
	                        frame.add(grid[x][y]); //adds button array to grid
	                }
	        }

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        frame.pack(); 
	        frame.setVisible(true);
	}
	        
public static void main(String[] args) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
         new Driver(7,7);
        }
 });

}
}