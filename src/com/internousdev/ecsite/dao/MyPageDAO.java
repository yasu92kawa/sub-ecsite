package com.internousdev.ecsite.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.MyPageDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.mysql.jdbc.Connection;

public class MyPageDAO {

	private DBConnector db = new DBConnector();
	Connection con =(Connection) db.getConnection();




		public ArrayList<MyPageDTO> getMyPageUserInfo(String item_transaction_id, String user_master_id) throws SQLException{

			ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();

			String sql="select ubi.id, ii.item_name, ubi.total_price, ubi.total_count, ubi.pay, ubi.insert_date "
					+ "FROM user_buy_item ubi "
					+ "LEFT JOIN item_info ii "
					+ "ON ubi.item_transaction_id = ii.id "
					+ "WHERE ubi.item_transaction_id = ? AND ubi.user_master_id = ? "
					+ "ORDER BY insert_date DESC";


			try{
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1,item_transaction_id);
				ps.setString(2, user_master_id);

				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					MyPageDTO dto = new MyPageDTO();
					dto.setId(rs.getString("id"));
					dto.setItemName(rs.getString("item_name"));
		        	dto.setTotalPrice(rs.getString("total_price"));
		        	dto.setTotalCount(rs.getString("total_count"));
		        	dto.setPayment(rs.getString("pay"));
		        	dto.setInsert_date(rs.getString("insert_date"));
		        	myPageDTO.add(dto);


		        }
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				con.close();
			}

			return myPageDTO;
		}




		public int buyItemHistoryDelete(String item_transaction_id, String user_master_id) throws SQLException{
			String sql = "DELETE FROM user_buy_item WHERE item_transaction_id = ? AND user_master_id = ?";

			int ret = 0;
			
			try{

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, item_transaction_id);
				ps.setString(2, user_master_id);
				ret = ps.executeUpdate();

			} catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}
			return ret;
		}


	}
