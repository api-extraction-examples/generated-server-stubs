package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FieldDetails;
import org.openapitools.model.GroupName;
import org.openapitools.model.ProjectRole;
import org.openapitools.model.UserDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a notification associated with an event.
 */

@Schema(name = "EventNotification", description = "Details about a notification associated with an event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class EventNotification {

  private String emailAddress;

  private String expand;

  private FieldDetails field;

  private GroupName group;

  private Long id;

  /**
   * Identifies the recipients of the notification.
   */
  public enum NotificationTypeEnum {
    CURRENTASSIGNEE("CurrentAssignee"),
    
    REPORTER("Reporter"),
    
    CURRENTUSER("CurrentUser"),
    
    PROJECTLEAD("ProjectLead"),
    
    COMPONENTLEAD("ComponentLead"),
    
    USER("User"),
    
    GROUP("Group"),
    
    PROJECTROLE("ProjectRole"),
    
    EMAILADDRESS("EmailAddress"),
    
    ALLWATCHERS("AllWatchers"),
    
    USERCUSTOMFIELD("UserCustomField"),
    
    GROUPCUSTOMFIELD("GroupCustomField");

    private String value;

    NotificationTypeEnum(String value) {
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
    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NotificationTypeEnum notificationType;

  private String parameter;

  private ProjectRole projectRole;

  private String recipient;

  private UserDetails user;

  public EventNotification emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address.
   * @return emailAddress
  */
  
  @Schema(name = "emailAddress", description = "The email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public EventNotification expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional event notification details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", description = "Expand options that include additional event notification details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public EventNotification field(FieldDetails field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @Valid 
  @Schema(name = "field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public FieldDetails getField() {
    return field;
  }

  public void setField(FieldDetails field) {
    this.field = field;
  }

  public EventNotification group(GroupName group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @Valid 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public GroupName getGroup() {
    return group;
  }

  public void setGroup(GroupName group) {
    this.group = group;
  }

  public EventNotification id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the notification.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EventNotification notificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Identifies the recipients of the notification.
   * @return notificationType
  */
  
  @Schema(name = "notificationType", description = "Identifies the recipients of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationType")
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }

  public EventNotification parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * As a group's name can change, use of `recipient` is recommended. The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by `notificationType` value. So, when `notificationType` is:   *  `User` The `parameter` is the user account ID.  *  `Group` The `parameter` is the group name.  *  `ProjectRole` The `parameter` is the project role ID.  *  `UserCustomField` The `parameter` is the ID of the custom field.  *  `GroupCustomField` The `parameter` is the ID of the custom field.
   * @return parameter
  */
  
  @Schema(name = "parameter", description = "As a group's name can change, use of `recipient` is recommended. The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by `notificationType` value. So, when `notificationType` is:   *  `User` The `parameter` is the user account ID.  *  `Group` The `parameter` is the group name.  *  `ProjectRole` The `parameter` is the project role ID.  *  `UserCustomField` The `parameter` is the ID of the custom field.  *  `GroupCustomField` The `parameter` is the ID of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public EventNotification projectRole(ProjectRole projectRole) {
    this.projectRole = projectRole;
    return this;
  }

  /**
   * Get projectRole
   * @return projectRole
  */
  @Valid 
  @Schema(name = "projectRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectRole")
  public ProjectRole getProjectRole() {
    return projectRole;
  }

  public void setProjectRole(ProjectRole projectRole) {
    this.projectRole = projectRole;
  }

  public EventNotification recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by the `notificationType` value. So, when `notificationType` is:   *  `User`, `recipient` is the user account ID.  *  `Group`, `recipient` is the group ID.  *  `ProjectRole`, `recipient` is the project role ID.  *  `UserCustomField`, `recipient` is the ID of the custom field.  *  `GroupCustomField`, `recipient` is the ID of the custom field.
   * @return recipient
  */
  
  @Schema(name = "recipient", description = "The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by the `notificationType` value. So, when `notificationType` is:   *  `User`, `recipient` is the user account ID.  *  `Group`, `recipient` is the group ID.  *  `ProjectRole`, `recipient` is the project role ID.  *  `UserCustomField`, `recipient` is the ID of the custom field.  *  `GroupCustomField`, `recipient` is the ID of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public EventNotification user(UserDetails user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public UserDetails getUser() {
    return user;
  }

  public void setUser(UserDetails user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.emailAddress, eventNotification.emailAddress) &&
        Objects.equals(this.expand, eventNotification.expand) &&
        Objects.equals(this.field, eventNotification.field) &&
        Objects.equals(this.group, eventNotification.group) &&
        Objects.equals(this.id, eventNotification.id) &&
        Objects.equals(this.notificationType, eventNotification.notificationType) &&
        Objects.equals(this.parameter, eventNotification.parameter) &&
        Objects.equals(this.projectRole, eventNotification.projectRole) &&
        Objects.equals(this.recipient, eventNotification.recipient) &&
        Objects.equals(this.user, eventNotification.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, expand, field, group, id, notificationType, parameter, projectRole, recipient, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

