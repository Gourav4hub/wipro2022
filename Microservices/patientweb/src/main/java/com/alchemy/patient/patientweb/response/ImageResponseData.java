package com.alchemy.patient.patientweb.response;

public class ImageResponseData 
{	
	private boolean status;
	private String imageBase64;
	private String imagePath;
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImagePath() {
		return imagePath;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getImageBase64() {
		return imageBase64;
	}
	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}
	
	
}
