import java.util.Scanner;

public class ScoreLevel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�п�J�Ʀr: ");
		int remain = scanner.nextInt();
		
		if (remain >= 0 && remain <=50) 
			System.out.println("�t");
		else if (remain >= 51 && remain <=70) 
			System.out.println("�i");
		else if (remain >= 71 && remain <=80)
			System.out.println("�}");
		else if (remain >= 81 && remain <=100)
			System.out.println("�u");
		 else {
			System.out.println("���~");
		}

	}
}
