import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void testApp() {
		App test = new App();
		assertEquals(0, test.test());
	}
}