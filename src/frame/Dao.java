package frame;

import java.util.ArrayList;

public interface Dao {
	//CRUD Method Define
	// 스펙--명세서
	//프로젝트의 골격--기본표준화
	
	/**
	 * Insert Object to Oracle DB
	 * */
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object select(Object obj);
	public ArrayList<Object> select();
	

}
