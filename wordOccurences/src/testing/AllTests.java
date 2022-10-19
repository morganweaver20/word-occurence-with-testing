package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FirstWordTest.class, LastWordTest.class, HashMapTest.class})
public class AllTests {

}
