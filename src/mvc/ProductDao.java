package mvc;

public class ProductDao {
	public ProductDao() {}
	
	public void ProductInsert(ProductDTO pro) {
		System.out.println("DB�� product�Է�");
		System.out.println(pro);
		System.out.println("�Է¿Ϸ�");
		
	}
	
	public void ProductDelete(int id) {
		System.out.println("DB�� idã��");
		System.out.println(id);
		System.out.println("�����Ϸ�");
		
	}
	
	public void ProductUpdate(ProductDTO pro) {
		System.out.println("DB�� product����");
		System.out.println(pro);
		System.out.println("�����Ϸ�");
		
	}

}
