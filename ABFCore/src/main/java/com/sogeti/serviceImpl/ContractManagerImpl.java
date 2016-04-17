package com.sogeti.serviceImpl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sogeti.dao.ContractDao;
import com.sogeti.db.models.Contract;
import com.sogeti.service.ContractManager;
/**
 * ContractManagerImpl invoke ContractManager class and calls the method addContract. 
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
 * 06/04/2016         kalyan             N/A          webshop        Created.
 * 
 * =============================================================================
 * 
 * </PRE>
 */
/**
 * ContractManagerImpl invoke ContractManager class and calls the method addContract. 
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
 * 06/04/2016         kalyan             N/A          webshop        Created.
 * 
 * =============================================================================
 * 
 * </PRE>
 */

@Service("contractManager")
public class ContractManagerImpl implements ContractManager {
	@Autowired
	ContractDao contractdao;
	public void createContract(Contract contractEntity) throws PersistenceException{
		contractdao.createContract(contractEntity);
		
	}
	
	public List<Contract> allContracts() {
		return contractdao.allContracts();
	}
	
	public Contract getContract(int contractID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void updateContract(Contract contract) {
		// TODO Auto-generated method stub
		
	}
	
	public void deleteContract(Contract contract) {
		// TODO Auto-generated method stub
		
	}

	public List<Contract> allContractsByMe(int loginID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contract> allContractsApprovalByMe(int loginID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
