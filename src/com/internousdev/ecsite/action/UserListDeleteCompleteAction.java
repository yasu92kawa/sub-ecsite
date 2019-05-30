package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao. UserListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware{


	private ArrayList<UserInfoDTO> userInfoList = new ArrayList<UserInfoDTO>();
	private UserListDeleteCompleteDAO userListDeleteCompleteDAO = new UserListDeleteCompleteDAO();
	private String message;
	int res = 0;



	public String execute() throws SQLException{





		res =  userListDeleteCompleteDAO.userInfoDelete();

		//test
		System.out.println(res);
		//test



		if(res>0){
			setUserInfoList(null);
			setMessage("ユーザー情報を削除しました。");
		}else if(res == 0){
			setMessage("ユーザー情報を削除に失敗しました。");
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







	public ArrayList<UserInfoDTO> getUserInfoList() {
		return userInfoList;
	}







	public void setUserInfoList(ArrayList<UserInfoDTO> userInfoList) {
		this.userInfoList = userInfoList;
	}



}
