package Anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollegeTest {

	public static void main(String[] args) {
		List<College> cl=Arrays.asList(new College(104,"Aurora's PG College"),new College(101,"Masters Junior College"),
				new College(102,"Vivekananda Degree College"),new College(103,"Sreenidhi High School"));
		System.out.println(cl);
		
	Comparator<College> IdComparator=new Comparator<College>(){

		@Override
		public int compare(College o1, College o2) {
			// TODO Auto-generated method stub
			return o1.CollegeId-o2.CollegeId;
		}
		
	};
	Comparator<College> NameComparator= new Comparator<College>() {

		@Override
		public int compare(College o1, College o2) {
			// TODO Auto-generated method stub
			return o1.CollegeName.compareTo(o2.CollegeName);
		}
		
	};
	Collections.sort(cl,IdComparator);
	System.out.println(cl);
	Collections.sort(cl,NameComparator);
	System.out.println(cl);

	
}
}
