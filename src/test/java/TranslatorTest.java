import static org.junit.Assert.assertEquals;

import org.junit.Test;

import morsetranslator.MorseTranslator;

public class TranslatorTest {

	MorseTranslator example = new MorseTranslator();

	@Test
	public void test1() {
		String expected = ".../---/...";
		String actual = example.morseTranslatorResult("sos");

		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		String expected = "...";
		String actual = example.morseTranslatorResult("s");

		assertEquals(expected, actual);
	}

}
