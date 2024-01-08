package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ErrorParameter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A container that defines the elements of error and warning messages.
 */

@Schema(name = "Error", description = "A container that defines the elements of error and warning messages.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class Error {

  private String category;

  private String domain;

  private Integer errorId;

  @Valid
  private List<String> inputRefIds;

  private String longMessage;

  private String message;

  @Valid
  private List<String> outputRefIds;

  @Valid
  private List<@Valid ErrorParameter> parameters;

  private String subdomain;

  public Error category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category type for this error or warning. It is a string that can have one of three values:<ul><li><code>Application</code>: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service's business logic, system failures, or request errors from a dependency.</li><li><code>Business</code>: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as \"Seller does not ship item to Antarctica\" or \"Buyer ineligible to purchase an alcoholic item\". Business errors are not syntactical input errors.</li><li><code>Request</code>: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.</li></ul>
   * @return category
  */
  
  @Schema(name = "category", description = "The category type for this error or warning. It is a string that can have one of three values:<ul><li><code>Application</code>: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service's business logic, system failures, or request errors from a dependency.</li><li><code>Business</code>: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as \"Seller does not ship item to Antarctica\" or \"Buyer ineligible to purchase an alcoholic item\". Business errors are not syntactical input errors.</li><li><code>Request</code>: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.</li></ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Error domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Name of the domain ,or primary system, of the service or application where the error occurred.
   * @return domain
  */
  
  @Schema(name = "domain", description = "Name of the domain ,or primary system, of the service or application where the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public Error errorId(Integer errorId) {
    this.errorId = errorId;
    return this;
  }

  /**
   * A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.
   * @return errorId
  */
  
  @Schema(name = "errorId", description = "A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorId")
  public Integer getErrorId() {
    return errorId;
  }

  public void setErrorId(Integer errorId) {
    this.errorId = errorId;
  }

  public Error inputRefIds(List<String> inputRefIds) {
    this.inputRefIds = inputRefIds;
    return this;
  }

  public Error addInputRefIdsItem(String inputRefIdsItem) {
    if (this.inputRefIds == null) {
      this.inputRefIds = new ArrayList<>();
    }
    this.inputRefIds.add(inputRefIdsItem);
    return this;
  }

  /**
   * Identifies specific request elements associated with the error, if any. inputRefId's response is format specific. For JSON, use <i>JSONPath</i> notation.
   * @return inputRefIds
  */
  
  @Schema(name = "inputRefIds", description = "Identifies specific request elements associated with the error, if any. inputRefId's response is format specific. For JSON, use <i>JSONPath</i> notation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inputRefIds")
  public List<String> getInputRefIds() {
    return inputRefIds;
  }

  public void setInputRefIds(List<String> inputRefIds) {
    this.inputRefIds = inputRefIds;
  }

  public Error longMessage(String longMessage) {
    this.longMessage = longMessage;
    return this;
  }

  /**
   * A more detailed explanation of the error than given in the <code>message</code> error field.
   * @return longMessage
  */
  
  @Schema(name = "longMessage", description = "A more detailed explanation of the error than given in the <code>message</code> error field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longMessage")
  public String getLongMessage() {
    return longMessage;
  }

  public void setLongMessage(String longMessage) {
    this.longMessage = longMessage;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Information on how to correct the problem, in the end user's terms and language where applicable. Its value is at most 50 characters long. If applicable, the value is localized in the end user's requested locale.
   * @return message
  */
  
  @Schema(name = "message", description = "Information on how to correct the problem, in the end user's terms and language where applicable. Its value is at most 50 characters long. If applicable, the value is localized in the end user's requested locale.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error outputRefIds(List<String> outputRefIds) {
    this.outputRefIds = outputRefIds;
    return this;
  }

  public Error addOutputRefIdsItem(String outputRefIdsItem) {
    if (this.outputRefIds == null) {
      this.outputRefIds = new ArrayList<>();
    }
    this.outputRefIds.add(outputRefIdsItem);
    return this;
  }

  /**
   * Identifies specific response elements associated with the error, if any. Path format is the same as <code>inputRefId</code>.
   * @return outputRefIds
  */
  
  @Schema(name = "outputRefIds", description = "Identifies specific response elements associated with the error, if any. Path format is the same as <code>inputRefId</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputRefIds")
  public List<String> getOutputRefIds() {
    return outputRefIds;
  }

  public void setOutputRefIds(List<String> outputRefIds) {
    this.outputRefIds = outputRefIds;
  }

  public Error parameters(List<@Valid ErrorParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Error addParametersItem(ErrorParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * This optional list of name/value pairs that contain context-specific <code>ErrorParameter</code> objects, with each item in the list being a parameter (or input field name) that caused an error condition. Each <code>ErrorParameter</code> object consists of two fields, a <code>name</code> and a <code>value</code>.
   * @return parameters
  */
  @Valid 
  @Schema(name = "parameters", description = "This optional list of name/value pairs that contain context-specific <code>ErrorParameter</code> objects, with each item in the list being a parameter (or input field name) that caused an error condition. Each <code>ErrorParameter</code> object consists of two fields, a <code>name</code> and a <code>value</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public List<@Valid ErrorParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<@Valid ErrorParameter> parameters) {
    this.parameters = parameters;
  }

  public Error subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

  /**
   * If present, indicates the subsystem in which the error occurred.
   * @return subdomain
  */
  
  @Schema(name = "subdomain", description = "If present, indicates the subsystem in which the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subdomain")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.category, error.category) &&
        Objects.equals(this.domain, error.domain) &&
        Objects.equals(this.errorId, error.errorId) &&
        Objects.equals(this.inputRefIds, error.inputRefIds) &&
        Objects.equals(this.longMessage, error.longMessage) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.outputRefIds, error.outputRefIds) &&
        Objects.equals(this.parameters, error.parameters) &&
        Objects.equals(this.subdomain, error.subdomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, domain, errorId, inputRefIds, longMessage, message, outputRefIds, parameters, subdomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    inputRefIds: ").append(toIndentedString(inputRefIds)).append("\n");
    sb.append("    longMessage: ").append(toIndentedString(longMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    outputRefIds: ").append(toIndentedString(outputRefIds)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
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

