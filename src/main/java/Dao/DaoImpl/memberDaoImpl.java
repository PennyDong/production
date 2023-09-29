package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.DbConnection;
import Dao.memberDao;
import vo.member;

public class memberDaoImpl implements memberDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x= new memberDaoImpl().queryUser("woo");
		System.out.println(x);
		boolean y = new memberDaoImpl().queryPassword("123");
		System.out.println(y);
	}

	@Override
	public void add(member m) {
		// TODO Auto-generated method stub
			
			
			String SQL="insert into member(name,username,password) values(?,?,?)";
			Connection conn = DbConnection.getDb(); 
			
			try {
				PreparedStatement ps = conn.prepareStatement(SQL);
				
				ps.setString(1,m.getName());
				ps.setString(2,m.getUsername());
				ps.setString(3,m.getPassword());
				
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	@Override
	public boolean queryUser(String username) {
		
		Connection conn = DbConnection.getDb();
		String SQL = "Select * from member WHERE username=?";
		boolean x=false;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1,username);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				x=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	@Override
	public boolean queryPassword(String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "Select * from member WHERE password=?";
		boolean p=false;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1,password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				p=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	

	@Override
	public member queryMember(String username,String password) {
		
		Connection conn = DbConnection.getDb();
		String SQL="select * from member where username=? and password=?";
		member m =null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1,username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				m=new member();
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
		
	}

	@Override
	public void updateUsername(String newName,String username) {
		
		Connection conn = DbConnection.getDb();
		String SQL="update member set name=? where username=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1,newName);
			ps.setString(2,username);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updatePassword(String newPassword,String password) {
		Connection conn = DbConnection.getDb();
		String SQL="update member set password=? where password=?";
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SQL);
			
			ps.setString(1,newPassword);
			ps.setString(2,password);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
	

}
	

