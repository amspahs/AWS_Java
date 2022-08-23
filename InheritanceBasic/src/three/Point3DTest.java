package three;

public class Point3DTest {	//메인에서는 익스텐즈 없어야 됨

	public static void main(String[] args) {

		Point3D point3d = new Point3D();
		String str = "";
		
		point3d.x = 1;
		point3d.y = 2;
		point3d.z = 3;
		
		str = point3d.getLocation();
				
		System.out.println(str);
	}
}

