package RoomWork;

public class CW4_AccessLocalGlobal {
             static int a = 10;
             static int b = 50;
             
             int x = 65;
             int y = 44;
             
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(CW4_AccessLocalGlobal.b);
		
		CW4_AccessLocalGlobal a1 = new CW4_AccessLocalGlobal();
		
		System.out.println(a1.x);
		System.out.println(a1.y);
		
	}

}
