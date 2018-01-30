package user;

import java.util.ArrayList;

import frame.Biz;

public class UserBIZ extends Biz {
	public UserBIZ() {
		dao = new UserDAO();
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
		int i =10/0;
			
		return dao.select(obj);
	}

	@Override
	public ArrayList<Object> get() {
	
		return dao.select();
	}


}
