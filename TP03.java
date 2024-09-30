import java.util.Scanner;

public class TP03 {

	public static void main(String[] args) {

				// panjang
				Scanner Inputan = new Scanner(System.in);

				int p  = Inputan.nextInt();
				int l = Inputan.nextInt();
				int s = Inputan.nextInt();

				// buatlah logikanya
				boolean m = s <= p && s <= l;

				System.out.println("Kotak dapat masuk ke dalam Persegi Panjang? " + m + "\n");

				Inputan.close();
	}
}