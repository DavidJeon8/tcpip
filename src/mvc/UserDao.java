package mvc;

public class UserDao {
	//Driver Loading
	//DB�� �����Ѵ�.
	//CRUD�� �Լ��� �����ȴ�.
	public UserDao() {}
	public void userInert(UserDTO user) {
		System.out.println("DB�� User�Է�");
		System.out.println(user);
		System.out.println("�Է¿Ϸ�");
		
		
	}
	public void userDelete(String id) {
		System.out.println("DB�� id����");
		System.out.println(id);
		System.out.println("���� �Ϸ�");
		
		
	}
	public void userUpdate(UserDTO user) {
		System.out.println("DB�� User����");
		System.out.println(user);
		System.out.println("�����Ϸ�");
		
		
	}
	

}
