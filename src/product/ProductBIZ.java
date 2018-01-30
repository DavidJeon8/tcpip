package product;

import java.util.ArrayList;

import frame.Biz;

public class ProductBIZ extends Biz {
	public ProductBIZ() {
		dao = new ProductDAO();
	}

	@Override
	public void register(Object obj) {
		start();
		dao.insert(obj);
		end();

	}

	@Override
	public void modify(Object obj) {
		start();
		dao.update(obj);
		end();

	}

	@Override
	public void remove(Object obj) {
		start();
		dao.delete(obj);
		end();

	}

	@Override
	public Object get(Object obj) {
	
		return dao.select(obj);
	}

	@Override
	public ArrayList<Object> get() {
		return dao.select();
	}

}
