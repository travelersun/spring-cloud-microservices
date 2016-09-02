/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.job.api.res;

import java.util.List;

/**
 * The Class PoDetailsRes.
 */
public class PoDetailsRes {

	/** The code. */
	private int code;
	
	/** The status. */
	private String status;
	
	/** The message. */
	private String message;
	
	/** The date. */
	private String date;
	
	/** The po list. */
	private List<PoDetails> poList;

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Gets the po list.
	 *
	 * @return the po list
	 */
	public List<PoDetails> getPoList() {
		return poList;
	}

	/**
	 * Sets the po list.
	 *
	 * @param poList the new po list
	 */
	public void setPoList(List<PoDetails> poList) {
		this.poList = poList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PoDetailsRes [code=" + code + ", status=" + status + ", message=" + message + ", date=" + date
				+ ", poList=" + poList + "]";
	}

	
	
}
