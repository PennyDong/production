package Dao;

import vo.member;

public interface memberDao {
	
	//create
	void add(member m);
	
	//read
	boolean queryUser(String username);
	boolean queryPassword(String password);
	member queryMember(String username,String password);
	
	//update
	void updateUsername(String newName,String username);
	void updatePassword(String newPassword,String password);
	
	//delete
}
