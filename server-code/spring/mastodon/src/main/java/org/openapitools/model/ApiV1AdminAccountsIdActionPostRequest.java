package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1AdminAccountsIdActionPostRequest
 */

@JsonTypeName("_api_v1_admin_accounts__id__action_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AdminAccountsIdActionPostRequest {

  private String reportId;

  private Boolean sendEmailNotification;

  private String text;

  /**
   * Type of action to be taken. Enumerable oneOf: none disable silence suspend
   */
  public enum TypeEnum {
    NONE("none"),
    
    DISABLE("disable"),
    
    SILENCE("silence"),
    
    SUSPEND("suspend");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String warningPresetId;

  public ApiV1AdminAccountsIdActionPostRequest reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * ID of an associated report that caused this action to be taken
   * @return reportId
  */
  
  @Schema(name = "report_id", description = "ID of an associated report that caused this action to be taken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_id")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public ApiV1AdminAccountsIdActionPostRequest sendEmailNotification(Boolean sendEmailNotification) {
    this.sendEmailNotification = sendEmailNotification;
    return this;
  }

  /**
   * Whether an email should be sent to the user with the above information.
   * @return sendEmailNotification
  */
  
  @Schema(name = "send_email_notification", description = "Whether an email should be sent to the user with the above information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("send_email_notification")
  public Boolean getSendEmailNotification() {
    return sendEmailNotification;
  }

  public void setSendEmailNotification(Boolean sendEmailNotification) {
    this.sendEmailNotification = sendEmailNotification;
  }

  public ApiV1AdminAccountsIdActionPostRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Additional text for clarification of why this action was taken
   * @return text
  */
  
  @Schema(name = "text", description = "Additional text for clarification of why this action was taken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ApiV1AdminAccountsIdActionPostRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of action to be taken. Enumerable oneOf: none disable silence suspend
   * @return type
  */
  
  @Schema(name = "type", description = "Type of action to be taken. Enumerable oneOf: none disable silence suspend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ApiV1AdminAccountsIdActionPostRequest warningPresetId(String warningPresetId) {
    this.warningPresetId = warningPresetId;
    return this;
  }

  /**
   * ID of a preset warning
   * @return warningPresetId
  */
  
  @Schema(name = "warning_preset_id", description = "ID of a preset warning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warning_preset_id")
  public String getWarningPresetId() {
    return warningPresetId;
  }

  public void setWarningPresetId(String warningPresetId) {
    this.warningPresetId = warningPresetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AdminAccountsIdActionPostRequest apiV1AdminAccountsIdActionPostRequest = (ApiV1AdminAccountsIdActionPostRequest) o;
    return Objects.equals(this.reportId, apiV1AdminAccountsIdActionPostRequest.reportId) &&
        Objects.equals(this.sendEmailNotification, apiV1AdminAccountsIdActionPostRequest.sendEmailNotification) &&
        Objects.equals(this.text, apiV1AdminAccountsIdActionPostRequest.text) &&
        Objects.equals(this.type, apiV1AdminAccountsIdActionPostRequest.type) &&
        Objects.equals(this.warningPresetId, apiV1AdminAccountsIdActionPostRequest.warningPresetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, sendEmailNotification, text, type, warningPresetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AdminAccountsIdActionPostRequest {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    sendEmailNotification: ").append(toIndentedString(sendEmailNotification)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    warningPresetId: ").append(toIndentedString(warningPresetId)).append("\n");
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

