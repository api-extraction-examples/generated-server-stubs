package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsConsentsRawOKBodyOriginalRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsConsentsRawOKBody
 */

@JsonTypeName("postPaymentsConsentsRawOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsConsentsRawOKBody {

  private PostPaymentsConsentsRawOKBodyOriginalRequestInfo originalRequestInfo;

  private String rawConsent;

  public PostPaymentsConsentsRawOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsConsentsRawOKBody(PostPaymentsConsentsRawOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsConsentsRawOKBody originalRequestInfo(PostPaymentsConsentsRawOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
    return this;
  }

  /**
   * Get originalRequestInfo
   * @return originalRequestInfo
  */
  @NotNull @Valid 
  @Schema(name = "originalRequestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("originalRequestInfo")
  public PostPaymentsConsentsRawOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsConsentsRawOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsConsentsRawOKBody rawConsent(String rawConsent) {
    this.rawConsent = rawConsent;
    return this;
  }

  /**
   * Raw Consent
   * @return rawConsent
  */
  
  @Schema(name = "rawConsent", description = "Raw Consent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rawConsent")
  public String getRawConsent() {
    return rawConsent;
  }

  public void setRawConsent(String rawConsent) {
    this.rawConsent = rawConsent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsConsentsRawOKBody postPaymentsConsentsRawOKBody = (PostPaymentsConsentsRawOKBody) o;
    return Objects.equals(this.originalRequestInfo, postPaymentsConsentsRawOKBody.originalRequestInfo) &&
        Objects.equals(this.rawConsent, postPaymentsConsentsRawOKBody.rawConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalRequestInfo, rawConsent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsConsentsRawOKBody {\n");
    sb.append("    originalRequestInfo: ").append(toIndentedString(originalRequestInfo)).append("\n");
    sb.append("    rawConsent: ").append(toIndentedString(rawConsent)).append("\n");
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

