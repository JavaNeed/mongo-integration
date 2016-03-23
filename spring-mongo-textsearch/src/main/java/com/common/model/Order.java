package com.common.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="orders")
public class Order {

	@Id
	private ObjectId id;
	
	@Field("OrderID")
	private Integer orderId;
	
	@Field("CustomerID")
	private String customerId;
	
	@Field("EmployeeID")
	private Integer employeeId;
	
	@Field("OrderDate")
	private String orderDate;
	
	@Field("RequiredDate")
	private String requiredDate;
	
	@Field("ShippedDate")
	private String shippedDate;
	
	@Field("ShipVia")
	private Integer shipVia;
	
	@Field("Freight")
	private Double freight;
	
	@Field("ShipName")
	private String shipName;
	
	@Field("ShipAddress")
	private Integer shipAddress;
	
	@Field("ShipCity")
	private String shipCity;
	
	@Field("ShipRegion")
	private String shipRegion;

	@Field("ShipPostalCode")
	private String shipPostalCode;
	
	@Field("ShipCountry")
	private Integer shipCountry;
	
	@Field("field14")
	private String field14;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Integer getShipVia() {
		return shipVia;
	}

	public void setShipVia(Integer shipVia) {
		this.shipVia = shipVia;
	}

	public Double getFreight() {
		return freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public Integer getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(Integer shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipRegion() {
		return shipRegion;
	}

	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	public String getShipPostalCode() {
		return shipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}

	public Integer getShipCountry() {
		return shipCountry;
	}

	public void setShipCountry(Integer shipCountry) {
		this.shipCountry = shipCountry;
	}

	public String getField14() {
		return field14;
	}

	public void setField14(String field14) {
		this.field14 = field14;
	}
}
