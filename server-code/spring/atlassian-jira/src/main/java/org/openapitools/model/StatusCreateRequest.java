package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StatusCreate;
import org.openapitools.model.StatusScope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the statuses being created and their scope.
 */

@Schema(name = "StatusCreateRequest", description = "Details of the statuses being created and their scope.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusCreateRequest {

  private StatusScope scope;

  @Valid
  private List<@Valid StatusCreate> statuses = new ArrayList<>();

  public StatusCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusCreateRequest(StatusScope scope, List<@Valid StatusCreate> statuses) {
    this.scope = scope;
    this.statuses = statuses;
  }

  public StatusCreateRequest scope(StatusScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @NotNull @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scope")
  public StatusScope getScope() {
    return scope;
  }

  public void setScope(StatusScope scope) {
    this.scope = scope;
  }

  public StatusCreateRequest statuses(List<@Valid StatusCreate> statuses) {
    this.statuses = statuses;
    return this;
  }

  public StatusCreateRequest addStatusesItem(StatusCreate statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Details of the statuses being created.
   * @return statuses
  */
  @NotNull @Valid 
  @Schema(name = "statuses", description = "Details of the statuses being created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid StatusCreate> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid StatusCreate> statuses) {
    this.statuses = statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCreateRequest statusCreateRequest = (StatusCreateRequest) o;
    return Objects.equals(this.scope, statusCreateRequest.scope) &&
        Objects.equals(this.statuses, statusCreateRequest.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCreateRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

