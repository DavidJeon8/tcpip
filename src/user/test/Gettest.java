package user.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import user.UserBIZ;
import vo.UserVO;

class GetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test Start----------");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test End----------");

	}
	
	
	Biz biz;

	@Test
	void testGetObject() {
		biz = new UserBIZ();
		UserVO result = null;
		result = (UserVO) biz.get("id01");
		System.out.println(result);

	}

	@Test
	void testGet() {
		biz = new UserBIZ();
		ArrayList<Object>list = null;
		list = biz.get();
		for(Object obj : list) { //list안에 object갯수만큼 반복
			UserVO user = (UserVO)obj;
			System.out.println(user);
		}
	}

}
