package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsOKBodyLinks;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsOKBodyOriginalRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersConsentsOKBody
 */

@JsonTypeName("postPaymentsSepaCreditTransfersConsentsOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersConsentsOKBody {

  private PostPaymentsSepaCreditTransfersConsentsOKBodyLinks links;

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

  private PostPaymentsSepaCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo;

  public PostPaymentsSepaCreditTransfersConsentsOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersConsentsOKBody(PostPaymentsSepaCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsSepaCreditTransfersConsentsOKBody links(PostPaymentsSepaCreditTransfersConsentsOKBodyLinks links) {
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
  public PostPaymentsSepaCreditTransfersConsentsOKBodyLinks getLinks() {
    return links;
  }

  public void setLinks(PostPaymentsSepaCreditTransfersConsentsOKBodyLinks links) {
    this.links = links;
  }

  public PostPaymentsSepaCreditTransfersConsentsOKBody additionalData(PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData additionalData) {
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

  public PostPaymentsSepaCreditTransfersConsentsOKBody aspspSCAApproach(AspspSCAApproachEnum aspspSCAApproach) {
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

  public PostPaymentsSepaCreditTransfersConsentsOKBody consentRequestId(String consentRequestId) {
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

  public PostPaymentsSepaCreditTransfersConsentsOKBody originalRequestInfo(PostPaymentsSepaCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo) {
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
  public PostPaymentsSepaCreditTransfersConsentsOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsSepaCreditTransfersConsentsOKBodyOriginalRequestInfo originalRequestInfo) {
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
    PostPaymentsSepaCreditTransfersConsentsOKBody postPaymentsSepaCreditTransfersConsentsOKBody = (PostPaymentsSepaCreditTransfersConsentsOKBody) o;
    return Objects.equals(this.links, postPaymentsSepaCreditTransfersConsentsOKBody.links) &&
        Objects.equals(this.additionalData, postPaymentsSepaCreditTransfersConsentsOKBody.additionalData) &&
        Objects.equals(this.aspspSCAApproach, postPaymentsSepaCreditTransfersConsentsOKBody.aspspSCAApproach) &&
        Objects.equals(this.consentRequestId, postPaymentsSepaCreditTransfersConsentsOKBody.consentRequestId) &&
        Objects.equals(this.originalRequestInfo, postPaymentsSepaCreditTransfersConsentsOKBody.originalRequestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, additionalData, aspspSCAApproach, consentRequestId, originalRequestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersConsentsOKBody {\n");
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

