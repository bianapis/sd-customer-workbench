/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerWorkbenchApiServiceImpl implements CustomerWorkbenchApiService {

	public CustomerWorkbenchBrowsingComplete executePostBrowsings(String crReferenceId, CustomerWorkbenchBrowsingBasic request){
		return JsonReader.read("executePost-CustomerWorkbenchBrowsingComplete.json",new TypeReference<CustomerWorkbenchBrowsingComplete>(){});
	}
	
	public CustomerWorkbenchBrowsingComplete executePutBrowsings(String crReferenceId, String bqReferenceId, CustomerWorkbenchBrowsingBasic request){
		return JsonReader.read("executePut-CustomerWorkbenchBrowsingComplete.json",new TypeReference<CustomerWorkbenchBrowsingComplete>(){});
	}
	
	public CustomerWorkbenchRecordResponse recordReceives(String crReferenceId, String bqReferenceId, CustomerWorkbenchRecordRequest request){
		return JsonReader.read("record-CustomerWorkbenchRecordResponse.json",new TypeReference<CustomerWorkbenchRecordResponse>(){});
	}
	
	public CustomerWorkbenchContactComplete requestPostContacts(String crReferenceId, CustomerWorkbenchContactBasic request){
		return JsonReader.read("requestPost-CustomerWorkbenchContactComplete.json",new TypeReference<CustomerWorkbenchContactComplete>(){});
	}
	
	public CustomerWorkbenchContactComplete requestPutContacts(String crReferenceId, String bqReferenceId, CustomerWorkbenchContactBasic request){
		return JsonReader.read("requestPut-CustomerWorkbenchContactComplete.json",new TypeReference<CustomerWorkbenchContactComplete>(){});
	}
	
	public CustomerWorkbenchProductServiceAccessComplete requestPostProductServiceAccess(String crReferenceId, CustomerWorkbenchProductServiceAccessBasic request){
		return JsonReader.read("requestPost-CustomerWorkbenchProductServiceAccessComplete.json",new TypeReference<CustomerWorkbenchProductServiceAccessComplete>(){});
	}
	
	public CustomerWorkbenchProductServiceAccessComplete requestPutProductServiceAccess(String crReferenceId, String bqReferenceId, CustomerWorkbenchProductServiceAccessBasic request){
		return JsonReader.read("requestPut-CustomerWorkbenchProductServiceAccessComplete.json",new TypeReference<CustomerWorkbenchProductServiceAccessComplete>(){});
	}
	
	public CustomerWorkbenchSWUpdateComplete requestPostSwUpdates(String crReferenceId, CustomerWorkbenchSWUpdateBasic request){
		return JsonReader.read("requestPost-CustomerWorkbenchSWUpdateComplete.json",new TypeReference<CustomerWorkbenchSWUpdateComplete>(){});
	}
	
	public CustomerWorkbenchSWUpdateComplete requestPutSwUpdates(String crReferenceId, String bqReferenceId, CustomerWorkbenchSWUpdateBasic request){
		return JsonReader.read("requestPut-CustomerWorkbenchSWUpdateComplete.json",new TypeReference<CustomerWorkbenchSWUpdateComplete>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerWorkbenchBrowsingComplete retrieveBrowsings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerWorkbenchBrowsingComplete.json",new TypeReference<CustomerWorkbenchBrowsingComplete>(){});
	}
	
	public CustomerWorkbenchConfigurationComplete retrieveConfigurations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerWorkbenchConfigurationComplete.json",new TypeReference<CustomerWorkbenchConfigurationComplete>(){});
	}
	
	public CustomerWorkbenchContactComplete retrieveContacts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerWorkbenchContactComplete.json",new TypeReference<CustomerWorkbenchContactComplete>(){});
	}
	
	public CustomerWorkbenchProductServiceAccessComplete retrieveProductServiceAccess(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerWorkbenchProductServiceAccessComplete.json",new TypeReference<CustomerWorkbenchProductServiceAccessComplete>(){});
	}
	
	public CustomerWorkbenchReceiveComplete retrieveReceives(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerWorkbenchReceiveComplete.json",new TypeReference<CustomerWorkbenchReceiveComplete>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerWorkbenchSWUpdateComplete retrieveSwupdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerWorkbenchSWUpdateComplete.json",new TypeReference<CustomerWorkbenchSWUpdateComplete>(){});
	}
	
}
