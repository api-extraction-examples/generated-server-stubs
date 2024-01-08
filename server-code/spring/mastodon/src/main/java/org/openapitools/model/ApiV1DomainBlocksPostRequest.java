package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1DomainBlocksPostRequest
 */

@JsonTypeName("_api_v1_domain_blocks_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1DomainBlocksPostRequest {

  private String domain;

  public ApiV1DomainBlocksPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1DomainBlocksPostRequest(String domain) {
    this.domain = domain;
  }

  public ApiV1DomainBlocksPostRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Domain to block.
   * @return domain
  */
  @NotNull 
  @Schema(name = "domain", description = "Domain to block.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1DomainBlocksPostRequest apiV1DomainBlocksPostRequest = (ApiV1DomainBlocksPostRequest) o;
    return Objects.equals(this.domain, apiV1DomainBlocksPostRequest.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1DomainBlocksPostRequest {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

