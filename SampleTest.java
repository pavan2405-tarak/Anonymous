package Anonymous;

public class SampleTest{
	public static void main(String[] args) {
		Sample ad=new Sample() {
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("Addition");
				
			}
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				System.out.println("Substration");
			}
			
		};
		ad.add();
		ad.sub();
			
		}
		
		
		
		
		
	}