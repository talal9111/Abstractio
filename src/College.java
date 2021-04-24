
public abstract class College {
	public abstract void department(String nameDepartment);
	
	public void college(String nameCollege) {
		System.out.println("The Name of The College is: " + nameCollege);
	}
}
	class Department extends College{

		@Override
		public void department(String nameDepartment) {
			// TODO Auto-generated method stub
			System.out.println("The Name of The Department is: " + nameDepartment);
		}
		
	}
	
	class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department();
		obj.college("Computer Science and Information Systems");
		obj.department("Information Systems");
	}
}
