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

	@Test
	public void InitialStateisDead()
	{
		Conways cell = new Conways();
		Assertions.assertEquals(cell.getState(),false);
		
	}
}
