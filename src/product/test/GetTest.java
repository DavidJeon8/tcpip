package product.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import product.ProductBIZ;
import vo.ProductVO;
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
		System.out.println("Test Star-------");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test End-------");
	}
	
	Biz biz;

	@Test
	void testGetObject() {
		biz= new ProductBIZ();
		ProductVO pro = null;
		pro = (ProductVO) biz.get(011);
		System.out.println(pro);
	}

	@Test
	void testGet() {
		biz = new ProductBIZ();
		ArrayList<Object> list =  biz.get();
		for(Object obj:list) {
			ProductVO pro = (ProductVO)obj;
			System.out.println(pro);
		}
	}

}
