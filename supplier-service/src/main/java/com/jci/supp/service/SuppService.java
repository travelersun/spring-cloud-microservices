/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.supp.service;

import java.net.URISyntaxException;
import java.security.InvalidKeyException;

import com.jci.supp.dto.SegmentedDetailReq;
import com.jci.supp.dto.SegmentedDetailRes;
import com.microsoft.azure.storage.StorageException;


/**
 * The Interface SuppService.
 */
public interface SuppService {
	
	/**
	 * Gets the supplier result set.
	 *
	 * @param request the request
	 * @return the supplier result set
	 * @throws InvalidKeyException the invalid key exception
	 * @throws URISyntaxException the URI syntax exception
	 * @throws StorageException the storage exception
	 */
	SegmentedDetailRes getSupplierResultSet(SegmentedDetailReq request) throws InvalidKeyException, URISyntaxException, StorageException;
}
