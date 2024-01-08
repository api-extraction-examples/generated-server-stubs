package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsOKBodyLinks;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsOKBodyOriginalRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersConsentsOKBody
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsOKBody {

  private PostPaymentsCrossBorderCreditTransfersConsentsOKBodyLinks links;

  private PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData additionalData;

  /**
   * Gets or Sets aspspSCAApproach
   */
  public enum AspspSCAApproachEnum {
    REDIRECT("REDIRECT");

    private String value;

    AspspSCAApproachEnum(String value) {
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
    public static AspspSCAApproachEnum fromValue(String value) {
      for (AspspSCAApproachEnum b : AspspSCAApproachEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AspspSCAApproachEnum aspspSCAApproach;

  private String consentRequestId;

  private PostPaymentsCrossBorderCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo;

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody links(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public PostPaymentsCrossBorderCreditTransfersConsentsOKBodyLinks getLinks() {
    return links;
  }

  public void setLinks(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyLinks links) {
    this.links = links;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody additionalData(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  /**
   * Get additionalData
   * @return additionalData
  */
  @Valid 
  @Schema(name = "additionalData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalData")
  public PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData additionalData) {
    this.additionalData = additionalData;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody aspspSCAApproach(AspspSCAApproachEnum aspspSCAApproach) {
    this.aspspSCAApproach = aspspSCAApproach;
    return this;
  }

  /**
   * Get aspspSCAApproach
   * @return aspspSCAApproach
  */
  
  @Schema(name = "aspspSCAApproach", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aspspSCAApproach")
  public AspspSCAApproachEnum getAspspSCAApproach() {
    return aspspSCAApproach;
  }

  public void setAspspSCAApproach(AspspSCAApproachEnum aspspSCAApproach) {
    this.aspspSCAApproach = aspspSCAApproach;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody consentRequestId(String consentRequestId) {
    this.consentRequestId = consentRequestId;
    return this;
  }

  /**
   * Get consentRequestId
   * @return consentRequestId
  */
  
  @Schema(name = "consentRequestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consentRequestId")
  public String getConsentRequestId() {
    return consentRequestId;
  }

  public void setConsentRequestId(String consentRequestId) {
    this.consentRequestId = consentRequestId;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBody originalRequestInfo(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo) {
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
  public PostPaymentsCrossBorderCreditTransfersConsentsOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsOKBody postPaymentsCrossBorderCreditTransfersConsentsOKBody = (PostPaymentsCrossBorderCreditTransfersConsentsOKBody) o;
    return Objects.equals(this.links, postPaymentsCrossBorderCreditTransfersConsentsOKBody.links) &&
        Objects.equals(this.additionalData, postPaymentsCrossBorderCreditTransfersConsentsOKBody.additionalData) &&
        Objects.equals(this.aspspSCAApproach, postPaymentsCrossBorderCreditTransfersConsentsOKBody.aspspSCAApproach) &&
        Objects.equals(this.consentRequestId, postPaymentsCrossBorderCreditTransfersConsentsOKBody.consentRequestId) &&
        Objects.equals(this.originalRequestInfo, postPaymentsCrossBorderCreditTransfersConsentsOKBody.originalRequestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, additionalData, aspspSCAApproach, consentRequestId, originalRequestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsOKBody {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    aspspSCAApproach: ").append(toIndentedString(aspspSCAApproach)).append("\n");
    sb.append("    consentRequestId: ").append(toIndentedString(consentRequestId)).append("\n");
    sb.append("    originalRequestInfo: ").append(toIndentedString(originalRequestInfo)).append("\n");
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

