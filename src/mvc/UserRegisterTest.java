package mvc;

public class UserRegisterTest {

	public static void main(String[] args) {
		//삭제,수정,입력기능
		UserDTO user = new UserDTO("id01", "pwd01", "이말숙");
		UserBiz biz = new UserBiz();
		biz.register(user);
		

	}

}
