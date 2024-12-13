package Anonymous;

public class College implements Comparable<College>{
     int CollegeId;
     String CollegeName;
	@Override
	public int compareTo(College o) {
		// TODO Auto-generated method stub
		return o.CollegeId-o.CollegeId;
		//return o.CollegeName.compareTo(o.CollegeName);
	}
	public College(int collegeId, String collegeName) {
		this.CollegeId = collegeId;
		this.CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "College [CollegeId=" + CollegeId + ", CollegeName=" + CollegeName + "]";
	}
     
	

}
