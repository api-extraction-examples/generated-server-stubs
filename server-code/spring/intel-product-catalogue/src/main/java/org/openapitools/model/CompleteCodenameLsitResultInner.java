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
 * CompleteCodenameLsitResultInner
 */

@JsonTypeName("Complete_codename_lsit_result_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class CompleteCodenameLsitResultInner {

  private String codeNameId;

  private String codeNameText;

  private String codeNameType;

  private String urlText;

  public CompleteCodenameLsitResultInner codeNameId(String codeNameId) {
    this.codeNameId = codeNameId;
    return this;
  }

  /**
   * Get codeNameId
   * @return codeNameId
  */
  
  @Schema(name = "CodeNameId", example = "37567", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodeNameId")
  public String getCodeNameId() {
    return codeNameId;
  }

  public void setCodeNameId(String codeNameId) {
    this.codeNameId = codeNameId;
  }

  public CompleteCodenameLsitResultInner codeNameText(String codeNameText) {
    this.codeNameText = codeNameText;
    return this;
  }

  /**
   * Get codeNameText
   * @return codeNameText
  */
  
  @Schema(name = "CodeNameText", example = "Products formerly Tunnel Creek", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodeNameText")
  public String getCodeNameText() {
    return codeNameText;
  }

  public void setCodeNameText(String codeNameText) {
    this.codeNameText = codeNameText;
  }

  public CompleteCodenameLsitResultInner codeNameType(String codeNameType) {
    this.codeNameType = codeNameType;
    return this;
  }

  /**
   * Get codeNameType
   * @return codeNameType
  */
  
  @Schema(name = "CodeNameType", example = "CODENAME", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodeNameType")
  public String getCodeNameType() {
    return codeNameType;
  }

  public void setCodeNameType(String codeNameType) {
    this.codeNameType = codeNameType;
  }

  public CompleteCodenameLsitResultInner urlText(String urlText) {
    this.urlText = urlText;
    return this;
  }

  /**
   * Get urlText
   * @return urlText
  */
  
  @Schema(name = "UrlText", example = "Tunnel-Creek", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UrlText")
  public String getUrlText() {
    return urlText;
  }

  public void setUrlText(String urlText) {
    this.urlText = urlText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteCodenameLsitResultInner completeCodenameLsitResultInner = (CompleteCodenameLsitResultInner) o;
    return Objects.equals(this.codeNameId, completeCodenameLsitResultInner.codeNameId) &&
        Objects.equals(this.codeNameText, completeCodenameLsitResultInner.codeNameText) &&
        Objects.equals(this.codeNameType, completeCodenameLsitResultInner.codeNameType) &&
        Objects.equals(this.urlText, completeCodenameLsitResultInner.urlText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeNameId, codeNameText, codeNameType, urlText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteCodenameLsitResultInner {\n");
    sb.append("    codeNameId: ").append(toIndentedString(codeNameId)).append("\n");
    sb.append("    codeNameText: ").append(toIndentedString(codeNameText)).append("\n");
    sb.append("    codeNameType: ").append(toIndentedString(codeNameType)).append("\n");
    sb.append("    urlText: ").append(toIndentedString(urlText)).append("\n");
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

