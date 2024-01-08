package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.NotificationRecipients;
import org.openapitools.model.NotificationRecipientsRestrictions;
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
 * Details about a notification.
 */

@Schema(name = "Notification", description = "Details about a notification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Notification {

  private String htmlBody;

  private NotificationRecipientsRestrictions restrict;

  private String subject;

  private String textBody;

  private NotificationRecipients to;

  public Notification htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

  /**
   * The HTML body of the email notification for the issue.
   * @return htmlBody
  */
  
  @Schema(name = "htmlBody", description = "The HTML body of the email notification for the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmlBody")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public Notification restrict(NotificationRecipientsRestrictions restrict) {
    this.restrict = restrict;
    return this;
  }

  /**
   * Get restrict
   * @return restrict
  */
  @Valid 
  @Schema(name = "restrict", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restrict")
  public NotificationRecipientsRestrictions getRestrict() {
    return restrict;
  }

  public void setRestrict(NotificationRecipientsRestrictions restrict) {
    this.restrict = restrict;
  }

  public Notification subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
   * @return subject
  */
  
  @Schema(name = "subject", description = "The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Notification textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

  /**
   * The plain text body of the email notification for the issue.
   * @return textBody
  */
  
  @Schema(name = "textBody", description = "The plain text body of the email notification for the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public Notification to(NotificationRecipients to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  @Valid 
  @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public NotificationRecipients getTo() {
    return to;
  }

  public void setTo(NotificationRecipients to) {
    this.to = to;
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
    public Notification putAdditionalProperty(String key, Object value) {
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
    Notification notification = (Notification) o;
    return Objects.equals(this.htmlBody, notification.htmlBody) &&
        Objects.equals(this.restrict, notification.restrict) &&
        Objects.equals(this.subject, notification.subject) &&
        Objects.equals(this.textBody, notification.textBody) &&
        Objects.equals(this.to, notification.to) &&
    Objects.equals(this.additionalProperties, notification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlBody, restrict, subject, textBody, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    
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

