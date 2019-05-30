package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{


	private Map<String,Object> session;
	private int count;
	private String pay;


	public String execute(){

		String ret = SUCCESS ;

		session.put("count",count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price" , intCount*intPrice);
		String payment;

		if(pay.equals("1")){
			payment = "現金払い";
			session.put("pay",payment);
		}else if(pay.equals("2")){
			payment = "クレジットカード払い";
			session.put("pay",payment);
		}

		return ret;

	}





	public String getPay(){
		return pay;
	}

	public void setPay(String pay){
		this.pay = pay;
	}

	public int getcount(){
		return count;
	}

	public void setCount(int count){
		this.count = count;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	public Map<String, Object> getSession() {
		return  session;

	}

}
