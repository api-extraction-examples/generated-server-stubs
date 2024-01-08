package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ErrorDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about why a request failed, such as missing or invalid parameters
 */

@Schema(name = "RideRequestError", description = "Details about why a request failed, such as missing or invalid parameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideRequestError {

  private String costToken;

  private String error;

  private String errorDescription;

  @Valid
  private List<@Valid ErrorDetail> errorDetail;

  private String errorUri;

  private String primetimeConfirmationToken;

  private Float primetimeMultiplier;

  private String primetimePercentage;

  private String tokenDuration;

  public RideRequestError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RideRequestError(String error) {
    this.error = error;
  }

  public RideRequestError costToken(String costToken) {
    this.costToken = costToken;
    return this;
  }

  /**
   * A token that confirms the user has accepted current Prime Time and/or fixed price charges
   * @return costToken
  */
  
  @Schema(name = "cost_token", description = "A token that confirms the user has accepted current Prime Time and/or fixed price charges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_token")
  public String getCostToken() {
    return costToken;
  }

  public void setCostToken(String costToken) {
    this.costToken = costToken;
  }

  public RideRequestError error(String error) {
    this.error = error;
    return this;
  }

  /**
   * A \"slug\" that serves as the error code (eg. \"bad_parameter\")
   * @return error
  */
  @NotNull 
  @Schema(name = "error", description = "A \"slug\" that serves as the error code (eg. \"bad_parameter\")", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RideRequestError errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * A user-friendly description of the error (appropriate to show to an end-user)
   * @return errorDescription
  */
  
  @Schema(name = "error_description", description = "A user-friendly description of the error (appropriate to show to an end-user)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_description")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public RideRequestError errorDetail(List<@Valid ErrorDetail> errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  public RideRequestError addErrorDetailItem(ErrorDetail errorDetailItem) {
    if (this.errorDetail == null) {
      this.errorDetail = new ArrayList<>();
    }
    this.errorDetail.add(errorDetailItem);
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
  */
  @Valid 
  @Schema(name = "error_detail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_detail")
  public List<@Valid ErrorDetail> getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(List<@Valid ErrorDetail> errorDetail) {
    this.errorDetail = errorDetail;
  }

  public RideRequestError errorUri(String errorUri) {
    this.errorUri = errorUri;
    return this;
  }

  /**
   * When a user must go through another flow before requesting a ride, this URI specifies which flow to use (e.g. an account challenge flow in a web view)
   * @return errorUri
  */
  
  @Schema(name = "error_uri", description = "When a user must go through another flow before requesting a ride, this URI specifies which flow to use (e.g. an account challenge flow in a web view)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_uri")
  public String getErrorUri() {
    return errorUri;
  }

  public void setErrorUri(String errorUri) {
    this.errorUri = errorUri;
  }

  public RideRequestError primetimeConfirmationToken(String primetimeConfirmationToken) {
    this.primetimeConfirmationToken = primetimeConfirmationToken;
    return this;
  }

  /**
   * A token that confirms the user has accepted current Prime Time charges (Deprecated)
   * @return primetimeConfirmationToken
  */
  
  @Schema(name = "primetime_confirmation_token", description = "A token that confirms the user has accepted current Prime Time charges (Deprecated)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_confirmation_token")
  public String getPrimetimeConfirmationToken() {
    return primetimeConfirmationToken;
  }

  public void setPrimetimeConfirmationToken(String primetimeConfirmationToken) {
    this.primetimeConfirmationToken = primetimeConfirmationToken;
  }

  public RideRequestError primetimeMultiplier(Float primetimeMultiplier) {
    this.primetimeMultiplier = primetimeMultiplier;
    return this;
  }

  /**
   * Current Prime Time multiplier (eg. if primetime_percentage is 100%, primetime_multiplier will be 2.0)
   * @return primetimeMultiplier
  */
  
  @Schema(name = "primetime_multiplier", description = "Current Prime Time multiplier (eg. if primetime_percentage is 100%, primetime_multiplier will be 2.0)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_multiplier")
  public Float getPrimetimeMultiplier() {
    return primetimeMultiplier;
  }

  public void setPrimetimeMultiplier(Float primetimeMultiplier) {
    this.primetimeMultiplier = primetimeMultiplier;
  }

  public RideRequestError primetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
    return this;
  }

  /**
   * Current Prime Time percentage
   * @return primetimePercentage
  */
  
  @Schema(name = "primetime_percentage", description = "Current Prime Time percentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_percentage")
  public String getPrimetimePercentage() {
    return primetimePercentage;
  }

  public void setPrimetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
  }

  public RideRequestError tokenDuration(String tokenDuration) {
    this.tokenDuration = tokenDuration;
    return this;
  }

  /**
   * Validity of the token in seconds
   * @return tokenDuration
  */
  
  @Schema(name = "token_duration", description = "Validity of the token in seconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token_duration")
  public String getTokenDuration() {
    return tokenDuration;
  }

  public void setTokenDuration(String tokenDuration) {
    this.tokenDuration = tokenDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideRequestError rideRequestError = (RideRequestError) o;
    return Objects.equals(this.costToken, rideRequestError.costToken) &&
        Objects.equals(this.error, rideRequestError.error) &&
        Objects.equals(this.errorDescription, rideRequestError.errorDescription) &&
        Objects.equals(this.errorDetail, rideRequestError.errorDetail) &&
        Objects.equals(this.errorUri, rideRequestError.errorUri) &&
        Objects.equals(this.primetimeConfirmationToken, rideRequestError.primetimeConfirmationToken) &&
        Objects.equals(this.primetimeMultiplier, rideRequestError.primetimeMultiplier) &&
        Objects.equals(this.primetimePercentage, rideRequestError.primetimePercentage) &&
        Objects.equals(this.tokenDuration, rideRequestError.tokenDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costToken, error, errorDescription, errorDetail, errorUri, primetimeConfirmationToken, primetimeMultiplier, primetimePercentage, tokenDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideRequestError {\n");
    sb.append("    costToken: ").append(toIndentedString(costToken)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    errorUri: ").append(toIndentedString(errorUri)).append("\n");
    sb.append("    primetimeConfirmationToken: ").append(toIndentedString(primetimeConfirmationToken)).append("\n");
    sb.append("    primetimeMultiplier: ").append(toIndentedString(primetimeMultiplier)).append("\n");
    sb.append("    primetimePercentage: ").append(toIndentedString(primetimePercentage)).append("\n");
    sb.append("    tokenDuration: ").append(toIndentedString(tokenDuration)).append("\n");
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

