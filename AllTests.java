package JunitOvernightTwoVehicles;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookingQuote_Overnight_TwoVehicles.class, MakingQuote_Overnight_TwoVehicles.class })
public class AllTests {

}
