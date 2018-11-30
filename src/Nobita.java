import java.util.Random;


public class Nobita extends Character{
	public Nobita(){
		kecerdasan = 10;
	}
	
	void belajar(){
		if(kecerdasan < 100){
			kecerdasan = kecerdasan + 1;
		}
		else{
			kecerdasan = 100;
		}
	}
	
	int ujian(){
		Random rand = new Random();
		
		return rand.nextInt(kecerdasan+1);
	}
}
