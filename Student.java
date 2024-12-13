package Anonymous;

public class Student implements Comparable<Student> {
	int id;
	String name;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	/*@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.id-o.id;
	}*/
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

}
