import java.util.Scanner;

public class ScoreLevel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入數字: ");
		int remain = scanner.nextInt();
		
		if (remain >= 0 && remain <=50) 
			System.out.println("差");
		else if (remain >= 51 && remain <=70) 
			System.out.println("可");
		else if (remain >= 71 && remain <=80)
			System.out.println("良");
		else if (remain >= 81 && remain <=100)
			System.out.println("優");
		 else {
			System.out.println("錯誤");
		}

	}
}
