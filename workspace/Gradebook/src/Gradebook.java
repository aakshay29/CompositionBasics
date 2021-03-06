import java.util.Scanner;
public class Gradebook {
	public static void main (String[] args){
		System.out.println("Welcome to the Student Gradebook");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		double maleAvg = 0, femaleAvg = 0, econAvg = 0, csAvg = 0, eeAvg = 0, mdAvg = 0, dcAvg = 0, vaAvg = 0, overallAvg = 0;	
		int maleTot = 0, femaleTot = 0, econTot = 0, csTot = 0, eeTot = 0, mdTot = 0, dcTot = 0, vaTot = 0, overallTot = 0;	
		String[] name = new String[100];
		String[] grade = new String[100];
		String[] gender = new String[100];
		String[] major = new String[100];
		String[] state = new String[100];
		int[] score = new int[100];
		int counter = 0;
		
		for(int i = 0; i < 100; i++){			
			System.out.println("Enter Name of Student " + (i+1));
			name[i] = sc.nextLine();
			System.out.println("Enter Grade of Student " + (i+1));
			grade[i] = sc.nextLine();
			System.out.println("Enter Gender of Student " + (i+1) + " (M/F)");
			gender[i] = sc.nextLine();
			System.out.println("Enter Major of Student " + (i+1) + " (Econ/CS/EE)");
			major[i] = sc.nextLine();
			System.out.println("Enter State of Student " + (i+1) + " (MD/VA/DC)");
			state[i] = sc.nextLine();
			System.out.println("Enter Score of Student " + (i+1));
			score[i] = sc.nextInt();
			sc.nextLine();
			counter++;
			System.out.println("Enter another record? (Yes/No)");
			if(sc.nextLine().equalsIgnoreCase("No"))
				break;		
		}
		int maleCounter = 0, femaleCounter = 0, dcCounter = 0, vaCounter = 0, mdCounter = 0, eeCounter = 0, csCounter = 0, econCounter = 0;
		for(int i = 0; i < counter; i++){			
			
			overallTot += score[i];			
			if(counter != 0)
				overallAvg = overallTot/counter;
								
			if(gender[i].equalsIgnoreCase("M")){
				maleCounter++;
				maleTot += score[i];
				maleAvg = maleTot/maleCounter;
			}
			
			if(gender[i].equalsIgnoreCase("F")){
				femaleCounter++;
				femaleTot += score[i];	
				femaleAvg = femaleTot/femaleCounter;
			}		
			
			if(major[i].equalsIgnoreCase("econ")){
				econCounter++;
				econTot += score[i];	
				econAvg = econTot/econCounter;
			}
							
			if(major[i].equalsIgnoreCase("cs")){
				csCounter++;
				csTot += score[i];	
				csAvg = csTot/csCounter;
			}			
			
			if(major[i].equalsIgnoreCase("ee")){
				eeCounter++;
				eeTot += score[i];	
				eeAvg = eeTot/eeCounter;
			}
							
			if(state[i].equalsIgnoreCase("va")){
				vaCounter++;
				vaTot += score[i];	
				vaAvg = vaTot/vaCounter;
			}
			
			if(state[i].equalsIgnoreCase("md")){
				mdCounter++;
				mdTot += score[i];
				mdAvg = mdTot/mdCounter;
			}
			
			if(state[i].equalsIgnoreCase("dc")){
				dcCounter++;
				dcTot += score[i];	
				dcAvg = dcTot/dcCounter;		
			}	
		}
		System.out.println("Number of students: " + counter);
		System.out.println("Overall Average: " + overallAvg);
		System.out.println("Male Average: " + maleAvg);
		System.out.println("Female Average: " + femaleAvg);
		System.out.println("Econ Major Average: " + econAvg);
		System.out.println("CS Major Average: " + csAvg);
		System.out.println("EE Major Average: " + eeAvg);
		System.out.println("Maryland State Average: " + mdAvg);
		System.out.println("Virginia State Average: " + vaAvg);
		System.out.println("Washington DC State Average: " + dcAvg);
		
		sc.close();
	}
}
