
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		ProblemGet level1 = new ProblemGet('+', 5);
		ProblemGet level2 = new ProblemGet('+', 9);
		ProblemGet level3 = new ProblemGet('-', 9);
		boolean done = false;
		int level = 1;
		int wrongCount = 0;
		int Correct = 0;
		Scanner in = new Scanner(System.in);
		
		while (!done && wrongCount < 2) {
			if (level == 1) {
				System.out.println(level1.Next());
			} else if (level == 2) {
				System.out.println(level2.Next());
			} else {
				System.out.println(level3.Next());
			}
			int ans;
			try {
				ans = in.nextInt();
				if (level == 1) {
					if (level1.isTrue(ans)) {
						Correct++;
						System.out.printf("\n CORRECT!!!! \n");
					} else {
						wrongCount++;
						System.out.printf("\n INCORRECT \n");
					}
				} else if (level == 2) {
					if (level2.isTrue(ans)) {
						Correct++;
						System.out.printf("\n CORRECT!!!! \n");
					} else {
						wrongCount++;
						System.out.printf("\n INCORRECT \n");
					}
				} else {
					if (level3.isTrue(ans)) {
						Correct++;
						System.out.printf("\n CORRECT!!!! \n");
					} else {
						wrongCount++;
						System.out.printf("\n INCORRECT \n");
					}
				}
			} catch (Exception err) {
				System.out.printf("\n ERROR \n");
				in.next();
			}
			if (Correct > 9) {
				if (level < 3) {
					level++;
					Correct = 0;
					System.out.printf("\n NEXT LEVEL \n");
				} else {
					done = true;
					System.out.printf("\n YOU FINISHED. GREAT JOB!!!! \n");
				}
			}
		}
		in.close();
	}
}
