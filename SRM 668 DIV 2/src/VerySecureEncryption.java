import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class VerySecureEncryption {
	
	public String encrypt(String message, int[] key, int K) {
		String newMessage = message;
		int n = message.length();

		while(K > 0) {
			for (int i=0; i < n; i++ ) {
				newMessage[i] = message.charAt(i);
			}
			K--;
		}
	}
}
