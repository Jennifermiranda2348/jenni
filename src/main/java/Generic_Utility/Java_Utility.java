package Generic_Utility;

import java.util.Random;

/**
 * This class consists of java related methods
 * @author Jennifer
 */
public class Java_Utility {
	/**
	 * This method is used to get the random number
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}
}
