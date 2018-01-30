package mvc;

public class ProductRemoveTest {

	public static void main(String[] args) {
		ProductDTO pro = new ProductDTO(10035, "TV", 300);
		ProductBiz biz = new ProductBiz();
		biz.remove(pro.getId());
		

	}

}
