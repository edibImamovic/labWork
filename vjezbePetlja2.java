
public class vjezbaParni {
	public static void main(String[] args) {
	
		
		System.out.println("Molim Vas da unesete prvi broj:");
		int prviBroj = TextIO.getInt();
		System.out.println("Molim Vas da unesete drugi broj:");
		int drugiBroj = TextIO.getInt();
		
		int sum1 = 0;
		int sum2 = 0;
		while (prviBroj <=drugiBroj){
			if (sum1%2==0);{
			sum1 = sum1 +prviBroj;
			prviBroj++;
			}	
			System.out.printf("Zbir svih parnih brojeva je;%d ", sum1);
			
			if (sum1%2!=0);{
				sum2 = sum2 +drugiBroj;
				prviBroj++;
				}	
			System.out.printf("Zbir svih neparnih brojeva je;%d ", sum2);
		}
			
		
		}
		
				
			}
		
