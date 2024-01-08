package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UiModificationContextDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of a UI modification.
 */

@Schema(name = "CreateUiModificationDetails", description = "The details of a UI modification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateUiModificationDetails {

  @Valid
  private List<@Valid UiModificationContextDetails> contexts;

  private String data;

  private String description;

  private String name;

  public CreateUiModificationDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUiModificationDetails(String name) {
    this.name = name;
  }

  public CreateUiModificationDetails contexts(List<@Valid UiModificationContextDetails> contexts) {
    this.contexts = contexts;
    return this;
  }

  public CreateUiModificationDetails addContextsItem(UiModificationContextDetails contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

  /**
   * List of contexts of the UI modification. The maximum number of contexts is 1000.
   * @return contexts
  */
  @Valid 
  @Schema(name = "contexts", description = "List of contexts of the UI modification. The maximum number of contexts is 1000.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contexts")
  public List<@Valid UiModificationContextDetails> getContexts() {
    return contexts;
  }

  public void setContexts(List<@Valid UiModificationContextDetails> contexts) {
    this.contexts = contexts;
  }

  public CreateUiModificationDetails data(String data) {
    this.data = data;
    return this;
  }

  /**
   * The data of the UI modification. The maximum size of the data is 50000 characters.
   * @return data
  */
  
  @Schema(name = "data", description = "The data of the UI modification. The maximum size of the data is 50000 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public CreateUiModificationDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the UI modification. The maximum length is 255 characters.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the UI modification. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateUiModificationDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the UI modification. The maximum length is 255 characters.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the UI modification. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUiModificationDetails createUiModificationDetails = (CreateUiModificationDetails) o;
    return Objects.equals(this.contexts, createUiModificationDetails.contexts) &&
        Objects.equals(this.data, createUiModificationDetails.data) &&
        Objects.equals(this.description, createUiModificationDetails.description) &&
        Objects.equals(this.name, createUiModificationDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts, data, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUiModificationDetails {\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

