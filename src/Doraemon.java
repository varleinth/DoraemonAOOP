import java.util.*;

public class Doraemon {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void charmenu(){
		System.out.println("1. Belajar");
		System.out.println("2. Ujian");
		System.out.println("3. Keluar");
	}
	
	public static void NobitaGo(){
		int choose;
		Nobita nobita = new Nobita();
		
		
		do{
			charmenu();
			choose = scanner.nextInt();
			scanner.nextLine();
			switch(choose){
			case 1:
				nobita.belajar();
				System.out.println("Kecerdasan saat ini "+nobita.getKecerdasan());
				break;
			case 2:
				System.out.println("Hasil Ujian " + nobita.ujian());
				break;
			
			case 3:
				System.exit(0);
				break;
			}
		}while(choose > 1 || choose < 4);
	}
	
	
	public static void ShizukaGo(){
		int choose;
		Shizuka shizuka = new Shizuka();
		
		do{
			charmenu();
			choose = scanner.nextInt();
			scanner.nextLine();
			switch(choose){
			case 1:
				shizuka.belajar();
				System.out.println("Kecedasan saat ini " + shizuka.getKecerdasan());
				break;
			case 2:
				System.out.println("Hasil Ujian " + shizuka.ujian());
				break;
			
			case 3:
				System.exit(0);
				break;
			}
		}while(choose > 1 || choose < 4);
	}
	
	public static void SuneoGo(){
		int choose;
		Suneo suneo = new Suneo();
		
		
		do{
			charmenu();
			choose = scanner.nextInt();
			scanner.nextLine();
			switch(choose){
			case 1:
				suneo.belajar();
				System.out.println("Kecerdasan saat ini " + suneo.getKecerdasan());
				break;
			case 2:
				System.out.println("Hasil Ujian " + suneo.ujian());
				break;
			
			case 3:
				System.exit(0);
				break;
			}
		}while(choose > 1 || choose < 4);
	}
	
	public static void DekisugiGo(){
		int choose;
		Dekisugi dekisugi = new Dekisugi();
		
		
		do{
			charmenu();
			choose = scanner.nextInt();
			scanner.nextLine();
			switch(choose){
			case 1:
				dekisugi.belajar();
				System.out.println("Kecerdasan saat ini " + dekisugi.getKecerdasan());
				break;
			case 2:
				System.out.println("Hasil Ujian "+dekisugi.ujian());
				break;
			
			case 3:
				System.exit(0);
				break;
			}
		}while(choose > 1 || choose < 4);
	}
	
	
	public static void main(String[] args) {
		int choose;
		
		
		do{
		
			System.out.println("1. Nobita");
			System.out.println("2. Suneo");
			System.out.println("3. Shizuka");
			System.out.println("4. Dekisugi");
			
			choose = scanner.nextInt();
			scanner.nextLine();
		
			
			switch(choose){
			
				case 1:
					NobitaGo();
					break;
				case 2:
					SuneoGo();
					break;
				case 3:
					ShizukaGo();
					break;
				case 4:
					DekisugiGo();
					
					
			}
		
		}while(choose < 1 || choose > 4 );
		
		
	}
}
