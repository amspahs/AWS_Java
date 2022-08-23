package five;

public class Point3DTest {	//메인에서는 익스텐즈 없어야 됨

	public static void main(String[] args) {

		Point3D point3d = new Point3D();	//뉴를 하면 하나만 만들어짐. 부모가 아니라 나
//		String str = "";
												//***alt + shift + a: 여러 줄 바꾸기. 유용하다.
		
		
		
		
//		str = point3d.getLocation();
				
		System.out.println("point3d.x =" + point3d.x);
		System.out.println("point3d.y =" + point3d.y);
		System.out.println("point3d.z =" + point3d.z);
	
//		System.out.println("point3d.x =" + this.point3d.x); 
//		System.out.println("point3d.x =" + super.point3d.x);
	}
}

