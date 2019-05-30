package com.internousdev.ecsite.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.mysql.jdbc.Connection;

public class UserListDAO {

	private DBConnector db = new DBConnector();
	Connection con =(Connection) db.getConnection();


		public ArrayList<UserInfoDTO> getUserInfo() throws SQLException{

			ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();

			String sql="select * FROM login_user ";

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					UserInfoDTO dto = new UserInfoDTO();
					dto.setId(rs.getString("id"));
					dto.setLoginId(rs.getString("login_id"));
		        	dto.setLoginPassword(rs.getString("login_pass"));
		        	dto.setUserName(rs.getString("user_name"));
		        	userInfoDTO.add(dto);




		        }
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				con.close();
			}



			return userInfoDTO;
		}





	}
