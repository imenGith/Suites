package TestSuit2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestSuit4.ThirdTest4;

@RunWith(Suite.class)
@SuiteClasses({ThirdTest4.class})
public class AllTests {

}
