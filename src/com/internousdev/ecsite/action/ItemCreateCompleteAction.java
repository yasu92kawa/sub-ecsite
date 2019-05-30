package com.internousdev.ecsite.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{



	private String itemName;
	private int itemPrice;
	private int stock;
	private Map<String , Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();


	public String execute() throws SQLException{


		itemCreateCompleteDAO.createItem(
				session.get("itemName").toString(),
				(int)session.get("itemPrice"),
				(int)session.get("stock")
				);

		String ret = SUCCESS;
		return ret;

	}





	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName  = itemName;
	}

	public int getItemPrice(){
 	   return itemPrice;
 	}
 	public void setItemPrice(int itemPrice){
 	   this.itemPrice = itemPrice;
 	}
 	public int getStock(){
  	   return stock;
  	}
  	public void setStock(int stock){
  	   this.stock=stock;
  	}

   	public void setSession(Map<String , Object> session){
   		this.session = session;
   	}

}
