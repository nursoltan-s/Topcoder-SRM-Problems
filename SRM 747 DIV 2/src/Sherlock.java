import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Sherlock {
	
	public String isItHim(String firstName, String lastName) {
		boolean s = true;

		if (firstName.length() < 7) s = false;
		if (lastName.length() < 7) s = false;
		if (firstName.charAt(0) != 'B') s = false;
		if (lastName.charAt(0) != 'C') s = false;

		int cnt = 0;
		for (int i=0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (ch == 'B' || ch == 'E' || ch == 'N' || ch == 'D' || ch == 'I' || ch == 'C' || ch == 'T') cnt ++;
		}

		if (cnt < 3) s = false;

		cnt = 0;
		for (int i=0; i < lastName.length(); i++) {
			char ch = lastName.charAt(i);
			if (ch == 'C' || ch == 'U' || ch == 'M' || ch == 'B' || ch == 'E' || ch == 'R' || ch == 'B' || ch == 'A' || ch == 'T' || ch == 'H') cnt ++;
		}

		if (cnt < 5) s = false;

		return s ? "It is him" : "It is someone else";
	}
}
