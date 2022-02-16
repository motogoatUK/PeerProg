import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeerTest {
@Test
public void test1() {
	//Given
	float myVal = 120f;
	//When
	float actual = revFact(float myVal);
	//then
	float expected = 5.0f;
	assertEquals(actual,expected,0.0001);
	}

}
