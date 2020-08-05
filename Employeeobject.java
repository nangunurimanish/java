public class Employeeobject {
		static String name;
		int age;
		int id;
		String gender;
		double salary;
		public static void main(String[] args) {
			Employeeobject a = new Employeeobject();
			a.age=43;
			a.id=1234;
			a.gender="female";
			name = "Pushpavalli";
			a.salary = 100000.00;
			System.out.println("Employee name is:"+Employeeobject.name);
			System.out.println("she is:"+a.age+" old");
			System.out.println("Employee is:"+a.gender);
			System.out.println("Employee id is:"+a.id);
			System.out.println("She earns"+a.salary);
			
	}


}
