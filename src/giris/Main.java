package giris;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Matematik notunuzu giriniz :");
		int matematikNot = scanner.nextInt(); 
		
		System.out.print("Fizik notunuzu giriniz :");
		int fizikNot = scanner.nextInt(); 
		
		System.out.print("Kimya notunuzu giriniz :");
		int kimyaNot = scanner.nextInt(); 
		
		System.out.print("Türkçe notunuzu giriniz :");
		int turkceNot = scanner.nextInt(); 
		
		System.out.print("Tarih notunuzu giriniz :");
		int tarihNot = scanner.nextInt(); 
		
		System.out.print("Müzik notunuzu giriniz :");
		int muzikNot = scanner.nextInt(); 
		
		Double ortalama = (double) ((matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot)/6);
		System.out.println("Ortalamanız :" + ortalama);
		
		if(ortalama>=60) {
			System.out.println("Sınıfı Geçti");
		}else {
			System.out.println("Sınıfta kaldı");
		}
		
}
	
	
}