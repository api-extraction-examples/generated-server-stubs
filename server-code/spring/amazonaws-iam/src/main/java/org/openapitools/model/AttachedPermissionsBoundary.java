package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PermissionsBoundaryAttachmentType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an attached permissions boundary.&lt;/p&gt; &lt;p&gt;An attached permissions boundary is a managed policy that has been attached to a user or role to set the permissions boundary.&lt;/p&gt; &lt;p&gt;For more information about permissions boundaries, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\&quot;&gt;Permissions boundaries for IAM identities &lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
 */

@Schema(name = "AttachedPermissionsBoundary", description = "<p>Contains information about an attached permissions boundary.</p> <p>An attached permissions boundary is a managed policy that has been attached to a user or role to set the permissions boundary.</p> <p>For more information about permissions boundaries, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html\">Permissions boundaries for IAM identities </a> in the <i>IAM User Guide</i>.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class AttachedPermissionsBoundary {

  private PermissionsBoundaryAttachmentType permissionsBoundaryType;

  private String permissionsBoundaryArn;

  public AttachedPermissionsBoundary permissionsBoundaryType(PermissionsBoundaryAttachmentType permissionsBoundaryType) {
    this.permissionsBoundaryType = permissionsBoundaryType;
    return this;
  }

  /**
   * Get permissionsBoundaryType
   * @return permissionsBoundaryType
  */
  @Valid 
  @Schema(name = "PermissionsBoundaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryType")
  public PermissionsBoundaryAttachmentType getPermissionsBoundaryType() {
    return permissionsBoundaryType;
  }

  public void setPermissionsBoundaryType(PermissionsBoundaryAttachmentType permissionsBoundaryType) {
    this.permissionsBoundaryType = permissionsBoundaryType;
  }

  public AttachedPermissionsBoundary permissionsBoundaryArn(String permissionsBoundaryArn) {
    this.permissionsBoundaryArn = permissionsBoundaryArn;
    return this;
  }

  /**
   * Get permissionsBoundaryArn
   * @return permissionsBoundaryArn
  */
  
  @Schema(name = "PermissionsBoundaryArn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryArn")
  public String getPermissionsBoundaryArn() {
    return permissionsBoundaryArn;
  }

  public void setPermissionsBoundaryArn(String permissionsBoundaryArn) {
    this.permissionsBoundaryArn = permissionsBoundaryArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachedPermissionsBoundary attachedPermissionsBoundary = (AttachedPermissionsBoundary) o;
    return Objects.equals(this.permissionsBoundaryType, attachedPermissionsBoundary.permissionsBoundaryType) &&
        Objects.equals(this.permissionsBoundaryArn, attachedPermissionsBoundary.permissionsBoundaryArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsBoundaryType, permissionsBoundaryArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachedPermissionsBoundary {\n");
    sb.append("    permissionsBoundaryType: ").append(toIndentedString(permissionsBoundaryType)).append("\n");
    sb.append("    permissionsBoundaryArn: ").append(toIndentedString(permissionsBoundaryArn)).append("\n");
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

