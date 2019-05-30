package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	private ArrayList<ItemInfoDTO> itemInfoList = new ArrayList<ItemInfoDTO>();
	private ItemListDAO itemListDAO = new ItemListDAO();




	public String execute() throws SQLException{




			itemInfoList = itemListDAO.getItemInfo();



		String ret = SUCCESS;
		return ret;

	}



	public ArrayList<ItemInfoDTO> getItemInfoList(){
		return itemInfoList;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}




}
