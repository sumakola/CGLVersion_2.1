
package conwayJavaFX;


public class Board {
	int [][] b;
	int row;
	int col;
	Board(int row,int col){
	this.row=row;
	this.col=col;
	this.b=new int[this.row][this.col];
	}
//	Creates a board by taking two intergers i and j for rows and columns and a 2d array containg positions of alive cells
	public void createBoard(int[][] b) {			
		for(int r=0;r<b.length;r++) {
			this.b[b[r][0]][b[r][1]]=1;
		}
	}
//	Returns the number of alive neighbours by taking position of a cell and the board
	public int numberOfAliveNeighbours(int x,int y) {
//		int [][] board1 = this.b;
		int c=0;
//		Overcoming border cases
		if(x==0 && y==0) {                     // border case of first row and first column
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x][y+1]==1) {
				c++;
			}
			if(this.b[x+1][y+1]==1) {
				c++;
			}
			if(this.b[x+1][y]==1) {
				c++;
			}
		
		}else if(x==0 && y==(this.b[0].length-1)) {   // border case of first row and last column
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x][y-1]==1) {
				c++;
			}
			if(this.b[x+1][y-1]==1) {
				c++;
			}
			if(this.b[x+1][y]==1) {
				c++;
			}
		}else if(x==this.b.length-1 && y==0) {     // border case of last row and first column
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x-1][y]==1) {
				c++;
			}
			if(this.b[x-1][y+1]==1) {
				c++;
			}
			if(this.b[x][y+1]==1) {
				c++;
			}
		}else if(x==this.b.length-1 && y==this.b[0].length-1) {   // border case of last row and last column
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x-1][y-1]==1) {
				c++;
			}
			if(this.b[x-1][y]==1) {
				c++;
			}
			if(this.b[x][y-1]==1) {
				c++;
			}
		}
		else if(x==0) {     // border case of first row only
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x][y-1]==1) {
				c++;
			}
			if(this.b[x][y+1]==1) {
				c++;
			}
			if(this.b[x+1][y-1]==1) {
				c++;
			}
			if(this.b[x+1][y+1]==1) {
				c++;
			}
			if(this.b[x+1][y]==1) {
				c++;
			}
		}else if(y==0) {     // border case of first column only
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x-1][y]==1) {
				c++;
			}
			if(this.b[x-1][y+1]==1) {
				c++;
			}
			if(this.b[x][y+1]==1) {
				c++;
			}
			if(this.b[x+1][y+1]==1) {
				c++;
			}
			if(this.b[x+1][y]==1) {
				c++;
			}
		}else if(x==this.b.length-1) {     // border case of last row only
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x-1][y-1]==1) {
				c++;
			}
			if(this.b[x-1][y]==1) {
				c++;
			}
			if(this.b[x-1][y+1]==1) {
				c++;
			}
			if(this.b[x][y-1]==1) {
				c++;
			}
			if(this.b[x][y+1]==1) {
				c++;
			}
		}else if(y==this.b[0].length-1) {    // border case of last column only
			if(this.b[x][y]==1) {
				c++;
			}
			if(this.b[x-1][y-1]==1) {
				c++;
			}
			if(this.b[x-1][y]==1) {
				c++;
			}
			if(this.b[x+1][y]==1) {
				c++;
			}
			if(this.b[x+1][y-1]==1) {
				c++;
			}
			if(this.b[x][y-1]==1) {
				c++;
			}
		}
		else {                   //Remaining cases
		for(int i=-1;i<=1;i++) {
			for(int j=-1;j<=1;j++) {
				if(this.b[x+i][y+j]==1) {
					c++;
				}
			}
		}
		}if(this.b[x][y]==1) {
			return c-1;
		}
		return c;
	}
//	Returns the next generation by taking the current generation board as parameter
	public  void nextGeneration(Board board) {
//		int [][] currGen = board;
//		board.b;
		for(int i=0;i<this.row;i++) {
			for(int j=0;j<this.col;j++) {
				if(this.b[i][j]==1) {
					if((numberOfAliveNeighbours(i, j)==2) || (numberOfAliveNeighbours(i, j)==3)) {
						board.b[i][j]=1;
					}
//					if((numberOfAliveNeighbours(i, j)<2) || (numberOfAliveNeighbours(i, j)>3)) {
//						board.b[i][j]=0;
//					}
					
				}
				if(this.b[i][j]==0) {
					if((numberOfAliveNeighbours(i, j)==3)) {
						board.b[i][j]=1;
					}
				}
			}
		}
//		return nextGen;
	}
}
