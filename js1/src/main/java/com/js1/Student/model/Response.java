
package com.js1.Student.model;

public class Response {
	private boolean status;
	private String msg;

	public Response() {
		status = false;
		msg = "failed";
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

