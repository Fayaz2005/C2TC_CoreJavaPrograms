package Day2.basic;

public class ContinueDEmo {
	public static void main(String[] args) {
		for (int k = 5; k < 15; k++)
		{
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}
}
