package com.internousdev.ecsite.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.mysql.jdbc.Connection;

public class ItemListDAO {

	private DBConnector db = new DBConnector();
	Connection con =(Connection) db.getConnection();


		public ArrayList<ItemInfoDTO> getItemInfo() throws SQLException{

			ArrayList<ItemInfoDTO> itemInfoDTO = new ArrayList<ItemInfoDTO>();

			String sql="select * FROM item_info ";

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					ItemInfoDTO dto = new ItemInfoDTO();
					dto.setId(rs.getString("id"));
					dto.setItemName(rs.getString("item_name"));
		        	dto.setItemPrice(rs.getInt("item_price"));
		        	dto.setStock(rs.getInt("item_stock"));
		        	itemInfoDTO.add(dto);

		        	//test
		        	System.out.println(dto.getItemName());
		        	//test

		        	//test
		        	System.out.println(dto.getItemPrice());
		        	//test


		        }
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				con.close();
			}



			return itemInfoDTO;
		}





	}
