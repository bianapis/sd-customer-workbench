package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * To support the download of updated bank SW
 */
public class CustomerWorkbenchSWUpdateComplete   {
  private String customerWorkbenchOperatingSessionReference = null;

  private String customerWorkbenchSWUpdateRecordReference = null;

  private String customerWorkbenchDeviceReference = null;

  private String customerWorkbenchDeviceConfigurationRecordReference = null;

  private Object customerWorkbenchDeviceConfigurationRecord = null;

  private String customerReference = null;

  private String customerWorkbenchDeviceType = null;

  private String customerWorkbenchDeviceManufacturer = null;

  private String customerWorkbenchDeviceOperatingSystemVersionNumber = null;

  private String customerWorkbenchDeviceAccessPermissions = null;

  private String installedBankApplicationType = null;

  private String installedBankApplicationVersionNumber = null;

  private String lastUpdateDateTime = null;


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
   * general-info: Used to track SW Update activity `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchSWUpdateRecordReference
  **/

  public String getCustomerWorkbenchSWUpdateRecordReference() {
    return customerWorkbenchSWUpdateRecordReference;
  }

  public void setCustomerWorkbenchSWUpdateRecordReference(String customerWorkbenchSWUpdateRecordReference) {
    this.customerWorkbenchSWUpdateRecordReference = customerWorkbenchSWUpdateRecordReference;
  }


  /**
   * general-info: Refers to the customer workbench/device `status: Provisionally Registered` bian-reference: (asSession).UserDevice 
   * @return customerWorkbenchDeviceReference
  **/

  public String getCustomerWorkbenchDeviceReference() {
    return customerWorkbenchDeviceReference;
  }

  public void setCustomerWorkbenchDeviceReference(String customerWorkbenchDeviceReference) {
    this.customerWorkbenchDeviceReference = customerWorkbenchDeviceReference;
  }


  /**
   * general-info: Refers to the customer workbench/device set-up `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchDeviceConfigurationRecordReference
  **/

  public String getCustomerWorkbenchDeviceConfigurationRecordReference() {
    return customerWorkbenchDeviceConfigurationRecordReference;
  }

  public void setCustomerWorkbenchDeviceConfigurationRecordReference(String customerWorkbenchDeviceConfigurationRecordReference) {
    this.customerWorkbenchDeviceConfigurationRecordReference = customerWorkbenchDeviceConfigurationRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerWorkbenchDeviceConfigurationRecord
  **/

  public Object getCustomerWorkbenchDeviceConfigurationRecord() {
    return customerWorkbenchDeviceConfigurationRecord;
  }

  public void setCustomerWorkbenchDeviceConfigurationRecord(Object customerWorkbenchDeviceConfigurationRecord) {
    this.customerWorkbenchDeviceConfigurationRecord = customerWorkbenchDeviceConfigurationRecord;
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
   * general-info: mobile, laptop, workstation `status: Provisionally Registered` bian-reference: (asSession).UserDevice(asResource).Type 
   * @return customerWorkbenchDeviceType
  **/

  public String getCustomerWorkbenchDeviceType() {
    return customerWorkbenchDeviceType;
  }

  public void setCustomerWorkbenchDeviceType(String customerWorkbenchDeviceType) {
    this.customerWorkbenchDeviceType = customerWorkbenchDeviceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerWorkbenchDeviceManufacturer
  **/

  public String getCustomerWorkbenchDeviceManufacturer() {
    return customerWorkbenchDeviceManufacturer;
  }

  public void setCustomerWorkbenchDeviceManufacturer(String customerWorkbenchDeviceManufacturer) {
    this.customerWorkbenchDeviceManufacturer = customerWorkbenchDeviceManufacturer;
  }


  /**
   * `status: Provisionally Registered` bian-reference: (asSession).UserDevice.Version 
   * @return customerWorkbenchDeviceOperatingSystemVersionNumber
  **/

  public String getCustomerWorkbenchDeviceOperatingSystemVersionNumber() {
    return customerWorkbenchDeviceOperatingSystemVersionNumber;
  }

  public void setCustomerWorkbenchDeviceOperatingSystemVersionNumber(String customerWorkbenchDeviceOperatingSystemVersionNumber) {
    this.customerWorkbenchDeviceOperatingSystemVersionNumber = customerWorkbenchDeviceOperatingSystemVersionNumber;
  }


  /**
   * general-info: Bank allowed to access/update local storage/configuration `status: Provisionally Registered` bian-reference: (asSession).UserDevice(asResource).ResourceRestriction.AllowedRoleInstance `status: Provisionally Registered` bian-reference: (asSession).UserDevice(asResource).ResourceRestriction.AllowedRoleType `status: Provisionally Registered` bian-reference: (asSession).UserDevice(asResource).ResourceRestriction.ProhibitedRoleInstance `status: Provisionally Registered` bian-reference: (asSession).UserDevice(asResource).ResourceRestriction.ProhibitedRoleType 
   * @return customerWorkbenchDeviceAccessPermissions
  **/

  public String getCustomerWorkbenchDeviceAccessPermissions() {
    return customerWorkbenchDeviceAccessPermissions;
  }

  public void setCustomerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
    this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
  }


  /**
   * general-info: Known device resident bank software `status: Registered` bian-reference:  CustomerWorkbench(asSystem).SystemIdentification.SystemName iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EkpDkA05EeKTRanIvvfSTQ_1398040998/elements/_EkpDkQ05EeKTRanIvvfSTQ_416826332) 
   * @return installedBankApplicationType
  **/

  public String getInstalledBankApplicationType() {
    return installedBankApplicationType;
  }

  public void setInstalledBankApplicationType(String installedBankApplicationType) {
    this.installedBankApplicationType = installedBankApplicationType;
  }


  /**
   * general-info: Release/version of installed software `status: Registered` bian-reference:  CustomerWorkbench(asSystem).SystemIdentification.SystemVersion iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EkpDkA05EeKTRanIvvfSTQ_1398040998/elements/_ExytFMTGEeChad0JzLk7QA_669806374) 
   * @return installedBankApplicationVersionNumber
  **/

  public String getInstalledBankApplicationVersionNumber() {
    return installedBankApplicationVersionNumber;
  }

  public void setInstalledBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
    this.installedBankApplicationVersionNumber = installedBankApplicationVersionNumber;
  }


  /**
   * Get lastUpdateDateTime
   * @return lastUpdateDateTime
  **/

  public String getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(String lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }


}

