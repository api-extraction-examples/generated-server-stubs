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
 * The details of the available dashboard gadget.
 */

@Schema(name = "AvailableDashboardGadget", description = "The details of the available dashboard gadget.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AvailableDashboardGadget {

  private String moduleKey;

  private String title;

  private String uri;

  public AvailableDashboardGadget() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AvailableDashboardGadget(String title) {
    this.title = title;
  }

  public AvailableDashboardGadget moduleKey(String moduleKey) {
    this.moduleKey = moduleKey;
    return this;
  }

  /**
   * The module key of the gadget type.
   * @return moduleKey
  */
  
  @Schema(name = "moduleKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The module key of the gadget type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moduleKey")
  public String getModuleKey() {
    return moduleKey;
  }

  public void setModuleKey(String moduleKey) {
    this.moduleKey = moduleKey;
  }

  public AvailableDashboardGadget title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the gadget.
   * @return title
  */
  
  @Schema(name = "title", accessMode = Schema.AccessMode.READ_ONLY, description = "The title of the gadget.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AvailableDashboardGadget uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The URI of the gadget type.
   * @return uri
  */
  
  @Schema(name = "uri", accessMode = Schema.AccessMode.READ_ONLY, description = "The URI of the gadget type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableDashboardGadget availableDashboardGadget = (AvailableDashboardGadget) o;
    return Objects.equals(this.moduleKey, availableDashboardGadget.moduleKey) &&
        Objects.equals(this.title, availableDashboardGadget.title) &&
        Objects.equals(this.uri, availableDashboardGadget.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleKey, title, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableDashboardGadget {\n");
    sb.append("    moduleKey: ").append(toIndentedString(moduleKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

