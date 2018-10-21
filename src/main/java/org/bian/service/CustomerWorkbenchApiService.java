/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerWorkbenchApiService {

	CustomerWorkbenchBrowsingComplete executePostBrowsings(String crReferenceId, CustomerWorkbenchBrowsingBasic request);
	
	CustomerWorkbenchBrowsingComplete executePutBrowsings(String crReferenceId, String bqReferenceId, CustomerWorkbenchBrowsingBasic request);
	
	CustomerWorkbenchRecordResponse recordReceives(String crReferenceId, String bqReferenceId, CustomerWorkbenchRecordRequest request);
	
	CustomerWorkbenchContactComplete requestPostContacts(String crReferenceId, CustomerWorkbenchContactBasic request);
	
	CustomerWorkbenchContactComplete requestPutContacts(String crReferenceId, String bqReferenceId, CustomerWorkbenchContactBasic request);
	
	CustomerWorkbenchProductServiceAccessComplete requestPostProductServiceAccess(String crReferenceId, CustomerWorkbenchProductServiceAccessBasic request);
	
	CustomerWorkbenchProductServiceAccessComplete requestPutProductServiceAccess(String crReferenceId, String bqReferenceId, CustomerWorkbenchProductServiceAccessBasic request);
	
	CustomerWorkbenchSWUpdateComplete requestPostSwUpdates(String crReferenceId, CustomerWorkbenchSWUpdateBasic request);
	
	CustomerWorkbenchSWUpdateComplete requestPutSwUpdates(String crReferenceId, String bqReferenceId, CustomerWorkbenchSWUpdateBasic request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	CustomerWorkbenchBrowsingComplete retrieveBrowsings(String crReferenceId, String bqReferenceId);
	
	CustomerWorkbenchConfigurationComplete retrieveConfigurations(String crReferenceId, String bqReferenceId);
	
	CustomerWorkbenchContactComplete retrieveContacts(String crReferenceId, String bqReferenceId);
	
	CustomerWorkbenchProductServiceAccessComplete retrieveProductServiceAccess(String crReferenceId, String bqReferenceId);
	
	CustomerWorkbenchReceiveComplete retrieveReceives(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	List<String> retrieveBQs();
	
	CustomerWorkbenchSWUpdateComplete retrieveSwupdates(String crReferenceId, String bqReferenceId);
	
}
