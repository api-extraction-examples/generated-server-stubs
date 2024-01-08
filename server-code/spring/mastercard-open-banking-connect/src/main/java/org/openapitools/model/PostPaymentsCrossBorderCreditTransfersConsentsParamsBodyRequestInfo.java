package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Merchant;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo {

  private String aspspId;

  /**
   * Gets or Sets flags
   */
  public enum FlagsEnum {
    RETURN_RAW_CONSENT("Return.Raw.Consent");

    private String value;

    FlagsEnum(String value) {
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
    public static FlagsEnum fromValue(String value) {
      for (FlagsEnum b : FlagsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<FlagsEnum> flags;

  private Merchant merchant;

  private String tppRedirectURI;

  private String xRequestId;

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo(String aspspId, String tppRedirectURI, String xRequestId) {
    this.aspspId = aspspId;
    this.tppRedirectURI = tppRedirectURI;
    this.xRequestId = xRequestId;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo aspspId(String aspspId) {
    this.aspspId = aspspId;
    return this;
  }

  /**
   * Identification of ASPSP
   * @return aspspId
  */
  @NotNull @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "aspspId", example = "420e5cff-0e2a-4156-991a-f6eeef0478cf", description = "Identification of ASPSP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aspspId")
  public String getAspspId() {
    return aspspId;
  }

  public void setAspspId(String aspspId) {
    this.aspspId = aspspId;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo flags(List<FlagsEnum> flags) {
    this.flags = flags;
    return this;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo addFlagsItem(FlagsEnum flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Request information flags which can influence the behaviour or returned data
   * @return flags
  */
  
  @Schema(name = "flags", description = "Request information flags which can influence the behaviour or returned data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flags")
  public List<FlagsEnum> getFlags() {
    return flags;
  }

  public void setFlags(List<FlagsEnum> flags) {
    this.flags = flags;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo merchant(Merchant merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
  */
  @Valid 
  @Schema(name = "merchant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchant")
  public Merchant getMerchant() {
    return merchant;
  }

  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo tppRedirectURI(String tppRedirectURI) {
    this.tppRedirectURI = tppRedirectURI;
    return this;
  }

  /**
   * Call back uri
   * @return tppRedirectURI
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "tppRedirectURI", example = "https://tpp-ob.com/callback", description = "Call back uri", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tppRedirectURI")
  public String getTppRedirectURI() {
    return tppRedirectURI;
  }

  public void setTppRedirectURI(String tppRedirectURI) {
    this.tppRedirectURI = tppRedirectURI;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo xRequestId(String xRequestId) {
    this.xRequestId = xRequestId;
    return this;
  }

  /**
   * Request id given by the client
   * @return xRequestId
  */
  @NotNull @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "xRequestId", example = "123e4567-e89b-12d3-a456-426655440000", description = "Request id given by the client", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("xRequestId")
  public String getxRequestId() {
    return xRequestId;
  }

  public void setxRequestId(String xRequestId) {
    this.xRequestId = xRequestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo) o;
    return Objects.equals(this.aspspId, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo.aspspId) &&
        Objects.equals(this.flags, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo.flags) &&
        Objects.equals(this.merchant, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo.merchant) &&
        Objects.equals(this.tppRedirectURI, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo.tppRedirectURI) &&
        Objects.equals(this.xRequestId, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo.xRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspspId, flags, merchant, tppRedirectURI, xRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo {\n");
    sb.append("    aspspId: ").append(toIndentedString(aspspId)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    tppRedirectURI: ").append(toIndentedString(tppRedirectURI)).append("\n");
    sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

