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
 * The payments program onboarding steps, status, and link.
 */

@Schema(name = "PaymentsProgramOnboardingSteps", description = "The payments program onboarding steps, status, and link.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentsProgramOnboardingSteps {

  private String name;

  private String status;

  private String webUrl;

  public PaymentsProgramOnboardingSteps name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the step in the steps array. Over time, these names are subject to change as processes change. The output sample contains example step names. Review an actual call response for updated step names. 
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the step in the steps array. Over time, these names are subject to change as processes change. The output sample contains example step names. Review an actual call response for updated step names. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentsProgramOnboardingSteps status(String status) {
    this.status = status;
    return this;
  }

  /**
   * This enumeration value indicates the status of the associated step. <p> <span class=\"tablenote\"><strong>Note:</strong> Only one step can be <code>IN_PROGRESS</code> at a time.</span></p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStepStatus'>eBay API documentation</a>
   * @return status
  */
  
  @Schema(name = "status", description = "This enumeration value indicates the status of the associated step. <p> <span class=\"tablenote\"><strong>Note:</strong> Only one step can be <code>IN_PROGRESS</code> at a time.</span></p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStepStatus'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentsProgramOnboardingSteps webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

  /**
   * This URL provides access to the <code>IN_PROGRESS</code> step.
   * @return webUrl
  */
  
  @Schema(name = "webUrl", description = "This URL provides access to the <code>IN_PROGRESS</code> step.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webUrl")
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProgramOnboardingSteps paymentsProgramOnboardingSteps = (PaymentsProgramOnboardingSteps) o;
    return Objects.equals(this.name, paymentsProgramOnboardingSteps.name) &&
        Objects.equals(this.status, paymentsProgramOnboardingSteps.status) &&
        Objects.equals(this.webUrl, paymentsProgramOnboardingSteps.webUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, webUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProgramOnboardingSteps {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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

