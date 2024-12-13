package Anonymous;

public class Films implements Comparable<Films>{
	int DateofRelease;
	String Film;
	@Override
	public int compareTo(Films o) {
		// TODO Auto-generated method stub
		return o.DateofRelease-o.DateofRelease;
	}
	@Override
	public String toString() {
		return "Films[DateofRelease=" + DateofRelease + ", Film=" + Film + "]";
	}
	public Films(int dateofRelease, String film) {
		this.DateofRelease = dateofRelease;
		this.Film = film;
	}
	
	

}
