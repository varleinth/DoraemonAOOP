import java.util.Random;

	public class Suneo extends Character{
		public Suneo(){
			kecerdasan = 40;
		}
		
		void belajar(){
			if(kecerdasan < 100){
				kecerdasan = kecerdasan + 3;
			}
			else{
				kecerdasan = 100;
			}
		}
		
		int ujian(){
			Random rand = new Random();
			int nilai=rand.nextInt(kecerdasan+6)+5;
			if(nilai<100){
				return nilai;
			}
			else{
				return 100;
			}
		}
}
