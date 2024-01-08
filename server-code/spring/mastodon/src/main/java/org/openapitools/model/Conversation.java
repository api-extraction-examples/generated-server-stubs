package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Status;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a conversation with \&quot;direct message\&quot; visibility.
 */

@Schema(name = "Conversation", description = "Represents a conversation with \"direct message\" visibility.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Conversation {

  @Valid
  private List<@Valid Account> accounts = new ArrayList<>();

  private String id;

  private Status lastStatus;

  private Boolean unread;

  public Conversation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Conversation(List<@Valid Account> accounts, String id, Boolean unread) {
    this.accounts = accounts;
    this.id = id;
    this.unread = unread;
  }

  public Conversation accounts(List<@Valid Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Conversation addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Participants in the conversation.
   * @return accounts
  */
  @NotNull @Valid 
  @Schema(name = "accounts", description = "Participants in the conversation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accounts")
  public List<@Valid Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<@Valid Account> accounts) {
    this.accounts = accounts;
  }

  public Conversation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Local database ID of the conversation. Cast from an integer, but not guaranteed to be a number
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Local database ID of the conversation. Cast from an integer, but not guaranteed to be a number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Conversation lastStatus(Status lastStatus) {
    this.lastStatus = lastStatus;
    return this;
  }

  /**
   * Get lastStatus
   * @return lastStatus
  */
  @Valid 
  @Schema(name = "last_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_status")
  public Status getLastStatus() {
    return lastStatus;
  }

  public void setLastStatus(Status lastStatus) {
    this.lastStatus = lastStatus;
  }

  public Conversation unread(Boolean unread) {
    this.unread = unread;
    return this;
  }

  /**
   * Is the conversation currently marked as unread?
   * @return unread
  */
  @NotNull 
  @Schema(name = "unread", description = "Is the conversation currently marked as unread?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unread")
  public Boolean getUnread() {
    return unread;
  }

  public void setUnread(Boolean unread) {
    this.unread = unread;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.accounts, conversation.accounts) &&
        Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.lastStatus, conversation.lastStatus) &&
        Objects.equals(this.unread, conversation.unread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, id, lastStatus, unread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
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

