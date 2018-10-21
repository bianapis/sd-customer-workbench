package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Supports a customer log-in/access session with the bank from the workbench via the bank&#39;s website
 */
public class CustomerWorkbenchContactBasic   {
  private String customerReference = null;

  private String contactReference = null;

  private String contactStartEndTime = null;

  private Object contactActivityLog = null;


  /**
   * `status: Provisionally Registered` bian-reference: WorkbenchUser.Customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * general-info: Contact details are captured in access log `status: Provisionally Registered` bian-reference: WorkbenchUser 
   * @return contactReference
  **/

  public String getContactReference() {
    return contactReference;
  }

  public void setContactReference(String contactReference) {
    this.contactReference = contactReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: (asSession).TimeBracket 
   * @return contactStartEndTime
  **/

  public String getContactStartEndTime() {
    return contactStartEndTime;
  }

  public void setContactStartEndTime(String contactStartEndTime) {
    this.contactStartEndTime = contactStartEndTime;
  }


  /**
   * general-info: Locally records page/service access as appropriate `status: Provisionally Registered` bian-reference:  (asSession).FailureEvent `status: Provisionally Registered` bian-reference:  (asSession).NormalEvent 
   * @return contactActivityLog
  **/

  public Object getContactActivityLog() {
    return contactActivityLog;
  }

  public void setContactActivityLog(Object contactActivityLog) {
    this.contactActivityLog = contactActivityLog;
  }


}

