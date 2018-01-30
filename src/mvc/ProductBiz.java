package mvc;

public class ProductBiz {
	private ProductDao dao;
	
	public ProductBiz() {
		dao = new ProductDao();
	}
	
	public void register(ProductDTO pro) {
		System.out.println("������ üũ");
		System.out.println("��ǰ��ȣ �Է�");
		dao.ProductInsert(pro);
		System.out.println("���� ����");
	}
	
	public void modify(ProductDTO pro) {
		System.out.println("������ ����");
		System.out.println("��ǰ��ȣ �Է�");
		dao.ProductUpdate(pro);
		System.out.println("���� ����");
	}
	
	public void remove(int id) {
		System.out.println("������ ����");
		dao.ProductDelete(id);
	
	}



}
