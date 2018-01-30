package producttest;

import frame.Biz;
import product.ProductBIZ;
import vo.ProductVO;


public class Registertest {
	public static void main(String[] args) {
		Biz biz = new ProductBIZ();
		ProductVO prod = new ProductVO(01,"å01",1000);
		biz.register(prod);
		biz.modify(prod);
		biz.remove(prod.getId());
	
	}
	
}
