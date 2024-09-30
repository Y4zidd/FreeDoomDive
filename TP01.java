import java.time.Year;
import java.util.Scanner;

public class TP01 {
	public static void main(String[] args) {
		// Kerjakan soalnya di sini

		// memasukan scanner
		Scanner nm = new Scanner(System.in);

		// masukan umur dan nama
		String Nama = nm.nextLine();
		int Umur = nm.nextInt() ;

		int tahunSekarang = (Year.now().getValue() - Umur) - 2;

		// cetak nama dan umur
		System.out.println("\nHalo, " + Nama + "." + "\n" + "Ternyata usiamu baru " + tahunSekarang + " tahun ya! \n");

		nm.close();
	}
}