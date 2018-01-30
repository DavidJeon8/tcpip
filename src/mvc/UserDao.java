package mvc;

public class UserDao {
	//Driver Loading
	//DB에 접속한다.
	//CRUD가 함수로 구현된다.
	public UserDao() {}
	public void userInert(UserDTO user) {
		System.out.println("DB에 User입력");
		System.out.println(user);
		System.out.println("입력완료");
		
		
	}
	public void userDelete(String id) {
		System.out.println("DB에 id삭제");
		System.out.println(id);
		System.out.println("삭제 완료");
		
		
	}
	public void userUpdate(UserDTO user) {
		System.out.println("DB에 User수정");
		System.out.println(user);
		System.out.println("수정완료");
		
		
	}
	

}
