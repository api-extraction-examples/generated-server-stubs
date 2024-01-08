package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ID of a registered webhook or error messages explaining why a webhook wasn&#39;t registered.
 */

@Schema(name = "RegisteredWebhook", description = "ID of a registered webhook or error messages explaining why a webhook wasn't registered.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RegisteredWebhook {

  private Long createdWebhookId;

  @Valid
  private List<String> errors;

  public RegisteredWebhook createdWebhookId(Long createdWebhookId) {
    this.createdWebhookId = createdWebhookId;
    return this;
  }

  /**
   * The ID of the webhook. Returned if the webhook is created.
   * @return createdWebhookId
  */
  
  @Schema(name = "createdWebhookId", description = "The ID of the webhook. Returned if the webhook is created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdWebhookId")
  public Long getCreatedWebhookId() {
    return createdWebhookId;
  }

  public void setCreatedWebhookId(Long createdWebhookId) {
    this.createdWebhookId = createdWebhookId;
  }

  public RegisteredWebhook errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public RegisteredWebhook addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Error messages specifying why the webhook creation failed.
   * @return errors
  */
  
  @Schema(name = "errors", description = "Error messages specifying why the webhook creation failed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredWebhook registeredWebhook = (RegisteredWebhook) o;
    return Objects.equals(this.createdWebhookId, registeredWebhook.createdWebhookId) &&
        Objects.equals(this.errors, registeredWebhook.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdWebhookId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredWebhook {\n");
    sb.append("    createdWebhookId: ").append(toIndentedString(createdWebhookId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

