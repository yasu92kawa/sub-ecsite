package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{



	private Map<String , Object> session;
	private String itemName;
	private int itemPrice = 0;
	private int stock;
	private String errorMessage;

	public String execute(){

		String ret = SUCCESS;

////

		if(!(itemName.equals("")) && !(itemPrice == 0) && !(stock == 0)){
			session.put("itemName",itemName);
			session.put("itemPrice",itemPrice);
			session.put("stock",stock);
		}else{
			setErrorMessage("未入力の項目があります。");
			ret = ERROR;
		}

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
 	public Map<String , Object> getSession(){
  	   return session;
  	}
  	public void setSession(Map<String , Object> session){
  		this.session = session;
  	}
  	public String getErrorMessage(){
  	   return errorMessage;
  	}
  	public void setErrorMessage(String errorMessage){
  	   this.errorMessage=errorMessage;
  	}


}
