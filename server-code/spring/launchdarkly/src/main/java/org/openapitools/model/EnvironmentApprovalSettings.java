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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Approval settings for an environment. Only appears if the approvals feature is enabled.
 */

@Schema(name = "Environment_approvalSettings", description = "Approval settings for an environment. Only appears if the approvals feature is enabled.")
@JsonTypeName("Environment_approvalSettings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class EnvironmentApprovalSettings {

  private Boolean canApplyDeclinedChanges;

  private Boolean canReviewOwnRequest;

  private Long minNumApprovals;

  private Boolean required;

  @Valid
  private List<String> requiredApprovalTags;

  /**
   * The approvals system used.
   */
  public enum ServiceKindEnum {
    LAUNCHDARKLY("launchdarkly"),
    
    SERVICE_NOW("service-now");

    private String value;

    ServiceKindEnum(String value) {
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
    public static ServiceKindEnum fromValue(String value) {
      for (ServiceKindEnum b : ServiceKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ServiceKindEnum serviceKind;

  public EnvironmentApprovalSettings canApplyDeclinedChanges(Boolean canApplyDeclinedChanges) {
    this.canApplyDeclinedChanges = canApplyDeclinedChanges;
    return this;
  }

  /**
   * Whether changes can be applied as long as minNumApprovals is met, regardless of if any reviewers have declined a request.
   * @return canApplyDeclinedChanges
  */
  
  @Schema(name = "canApplyDeclinedChanges", description = "Whether changes can be applied as long as minNumApprovals is met, regardless of if any reviewers have declined a request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canApplyDeclinedChanges")
  public Boolean getCanApplyDeclinedChanges() {
    return canApplyDeclinedChanges;
  }

  public void setCanApplyDeclinedChanges(Boolean canApplyDeclinedChanges) {
    this.canApplyDeclinedChanges = canApplyDeclinedChanges;
  }

  public EnvironmentApprovalSettings canReviewOwnRequest(Boolean canReviewOwnRequest) {
    this.canReviewOwnRequest = canReviewOwnRequest;
    return this;
  }

  /**
   * Whether requesters can approve or decline their own request. They may always comment.
   * @return canReviewOwnRequest
  */
  
  @Schema(name = "canReviewOwnRequest", description = "Whether requesters can approve or decline their own request. They may always comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canReviewOwnRequest")
  public Boolean getCanReviewOwnRequest() {
    return canReviewOwnRequest;
  }

  public void setCanReviewOwnRequest(Boolean canReviewOwnRequest) {
    this.canReviewOwnRequest = canReviewOwnRequest;
  }

  public EnvironmentApprovalSettings minNumApprovals(Long minNumApprovals) {
    this.minNumApprovals = minNumApprovals;
    return this;
  }

  /**
   * The number of approvals required before an approval request can be applied.
   * @return minNumApprovals
  */
  
  @Schema(name = "minNumApprovals", example = "2", description = "The number of approvals required before an approval request can be applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minNumApprovals")
  public Long getMinNumApprovals() {
    return minNumApprovals;
  }

  public void setMinNumApprovals(Long minNumApprovals) {
    this.minNumApprovals = minNumApprovals;
  }

  public EnvironmentApprovalSettings required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether any changes to flags in this environment will require approval. You may only set required or requiredApprovalTags, not both.
   * @return required
  */
  
  @Schema(name = "required", description = "Whether any changes to flags in this environment will require approval. You may only set required or requiredApprovalTags, not both.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public EnvironmentApprovalSettings requiredApprovalTags(List<String> requiredApprovalTags) {
    this.requiredApprovalTags = requiredApprovalTags;
    return this;
  }

  public EnvironmentApprovalSettings addRequiredApprovalTagsItem(String requiredApprovalTagsItem) {
    if (this.requiredApprovalTags == null) {
      this.requiredApprovalTags = new ArrayList<>();
    }
    this.requiredApprovalTags.add(requiredApprovalTagsItem);
    return this;
  }

  /**
   * An array of tags used to specify which flags with those tags require approval. You may only set requiredApprovalTags or required, not both.
   * @return requiredApprovalTags
  */
  
  @Schema(name = "requiredApprovalTags", description = "An array of tags used to specify which flags with those tags require approval. You may only set requiredApprovalTags or required, not both.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredApprovalTags")
  public List<String> getRequiredApprovalTags() {
    return requiredApprovalTags;
  }

  public void setRequiredApprovalTags(List<String> requiredApprovalTags) {
    this.requiredApprovalTags = requiredApprovalTags;
  }

  public EnvironmentApprovalSettings serviceKind(ServiceKindEnum serviceKind) {
    this.serviceKind = serviceKind;
    return this;
  }

  /**
   * The approvals system used.
   * @return serviceKind
  */
  
  @Schema(name = "serviceKind", description = "The approvals system used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceKind")
  public ServiceKindEnum getServiceKind() {
    return serviceKind;
  }

  public void setServiceKind(ServiceKindEnum serviceKind) {
    this.serviceKind = serviceKind;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentApprovalSettings environmentApprovalSettings = (EnvironmentApprovalSettings) o;
    return Objects.equals(this.canApplyDeclinedChanges, environmentApprovalSettings.canApplyDeclinedChanges) &&
        Objects.equals(this.canReviewOwnRequest, environmentApprovalSettings.canReviewOwnRequest) &&
        Objects.equals(this.minNumApprovals, environmentApprovalSettings.minNumApprovals) &&
        Objects.equals(this.required, environmentApprovalSettings.required) &&
        Objects.equals(this.requiredApprovalTags, environmentApprovalSettings.requiredApprovalTags) &&
        Objects.equals(this.serviceKind, environmentApprovalSettings.serviceKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canApplyDeclinedChanges, canReviewOwnRequest, minNumApprovals, required, requiredApprovalTags, serviceKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentApprovalSettings {\n");
    sb.append("    canApplyDeclinedChanges: ").append(toIndentedString(canApplyDeclinedChanges)).append("\n");
    sb.append("    canReviewOwnRequest: ").append(toIndentedString(canReviewOwnRequest)).append("\n");
    sb.append("    minNumApprovals: ").append(toIndentedString(minNumApprovals)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredApprovalTags: ").append(toIndentedString(requiredApprovalTags)).append("\n");
    sb.append("    serviceKind: ").append(toIndentedString(serviceKind)).append("\n");
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

