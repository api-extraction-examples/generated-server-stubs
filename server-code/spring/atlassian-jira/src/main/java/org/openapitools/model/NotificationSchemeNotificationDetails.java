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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of a notification within a notification scheme.
 */

@Schema(name = "NotificationSchemeNotificationDetails", description = "Details of a notification within a notification scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationSchemeNotificationDetails {

  private String notificationType;

  private String parameter;

  public NotificationSchemeNotificationDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotificationSchemeNotificationDetails(String notificationType) {
    this.notificationType = notificationType;
  }

  public NotificationSchemeNotificationDetails notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * The notification type, e.g `CurrentAssignee`, `Group`, `EmailAddress`.
   * @return notificationType
  */
  @NotNull 
  @Schema(name = "notificationType", description = "The notification type, e.g `CurrentAssignee`, `Group`, `EmailAddress`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationType")
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public NotificationSchemeNotificationDetails parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * The value corresponding to the specified notification type.
   * @return parameter
  */
  
  @Schema(name = "parameter", description = "The value corresponding to the specified notification type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public NotificationSchemeNotificationDetails putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSchemeNotificationDetails notificationSchemeNotificationDetails = (NotificationSchemeNotificationDetails) o;
    return Objects.equals(this.notificationType, notificationSchemeNotificationDetails.notificationType) &&
        Objects.equals(this.parameter, notificationSchemeNotificationDetails.parameter) &&
    Objects.equals(this.additionalProperties, notificationSchemeNotificationDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationType, parameter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSchemeNotificationDetails {\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

