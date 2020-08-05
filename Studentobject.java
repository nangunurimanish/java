
public class Studentobject {
	static String name;
	int age;
	int id;
	String gender;
	public static void main(String[] args) {
		Studentobject a = new Studentobject();
		a.age=23;
		a.id=12;
		a.gender="male";
		name = "Manish";
		System.out.println("Student name is:"+Studentobject.name);
		System.out.println("He is:"+a.age+" old");
		System.out.println("Student is:"+a.gender);
		System.out.println("Student id is:"+a.id);
		
		
	}

}
