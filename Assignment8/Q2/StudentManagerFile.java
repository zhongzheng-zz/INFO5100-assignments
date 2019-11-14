package Q2;

import java.io.*;
import java.util.*;


public class StudentManagerFile {
	private Map<String,Student> studentsMap = new HashMap<String, Student>();
	private String file = "/Users/zhengzhong/eclipse-workspace/student.txt";
	
	public StudentManagerFile() throws Exception{
		readFromFileAndAddData();
	}

	private void readFromFileAndAddData() throws Exception{
		File f = new File(file);
		if(f.exists() == false) {
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		Scanner s = new Scanner(fis);
		while(s.hasNext()) {
			String l  = s.nextLine();
			String[] tokens = l.split("\\|");
			Student student = new Student(tokens[0],tokens[1],tokens[2]);
			this.addStudentToMap(student);
		}
		s.close();
	}

	private void addStudentToMap(Student student) {
		String id = student.getId();
		Student s = studentsMap.get(id);
		if(s == null) {
			studentsMap.put(student.getId(), student);
		}
		else {
			throw new RuntimeException("student with this id: " + id + " is already existed");
		}
		
	}

	public void addStudent(Student student) {
		addStudentToMap(student);
		writeIntoFile(student);
	}
	
	private void writeIntoFile(Student student) {
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			PrintStream ps = new PrintStream(fos);
			ps.println(student.getId() + "|"+ student.getName() + "|" + student.getGender());
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public int getStudentCount() {
		return studentsMap.size();
	}
	
	public List<Student> getStudents(){
		return new ArrayList<Student>(studentsMap.values());
	}

}
