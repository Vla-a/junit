package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DifferenceTest.class, MultipleTest.class, SumTest.class })
public class AllTests {

}
