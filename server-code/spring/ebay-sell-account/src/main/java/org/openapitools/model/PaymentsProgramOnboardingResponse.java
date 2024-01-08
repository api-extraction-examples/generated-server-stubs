package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PaymentsProgramOnboardingSteps;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Type used by the payments program onboarding response
 */

@Schema(name = "PaymentsProgramOnboardingResponse", description = "Type used by the payments program onboarding response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentsProgramOnboardingResponse {

  private String onboardingStatus;

  @Valid
  private List<@Valid PaymentsProgramOnboardingSteps> steps;

  public PaymentsProgramOnboardingResponse onboardingStatus(String onboardingStatus) {
    this.onboardingStatus = onboardingStatus;
    return this;
  }

  /**
   * This enumeration value indicates the eligibility of payment onboarding for the registered site. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStatus'>eBay API documentation</a>
   * @return onboardingStatus
  */
  
  @Schema(name = "onboardingStatus", description = "This enumeration value indicates the eligibility of payment onboarding for the registered site. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramOnboardingStatus'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onboardingStatus")
  public String getOnboardingStatus() {
    return onboardingStatus;
  }

  public void setOnboardingStatus(String onboardingStatus) {
    this.onboardingStatus = onboardingStatus;
  }

  public PaymentsProgramOnboardingResponse steps(List<@Valid PaymentsProgramOnboardingSteps> steps) {
    this.steps = steps;
    return this;
  }

  public PaymentsProgramOnboardingResponse addStepsItem(PaymentsProgramOnboardingSteps stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * An array of the active process steps for payment onboarding and the status of each step. This array includes the step <strong>name</strong>, step <strong>status</strong>, and a <strong>webUrl</strong> to the <code>IN_PROGRESS</code> step. The step names are returned in sequential order. 
   * @return steps
  */
  @Valid 
  @Schema(name = "steps", description = "An array of the active process steps for payment onboarding and the status of each step. This array includes the step <strong>name</strong>, step <strong>status</strong>, and a <strong>webUrl</strong> to the <code>IN_PROGRESS</code> step. The step names are returned in sequential order. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public List<@Valid PaymentsProgramOnboardingSteps> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid PaymentsProgramOnboardingSteps> steps) {
    this.steps = steps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProgramOnboardingResponse paymentsProgramOnboardingResponse = (PaymentsProgramOnboardingResponse) o;
    return Objects.equals(this.onboardingStatus, paymentsProgramOnboardingResponse.onboardingStatus) &&
        Objects.equals(this.steps, paymentsProgramOnboardingResponse.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onboardingStatus, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProgramOnboardingResponse {\n");
    sb.append("    onboardingStatus: ").append(toIndentedString(onboardingStatus)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

