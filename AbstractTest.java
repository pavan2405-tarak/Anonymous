package Anonymous;

public class AbstractTest {
	public static void main(String[] args) {
		Abstract cls= new Abstract() {
			
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("Showing");
				
			}
			@Override
			void display() {
				// TODO Auto-generated method stub
				System.out.println("displaying");
			}
		};
		cls.display();
		cls.show();
	}

}
