import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

	@Test
	public void firstPositionContainsNumberOne() {
		FizzBuzz fizzBuzz = new FizzBuz();

		List<Object> list = fizzBuzz.generateList();

		assertEquals(1, list.get(0));
	}

}
