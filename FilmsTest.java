package Anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilmsTest {
	public static void main(String[] args) {
		List<Films> fi=Arrays.asList(new Films(2014,"Bahubali"),new Films(2002,"Murari"),
				new Films(2024,"Pushpa2"),new Films(2010,"Khaleja"));
		System.out.println(fi);
		Comparator<Films> DORComparator= new Comparator<Films>() {

			@Override
			public int compare(Films o1, Films o2) {
				// TODO Auto-generated method stub
				return o1.DateofRelease-o2.DateofRelease;
				
			}
			
		};
		Comparator<Films> NameComparator=new Comparator<Films>() {

			@Override
			public int compare(Films o1, Films o2) {
				// TODO Auto-generated method stub
				return o1.Film.compareTo(o2.Film);
			}
			
		};
		Collections.sort(fi, DORComparator);
		System.out.println(fi);
		Collections.sort(fi, NameComparator);
		System.out.println(fi);

	       
	}
	

    

	

}
