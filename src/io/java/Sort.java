package io.java;

import java.util.*;

class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


//Complete the code
public class Sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		
		//first name comparator
		Comparator<Student> compareBycgpa = Comparator.comparingDouble(Student::getCgpa);
		 
		//last name comparator
		Comparator<Student> compareByFirstName = Comparator.comparing(Student::getFname);
		
		Comparator<Student> compareById = Comparator.comparingInt(Student::getId);
		 
		//Compare by first name and then last name (multiple fields)
		Comparator<Student> studentComparator = compareBycgpa.reversed().thenComparing(compareByFirstName).thenComparing(compareById);
		 
		//Use Comparator
		Collections.sort(studentList, studentComparator);
      
		
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
      	
      
	}
}



