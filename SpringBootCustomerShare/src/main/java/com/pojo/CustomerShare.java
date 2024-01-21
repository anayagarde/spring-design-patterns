package com.pojo;

public class CustomerShare {
	
	private String shareName;
	private int quantity;
	private String type;
	
	public CustomerShare(String shareName, int quantity, String type) {
		super();
		this.shareName = shareName;
		this.quantity = quantity;
		this.type = type;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CustomerShare [shareName=" + shareName + ", quantity=" + quantity + ", type=" + type + "]";
	}
	

}
