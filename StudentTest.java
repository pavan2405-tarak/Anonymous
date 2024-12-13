package Anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> stu = Arrays.asList(new Student(70, "Tarak"), new Student(20, "Pavan"),
				new Student(30, "Rohit"),new Student(10,"Srinivas"),new Student(50,"Kirito"));
		// Collections.sort(list, new IdComparator());
		System.out.println(stu);
		Comparator<Student> idComparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.id - o2.id;
			}
		};
		Comparator<Student> nameComparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		
		Collections.sort(stu, idComparator);
		System.out.println(stu);
		Collections.sort(stu, nameComparator);
		System.out.println(stu);
	}

	}


