package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String userName;
	private String admin;
	private boolean loginFlg = false;



	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	 public String getLoginPassword(){
	        return loginPassword;
	     }

	     public void setLoginPassword(String loginPassword){
	        this.loginPassword = loginPassword;
	     }

	    public String getUserName(){
	       return userName;
	    }

	    public void setUserName(String userName){
	       this.userName = userName;
	    }

	    public boolean getLoginFlg(){
	        return loginFlg;
	     }

	     public void setLoginFlg(boolean loginFlg){
	        this.loginFlg = loginFlg;
	     }

		public String getAdmin() {
			return admin;
		}

		public void setAdmin(String admin) {
			this.admin = admin;
		}




}
