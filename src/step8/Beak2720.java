package step8;

import java.util.Scanner;

public class Beak2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int money = sc.nextInt();

			int q = money / 25;
			money %= 25;
			int d = money / 10;
			money %= 10;
			int n = money / 5;
			money %= 5;
			int p = money;
			System.out.println(q + " " + d + " " + n + " " + p);

		}
		sc.close();
	}

}
