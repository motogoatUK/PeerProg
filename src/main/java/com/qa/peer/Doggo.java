package com.qa.peer;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public List<String> compete(int place) {
		if (place < 1 || place > 101)
			return null;
		List<String> places = new ArrayList<>();

		for (int f = 1; f < 101; f++) {
			// skip My place
			if (f == place)
				continue;
			int finalInt = f % 10;
			if (finalInt == 1 & f != 11)
				places.add(f + "st");
			else if (finalInt == 2 & f != 12)
				places.add(f + "nd");
			else if (finalInt == 3 & f != 13)
				places.add(f + "rd");
			else
				places.add(f + "th");
		}
		return places;
	}
}
