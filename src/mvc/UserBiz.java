package mvc;

public class UserBiz {
	private UserDao dao;
	
	public UserBiz() {
		dao = new UserDao();
	}
	
	public void register(UserDTO user) {
		System.out.println("데이터 체크");
		System.out.println("아이템 입렵");
		dao.userInert(user);
		System.out.println("메일 전송");
	}
	
	public void modify(UserDTO user) {
		System.out.println("데이터 체크");
		dao.userInert(user);
	}
	
	public void remove(String id) {
		System.out.println("데이터 체크");
		dao.userDelete(id);
	}
	
	

}
