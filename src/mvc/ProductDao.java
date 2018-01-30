package mvc;

public class ProductDao {
	public ProductDao() {}
	
	public void ProductInsert(ProductDTO pro) {
		System.out.println("DB에 product입력");
		System.out.println(pro);
		System.out.println("입력완료");
		
	}
	
	public void ProductDelete(int id) {
		System.out.println("DB에 id찾기");
		System.out.println(id);
		System.out.println("삭제완료");
		
	}
	
	public void ProductUpdate(ProductDTO pro) {
		System.out.println("DB에 product수정");
		System.out.println(pro);
		System.out.println("수정완료");
		
	}

}
