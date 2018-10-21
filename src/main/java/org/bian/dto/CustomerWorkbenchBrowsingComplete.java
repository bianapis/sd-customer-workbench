package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Supports browsing the public bank website from the workbench
 */
public class CustomerWorkbenchBrowsingComplete   {
  private String customerWorkbenchOperatingSessionReference = null;

  private String customerWorkbenchBrowsingSessionReference = null;

  private Object customerWorkbenchBrowsingSessionRecord = null;

  private String customerURL = null;

  private String bankWebsiteURL = null;


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
   * general-info: Used to track bank website access `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerWorkbenchBrowsingSessionReference
  **/

  public String getCustomerWorkbenchBrowsingSessionReference() {
    return customerWorkbenchBrowsingSessionReference;
  }

  public void setCustomerWorkbenchBrowsingSessionReference(String customerWorkbenchBrowsingSessionReference) {
    this.customerWorkbenchBrowsingSessionReference = customerWorkbenchBrowsingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerWorkbenchBrowsingSessionRecord
  **/

  public Object getCustomerWorkbenchBrowsingSessionRecord() {
    return customerWorkbenchBrowsingSessionRecord;
  }

  public void setCustomerWorkbenchBrowsingSessionRecord(Object customerWorkbenchBrowsingSessionRecord) {
    this.customerWorkbenchBrowsingSessionRecord = customerWorkbenchBrowsingSessionRecord;
  }


  /**
   * general-info: Used to detect known customer access `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerURL
  **/

  public String getCustomerURL() {
    return customerURL;
  }

  public void setCustomerURL(String customerURL) {
    this.customerURL = customerURL;
  }


  /**
   * `status: Registered` bian-reference:  WorkbenchUser.Customer.RelationshipManager.Organisation(asParty).ContactPoint(asElectronicAddress).URLAddress iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FQ8HM8TGEeChad0JzLk7QA_1582936206/elements/_FQ8HNcTGEeChad0JzLk7QA_-256929078) general-info: Access to public bank web based information 
   * @return bankWebsiteURL
  **/

  public String getBankWebsiteURL() {
    return bankWebsiteURL;
  }

  public void setBankWebsiteURL(String bankWebsiteURL) {
    this.bankWebsiteURL = bankWebsiteURL;
  }


}

