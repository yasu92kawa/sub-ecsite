package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{


	private LoginDTO loginDTO = new LoginDTO();
	private LoginDAO loginDAO = new LoginDAO();

	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private Map<String,Object> session;
	private String loginUserId;
	private String loginPassword;



	public String execute() throws SQLException {

		String ret = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		//test
		 System.out.println(loginDTO.getLoginPassword());
		 System.out.println(loginDTO.getLoginId());
		//test

		session.put("loginUser",loginDTO);


		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){

			ret = SUCCESS;
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("login_user_id",loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());



			 if(((LoginDTO) session.get("loginUser")).getAdmin() != null){
					ret = "manage";

					//test
					 System.out.println(ret);
					//test

					return  ret;
				}


			return  ret;



		}

		//test
		 System.out.println(ret);
		//test



		return ret;

	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Map<String, Object> getSession() {
		return  session;

	}


}
