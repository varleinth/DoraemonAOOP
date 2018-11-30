import java.util.Random;

public class Shizuka extends Character{
	public Shizuka(){
		kecerdasan = 70;
	}
	
	void belajar(){
		if(kecerdasan < 100){
			kecerdasan = kecerdasan + 5;
		}
		else{
			kecerdasan = 100;
		}
	}
	
	int ujian(){
		Random rand = new Random();
		
		return rand.nextInt(101 - kecerdasan)+kecerdasan;
	}
}
