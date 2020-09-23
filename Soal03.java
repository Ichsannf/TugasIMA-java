import java.util.Scanner;

public class Soal03 {
	public static void main(String[] args) {
		Scanner amd = new Scanner (System.in);
		double nilai_praktikum;
		double nilai_asesmen_1;
		double nilai_asesmen_2;
		double nilai_akhir;
	
		System.out.print("Masukan nilai praktikum = ");
		nilai_praktikum = amd.nextDouble();
	
		System.out.print("Masukan nilai asesmen 1 = ");
		nilai_asesmen_1 = amd.nextDouble();
		System.out.print("Masukan nilai asesmen 2 = ");
		nilai_asesmen_2 = amd.nextDouble();
	
		double persentase_1 = 0.25;		// 25%
		double persentase_2 = 0.35;		// 35%
		double persentase_3 = 0.40;		// 40%
	
		nilai_akhir = (persentase_1 * nilai_praktikum) + (persentase_2 * nilai_asesmen_1) + (persentase_3 * nilai_asesmen_2);

		System.out.println("Nilai akhir kamu adalah "+ nilai_akhir);
	}
}