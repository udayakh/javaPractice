import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.simpleprogrammer.proteintracker.InvalidGoalException;
import com.simpleprogrammer.proteintracker.TrackingService;


public class TrackingServiceTests {

	private TrackingService service;
	@BeforeClass
	public static void before()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void after()
	{
		System.out.println("After Class");
	}
	
	@Before
	public void setUp() 
	{
		System.out.println("Before");
		service = new TrackingService();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After");
	}
	

	@Test
	public void NewTrackingServiceTotalIsZero()
	{
		assertEquals("Tracking service total was not zero", 0, service.getTotal());
	}
	
	@Test
	public void WhenAddingProteinTotalIncreasesByThatAmount() 
	{
		service.addProtein(10);
		assertEquals(10, service.getTotal());
	}
	
	@Test
	public void WhenRemovingProteinTotalRemainsZero() 
	{
		service.removeProtein(5);
		assertEquals(0, service.getTotal());
	}
	
	@Test(expected = InvalidGoalException.class)
	public void WhenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException
	{
		service.setGoal(-5);
	}
	
	@Test(timeout = 200)
	public void BadTest()
	{
		for(int i = 0; i < 10000000; i++)
			service.addProtein(0);
	}
}
