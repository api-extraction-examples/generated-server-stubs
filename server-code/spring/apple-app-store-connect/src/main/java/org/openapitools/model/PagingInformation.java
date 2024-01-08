package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PagingInformationPaging;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PagingInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class PagingInformation {

  private PagingInformationPaging paging;

  public PagingInformation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PagingInformation(PagingInformationPaging paging) {
    this.paging = paging;
  }

  public PagingInformation paging(PagingInformationPaging paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
  */
  @NotNull @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paging")
  public PagingInformationPaging getPaging() {
    return paging;
  }

  public void setPaging(PagingInformationPaging paging) {
    this.paging = paging;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingInformation pagingInformation = (PagingInformation) o;
    return Objects.equals(this.paging, pagingInformation.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingInformation {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

