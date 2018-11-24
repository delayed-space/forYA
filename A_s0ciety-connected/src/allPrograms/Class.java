package allPrograms;

public class Class {
	Student[] students;
	int nstud;
	
	
	public Class(Student[] students, int n) {
		nstud = n;
		this.students = new Student[nstud];
		for (int j=0; j<nstud; j++) {
			this.students[j] = students[j];
		}
	}
	
	Student[] getStudents() {
		return students;
	}
	
}
