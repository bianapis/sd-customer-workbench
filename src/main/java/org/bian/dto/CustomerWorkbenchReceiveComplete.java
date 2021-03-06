package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * supports broadcast messages sent by the bank to the customer workbench
 */
public class CustomerWorkbenchReceiveComplete   {
  private String customerWorkbenchOperatingSessionReference = null;

  private String customerWorkbenchBroadcastReference = null;

  private Object customerWorkbenchBroadcastRecord = null;

  private String customerWorkbenchBroadcastRecordDateTime = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchOperatingSessionReference
  **/

  public String getCustomerWorkbenchOperatingSessionReference() {
    return customerWorkbenchOperatingSessionReference;
  }

  public void setCustomerWorkbenchOperatingSessionReference(String customerWorkbenchOperatingSessionReference) {
    this.customerWorkbenchOperatingSessionReference = customerWorkbenchOperatingSessionReference;
  }


  /**
   * general-info: used to track bank broadcast messages `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchBroadcastReference
  **/

  public String getCustomerWorkbenchBroadcastReference() {
    return customerWorkbenchBroadcastReference;
  }

  public void setCustomerWorkbenchBroadcastReference(String customerWorkbenchBroadcastReference) {
    this.customerWorkbenchBroadcastReference = customerWorkbenchBroadcastReference;
  }


  /**
   * general-info: text of the broadcast message `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerWorkbenchBroadcastRecord
  **/

  public Object getCustomerWorkbenchBroadcastRecord() {
    return customerWorkbenchBroadcastRecord;
  }

  public void setCustomerWorkbenchBroadcastRecord(Object customerWorkbenchBroadcastRecord) {
    this.customerWorkbenchBroadcastRecord = customerWorkbenchBroadcastRecord;
  }


  /**
   * Get customerWorkbenchBroadcastRecordDateTime
   * @return customerWorkbenchBroadcastRecordDateTime
  **/

  public String getCustomerWorkbenchBroadcastRecordDateTime() {
    return customerWorkbenchBroadcastRecordDateTime;
  }

  public void setCustomerWorkbenchBroadcastRecordDateTime(String customerWorkbenchBroadcastRecordDateTime) {
    this.customerWorkbenchBroadcastRecordDateTime = customerWorkbenchBroadcastRecordDateTime;
  }


}

