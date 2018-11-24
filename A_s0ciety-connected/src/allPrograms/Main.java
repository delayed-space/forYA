package allPrograms;

import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String name;
		String lastname;
		int age;
		String sdate;
		String sdd;
		String smm;
		String syyyy;
		BirthDate date;
		Student[] student;
		Class studclass;
		int n;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("How many students is the class composed of?");
		System.out.print("\t--> ");
		n = Integer.parseInt(in.readLine());
		student = new Student[n];
		
		
		for (int i = 0; i < n; i++){
			System.out.print("\n\nEnter the name of the " + (i+1) + "\u00B0 student--> ");
			name = in.readLine();
			System.out.print("Enter the last name of the " + (i+1) + "\u00B0 student--> ");
			lastname = in.readLine();
			System.out.print("Enter the age of the " + (i+1) + "\u00B0 student--> ");
			age = Integer.parseInt(in.readLine());
			
			do {
				System.out.println("Enter the birth date of the " + (i+1) + "\u00B0 student (Write '-1' if you don't know the day or the month)--> ");
				sdate = in.readLine();
				if(sdate.length() != 10) {
					System.out.println("The date format is dd/mm/yyyy.");
				}
			}while(sdate.length() != 10);
			
			sdd = sdate.substring(0, 2);
			smm = sdate.substring(3, 5);
			syyyy = sdate.substring(6, 10);
			
			if(sdd == "-1") {
				date = new BirthDate(smm, syyyy);
			}
			else if(smm == "-1") {
				date = new BirthDate(sdd, syyyy);
			}
			else {
				date = new BirthDate(sdd, smm, syyyy);
				
				if (age == -1) {
					Date data1 = new Date(System.currentTimeMillis());
					String strDateFormat = "dd/MM/yyyy";
				    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
				    String formattedDate= dateFormat.format(data1);
					
				    
				    int d1 = Integer.parseInt(sdd);
					int m1 = Integer.parseInt(smm);
					int y1 = Integer.parseInt(syyyy);
					
					
					int d = Integer.parseInt(formattedDate.substring(0, 2));
					int m = Integer.parseInt(formattedDate.substring(3, 5));
					int y = Integer.parseInt(formattedDate.substring(6, 10));
					
					
					LocalDate currentDate = LocalDate.of(y, m, d);
					LocalDate birthDate = LocalDate.of(y1, m1, d1);
					
					
					age = Period.between(birthDate, currentDate).getYears();
				}
			}
			
			student[i] = new Student(name, lastname, age, date);
			
		}
		studclass = new Class (student, n);
		
		for (int i=0; i<n; i++) {
			System.out.println("\n\n" + (i+1) + "\u00B0 student: ");
			System.out.println("\t\t" + student[i].getName() + "\t\t" + student[i].getLastName() + "\t\t" + student[i].getAge() + "\t\t" + student[i].getDate());
		}
		
		
		
		
	}

}
