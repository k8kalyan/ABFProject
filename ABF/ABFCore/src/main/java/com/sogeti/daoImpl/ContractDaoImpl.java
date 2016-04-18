package com.sogeti.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.sogeti.dao.ContractDao;
import com.sogeti.db.models.Contract;


/**
 * ContractDAOImpl class will invoke ContractDAO and calls the method
 * addContract *
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
 * 06/04/2016        kalyan             N/A          ABF        Created.
 * 
 * =============================================================================
 * 
 * </PRE>
 */
@Repository("contractDao")
@Transactional
public class ContractDaoImpl implements ContractDao {
	@PersistenceContext
	private EntityManager em;

	/**
	 * 
	 * @param entityManager
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	public void createContract(Contract contractEntity)
			throws PersistenceException {
		try {
			
			this.em.persist(contractEntity);
			
		} catch (PersistenceException e) {
			throw e;
		}
	}

	public Contract getContract(int contractID) {
		
		return null;
	}

	public void updateContract(Contract contract) {
		// TODO Auto-generated method stub
		
	}

	public void deleteContract(Contract contract) {
		// TODO Auto-generated method stub
		
	}

	public List<Contract> allContracts() {
		
		Query query = this.em.createQuery("SELECT c FROM Contract c where c.isactive=1");
		List<Contract> contractList = null;
		if (query != null) {
			contractList = query.getResultList();
		 System.out.println("List:"+contractList);
		}
		return contractList;
	}
	

	public List<Contract> allContractsByMe(int loginID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contract> allContractsApprovalByMe(int loginID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contract findByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contract> findAll(int startIndex, int fetchSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contract> findByExample(Contract exampleInstance,
			String[] excludeProperty) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contract save(Contract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Contract entity) {
		// TODO Auto-generated method stub
		
	}

	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}

	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}

	public void createContract() {
		// TODO Auto-generated method stub
		
	}
}
