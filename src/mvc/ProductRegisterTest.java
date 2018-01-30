package mvc;

public class ProductRegisterTest {

	public static void main(String[] args) {
		ProductDTO pro = new ProductDTO(10025, "TV", 300);
		ProductBiz biz = new ProductBiz();
		biz.register(pro);

	}

}
