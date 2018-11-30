import java.util.Random;

public class Dekisugi extends Character{
	public Dekisugi(){
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
		int chance = rand.nextInt(10)+1;
		if(chance <= 7){
			 return 100;
		}
		else{
			return rand.nextInt(101-kecerdasan)+kecerdasan-1;
		}
		
	}
}
