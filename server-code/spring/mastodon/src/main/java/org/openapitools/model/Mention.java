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
 * Represents a mention of a user within the content of a status.
 */

@Schema(name = "Mention", description = "Represents a mention of a user within the content of a status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Mention {

  private String acct;

  private String id;

  private String url;

  private String username;

  public Mention() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Mention(String acct, String id, String url, String username) {
    this.acct = acct;
    this.id = id;
    this.url = url;
    this.username = username;
  }

  public Mention acct(String acct) {
    this.acct = acct;
    return this;
  }

  /**
   * The webfinger acct URI of the mentioned user. Equivalent to `username` for local users, or `username@domain` for remote users.
   * @return acct
  */
  @NotNull 
  @Schema(name = "acct", description = "The webfinger acct URI of the mentioned user. Equivalent to `username` for local users, or `username@domain` for remote users.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acct")
  public String getAcct() {
    return acct;
  }

  public void setAcct(String acct) {
    this.acct = acct;
  }

  public Mention id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The account id of the mentioned user. Cast from an integer, but not guaranteed to be a number
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The account id of the mentioned user. Cast from an integer, but not guaranteed to be a number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Mention url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The location of the mentioned user's profile.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "The location of the mentioned user's profile.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Mention username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the mentioned user.
   * @return username
  */
  @NotNull 
  @Schema(name = "username", description = "The username of the mentioned user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mention mention = (Mention) o;
    return Objects.equals(this.acct, mention.acct) &&
        Objects.equals(this.id, mention.id) &&
        Objects.equals(this.url, mention.url) &&
        Objects.equals(this.username, mention.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acct, id, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mention {\n");
    sb.append("    acct: ").append(toIndentedString(acct)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

