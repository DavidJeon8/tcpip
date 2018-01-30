package product;

import java.util.ArrayList;

import frame.Dao;
import vo.ProductVO;
import vo.UserVO;

public class ProductDAO implements Dao {

	@Override
	public void insert(Object obj) {
		ProductVO pro = (ProductVO)obj;
		System.out.println(pro+"Inserted....");
	}

	@Override
	public void delete(Object obj) {
		int id =(int)obj;
		System.out.println(id+"Deleted....");

	}

	@Override
	public void update(Object obj) {
		ProductVO pro =(ProductVO)obj;
		System.out.println(pro+"Updated.....");

	}

	@Override
	public Object select(Object obj) {
		int id = (int) obj;
		System.out.println(id+"Selected....");
		ProductVO pro = new ProductVO(011, "Galaxy9", 105);
		
		return pro;
	}

	@Override
	public ArrayList<Object> select() {
		ArrayList<Object>list = new ArrayList<>();
		System.out.println("Selected All....");
		list.add(new ProductVO(11, "Galaxy9", 105));
		list.add(new ProductVO(12, "Galaxy8", 93));
		list.add(new ProductVO(13, "Galaxy7", 80));
		list.add(new ProductVO(14, "Galaxy6", 70));
		
		return list;
	}

}
