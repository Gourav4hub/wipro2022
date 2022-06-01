package com.wipro.boot.response;

public class WebResponse 
{
	private boolean status;
	private String message;
	private Object data; 
	private Object otherinfo;
	
	public WebResponse(boolean status, Object data)
	{	
		this.status = status;		
		this.data = data;		
	}	
	public WebResponse(boolean status, String message, Object data)
	{	
		this.status = status;
		this.message = message;
		this.data = data;		
	}
	public WebResponse(boolean status, Object data, Object otherinfo) 
	{		
		this.status = status;		
		this.data = data;
		this.otherinfo = otherinfo;
	}
	public WebResponse(boolean status, String message, Object data, Object otherinfo) 
	{		
		this.status = status;
		this.message = message;
		this.data = data;
		this.otherinfo = otherinfo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(Object otherinfo) {
		this.otherinfo = otherinfo;
	}
}
