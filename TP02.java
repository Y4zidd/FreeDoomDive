import java.util.Scanner;

public class TP02 {

	public static void main(String[] args) {
		// Kerjakan soalnya di sini;

		// masukan JumlahKawan
		Scanner inputan = new Scanner(System.in);

		int JumlahPermen = inputan.nextInt();
		int TemanDira = inputan.nextInt();

		int JumlahOrang = TemanDira + 1;

		// akan dieksekusi (/)
		int T = JumlahPermen / JumlahOrang;

		// akan dieksekusi (%)
		int S = JumlahPermen % JumlahOrang;

		System.out.println(T);
		System.out.println(S);

		inputan.close();
	}
}