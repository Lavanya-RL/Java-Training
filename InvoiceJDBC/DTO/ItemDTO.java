package DTO;

import java.io.Serializable;

public class ItemDTO implements Comparable<CustomerDTO> , Serializable{

	private int itemno , price ,unit;
	private String description;
	
	
	public ItemDTO(int itemno, int price, int unit, String description) {
		super();
		this.itemno = itemno;
		this.price = price;
		this.unit = unit;
		this.description = description;
	}
	
	


	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getNumber() {
		return itemno;
	}




	public void setNumber(int itemno) {
		this.itemno = itemno;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getUnit() {
		return unit;
	}




	public void setUnit(int unit) {
		this.unit = unit;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public int compareTo(CustomerDTO o) {

		
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}