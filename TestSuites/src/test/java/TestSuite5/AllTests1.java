package TestSuite5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestSuit4.SecondTest4;

@RunWith(Suite.class)
@SuiteClasses({SecondTest4.class})
public class AllTests1 {

}
