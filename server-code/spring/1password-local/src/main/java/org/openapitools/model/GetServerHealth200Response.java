package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ServiceDependency;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetServerHealth200Response
 */

@JsonTypeName("GetServerHealth_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class GetServerHealth200Response {

  @Valid
  private List<@Valid ServiceDependency> dependencies;

  private String name;

  private String version;

  public GetServerHealth200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServerHealth200Response(String name, String version) {
    this.name = name;
    this.version = version;
  }

  public GetServerHealth200Response dependencies(List<@Valid ServiceDependency> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public GetServerHealth200Response addDependenciesItem(ServiceDependency dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

  /**
   * Get dependencies
   * @return dependencies
  */
  @Valid 
  @Schema(name = "dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependencies")
  public List<@Valid ServiceDependency> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<@Valid ServiceDependency> dependencies) {
    this.dependencies = dependencies;
  }

  public GetServerHealth200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetServerHealth200Response version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The Connect server's version
   * @return version
  */
  @NotNull 
  @Schema(name = "version", description = "The Connect server's version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServerHealth200Response getServerHealth200Response = (GetServerHealth200Response) o;
    return Objects.equals(this.dependencies, getServerHealth200Response.dependencies) &&
        Objects.equals(this.name, getServerHealth200Response.name) &&
        Objects.equals(this.version, getServerHealth200Response.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServerHealth200Response {\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

