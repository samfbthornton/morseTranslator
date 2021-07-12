package morsetranslator;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	public Map<String, String> MORSE_MAP;

	public MorseTranslator() {
		this.MORSE_MAP = new HashMap<String, String>();

		this.MORSE_MAP.put("a", ".-");
		this.MORSE_MAP.put("b", "-...");
		this.MORSE_MAP.put("c", "-.-.");
		this.MORSE_MAP.put("d", "-..");
		this.MORSE_MAP.put("e", ".");
		this.MORSE_MAP.put("f", "..-.");
		this.MORSE_MAP.put("g", "--.");
		this.MORSE_MAP.put("h", "....");
		this.MORSE_MAP.put("i", "..");
		this.MORSE_MAP.put("j", ".---");
		this.MORSE_MAP.put("k", "-.-");
		this.MORSE_MAP.put("l", ".-..");
		this.MORSE_MAP.put("m", "--");
		this.MORSE_MAP.put("n", "-.");
		this.MORSE_MAP.put("o", "---");
		this.MORSE_MAP.put("p", ".--.");
		this.MORSE_MAP.put("q", "--.-");
		this.MORSE_MAP.put("r", ".-.");
		this.MORSE_MAP.put("s", "...");
		this.MORSE_MAP.put("t", "-");
		this.MORSE_MAP.put("u", "..-");
		this.MORSE_MAP.put("v", "...-");
		this.MORSE_MAP.put("w", ".--");
		this.MORSE_MAP.put("x", "-..-");
		this.MORSE_MAP.put("y", "-.--");
		this.MORSE_MAP.put("z", "--..");
		this.MORSE_MAP.put(" ", "/");

		// System.out.println(this.MORSE_MAP);
	}

	public String morseTranslatorResult(String toBeTranslated) {
		String[] input = toBeTranslated.split(" ");

		for (Map.Entry<String, String> entry : MORSE_MAP.entrySet()) {
			String alpha = entry.getKey();
			String morse = entry.getValue();

			if (input == alpha) {
				System.out.println(input + " = " + morse);
				return morse;

			}

		}
		return "Invalid entry";
	}
}