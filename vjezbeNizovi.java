
public class vjezbeNizovi {
	
	public static int[] unosNiza(int velicina){
		
		int [] nizUnos = new int [velicina];
		
		
		for (int i = 0; i<nizUnos.length; i++){
			System.out.println("Unesite broj");
			nizUnos[i] = TextIO.getInt();
			
			
		}
		return nizUnos;
	}
	
	public static void ispisNiza(int [] nizK){

		
		for (int i = 0; i<nizK.length; i++ ){
			System.out.print(nizK[i]);
		}	
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Unesite broj brojeva");
		int velicina = TextIO.getInt();
		int [] niz = unosNiza(velicina);
		ispisNiza(niz);
		
		}
		
	
	}
		
