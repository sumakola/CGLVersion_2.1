/**
 * 
 */

/**
 * @author Suma Kola
 *
 */
public class Board{
//	Creates a board by taking two integers i and j for rows and columns and a 2d array containing positions of alive cells 
	public int[][] createBoard(int i,int j, int[][] b) {
		int[][] board = new int [i][j];
		for(int r=0;r<i;r++) {
			for(int c=0;c<j;c++) {
				board[r][c]=0;
			}
		}
		for(int r=0;r<b.length;r++) {
			board[b[r][0]][b[r][1]]=1;
		}
		return board;
	}
//	Returns the number of alive neighbors by taking position of a cell and the board
	public int numberOfAliveNeighbours(int x,int y,int[][] board) {
		int [][] board1 = board;
		int c=0;
//		Overcoming border cases
		if(x==0 && y==0) {                     // border case of first row and first column
			if(board[x][y]==1) {
				c++;
			}
			if(board[x][y+1]==1) {
				c++;
			}
			if(board[x+1][y+1]==1) {
				c++;
			}
			if(board[x+1][y]==1) {
				c++;
			}
		
		}else if(x==0 && y==(board[0].length-1)) {   // border case of first row and last column
			if(board[x][y]==1) {
				c++;
			}
			if(board[x][y-1]==1) {
				c++;
			}
			if(board[x+1][y-1]==1) {
				c++;
			}
			if(board[x+1][y]==1) {
				c++;
			}
		}else if(x==board.length-1 && y==0) {     // border case of last row and first column
			if(board[x][y]==1) {
				c++;
			}
			if(board[x-1][y]==1) {
				c++;
			}
			if(board[x-1][y+1]==1) {
				c++;
			}
			if(board[x][y+1]==1) {
				c++;
			}
		}else if(x==board.length-1 && y==board[0].length-1) {   // border case of last row and last column
			if(board[x][y]==1) {
				c++;
			}
			if(board[x-1][y-1]==1) {
				c++;
			}
			if(board[x-1][y]==1) {
				c++;
			}
			if(board[x][y-1]==1) {
				c++;
			}
		}
		else if(x==0) {     // border case of first row only
			if(board[x][y]==1) {
				c++;
			}
			if(board[x][y-1]==1) {
				c++;
			}
			if(board[x][y+1]==1) {
				c++;
			}
			if(board[x+1][y-1]==1) {
				c++;
			}
			if(board[x+1][y+1]==1) {
				c++;
			}
			if(board[x+1][y]==1) {
				c++;
			}
		}else if(y==0) {     // border case of first column only
			if(board[x][y]==1) {
				c++;
			}
			if(board[x-1][y]==1) {
				c++;
			}
			if(board[x-1][y+1]==1) {
				c++;
			}
			if(board[x][y+1]==1) {
				c++;
			}
			if(board[x+1][y+1]==1) {
				c++;
			}
			if(board[x+1][y]==1) {
				c++;
			}
		}else if(x==board.length-1) {     // border case of last row only
			if(board[x][y]==1) {
				c++;
			}
			if(board[x-1][y-1]==1) {
				c++;
			}
			if(board[x-1][y]==1) {
				c++;
			}
			if(board[x-1][y+1]==1) {
				c++;
			}
			if(board[x][y-1]==1) {
				c++;
			}
			if(board[x][y+1]==1) {
				c++;
			}
		}else if(y==board[0].length-1) {    // border case of last column only
			if(board[x][y]==1) {
				c++;
			}
			if(board[x-1][y-1]==1) {
				c++;
			}
			if(board[x-1][y]==1) {
				c++;
			}
			if(board[x+1][y]==1) {
				c++;
			}
			if(board[x+1][y-1]==1) {
				c++;
			}
			if(board[x][y-1]==1) {
				c++;
			}
		}
		else {                   //Remaining cases
		for(int i=-1;i<=1;i++) {
			for(int j=-1;j<=1;j++) {
				if(board1[x+i][y+j]==1) {
					c++;
				}
			}
		}
		}if(board[x][y]==1) {
			return c-1;
		}
		return c;
	}
}