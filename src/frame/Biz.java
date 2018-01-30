package frame;

import java.util.ArrayList;

import vo.UserVO;

public abstract class Biz {
	protected Dao dao;
	
	public void start() {
		System.out.println("Start....");
	}
	public void end() {
		System.out.println("End....");
	}
	public abstract void register(Object obj);// abstract로 해야함.
	public abstract void modify(Object obj);
	public abstract void remove(Object obj);
	public abstract Object get(Object obj);
	public abstract ArrayList<Object> get();
	public void register(UserVO user) {
		// TODO Auto-generated method stub
		
	}


}
