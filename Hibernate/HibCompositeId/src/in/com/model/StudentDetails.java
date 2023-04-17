package in.com.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class StudentDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	public Student student;
	
	
	public String sname;
	public int Semester;
	

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	
	public String toString()
	{
		return student+"" +sname+" " +Semester;
	}
	

}
