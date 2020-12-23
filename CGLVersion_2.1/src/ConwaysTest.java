import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Suma Kola
 *
 */
class ConwaysTest {

	/**
	 * Cell's initial state is dead
	 */
	@Test
	public void initialStateisDead()
	{
		Conways cell = new Conways();
		Assertions.assertEquals(cell.getState(),false);
		System.out.println("****Test Case One passed****");
		
	}
	/**
	 * To check whether the cell is alive or not
	 */
	@Test
    public void cellAliveTest(){
      Cell changeCellAlive = new Cell();
        changeCellAlive.changeState();
        Assertions.assertEquals(changeCellAlive.getState(), true);
        System.out.println("****Test Case Two passed****");
    }
	/**
	 * Check if cell can change from alive to dead
	 */
	@Test
	public void cellDeadTest(){
	  CellNew changeCellDead = new CellNew();
	  changeCellDead.changeState();
	  changeCellDead.changeState();
	  //Assert
	  Assertions.assertEquals(changeCellDead.getState(), false);
	  System.out.println("****Test Case Three passed****");
	}
	@Test
	public void cellAliveTestOne(){
		CellAlive cell = new CellAlive();
		cell.nextState(2);
		Assertions.assertEquals(cell.getNextState(), true);
		System.out.println("****Test Case Four Passed****");
	}
	@Test
	public void cellAliveTestTwo(){
		CellAlive cell2 = new CellAlive();
		cell2.nextState(3);
		Assertions.assertEquals(cell2.getNextState(), true);
		System.out.println("****Test Case Five Passed****");
	}
}



