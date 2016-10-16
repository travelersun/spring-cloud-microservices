/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.entity;

import com.microsoft.azure.storage.table.TableServiceEntity;

/**
 * The Class GrEntity.
 */
public class GrEntity extends TableServiceEntity { // NO_UCD (unused code)

	/**
  * Instantiates a new gr entity.
  *
  * @param partitionKey the partition key
  * @param rowKey the row key
  */
 public GrEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;//receiptID
	}

	/**
	 * Instantiates a new gr entity.
	 */
	public GrEntity() {
	}

    /** The status. */
    private int supplierDeliveryState;

	/** The supp type. */
	private String suppType;
	
	/** The region. */
	private String region;
	
	/** The plant. */
	private String plant;
	
	/** The user name. */
	private String userName;
	
	/** The global id. */
	private String globalId;	
	
	/** The comment. */
	private String comment;	
	
	
	//new 
	private String receiptID;
	private String supplierType;
	private String customerID;
	private String customerDescription;
	private String customerDUNS;
	private String customerDUNS4;
	private String supplierID;
	private String supplierDescription;
	private String supplierDUNS;
	private String supplierDUNS4;
	private String receiptCreationDate;
	private String buyerCode;
	private String receivedAtHubOrSite;
	private String receiptStatus;
	private String receiptDateHdr;
	private String receivingSite;
	private String shipToAddressDescriptor;
	private String shipToAddress1;
	private String shipToAddress2;
	private String shipToAddress3;
	private String shipToAddress4;
	private String shipToAddress5;
	private String shipToCity;
	private String shipToCounty;
	private String shipToState;
	private String shipToCountry;
	private String shipToZip;
	private String flexStringReceiptHeader1;
	private String flexStringReceiptHeader2;
	private String flexStringReceiptHeader3;
	private String flexStringReceiptHeader4;
	private String flexStringReceiptHeader5;
	private String flexStringReceiptHeader6;
	private String flexStringReceiptHeader7;
	private String flexStringReceiptHeader8;
	private String flexStringReceiptHeader9;
	private String flexIntReceiptHeader1;
	private String flexIntReceiptHeader2;
	private String flexIntReceiptHeader3;
	private String flexIntReceiptHeader4;
	private String flexIntReceiptHeader5;
	private String flexFloatReceiptHeader1;
	private String flexFloatReceiptHeader2;
	private String flexFloatReceiptHeader3;
	private String flexFloatReceiptHeader4;
	private String flexFloatReceiptHeader5;
	private String flexDateReceiptHeader1;
	private String flexDateReceiptHeader2;
	private String flexDateReceiptHeader3;
	private String flexDateReceiptHeader4;
	private String flexDateReceiptHeader5;
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the global id.
	 *
	 * @return the global id
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * Sets the global id.
	 *
	 * @param globalId the new global id
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
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
     * Gets the supplier delivery state.
     *
     * @return the supplier delivery state
     */
    public int getSupplierDeliveryState() {
        return supplierDeliveryState;
    }

    /**
     * Sets the supplier delivery state.
     *
     * @param supplierDeliveryState the new supplier delivery state
     */
    public void setSupplierDeliveryState(int supplierDeliveryState) {
        this.supplierDeliveryState = supplierDeliveryState;
    }

    /**
     * Gets the supp type.
     *
     * @return the supp type
     */
    public String getSuppType() {
        return suppType;
    }

    /**
     * Sets the supp type.
     *
     * @param suppType the new supp type
     */
    public void setSuppType(String suppType) {
        this.suppType = suppType;
    }

    /**
     * Gets the region.
     *
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region.
     *
     * @param region the new region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the plant.
     *
     * @return the plant
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the plant.
     *
     * @param plant the new plant
     */
    public void setPlant(String plant) {
        this.plant = plant;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((partitionKey == null) ? 0 : partitionKey.hashCode());
        result = prime * result + ((rowKey == null) ? 0 : rowKey.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GrEntity other = (GrEntity) obj;
        if (partitionKey == null) {
            if (other.partitionKey != null)
                return false;
        } else if (!partitionKey.equals(other.partitionKey))
            return false;
        if (rowKey == null) {
            if (other.rowKey != null)
                return false;
        } else if (!rowKey.equals(other.rowKey))
            return false;
        return true;
    }

	public String getReceiptID() {
		return receiptID;
	}

	public void setReceiptID(String receiptID) {
		this.receiptID = receiptID;
	}

	public String getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	public String getCustomerDUNS() {
		return customerDUNS;
	}

	public void setCustomerDUNS(String customerDUNS) {
		this.customerDUNS = customerDUNS;
	}

	public String getCustomerDUNS4() {
		return customerDUNS4;
	}

	public void setCustomerDUNS4(String customerDUNS4) {
		this.customerDUNS4 = customerDUNS4;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierDescription() {
		return supplierDescription;
	}

	public void setSupplierDescription(String supplierDescription) {
		this.supplierDescription = supplierDescription;
	}

	public String getSupplierDUNS() {
		return supplierDUNS;
	}

	public void setSupplierDUNS(String supplierDUNS) {
		this.supplierDUNS = supplierDUNS;
	}

	public String getSupplierDUNS4() {
		return supplierDUNS4;
	}

	public void setSupplierDUNS4(String supplierDUNS4) {
		this.supplierDUNS4 = supplierDUNS4;
	}

	public String getReceiptCreationDate() {
		return receiptCreationDate;
	}

	public void setReceiptCreationDate(String receiptCreationDate) {
		this.receiptCreationDate = receiptCreationDate;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getReceivedAtHubOrSite() {
		return receivedAtHubOrSite;
	}

	public void setReceivedAtHubOrSite(String receivedAtHubOrSite) {
		this.receivedAtHubOrSite = receivedAtHubOrSite;
	}

	public String getReceiptStatus() {
		return receiptStatus;
	}

	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public String getReceiptDateHdr() {
		return receiptDateHdr;
	}

	public void setReceiptDateHdr(String receiptDateHdr) {
		this.receiptDateHdr = receiptDateHdr;
	}

	public String getReceivingSite() {
		return receivingSite;
	}

	public void setReceivingSite(String receivingSite) {
		this.receivingSite = receivingSite;
	}


	public String getShipToAddressDescriptor() {
		return shipToAddressDescriptor;
	}

	public void setShipToAddressDescriptor(String shipToAddressDescriptor) {
		this.shipToAddressDescriptor = shipToAddressDescriptor;
	}

	public String getShipToAddress1() {
		return shipToAddress1;
	}

	public void setShipToAddress1(String shipToAddress1) {
		this.shipToAddress1 = shipToAddress1;
	}

	public String getShipToAddress2() {
		return shipToAddress2;
	}

	public void setShipToAddress2(String shipToAddress2) {
		this.shipToAddress2 = shipToAddress2;
	}

	public String getShipToAddress3() {
		return shipToAddress3;
	}

	public void setShipToAddress3(String shipToAddress3) {
		this.shipToAddress3 = shipToAddress3;
	}

	public String getShipToAddress4() {
		return shipToAddress4;
	}

	public void setShipToAddress4(String shipToAddress4) {
		this.shipToAddress4 = shipToAddress4;
	}

	public String getShipToAddress5() {
		return shipToAddress5;
	}

	public void setShipToAddress5(String shipToAddress5) {
		this.shipToAddress5 = shipToAddress5;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	public String getShipToCounty() {
		return shipToCounty;
	}

	public void setShipToCounty(String shipToCounty) {
		this.shipToCounty = shipToCounty;
	}

	public String getShipToState() {
		return shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getShipToCountry() {
		return shipToCountry;
	}

	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	public String getShipToZip() {
		return shipToZip;
	}

	public void setShipToZip(String shipToZip) {
		this.shipToZip = shipToZip;
	}

	public String getFlexStringReceiptHeader1() {
		return flexStringReceiptHeader1;
	}

	public void setFlexStringReceiptHeader1(String flexStringReceiptHeader1) {
		this.flexStringReceiptHeader1 = flexStringReceiptHeader1;
	}

	public String getFlexStringReceiptHeader2() {
		return flexStringReceiptHeader2;
	}

	public void setFlexStringReceiptHeader2(String flexStringReceiptHeader2) {
		this.flexStringReceiptHeader2 = flexStringReceiptHeader2;
	}

	public String getFlexStringReceiptHeader3() {
		return flexStringReceiptHeader3;
	}

	public void setFlexStringReceiptHeader3(String flexStringReceiptHeader3) {
		this.flexStringReceiptHeader3 = flexStringReceiptHeader3;
	}

	public String getFlexStringReceiptHeader4() {
		return flexStringReceiptHeader4;
	}

	public void setFlexStringReceiptHeader4(String flexStringReceiptHeader4) {
		this.flexStringReceiptHeader4 = flexStringReceiptHeader4;
	}

	public String getFlexStringReceiptHeader5() {
		return flexStringReceiptHeader5;
	}

	public void setFlexStringReceiptHeader5(String flexStringReceiptHeader5) {
		this.flexStringReceiptHeader5 = flexStringReceiptHeader5;
	}

	public String getFlexStringReceiptHeader6() {
		return flexStringReceiptHeader6;
	}

	public void setFlexStringReceiptHeader6(String flexStringReceiptHeader6) {
		this.flexStringReceiptHeader6 = flexStringReceiptHeader6;
	}

	public String getFlexStringReceiptHeader7() {
		return flexStringReceiptHeader7;
	}

	public void setFlexStringReceiptHeader7(String flexStringReceiptHeader7) {
		this.flexStringReceiptHeader7 = flexStringReceiptHeader7;
	}

	public String getFlexStringReceiptHeader8() {
		return flexStringReceiptHeader8;
	}

	public void setFlexStringReceiptHeader8(String flexStringReceiptHeader8) {
		this.flexStringReceiptHeader8 = flexStringReceiptHeader8;
	}

	public String getFlexStringReceiptHeader9() {
		return flexStringReceiptHeader9;
	}

	public void setFlexStringReceiptHeader9(String flexStringReceiptHeader9) {
		this.flexStringReceiptHeader9 = flexStringReceiptHeader9;
	}

	public String getFlexIntReceiptHeader1() {
		return flexIntReceiptHeader1;
	}

	public void setFlexIntReceiptHeader1(String flexIntReceiptHeader1) {
		this.flexIntReceiptHeader1 = flexIntReceiptHeader1;
	}

	public String getFlexIntReceiptHeader2() {
		return flexIntReceiptHeader2;
	}

	public void setFlexIntReceiptHeader2(String flexIntReceiptHeader2) {
		this.flexIntReceiptHeader2 = flexIntReceiptHeader2;
	}

	public String getFlexIntReceiptHeader3() {
		return flexIntReceiptHeader3;
	}

	public void setFlexIntReceiptHeader3(String flexIntReceiptHeader3) {
		this.flexIntReceiptHeader3 = flexIntReceiptHeader3;
	}

	public String getFlexIntReceiptHeader4() {
		return flexIntReceiptHeader4;
	}

	public void setFlexIntReceiptHeader4(String flexIntReceiptHeader4) {
		this.flexIntReceiptHeader4 = flexIntReceiptHeader4;
	}

	public String getFlexIntReceiptHeader5() {
		return flexIntReceiptHeader5;
	}

	public void setFlexIntReceiptHeader5(String flexIntReceiptHeader5) {
		this.flexIntReceiptHeader5 = flexIntReceiptHeader5;
	}

	public String getFlexFloatReceiptHeader1() {
		return flexFloatReceiptHeader1;
	}

	public void setFlexFloatReceiptHeader1(String flexFloatReceiptHeader1) {
		this.flexFloatReceiptHeader1 = flexFloatReceiptHeader1;
	}

	public String getFlexFloatReceiptHeader2() {
		return flexFloatReceiptHeader2;
	}

	public void setFlexFloatReceiptHeader2(String flexFloatReceiptHeader2) {
		this.flexFloatReceiptHeader2 = flexFloatReceiptHeader2;
	}

	public String getFlexFloatReceiptHeader3() {
		return flexFloatReceiptHeader3;
	}

	public void setFlexFloatReceiptHeader3(String flexFloatReceiptHeader3) {
		this.flexFloatReceiptHeader3 = flexFloatReceiptHeader3;
	}

	public String getFlexFloatReceiptHeader4() {
		return flexFloatReceiptHeader4;
	}

	public void setFlexFloatReceiptHeader4(String flexFloatReceiptHeader4) {
		this.flexFloatReceiptHeader4 = flexFloatReceiptHeader4;
	}

	public String getFlexFloatReceiptHeader5() {
		return flexFloatReceiptHeader5;
	}

	public void setFlexFloatReceiptHeader5(String flexFloatReceiptHeader5) {
		this.flexFloatReceiptHeader5 = flexFloatReceiptHeader5;
	}

	public String getFlexDateReceiptHeader1() {
		return flexDateReceiptHeader1;
	}

	public void setFlexDateReceiptHeader1(String flexDateReceiptHeader1) {
		this.flexDateReceiptHeader1 = flexDateReceiptHeader1;
	}

	public String getFlexDateReceiptHeader2() {
		return flexDateReceiptHeader2;
	}

	public void setFlexDateReceiptHeader2(String flexDateReceiptHeader2) {
		this.flexDateReceiptHeader2 = flexDateReceiptHeader2;
	}

	public String getFlexDateReceiptHeader3() {
		return flexDateReceiptHeader3;
	}

	public void setFlexDateReceiptHeader3(String flexDateReceiptHeader3) {
		this.flexDateReceiptHeader3 = flexDateReceiptHeader3;
	}

	public String getFlexDateReceiptHeader4() {
		return flexDateReceiptHeader4;
	}

	public void setFlexDateReceiptHeader4(String flexDateReceiptHeader4) {
		this.flexDateReceiptHeader4 = flexDateReceiptHeader4;
	}

	public String getFlexDateReceiptHeader5() {
		return flexDateReceiptHeader5;
	}

	public void setFlexDateReceiptHeader5(String flexDateReceiptHeader5) {
		this.flexDateReceiptHeader5 = flexDateReceiptHeader5;
	}

	@Override
	public String toString() {
		return "GrEntity [supplierDeliveryState=" + supplierDeliveryState + ", suppType=" + suppType + ", region="
				+ region + ", plant=" + plant + ", userName=" + userName + ", globalId=" + globalId + ", comment="
				+ comment + ", receiptID=" + receiptID + ", supplierType=" + supplierType + ", customerID=" + customerID
				+ ", customerDescription=" + customerDescription + ", customerDUNS=" + customerDUNS + ", customerDUNS4="
				+ customerDUNS4 + ", supplierID=" + supplierID + ", supplierDescription=" + supplierDescription
				+ ", supplierDUNS=" + supplierDUNS + ", supplierDUNS4=" + supplierDUNS4 + ", receiptCreationDate="
				+ receiptCreationDate + ", buyerCode=" + buyerCode + ", receivedAtHubOrSite=" + receivedAtHubOrSite
				+ ", receiptStatus=" + receiptStatus + ", receiptDateHdr=" + receiptDateHdr + ", receivingSite="
				+ receivingSite + " , shipToAddressDescriptor="
				+ shipToAddressDescriptor + ", shipToAddress1=" + shipToAddress1 + ", shipToAddress2=" + shipToAddress2
				+ ", shipToAddress3=" + shipToAddress3 + ", shipToAddress4=" + shipToAddress4 + ", shipToAddress5="
				+ shipToAddress5 + ", shipToCity=" + shipToCity + ", shipToCounty=" + shipToCounty + ", shipToState="
				+ shipToState + ", shipToCountry=" + shipToCountry + ", shipToZip=" + shipToZip
				+ ", flexStringReceiptHeader1=" + flexStringReceiptHeader1 + ", flexStringReceiptHeader2="
				+ flexStringReceiptHeader2 + ", flexStringReceiptHeader3=" + flexStringReceiptHeader3
				+ ", flexStringReceiptHeader4=" + flexStringReceiptHeader4 + ", flexStringReceiptHeader5="
				+ flexStringReceiptHeader5 + ", flexStringReceiptHeader6=" + flexStringReceiptHeader6
				+ ", flexStringReceiptHeader7=" + flexStringReceiptHeader7 + ", flexStringReceiptHeader8="
				+ flexStringReceiptHeader8 + ", flexStringReceiptHeader9=" + flexStringReceiptHeader9
				+ ", flexIntReceiptHeader1=" + flexIntReceiptHeader1 + ", flexIntReceiptHeader2="
				+ flexIntReceiptHeader2 + ", flexIntReceiptHeader3=" + flexIntReceiptHeader3
				+ ", flexIntReceiptHeader4=" + flexIntReceiptHeader4 + ", flexIntReceiptHeader5="
				+ flexIntReceiptHeader5 + ", flexFloatReceiptHeader1=" + flexFloatReceiptHeader1
				+ ", flexFloatReceiptHeader2=" + flexFloatReceiptHeader2 + ", flexFloatReceiptHeader3="
				+ flexFloatReceiptHeader3 + ", flexFloatReceiptHeader4=" + flexFloatReceiptHeader4
				+ ", flexFloatReceiptHeader5=" + flexFloatReceiptHeader5 + ", flexDateReceiptHeader1="
				+ flexDateReceiptHeader1 + ", flexDateReceiptHeader2=" + flexDateReceiptHeader2
				+ ", flexDateReceiptHeader3=" + flexDateReceiptHeader3 + ", flexDateReceiptHeader4="
				+ flexDateReceiptHeader4 + ", flexDateReceiptHeader5=" + flexDateReceiptHeader5 + "]";
	}

}
