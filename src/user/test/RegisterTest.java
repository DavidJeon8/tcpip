package user.test;

import frame.Biz;
import user.UserBIZ;
import vo.UserVO;

public class RegisterTest { //개발자의 단위테스트

	public static void main(String[] args) {
		Biz biz = new UserBIZ();
		UserVO user = new UserVO("id01", "pwd01", "이말숙");
		biz.register(user);
		System.out.println("========================");
		UserVO user2 = new UserVO("id02", "pwd02", "김말이");
		biz.modify(user2);
		System.out.println("========================");
		String user3 = "김말이";
		biz.remove(user3);
		

	}

}
