
package com.internousdev.ecsite.dto;


public class ItemInfoDTO {
	private String id;
    private String itemName;
	private int itemPrice;
	private int stock;
	private String insert_date;



    public String getId(){
        return id;
     }

     public void setId(String id){
        this.id = id;
     }

    public String getItemName(){
        return itemName;
     }

     public void setItemName(String itemName){
        this.itemName = itemName;
     }



 	public int getItemPrice(){
  	   return itemPrice;
  	}
  	public void setItemPrice(int itemPrice){
  	   this.itemPrice = itemPrice;
  	}
  	public int getStock(){
   	   return stock;
   	}
   	public void setStock(int stock){
   	   this.stock=stock;
   	}


       public String getInsert_date(){
           return insert_date;
        }

        public void setInsert_date(String insert_date){
           this.insert_date = insert_date;
        }


}
