/**
 * 
 */

/**
 * @author Suma Kola
 *
 */
import java.util.Arrays;
public class ConwayGame{
	Board b = new Board();
//	Returns the next generation by taking the current generation board as parameter
	public  int [][] nextGeneration(int [][] board) {
//		int [][] currGen = board;
		int [][] nextGen = new int[board.length][board[0].length];
		for(int i=0;i<nextGen.length;i++) {
			for(int j=0;j<nextGen[0].length;j++) {
				nextGen[i][j]=0;
			}
		}
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==1) {
			    	if((b.numberOfAliveNeighbours(i, j, board)==2) || (b.numberOfAliveNeighbours(i, j, board)==3)) {
						nextGen[i][j]=1;
					}
				}
				if(board[i][j]==0) {
					if((b.numberOfAliveNeighbours(i, j, board)==3)) {
						nextGen[i][j]=1;
					}
				}
			}
		}
		return nextGen;
	}
}