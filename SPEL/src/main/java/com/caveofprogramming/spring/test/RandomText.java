package com.caveofprogramming.spring.test;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
	private static String[] texts = { "I'll be back", "Nah, I won't brother",
			"I want your clothes, boots and motorcycle"

	};

	public String getTexts() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
