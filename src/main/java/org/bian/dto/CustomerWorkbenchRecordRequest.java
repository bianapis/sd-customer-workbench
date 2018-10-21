package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerWorkbenchRecordRequest
 */
public class CustomerWorkbenchRecordRequest   {
  private Object customerWorkbenchBroadcastRecord = null;

  private String customerWorkbenchBroadcastRecordDateTime = null;


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

