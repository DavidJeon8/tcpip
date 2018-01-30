package mvc;

public class ProductBiz {
	private ProductDao dao;
	
	public ProductBiz() {
		dao = new ProductDao();
	}
	
	public void register(ProductDTO pro) {
		System.out.println("데이터 체크");
		System.out.println("제품번호 입력");
		dao.ProductInsert(pro);
		System.out.println("메일 전송");
	}
	
	public void modify(ProductDTO pro) {
		System.out.println("데이터 수정");
		System.out.println("제품번호 입력");
		dao.ProductUpdate(pro);
		System.out.println("메일 전송");
	}
	
	public void remove(int id) {
		System.out.println("데이터 삭제");
		dao.ProductDelete(id);
	
	}



}
