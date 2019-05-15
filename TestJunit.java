import org.junit.*;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestJunit
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Test
	public void algus()
	{
		System.out.println("Testid l2hevad toole.");
	}

	@Test
	public void lihtsam()
	{
		Lineaarvorrand sirge_1 = new Lihtsam_lineaarv(3.0);

		assertEquals(0.0, 	sirge_1.arvuta_y(0.0), 0.0000001);
		assertEquals(300.0, sirge_1.arvuta_y(100.0), 0.0000001);
		assertEquals(-3.0, 	sirge_1.arvuta_y(-1.0), 0.0000001);
	}

	@Test
	public void taielik()
	{
		Lineaarvorrand sirge_2 = new Taielik_lineaarv(3.0, 0.0);

		assertEquals(0.0,	sirge_2.arvuta_y(0.0), 0.0000001);
		assertEquals(300.0, sirge_2.arvuta_y(100.0), 0.0000001);
		assertEquals(-3.0, 	sirge_2.arvuta_y(-1.0), 0.0000001);

		Lineaarvorrand sirge_3 = new Taielik_lineaarv(3.0, 2.0);

		assertEquals(2.0,	sirge_3.arvuta_y(0.0), 0.0000001);
		assertEquals(302.0, sirge_3.arvuta_y(100.0), 0.0000001);
		assertEquals(-1.0, 	sirge_3.arvuta_y(-1.0), 0.0000001);
	}

	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@Test
	public void out()
	{
		Main.main(new String [] {"dummy_1", "dummy_2"});

		if (	outContent.toString().contains("2.0 3.0 4.0 5.0 6.0 7.0")
			 || outContent.toString().contains("2,0 3,0 4,0 5,0 6,0 7,0"))			
			assertTrue(true);
		else 
			assertTrue(false);  	
	}

	@After
	public void restoreStreams()
	{
		System.setOut(originalOut);
		System.setErr(originalErr);
	}
}

/*  Windows 10

    java -cp junit4.jar; org.junit.runner.JUnitCore TestJunit
    
    JUnit version 4.8.2
    ....
    Time: 0,032
    
    OK (4 tests)
*/