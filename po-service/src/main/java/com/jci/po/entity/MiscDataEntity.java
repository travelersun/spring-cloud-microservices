/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.po.entity;

import com.microsoft.azure.storage.table.TableServiceEntity;


/**
 * The Class MiscDataEntity.
 */
public class MiscDataEntity   extends TableServiceEntity {

	/**
	 * Instantiates a new misc data entity.
	 *
	 * @param partitionKey the partition key
	 * @param rowKey the row key
	 */
	public MiscDataEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey; 
	}

	/**
	 * Instantiates a new misc data entity.
	 */
	public MiscDataEntity() {
		
	}
	
	/** The po intransit count. */
	private int poIntransitCount;//1
	
	/** The po processed count. */
	private int poProcessedCount;//2
	
	/** The po error count. */
	private int poErrorCount;//3
	
	/** The item intransit count. */
	private int itemIntransitCount;//1
	
	/** The item processed count. */
	private int itemProcessedCount;//2
	
	/** The item error count. */
	private int itemErrorCount;//3
	
	/** The supp intransit count. */
	private int suppIntransitCount;//1
	
	/** The supp processed count. */
	private int suppProcessedCount;//2
	
	/** The supp error count. */
	private int suppErrorCount;//3
	
	/** The order number. */
	private String orderNumber;
	
	/** The comment. */
	private String comment;
	

	/**
	 * Gets the order number.
	 *
	 * @return the order number
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the order number.
	 *
	 * @param orderNumber the new order number
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Gets the po intransit count.
	 *
	 * @return the po intransit count
	 */
	public int getPoIntransitCount() {
		return poIntransitCount;
	}

	/**
	 * Sets the po intransit count.
	 *
	 * @param poIntransitCount the new po intransit count
	 */
	public void setPoIntransitCount(int poIntransitCount) {
		this.poIntransitCount = poIntransitCount;
	}

	/**
	 * Gets the po processed count.
	 *
	 * @return the po processed count
	 */
	public int getPoProcessedCount() {
		return poProcessedCount;
	}

	/**
	 * Sets the po processed count.
	 *
	 * @param poProcessedCount the new po processed count
	 */
	public void setPoProcessedCount(int poProcessedCount) {
		this.poProcessedCount = poProcessedCount;
	}

	/**
	 * Gets the po error count.
	 *
	 * @return the po error count
	 */
	public int getPoErrorCount() {
		return poErrorCount;
	}

	/**
	 * Sets the po error count.
	 *
	 * @param poErrorCount the new po error count
	 */
	public void setPoErrorCount(int poErrorCount) {
		this.poErrorCount = poErrorCount;
	}

	/**
	 * Gets the item intransit count.
	 *
	 * @return the item intransit count
	 */
	public int getItemIntransitCount() {
		return itemIntransitCount;
	}

	/**
	 * Sets the item intransit count.
	 *
	 * @param itemIntransitCount the new item intransit count
	 */
	public void setItemIntransitCount(int itemIntransitCount) {
		this.itemIntransitCount = itemIntransitCount;
	}

	/**
	 * Gets the item processed count.
	 *
	 * @return the item processed count
	 */
	public int getItemProcessedCount() {
		return itemProcessedCount;
	}

	/**
	 * Sets the item processed count.
	 *
	 * @param itemProcessedCount the new item processed count
	 */
	public void setItemProcessedCount(int itemProcessedCount) {
		this.itemProcessedCount = itemProcessedCount;
	}

	/**
	 * Gets the item error count.
	 *
	 * @return the item error count
	 */
	public int getItemErrorCount() {
		return itemErrorCount;
	}

	/**
	 * Sets the item error count.
	 *
	 * @param itemErrorCount the new item error count
	 */
	public void setItemErrorCount(int itemErrorCount) {
		this.itemErrorCount = itemErrorCount;
	}

	/**
	 * Gets the supp intransit count.
	 *
	 * @return the supp intransit count
	 */
	public int getSuppIntransitCount() {
		return suppIntransitCount;
	}

	/**
	 * Sets the supp intransit count.
	 *
	 * @param suppIntransitCount the new supp intransit count
	 */
	public void setSuppIntransitCount(int suppIntransitCount) {
		this.suppIntransitCount = suppIntransitCount;
	}

	/**
	 * Gets the supp processed count.
	 *
	 * @return the supp processed count
	 */
	public int getSuppProcessedCount() {
		return suppProcessedCount;
	}

	/**
	 * Sets the supp processed count.
	 *
	 * @param suppProcessedCount the new supp processed count
	 */
	public void setSuppProcessedCount(int suppProcessedCount) {
		this.suppProcessedCount = suppProcessedCount;
	}

	/**
	 * Gets the supp error count.
	 *
	 * @return the supp error count
	 */
	public int getSuppErrorCount() {
		return suppErrorCount;
	}

	/**
	 * Sets the supp error count.
	 *
	 * @param suppErrorCount the new supp error count
	 */
	public void setSuppErrorCount(int suppErrorCount) {
		this.suppErrorCount = suppErrorCount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MiscDataEntity [poIntransitCount=" + poIntransitCount + ", poProcessedCount=" + poProcessedCount
				+ ", poErrorCount=" + poErrorCount + ", itemIntransitCount=" + itemIntransitCount
				+ ", itemProcessedCount=" + itemProcessedCount + ", itemErrorCount=" + itemErrorCount
				+ ", suppIntransitCount=" + suppIntransitCount + ", suppProcessedCount=" + suppProcessedCount
				+ ", suppErrorCount=" + suppErrorCount + ", orderNumber=" + orderNumber + ", comment=" + comment + "]";
	}

}
