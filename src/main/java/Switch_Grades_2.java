/*Од тастатура се внесува максимален број на поени кои студентот може да ги
добие на тестот кој го решавал, во зависност од поените според формулата (оценка =
освоени бодови/максимален број на бодови) * 100, на екран да се испечати која
оценка ја добил студентот, доколку се внесе поголем број на поени од максималниот
број соодветно да се постапи.
so switch */

import java.util.Scanner;
public class Switch_Grades_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double procent, mP, oP;
		int  ocena;
		Scanner vnes = new Scanner(System.in);
		
		System.out.println("Vnesi maksimum mozen broj poeni\n");
		mP=vnes.nextInt();
		System.out.println(" Vnesi osvoeni poeni");
		oP=vnes.nextInt();
		
		procent=(oP/mP)*100;
		ocena = (int)Math.ceil(procent/10.0);
		System.out.println("mP= "+mP+" oP="+oP+" procent= "+procent+", ocena = "+ocena+"\n");
		switch(ocena) {
		
		
		case 10:
			System.out.println("Studentot dobil 10 so "+(int)procent+" bodovi\n");
			break;
		case 9:
			System.out.println("Studentot dobil 9 so "+(int)procent+" bodovi\n");
			break;
		case 8:
			System.out.println("Studentot dobil 8 so "+(int)procent+" bodovi\n");
			break;
		case 7:
			System.out.println("Studentot dobil 7 so "+(int)procent+" bodovi\n");
			break;
		case 6:
			System.out.println("Studentot dobil 6 so "+(int)procent+" bodovi\n");
			break;
		default:
			System.out.println("Studentot padnal\n");
	}
			
		
	}

}
