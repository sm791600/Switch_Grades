import java.util.Scanner;
public class Switch_Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double maxP=0, osvP=0, procent=0;
		System.out.println("Vnesi maksimum bodovi koi moze da se osvojat na testot\n");
		Scanner tastatura =new Scanner(System.in);
		maxP=tastatura.nextDouble();
		System.out.println("Vnesi osvoeni bodovi\n");
		osvP=tastatura.nextDouble();
		procent=(osvP/maxP)*100;
		System.out.println("osvoeni se "+osvP+" od "+ maxP+" znaci ima "+procent+"%");
		
		int procentInt = (int)procent;
		int zasluzenaOcena=(procentInt-50)/10+5;
		
		zasluzenaOcena++;
		switch(zasluzenaOcena) {
		case 10:
			System.out.println("studentot dobil 10");
			break;
		case 9:
			System.out.println("studentot dobil 9");
			break;
		case 8:
			System.out.println("studentot dobil 8");
			break;
		case 7:
			System.out.println("studentot dobil 7");
			break;
		case 6:
			System.out.println("studentot dobil 6");
			break;
		case 5:
			System.out.println("studentot padnal");
			break;
			default:
				System.out.println("Neopredelena kolicina bodovi!");
			
		}
		
		
		
		
		/* 
		 * //System.out.println("zasluzena ocena e "+zasluzenaOcena);
		 * if(osvP>maxP) {
			System.out.println("Osvoeni se povekje od maksimalnata kolicina bodovi");
			System.exit(0);
			}
		if(procent<51){
			System.out.println("studentot padnal");
			
		} else if(procent<=60 && procent >=51){
			System.out.println("studentot dobil 6");
			
		}else if(procent<=70 && procent >=61){
			System.out.println("studentot dobil 7");
			
		}else if(procent<=80 && procent >=71){
			System.out.println("studentot dobil 8");
			
		}else if(procent<=90 && procent >=81){
			System.out.println("studentot dobil 9");
			
		}else if(procent>90 && procent <=100){
			System.out.println("studentot dobil 10");
			
		} */
	}

}
