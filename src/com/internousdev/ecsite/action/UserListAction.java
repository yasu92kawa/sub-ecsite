package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware{





	private ArrayList<UserInfoDTO> userInfoList = new ArrayList<UserInfoDTO>();
	private UserListDAO userListDAO = new UserListDAO();




	public String execute() throws SQLException{




			userInfoList = userListDAO.getUserInfo();



		String ret = SUCCESS;
		return ret;

	}



	public ArrayList<UserInfoDTO> getUserInfoList(){
		return userInfoList;
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}




}
