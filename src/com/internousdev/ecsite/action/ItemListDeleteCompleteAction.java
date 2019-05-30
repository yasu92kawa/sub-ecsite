package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao. ItemListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware{


	private ArrayList<ItemInfoDTO> itemInfoList = new ArrayList<ItemInfoDTO>();
	private ItemListDeleteCompleteDAO itemListDeleteCompleteDAO = new ItemListDeleteCompleteDAO();
	private String message;
	int res = 0;



	public String execute() throws SQLException{





		res =  itemListDeleteCompleteDAO.itemInfoDelete();

		//test
		System.out.println(res);
		//test



		if(res>0){
			setItemInfoList(null);
			setMessage("商品情報を削除しました。");
		}else if(res == 0){
			setMessage("商品情報を削除に失敗しました。");
		}

		String ret = SUCCESS;
		return ret;

	}







	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}






	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}







	public ArrayList<ItemInfoDTO> getItemInfoList() {
		return itemInfoList;
	}







	public void setItemInfoList(ArrayList<ItemInfoDTO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}



}
