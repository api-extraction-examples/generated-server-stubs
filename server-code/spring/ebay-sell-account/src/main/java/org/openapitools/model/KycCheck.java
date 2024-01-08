package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used to provide details about any KYC check that is applicable to the managed payments seller.
 */

@Schema(name = "KycCheck", description = "This type is used to provide details about any KYC check that is applicable to the managed payments seller.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class KycCheck {

  private String alert;

  private String dataRequired;

  private String detailMessage;

  private String dueDate;

  private String remedyUrl;

  public KycCheck alert(String alert) {
    this.alert = alert;
    return this;
  }

  /**
   * This field gives a short summary of what is required from the seller. An example might be, '<code>Upload bank document now.</code>'. The <b>detailMessage</b> field will often provide more details on what is required of the seller.
   * @return alert
  */
  
  @Schema(name = "alert", description = "This field gives a short summary of what is required from the seller. An example might be, '<code>Upload bank document now.</code>'. The <b>detailMessage</b> field will often provide more details on what is required of the seller.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alert")
  public String getAlert() {
    return alert;
  }

  public void setAlert(String alert) {
    this.alert = alert;
  }

  public KycCheck dataRequired(String dataRequired) {
    this.dataRequired = dataRequired;
    return this;
  }

  /**
   * The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the <b>detailMessage</b> and other applicable, corresponding fields. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType'>eBay API documentation</a>
   * @return dataRequired
  */
  
  @Schema(name = "dataRequired", description = "The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the <b>detailMessage</b> and other applicable, corresponding fields. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataRequired")
  public String getDataRequired() {
    return dataRequired;
  }

  public void setDataRequired(String dataRequired) {
    this.dataRequired = dataRequired;
  }

  public KycCheck detailMessage(String detailMessage) {
    this.detailMessage = detailMessage;
    return this;
  }

  /**
   * This field gives a detailed message about what is required from the seller. An example might be, '<code>Please upload a bank document by 2020-08-01 to get your account back in good standing.</code>'.
   * @return detailMessage
  */
  
  @Schema(name = "detailMessage", description = "This field gives a detailed message about what is required from the seller. An example might be, '<code>Please upload a bank document by 2020-08-01 to get your account back in good standing.</code>'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detailMessage")
  public String getDetailMessage() {
    return detailMessage;
  }

  public void setDetailMessage(String detailMessage) {
    this.detailMessage = detailMessage;
  }

  public KycCheck dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.<br><br>The timestamp in this field uses the UTC date and time format described in the <a href=\"https://www.iso.org/iso-8601-date-and-time-format.html\" target=\"_blank\">ISO 8601 Standard</a>. See below for this format and an example: <br><br><i>MM-DD-YYYY HH:MM:SS</i><br/><code>06-05-2020 10:34:18</code>
   * @return dueDate
  */
  
  @Schema(name = "dueDate", description = "The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.<br><br>The timestamp in this field uses the UTC date and time format described in the <a href=\"https://www.iso.org/iso-8601-date-and-time-format.html\" target=\"_blank\">ISO 8601 Standard</a>. See below for this format and an example: <br><br><i>MM-DD-YYYY HH:MM:SS</i><br/><code>06-05-2020 10:34:18</code>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public KycCheck remedyUrl(String remedyUrl) {
    this.remedyUrl = remedyUrl;
    return this;
  }

  /**
   * If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.
   * @return remedyUrl
  */
  
  @Schema(name = "remedyUrl", description = "If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remedyUrl")
  public String getRemedyUrl() {
    return remedyUrl;
  }

  public void setRemedyUrl(String remedyUrl) {
    this.remedyUrl = remedyUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycCheck kycCheck = (KycCheck) o;
    return Objects.equals(this.alert, kycCheck.alert) &&
        Objects.equals(this.dataRequired, kycCheck.dataRequired) &&
        Objects.equals(this.detailMessage, kycCheck.detailMessage) &&
        Objects.equals(this.dueDate, kycCheck.dueDate) &&
        Objects.equals(this.remedyUrl, kycCheck.remedyUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, dataRequired, detailMessage, dueDate, remedyUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycCheck {\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    dataRequired: ").append(toIndentedString(dataRequired)).append("\n");
    sb.append("    detailMessage: ").append(toIndentedString(detailMessage)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    remedyUrl: ").append(toIndentedString(remedyUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

