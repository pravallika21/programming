
import java.util.*;


	class Square extends Thread{
		int x ;
		public Square(int n){
			x = n;
		}

		public void run(){
			int sqr = x*x ;
			System.out.println("Square of "+x+" = "+sqr);
		}
	}

	class Cube extends Thread{
		int x ;
		public Cube(int n){
			x = n ;
		}

		public void run(){
			int cub = x*x*x ;
			System.out.println("Cube of "+x+" = "+cub);
		}
	}

	class Number extends Thread{
		public void run(){
			Random r = new Random();
			for(int i=0 ; i<11 ;i++){
				int ran = r.nextInt(100);
				System.out.println("Random is generated : "+ran );
				Square sl = new Square(ran);
				Cube sk = new Cube(ran);
				if(ran%2==0){
					sl.start();
				}
				else{
					sk.start();
				}

				try{
					Thread.sleep(1000);
				}catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}



public class ThreeThreads{
	public static void main(String []args){
		Number nl = new Number();
		nl.start();
	}
}