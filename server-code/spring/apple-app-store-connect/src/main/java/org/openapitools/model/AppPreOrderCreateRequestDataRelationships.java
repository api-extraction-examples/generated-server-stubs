package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppPreOrderCreateRequestDataRelationshipsApp;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreOrderCreateRequestDataRelationships
 */

@JsonTypeName("AppPreOrderCreateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreOrderCreateRequestDataRelationships {

  private AppPreOrderCreateRequestDataRelationshipsApp app;

  public AppPreOrderCreateRequestDataRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreOrderCreateRequestDataRelationships(AppPreOrderCreateRequestDataRelationshipsApp app) {
    this.app = app;
  }

  public AppPreOrderCreateRequestDataRelationships app(AppPreOrderCreateRequestDataRelationshipsApp app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
  */
  @NotNull @Valid 
  @Schema(name = "app", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("app")
  public AppPreOrderCreateRequestDataRelationshipsApp getApp() {
    return app;
  }

  public void setApp(AppPreOrderCreateRequestDataRelationshipsApp app) {
    this.app = app;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreOrderCreateRequestDataRelationships appPreOrderCreateRequestDataRelationships = (AppPreOrderCreateRequestDataRelationships) o;
    return Objects.equals(this.app, appPreOrderCreateRequestDataRelationships.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreOrderCreateRequestDataRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

