package user.test;

import frame.Biz;
import user.UserBIZ;
import vo.UserVO;

public class RegisterTest { //�������� �����׽�Ʈ

	public static void main(String[] args) {
		Biz biz = new UserBIZ();
		UserVO user = new UserVO("id01", "pwd01", "�̸���");
		biz.register(user);
		System.out.println("========================");
		UserVO user2 = new UserVO("id02", "pwd02", "�踻��");
		biz.modify(user2);
		System.out.println("========================");
		String user3 = "�踻��";
		biz.remove(user3);
		

	}

}
