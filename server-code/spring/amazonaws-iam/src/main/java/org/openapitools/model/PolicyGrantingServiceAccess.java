package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PolicyOwnerEntityType;
import org.openapitools.model.PolicyType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains details about the permissions policies that are attached to the specified identity (user, group, or role).&lt;/p&gt; &lt;p&gt;This data type is an element of the &lt;a&gt;ListPoliciesGrantingServiceAccessEntry&lt;/a&gt; object.&lt;/p&gt;
 */

@Schema(name = "PolicyGrantingServiceAccess", description = "<p>Contains details about the permissions policies that are attached to the specified identity (user, group, or role).</p> <p>This data type is an element of the <a>ListPoliciesGrantingServiceAccessEntry</a> object.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PolicyGrantingServiceAccess {

  private String policyName;

  private PolicyType policyType;

  private String policyArn;

  private PolicyOwnerEntityType entityType;

  private String entityName;

  public PolicyGrantingServiceAccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PolicyGrantingServiceAccess(String policyName, PolicyType policyType) {
    this.policyName = policyName;
    this.policyType = policyType;
  }

  public PolicyGrantingServiceAccess policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
  @NotNull 
  @Schema(name = "PolicyName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyName")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public PolicyGrantingServiceAccess policyType(PolicyType policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * Get policyType
   * @return policyType
  */
  @NotNull @Valid 
  @Schema(name = "PolicyType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyType")
  public PolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(PolicyType policyType) {
    this.policyType = policyType;
  }

  public PolicyGrantingServiceAccess policyArn(String policyArn) {
    this.policyArn = policyArn;
    return this;
  }

  /**
   * <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
   * @return policyArn
  */
  @Size(min = 20, max = 2048) 
  @Schema(name = "PolicyArn", description = "<p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyArn")
  public String getPolicyArn() {
    return policyArn;
  }

  public void setPolicyArn(String policyArn) {
    this.policyArn = policyArn;
  }

  public PolicyGrantingServiceAccess entityType(PolicyOwnerEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
  */
  @Valid 
  @Schema(name = "EntityType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EntityType")
  public PolicyOwnerEntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(PolicyOwnerEntityType entityType) {
    this.entityType = entityType;
  }

  public PolicyGrantingServiceAccess entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
  */
  
  @Schema(name = "EntityName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EntityName")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyGrantingServiceAccess policyGrantingServiceAccess = (PolicyGrantingServiceAccess) o;
    return Objects.equals(this.policyName, policyGrantingServiceAccess.policyName) &&
        Objects.equals(this.policyType, policyGrantingServiceAccess.policyType) &&
        Objects.equals(this.policyArn, policyGrantingServiceAccess.policyArn) &&
        Objects.equals(this.entityType, policyGrantingServiceAccess.entityType) &&
        Objects.equals(this.entityName, policyGrantingServiceAccess.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, policyType, policyArn, entityType, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyGrantingServiceAccess {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    policyArn: ").append(toIndentedString(policyArn)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

