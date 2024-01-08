package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.Account;
import org.openapitools.model.Status;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a notification of an event relevant to the user.
 */

@Schema(name = "Notification", description = "Represents a notification of an event relevant to the user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Notification {

  private Account account;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String id;

  private Status status;

  /**
   * The type of event that resulted in the notification.
   */
  public enum TypeEnum {
    FOLLOW("follow"),
    
    FOLLOW_REQUEST("follow_request"),
    
    MENTION("mention"),
    
    REBLOG("reblog"),
    
    FAVOURITE("favourite"),
    
    POLL("poll"),
    
    STATUS("status");

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

  public Notification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Notification(Account account, OffsetDateTime createdAt, String id, TypeEnum type) {
    this.account = account;
    this.createdAt = createdAt;
    this.id = id;
    this.type = type;
  }

  public Notification account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @NotNull @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Notification createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp of the notification. ISO 8601 Datetime.
   * @return createdAt
  */
  @NotNull @Valid 
  @Schema(name = "created_at", description = "The timestamp of the notification. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Notification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the notification in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The id of the notification in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Notification status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Notification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of event that resulted in the notification.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of event that resulted in the notification.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
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
    return Objects.equals(this.account, notification.account) &&
        Objects.equals(this.createdAt, notification.createdAt) &&
        Objects.equals(this.id, notification.id) &&
        Objects.equals(this.status, notification.status) &&
        Objects.equals(this.type, notification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, createdAt, id, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

