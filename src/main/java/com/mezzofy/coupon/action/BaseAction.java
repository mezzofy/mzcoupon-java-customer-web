package com.mezzofy.coupon.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport {

	public BaseAction() {
		super();
	}

	public void addActionMessage(String result, String msg ){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("actionresult", result);
		session.put("actionsmsg", msg);
	}

}