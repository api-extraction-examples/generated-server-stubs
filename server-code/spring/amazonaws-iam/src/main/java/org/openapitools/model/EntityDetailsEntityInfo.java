package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PolicyOwnerEntityType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EntityDetailsEntityInfo
 */

@JsonTypeName("EntityDetails_EntityInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class EntityDetailsEntityInfo {

  private String arn;

  private String name;

  private PolicyOwnerEntityType type;

  private String id;

  private String path;

  public EntityDetailsEntityInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntityDetailsEntityInfo(String arn, String name, PolicyOwnerEntityType type, String id) {
    this.arn = arn;
    this.name = name;
    this.type = type;
    this.id = id;
  }

  public EntityDetailsEntityInfo arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
   * @return arn
  */
  @NotNull @Size(min = 20, max = 2048) 
  @Schema(name = "Arn", description = "<p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public EntityDetailsEntityInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntityDetailsEntityInfo type(PolicyOwnerEntityType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public PolicyOwnerEntityType getType() {
    return type;
  }

  public void setType(PolicyOwnerEntityType type) {
    this.type = type;
  }

  public EntityDetailsEntityInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityDetailsEntityInfo path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDetailsEntityInfo entityDetailsEntityInfo = (EntityDetailsEntityInfo) o;
    return Objects.equals(this.arn, entityDetailsEntityInfo.arn) &&
        Objects.equals(this.name, entityDetailsEntityInfo.name) &&
        Objects.equals(this.type, entityDetailsEntityInfo.type) &&
        Objects.equals(this.id, entityDetailsEntityInfo.id) &&
        Objects.equals(this.path, entityDetailsEntityInfo.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, name, type, id, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDetailsEntityInfo {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

