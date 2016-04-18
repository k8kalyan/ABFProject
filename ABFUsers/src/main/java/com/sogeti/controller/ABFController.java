package com.sogeti.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sogeti.constants.ABFConstants;
import com.sogeti.model.ABFResponse;
import com.sogeti.model.Contract;
import com.sogeti.db.models.*;
import com.sogeti.service.ContractManager;
/**
 * ABF controller class  provides implementations for the contract. 
 * <P>
 * <B> Visibility decisions: </B>
 * <P>
 * Unless otherwise noted, attributes are private, and a public getter and
 * setter is provided for each.
 * <P>
 * <B> Design/implementation notes: </B>
 * <P>
 * Document any decisions, assumptions, issues, or other notes regarding the
 * implementation of this class.
 * <P>
 * <P>
 * <B> Revision History: </B>
 * 
 * <PRE>
 * 
 * =============================================================================
 * Prior Date            By                  Version  Project/CSR  Description 
 * ---------- --------------------------   ---------- ------------ ------------ 
 * 05/04/2016       kalyan             N/A          ABF        Created.
 * 
 * =============================================================================
 * 
 * </PRE>
 */
@RestController
@RequestMapping("/contract")
public class ABFController {	
	private Logger logger = Logger.getLogger(ABFController.class);
	
	@Autowired
	ContractManager contractManager;
	
	@RequestMapping( value = "/create", method = RequestMethod.POST)
	public ABFResponse createContract(@RequestBody Contract contract) {
		ABFResponse response = new ABFResponse();
		logger.info("Successful");
		System.out.println("success");
		
		com.sogeti.db.models.Contract dbContract = new com.sogeti.db.models.Contract();
		
		dbContract.setCompanyName(contract.getCustomerName());
		dbContract.setCustomerName(contract.getCustomerName());
		dbContract.setContractStartDate(contract.getFromDate());
		dbContract.setContractEndDate(contract.getToDate());
		dbContract.setComments(contract.getComments());
		
		logger.info("ContractData:"+contract);
		
		try {
			contractManager.createContract(dbContract);
			response.setStatus(ABFConstants.STATUS_SUCCESS);
			
		} catch (PersistenceException e) {
			response.setStatus(ABFConstants.STATUS_FAILURE);
			response.setFailureResponse(e.getMessage());
		}
		return response;
	}
	
	@RequestMapping( value = "/all", method = RequestMethod.GET)
	public ABFResponse getContracts(){
		ABFResponse  response = new ABFResponse();	
		
	 List<com.sogeti.db.models.Contract> contracts = new ArrayList<com.sogeti.db.models.Contract>();
	  contracts = contractManager.allContracts();
	  System.out.println("Contracts Loaded:"+contracts);
		
		return response;
	}

}
