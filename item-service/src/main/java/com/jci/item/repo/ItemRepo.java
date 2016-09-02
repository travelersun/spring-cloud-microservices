/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.item.repo;

import java.net.URISyntaxException;
import java.security.InvalidKeyException;

import com.jci.item.azure.data.DataHelper;
import com.jci.item.azure.data.ResultSet;
import com.jci.item.azure.query.ScrollingParam;
import com.microsoft.azure.storage.StorageException;


/**
 * The Interface ItemRepo.
 */
public interface ItemRepo {
	
	/**
	 * Gets the segmented result set.
	 *
	 * @param param the param
	 * @param request the request
	 * @return the segmented result set
	 * @throws InvalidKeyException the invalid key exception
	 * @throws URISyntaxException the URI syntax exception
	 * @throws StorageException the storage exception
	 */
	ResultSet getSegmentedResultSet(ScrollingParam param, DataHelper request) throws InvalidKeyException, URISyntaxException, StorageException;
}
