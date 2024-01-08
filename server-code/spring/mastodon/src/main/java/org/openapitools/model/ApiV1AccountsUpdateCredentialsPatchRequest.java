package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ApiV1AccountsUpdateCredentialsPatchRequestSource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1AccountsUpdateCredentialsPatchRequest
 */

@JsonTypeName("_api_v1_accounts_update_credentials_patch_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AccountsUpdateCredentialsPatchRequest {

  private String avatar;

  private Boolean bot;

  private String discoverable;

  private String displayName;

  private Object fieldsAttributes;

  private String header;

  private Boolean locked;

  private String note;

  private ApiV1AccountsUpdateCredentialsPatchRequestSource source;

  public ApiV1AccountsUpdateCredentialsPatchRequest avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Avatar image encoded using multipart/form-data
   * @return avatar
  */
  
  @Schema(name = "avatar", description = "Avatar image encoded using multipart/form-data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest bot(Boolean bot) {
    this.bot = bot;
    return this;
  }

  /**
   * Whether the account has a bot flag.
   * @return bot
  */
  
  @Schema(name = "bot", description = "Whether the account has a bot flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bot")
  public Boolean getBot() {
    return bot;
  }

  public void setBot(Boolean bot) {
    this.bot = bot;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest discoverable(String discoverable) {
    this.discoverable = discoverable;
    return this;
  }

  /**
   * Whether the account should be shown in the profile directory.
   * @return discoverable
  */
  
  @Schema(name = "discoverable", description = "Whether the account should be shown in the profile directory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discoverable")
  public String getDiscoverable() {
    return discoverable;
  }

  public void setDiscoverable(String discoverable) {
    this.discoverable = discoverable;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name to use for the profile.
   * @return displayName
  */
  
  @Schema(name = "display_name", description = "The display name to use for the profile.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest fieldsAttributes(Object fieldsAttributes) {
    this.fieldsAttributes = fieldsAttributes;
    return this;
  }

  /**
   * Profile metadata `name` and `value`. (By default, max 4 fields and 255 characters per property/value)
   * @return fieldsAttributes
  */
  
  @Schema(name = "fields_attributes", description = "Profile metadata `name` and `value`. (By default, max 4 fields and 255 characters per property/value)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields_attributes")
  public Object getFieldsAttributes() {
    return fieldsAttributes;
  }

  public void setFieldsAttributes(Object fieldsAttributes) {
    this.fieldsAttributes = fieldsAttributes;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Header image encoded using multipart/form-data
   * @return header
  */
  
  @Schema(name = "header", description = "Header image encoded using multipart/form-data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Whether manual approval of follow requests is required.
   * @return locked
  */
  
  @Schema(name = "locked", description = "Whether manual approval of follow requests is required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest note(String note) {
    this.note = note;
    return this;
  }

  /**
   * The account bio.
   * @return note
  */
  
  @Schema(name = "note", description = "The account bio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequest source(ApiV1AccountsUpdateCredentialsPatchRequestSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public ApiV1AccountsUpdateCredentialsPatchRequestSource getSource() {
    return source;
  }

  public void setSource(ApiV1AccountsUpdateCredentialsPatchRequestSource source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsUpdateCredentialsPatchRequest apiV1AccountsUpdateCredentialsPatchRequest = (ApiV1AccountsUpdateCredentialsPatchRequest) o;
    return Objects.equals(this.avatar, apiV1AccountsUpdateCredentialsPatchRequest.avatar) &&
        Objects.equals(this.bot, apiV1AccountsUpdateCredentialsPatchRequest.bot) &&
        Objects.equals(this.discoverable, apiV1AccountsUpdateCredentialsPatchRequest.discoverable) &&
        Objects.equals(this.displayName, apiV1AccountsUpdateCredentialsPatchRequest.displayName) &&
        Objects.equals(this.fieldsAttributes, apiV1AccountsUpdateCredentialsPatchRequest.fieldsAttributes) &&
        Objects.equals(this.header, apiV1AccountsUpdateCredentialsPatchRequest.header) &&
        Objects.equals(this.locked, apiV1AccountsUpdateCredentialsPatchRequest.locked) &&
        Objects.equals(this.note, apiV1AccountsUpdateCredentialsPatchRequest.note) &&
        Objects.equals(this.source, apiV1AccountsUpdateCredentialsPatchRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, bot, discoverable, displayName, fieldsAttributes, header, locked, note, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsUpdateCredentialsPatchRequest {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    discoverable: ").append(toIndentedString(discoverable)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fieldsAttributes: ").append(toIndentedString(fieldsAttributes)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

