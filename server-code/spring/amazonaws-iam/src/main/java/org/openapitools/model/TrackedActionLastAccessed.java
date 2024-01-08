package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains details about the most recent attempt to access an action within the service.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetServiceLastAccessedDetails&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "TrackedActionLastAccessed", description = "<p>Contains details about the most recent attempt to access an action within the service.</p> <p>This data type is used as a response element in the <a>GetServiceLastAccessedDetails</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class TrackedActionLastAccessed {

  private String actionName;

  private String lastAccessedEntity;

  private OffsetDateTime lastAccessedTime;

  private String lastAccessedRegion;

  public TrackedActionLastAccessed actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

  /**
   * Get actionName
   * @return actionName
  */
  
  @Schema(name = "ActionName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ActionName")
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public TrackedActionLastAccessed lastAccessedEntity(String lastAccessedEntity) {
    this.lastAccessedEntity = lastAccessedEntity;
    return this;
  }

  /**
   * <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
   * @return lastAccessedEntity
  */
  @Size(min = 20, max = 2048) 
  @Schema(name = "LastAccessedEntity", description = "<p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAccessedEntity")
  public String getLastAccessedEntity() {
    return lastAccessedEntity;
  }

  public void setLastAccessedEntity(String lastAccessedEntity) {
    this.lastAccessedEntity = lastAccessedEntity;
  }

  public TrackedActionLastAccessed lastAccessedTime(OffsetDateTime lastAccessedTime) {
    this.lastAccessedTime = lastAccessedTime;
    return this;
  }

  /**
   * Get lastAccessedTime
   * @return lastAccessedTime
  */
  @Valid 
  @Schema(name = "LastAccessedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAccessedTime")
  public OffsetDateTime getLastAccessedTime() {
    return lastAccessedTime;
  }

  public void setLastAccessedTime(OffsetDateTime lastAccessedTime) {
    this.lastAccessedTime = lastAccessedTime;
  }

  public TrackedActionLastAccessed lastAccessedRegion(String lastAccessedRegion) {
    this.lastAccessedRegion = lastAccessedRegion;
    return this;
  }

  /**
   * Get lastAccessedRegion
   * @return lastAccessedRegion
  */
  
  @Schema(name = "LastAccessedRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastAccessedRegion")
  public String getLastAccessedRegion() {
    return lastAccessedRegion;
  }

  public void setLastAccessedRegion(String lastAccessedRegion) {
    this.lastAccessedRegion = lastAccessedRegion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedActionLastAccessed trackedActionLastAccessed = (TrackedActionLastAccessed) o;
    return Objects.equals(this.actionName, trackedActionLastAccessed.actionName) &&
        Objects.equals(this.lastAccessedEntity, trackedActionLastAccessed.lastAccessedEntity) &&
        Objects.equals(this.lastAccessedTime, trackedActionLastAccessed.lastAccessedTime) &&
        Objects.equals(this.lastAccessedRegion, trackedActionLastAccessed.lastAccessedRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, lastAccessedEntity, lastAccessedTime, lastAccessedRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedActionLastAccessed {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    lastAccessedEntity: ").append(toIndentedString(lastAccessedEntity)).append("\n");
    sb.append("    lastAccessedTime: ").append(toIndentedString(lastAccessedTime)).append("\n");
    sb.append("    lastAccessedRegion: ").append(toIndentedString(lastAccessedRegion)).append("\n");
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

