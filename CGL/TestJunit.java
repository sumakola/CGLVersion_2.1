import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {

   @Test
   public void testOne() {
	   Board c1 =new Board();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
//	   System.out.println(c1.createBoard(10,10,b));
	   int[][] expout = {{0,0,0,0,0,0,0,0,0,0},
	   					 {0,0,0,1,1,0,0,0,0,0},
	   					 {0,0,0,0,1,0,0,0,0,0},
	   					 {0,0,0,0,0,0,0,0,0,0},
	   					 {0,0,0,0,0,0,0,0,0,0},
	   					 {0,0,0,1,1,0,0,0,0,0},
	   					 {0,0,1,1,0,0,0,0,0,0},
	   					 {0,0,0,0,0,1,0,0,0,0},
	   					 {0,0,0,0,1,0,0,0,0,0},
	   					 {0,0,0,0,0,0,0,0,0,0}};
	   String exo="";
	   String ao="";
	   int[][] myboard=c1.createBoard(10,10,b);
	   
	   for(int i=0;i<expout.length;i++) {
		   for (int j=0;j<expout[0].length;j++) {
			   exo+=expout[i][j];
		   }
		   exo+="\n";
	   }
	   
	   for(int i=0;i<myboard.length;i++) {
		   for (int j=0;j<myboard[0].length;j++) {
			   ao+=myboard[i][j];
		   }
		   ao+="\n";
	   }
//	   System.out.println(s);
//	   System.out.println(Arrays.toString(c1.createBoard(10,10,b)));
//	   System.out.println(Arrays.toString(expout));
	   Assertions.assertEquals(exo,ao);//Arrays.toString(expout),Arrays.toString(c1.createBoard(10,10,b))
	   }
   
   @Test
   public void testtwo() {
	   Board c1 =new Board();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(2,3,myboard);
	   Assertions.assertEquals(3,aliveNeighbours);
   	}
   
   @Test
   public void unwtest() {
	   Board c1 =new Board();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(5,3,myboard);
	   Assertions.assertEquals(3,aliveNeighbours);
   	}
   
   @Test
   public void unwtest2() {
	   Board c1 =new Board();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(5,4,myboard);
	   Assertions.assertEquals(2,aliveNeighbours);
   	}
   
   @Test
   public void unwtest3() {
	   Board c1 =new Board();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(5,4,myboard);
	   Assertions.assertEquals(2,aliveNeighbours);
   	}
   
   @Test
   public void testthree() {
	   Board c1 =new Board();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(2,4,myboard);
	   Assertions.assertEquals(2,aliveNeighbours);
   	}
   
   @Test
   public void testfour() {
	   Board c1 =new Board();
	   int [][] b= {{0,0},{0,1},{1,1},{1,0},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(0,0,myboard);
	   Assertions.assertEquals(3,aliveNeighbours);
   	}
   
   @Test
   public void testfive() {
	   Board c1 =new Board();
	   int [][] b= {{0,5},{0,4},{0,6},{1,4},{1,5},{1,6},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(0,5,myboard);
	   Assertions.assertEquals(5,aliveNeighbours);
   	}
   
   @Test
   public void testsix() {
	   Board c1 =new Board();
	   int [][] b= {{0,9},{0,8},{1,8},{1,9},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(0,9,myboard);
	   Assertions.assertEquals(3,aliveNeighbours);
   	}
   
   @Test
   public void testseven() {
	   Board c1 =new Board();
	   int [][] b= {{9,9},{9,8},{8,9},{8,8},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(9,9,myboard);
	   Assertions.assertEquals(3,aliveNeighbours);
   	}
   
   @Test
   public void testeight() {
	   Board c1 =new Board();
	   int [][] b= {{9,0},{9,1},{8,0},{8,1},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(9,0,myboard);
	   Assertions.assertEquals(3,aliveNeighbours);
   	}
   
   @Test
   public void testnine() {
	   Board c1 =new Board();
	   int [][] b= {{5,0},{6,0},{7,0},{5,1},{6,1},{7,1},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(6,0,myboard);
	   Assertions.assertEquals(5,aliveNeighbours);
   	}
   
   @Test
   public void testten() {
	   Board c1 =new Board();
	   int [][] b= {{9,3},{9,4},{9,5},{8,3},{8,5},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(9,4,myboard);
	   Assertions.assertEquals(5,aliveNeighbours);
   	}
   
   @Test
   public void testeleven() {
	   Board c1 =new Board();
	   int [][] b= {{3,9},{4,9},{5,9},{3,8},{4,8},{5,8},{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int [][] myboard = c1.createBoard(10,10,b);
	   int aliveNeighbours = c1.numberOfAliveNeighbours(4,9,myboard);
	   Assertions.assertEquals(5,aliveNeighbours);
   	}
   @Test
   public void testtwelve() {
	   Board c1 =new Board();
	   ConwayGame g = new ConwayGame();
	   int [][] b= {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
	   int[][] current=c1.createBoard(10,10,b);
	   int[][] expout = {{0,0,0,0,0,0,0,0,0,0},
					 	 {0,0,0,1,1,0,0,0,0,0},
					 	 {0,0,0,1,1,0,0,0,0,0},
					 	 {0,0,0,0,0,0,0,0,0,0},
					 	 {0,0,0,0,0,0,0,0,0,0},
					 	 {0,0,1,1,1,0,0,0,0,0},
					 	 {0,0,1,1,0,0,0,0,0,0},
					 	 {0,0,0,1,1,0,0,0,0,0},
					 	 {0,0,0,0,0,0,0,0,0,0},
					 	 {0,0,0,0,0,0,0,0,0,0}};
	   int [][] next = g.nextGeneration(current);
	   String exo = "";
	   for(int i=0;i<expout.length;i++) {
		   for(int j=0;j<expout[0].length;j++) {
			   exo += expout[i][j];
		   }
		   exo+="\n";
	   }
	   String ao = "";
	   for(int i=0;i<next.length;i++) {
		   for(int j=0;j<next[0].length;j++) {
			   ao += next[i][j];
		   }
		   ao+="\n";
	   }
	   String s="";
	   for(int i=0;i<current.length;i++) {
		   for(int j=0;j<current.length;j++) {
			   s+=current[i][j];
		   }
		   s+="\n";
	   }
	   System.out.println("***Current Generation***");
	   System.out.println();
	   System.out.println(s);
	   System.out.println();
	   System.out.println("***Next Generation***");
	   System.out.println();
	   System.out.println(ao);
	   Assertions.assertEquals(exo,ao);
   	}
   }
	
