package com.common.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="categories")
public class Category {
	@Id
	private ObjectId id;
	
	@Field("CategoryID")
	private Integer categoryID;
	
	@Field("CategoryName")
	private Integer categoryName;
	
	@Field("Description")
	private Integer description;
	
	@Field("Picture")
	private Integer picture;
	
	private Integer field4;
	private Integer field5;
	private Integer field6;
	private Integer field7;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Integer getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	public Integer getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(Integer categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getDescription() {
		return description;
	}
	public void setDescription(Integer description) {
		this.description = description;
	}
	public Integer getPicture() {
		return picture;
	}
	public void setPicture(Integer picture) {
		this.picture = picture;
	}
	public Integer getField4() {
		return field4;
	}
	public void setField4(Integer field4) {
		this.field4 = field4;
	}
	public Integer getField5() {
		return field5;
	}
	public void setField5(Integer field5) {
		this.field5 = field5;
	}
	public Integer getField6() {
		return field6;
	}
	public void setField6(Integer field6) {
		this.field6 = field6;
	}
	public Integer getField7() {
		return field7;
	}
	public void setField7(Integer field7) {
		this.field7 = field7;
	}
}
