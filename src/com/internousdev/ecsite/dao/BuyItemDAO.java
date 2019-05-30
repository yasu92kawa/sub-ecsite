package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	BuyItemDTO buyItemDTO = new BuyItemDTO();


	public BuyItemDTO getBuyItemInfo() throws SQLException{

		String sql = "select id, item_name, item_price from item_info ";


		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();


		try{
			if(rs.next()){
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return buyItemDTO;
	}

}
