package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ListCredentialResponseMeta;
import org.openapitools.model.NotifyV1ServiceBinding;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListBindingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:49.917798-04:00[America/Lower_Princes]")
public class ListBindingResponse {

  @Valid
  private List<@Valid NotifyV1ServiceBinding> bindings;

  private ListCredentialResponseMeta meta;

  public ListBindingResponse bindings(List<@Valid NotifyV1ServiceBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public ListBindingResponse addBindingsItem(NotifyV1ServiceBinding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<>();
    }
    this.bindings.add(bindingsItem);
    return this;
  }

  /**
   * Get bindings
   * @return bindings
  */
  @Valid 
  @Schema(name = "bindings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bindings")
  public List<@Valid NotifyV1ServiceBinding> getBindings() {
    return bindings;
  }

  public void setBindings(List<@Valid NotifyV1ServiceBinding> bindings) {
    this.bindings = bindings;
  }

  public ListBindingResponse meta(ListCredentialResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public ListCredentialResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ListCredentialResponseMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBindingResponse listBindingResponse = (ListBindingResponse) o;
    return Objects.equals(this.bindings, listBindingResponse.bindings) &&
        Objects.equals(this.meta, listBindingResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBindingResponse {\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

