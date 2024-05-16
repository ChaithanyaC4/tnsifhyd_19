package instancefunction1;

public class Function {
	int a=1;
	String movie="extraction";
	static int c=2;
	void hero () {
		System.out.println("chris");
	}
	static String heroine () {
		return "christie";
		
	}
	int budget(int d,int e) {
		return d-e;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function camera=new Function();
		Function name=new Function();
		System.out.println(camera.a);
		System.out.println(name.movie);
		System.out.println(Function.c);
		camera.hero();
		System.out.println(name.heroine());
		System.out.println(camera.budget(4,8));
		
		
		
		
		

	}

}
