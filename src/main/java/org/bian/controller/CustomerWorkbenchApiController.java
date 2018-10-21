/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CustomerWorkbenchApiController {

	@Autowired
	CustomerWorkbenchApiService service;
	
	@BQ("browsings")
	@Operate.ExecutePost
	public BianResponse<CustomerWorkbenchBrowsingComplete> executePostBrowsings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerWorkbenchBrowsingBasic> bianRequest) {
		return BianResponse.forSuccess(service.executePostBrowsings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("browsings")
	@Operate.ExecutePut
	public BianResponse<CustomerWorkbenchBrowsingComplete> executePutBrowsings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerWorkbenchBrowsingBasic> bianRequest) {
		return BianResponse.forSuccess(service.executePutBrowsings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("receives")
	@Operate.Record
	public BianResponse<CustomerWorkbenchRecordResponse> recordReceives(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerWorkbenchRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordReceives(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("contacts")
	@Operate.RequestPost
	public BianResponse<CustomerWorkbenchContactComplete> requestPostContacts(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerWorkbenchContactBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPostContacts(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contacts")
	@Operate.RequestPut
	public BianResponse<CustomerWorkbenchContactComplete> requestPutContacts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerWorkbenchContactBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPutContacts(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("product-service-access")
	@Operate.RequestPost
	public BianResponse<CustomerWorkbenchProductServiceAccessComplete> requestPostProductServiceAccess(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerWorkbenchProductServiceAccessBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPostProductServiceAccess(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("product-service-access")
	@Operate.RequestPut
	public BianResponse<CustomerWorkbenchProductServiceAccessComplete> requestPutProductServiceAccess(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerWorkbenchProductServiceAccessBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPutProductServiceAccess(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sw-updates")
	@Operate.RequestPost
	public BianResponse<CustomerWorkbenchSWUpdateComplete> requestPostSwUpdates(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerWorkbenchSWUpdateBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPostSwUpdates(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sw-updates")
	@Operate.RequestPut
	public BianResponse<CustomerWorkbenchSWUpdateComplete> requestPutSwUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerWorkbenchSWUpdateBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPutSwUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("browsings")
	@Operate.Retrieve
	public BianResponse<CustomerWorkbenchBrowsingComplete> retrieveBrowsings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBrowsings(crReferenceId, bqReferenceId));
	}
	
	@BQ("configurations")
	@Operate.Retrieve
	public BianResponse<CustomerWorkbenchConfigurationComplete> retrieveConfigurations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConfigurations(crReferenceId, bqReferenceId));
	}
	
	@BQ("contacts")
	@Operate.Retrieve
	public BianResponse<CustomerWorkbenchContactComplete> retrieveContacts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContacts(crReferenceId, bqReferenceId));
	}
	
	@BQ("product-service-access")
	@Operate.Retrieve
	public BianResponse<CustomerWorkbenchProductServiceAccessComplete> retrieveProductServiceAccess(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductServiceAccess(crReferenceId, bqReferenceId));
	}
	
	@BQ("receives")
	@Operate.Retrieve
	public BianResponse<CustomerWorkbenchReceiveComplete> retrieveReceives(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReceives(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("swUpdates")
	@Operate.Retrieve
	public BianResponse<CustomerWorkbenchSWUpdateComplete> retrieveSwupdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSwupdates(crReferenceId, bqReferenceId));
	}
	
}
