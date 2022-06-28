import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil;
		Scanner deger = new Scanner(System.in);
		System.out.println("dogum yilinizi giriniz: ");
		yil = deger.nextInt();

		if (yil % 12 == 0) {
			System.out.println("cin zodyagi burcunuz: maymun");
		}
		if (yil % 12 == 1) {
			System.out.println("cin zodyagi burcunuz: horoz");
		}
		if (yil % 12 == 2) {
			System.out.println("cin zodyagi burcunuz: kopek");
		}
		if (yil % 12 == 3) {
			System.out.println("cin zodyagi burcunuz: domuz");
		}
		if (yil % 12 == 4) {
			System.out.println("cin zodyagi burcunuz: fare");
		}
		if (yil % 12 == 5) {
			System.out.println("cin zodyagi burcunuz: okuz");
		}
		if (yil % 12 == 6) {
			System.out.println("cin zodyagi burcunuz: kaplan");
		}
		if (yil % 12 == 7) {
			System.out.println("cin zodyagi burcunuz: tavsan");
		}
		if (yil % 12 == 8) {
			System.out.println("cin zodyagi burcunuz: ejderha");
		}
		if (yil % 12 == 9) {
			System.out.println("cin zodyagi burcunuz: yilan");
		}
		if (yil % 12 == 10) {
			System.out.println("cin zodyagi burcunuz: at");
		}
		if (yil % 12 == 11) {
			System.out.println("cin zodyagi burcunuz: koyun");
		}

	}

}
