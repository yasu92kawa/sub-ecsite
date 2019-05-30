package com.internousdev.ecsite.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.mysql.jdbc.Connection;

public class ItemListDeleteCompleteDAO {

	private DBConnector db = new DBConnector();
	Connection con =(Connection) db.getConnection();



		public int itemInfoDelete() throws SQLException{
			String sql = "DELETE FROM item_info";

			int ret = 0;
			try{

				PreparedStatement ps = con.prepareStatement(sql);
				ret = ps.executeUpdate();

			} catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}


			//test
			System.out.println(ret);
			//test

			return ret;
		}


	}
