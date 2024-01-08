package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1AccountsUpdateCredentialsPatchRequestSource
 */

@JsonTypeName("_api_v1_accounts_update_credentials_patch_request_source")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AccountsUpdateCredentialsPatchRequestSource {

  private String language;

  private String privacy;

  private Boolean sensitive;

  public ApiV1AccountsUpdateCredentialsPatchRequestSource language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Default language to use for authored statuses. (ISO 6391)
   * @return language
  */
  
  @Schema(name = "language", description = "Default language to use for authored statuses. (ISO 6391)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequestSource privacy(String privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * Default post privacy for authored statuses.
   * @return privacy
  */
  
  @Schema(name = "privacy", description = "Default post privacy for authored statuses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy")
  public String getPrivacy() {
    return privacy;
  }

  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }

  public ApiV1AccountsUpdateCredentialsPatchRequestSource sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Whether to mark authored statuses as sensitive by default.
   * @return sensitive
  */
  
  @Schema(name = "sensitive", description = "Whether to mark authored statuses as sensitive by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensitive")
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsUpdateCredentialsPatchRequestSource apiV1AccountsUpdateCredentialsPatchRequestSource = (ApiV1AccountsUpdateCredentialsPatchRequestSource) o;
    return Objects.equals(this.language, apiV1AccountsUpdateCredentialsPatchRequestSource.language) &&
        Objects.equals(this.privacy, apiV1AccountsUpdateCredentialsPatchRequestSource.privacy) &&
        Objects.equals(this.sensitive, apiV1AccountsUpdateCredentialsPatchRequestSource.sensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, privacy, sensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsUpdateCredentialsPatchRequestSource {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
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

