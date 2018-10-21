package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerWorkbenchProductServiceAccessComplete
 */
public class CustomerWorkbenchProductServiceAccessComplete   {
  private String customerWorkbenchOperatingSessionReference = null;

  private String customerWorkbenchProductServiceAccessReference = null;

  private Object customerWorkbenchProductServiceAccessRecord = null;

  private String customerWorkbenchContactReference = null;

  private String customerReference = null;

  private String customerWorkbenchDeviceReference = null;

  private String customerWorkbenchDeviceAccessPermissions = null;

  private Object customerDetailsPreferences = null;

  private Object productServiceMenu = null;

  private Object productServiceMenuAccessLog = null;

  private String accessStartEndTime = null;

  private Object customerResidentFiles = null;


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
   * general-info: Used to track product/service access within a log-in contact `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchProductServiceAccessReference
  **/

  public String getCustomerWorkbenchProductServiceAccessReference() {
    return customerWorkbenchProductServiceAccessReference;
  }

  public void setCustomerWorkbenchProductServiceAccessReference(String customerWorkbenchProductServiceAccessReference) {
    this.customerWorkbenchProductServiceAccessReference = customerWorkbenchProductServiceAccessReference;
  }


  /**
   * general-info: Used to track product/service access activity from the workbench `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerWorkbenchProductServiceAccessRecord
  **/

  public Object getCustomerWorkbenchProductServiceAccessRecord() {
    return customerWorkbenchProductServiceAccessRecord;
  }

  public void setCustomerWorkbenchProductServiceAccessRecord(Object customerWorkbenchProductServiceAccessRecord) {
    this.customerWorkbenchProductServiceAccessRecord = customerWorkbenchProductServiceAccessRecord;
  }


  /**
   * general-info: used to track bank log-in  `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchContactReference
  **/

  public String getCustomerWorkbenchContactReference() {
    return customerWorkbenchContactReference;
  }

  public void setCustomerWorkbenchContactReference(String customerWorkbenchContactReference) {
    this.customerWorkbenchContactReference = customerWorkbenchContactReference;
  }


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
   * general-info: Product/Service access is made during the contact `status: Provisionally Registered` bian-reference:  (asSession).UserDevice 
   * @return customerWorkbenchDeviceReference
  **/

  public String getCustomerWorkbenchDeviceReference() {
    return customerWorkbenchDeviceReference;
  }

  public void setCustomerWorkbenchDeviceReference(String customerWorkbenchDeviceReference) {
    this.customerWorkbenchDeviceReference = customerWorkbenchDeviceReference;
  }


  /**
   * general-info: Bank allowed to access/update local storage/configuration `status: Provisionally Registered` bian-reference:  (asSession).UserDevice(asResource).ResourceRestriction.AllowedRoleInstance `status: Provisionally Registered` bian-reference:  (asSession).UserDevice(asResource).ResourceRestriction.AllowedRoleType `status: Provisionally Registered` bian-reference:  (asSession).UserDevice(asResource).ResourceRestriction.ProhibitedRoleInstance `status: Provisionally Registered` bian-reference:  (asSession).UserDevice(asResource).ResourceRestriction.ProhibitedRoleType 
   * @return customerWorkbenchDeviceAccessPermissions
  **/

  public String getCustomerWorkbenchDeviceAccessPermissions() {
    return customerWorkbenchDeviceAccessPermissions;
  }

  public void setCustomerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
    this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
  }


  /**
   * general-info: Values use for auto-fill and local validation `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerDetailsPreferences
  **/

  public Object getCustomerDetailsPreferences() {
    return customerDetailsPreferences;
  }

  public void setCustomerDetailsPreferences(Object customerDetailsPreferences) {
    this.customerDetailsPreferences = customerDetailsPreferences;
  }


  /**
   * general-info: Structured dialogue to access bank services as appropriate `status: Provisionally Registered` bian-reference:  (asSession).FailureEvent `status: Provisionally Registered` bian-reference:  (asSession).NormalEvent `status: Provisionally Registered` bian-reference:  CustomerWorkbench(asSystem).Feature 
   * @return productServiceMenu
  **/

  public Object getProductServiceMenu() {
    return productServiceMenu;
  }

  public void setProductServiceMenu(Object productServiceMenu) {
    this.productServiceMenu = productServiceMenu;
  }


  /**
   * general-info: Record of product/service screen access `status: Provisionally Registered` bian-reference:  (asSession).FailureEvent `status: Provisionally Registered` bian-reference:  (asSession).NormalEvent 
   * @return productServiceMenuAccessLog
  **/

  public Object getProductServiceMenuAccessLog() {
    return productServiceMenuAccessLog;
  }

  public void setProductServiceMenuAccessLog(Object productServiceMenuAccessLog) {
    this.productServiceMenuAccessLog = productServiceMenuAccessLog;
  }


  /**
   * general-info: Time and duration spent on product/service screens `status: Provisionally Registered` bian-reference: (asSession).NormalEvent(asEvent).TimeBracket 
   * @return accessStartEndTime
  **/

  public String getAccessStartEndTime() {
    return accessStartEndTime;
  }

  public void setAccessStartEndTime(String accessStartEndTime) {
    this.accessStartEndTime = accessStartEndTime;
  }


  /**
   * general-info: Local copies of requested information, application forms etc. `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerResidentFiles
  **/

  public Object getCustomerResidentFiles() {
    return customerResidentFiles;
  }

  public void setCustomerResidentFiles(Object customerResidentFiles) {
    this.customerResidentFiles = customerResidentFiles;
  }


}

