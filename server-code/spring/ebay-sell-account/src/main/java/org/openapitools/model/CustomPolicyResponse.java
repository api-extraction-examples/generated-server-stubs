package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompactCustomPolicyResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomPolicyResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class CustomPolicyResponse {

  @Valid
  private List<@Valid CompactCustomPolicyResponse> customPolicies;

  private String href;

  private Integer limit;

  private String next;

  private Integer offset;

  private String prev;

  private Integer total;

  public CustomPolicyResponse customPolicies(List<@Valid CompactCustomPolicyResponse> customPolicies) {
    this.customPolicies = customPolicies;
    return this;
  }

  public CustomPolicyResponse addCustomPoliciesItem(CompactCustomPolicyResponse customPoliciesItem) {
    if (this.customPolicies == null) {
      this.customPolicies = new ArrayList<>();
    }
    this.customPolicies.add(customPoliciesItem);
    return this;
  }

  /**
   * This array contains the custom policies that match the input criteria.
   * @return customPolicies
  */
  @Valid 
  @Schema(name = "customPolicies", description = "This array contains the custom policies that match the input criteria.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customPolicies")
  public List<@Valid CompactCustomPolicyResponse> getCustomPolicies() {
    return customPolicies;
  }

  public void setCustomPolicies(List<@Valid CompactCustomPolicyResponse> customPolicies) {
    this.customPolicies = customPolicies;
  }

  public CustomPolicyResponse href(String href) {
    this.href = href;
    return this;
  }

  /**
   * <i>This field is for future use.</i>
   * @return href
  */
  
  @Schema(name = "href", description = "<i>This field is for future use.</i>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CustomPolicyResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <i>This field is for future use.</i>
   * @return limit
  */
  
  @Schema(name = "limit", description = "<i>This field is for future use.</i>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CustomPolicyResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * <i>This field is for future use.</i>
   * @return next
  */
  
  @Schema(name = "next", description = "<i>This field is for future use.</i>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public CustomPolicyResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <i>This field is for future use.</i>
   * @return offset
  */
  
  @Schema(name = "offset", description = "<i>This field is for future use.</i>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public CustomPolicyResponse prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * <i>This field is for future use.</i>
   * @return prev
  */
  
  @Schema(name = "prev", description = "<i>This field is for future use.</i>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public CustomPolicyResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * <i>This field is for future use.</i>
   * @return total
  */
  
  @Schema(name = "total", description = "<i>This field is for future use.</i>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPolicyResponse customPolicyResponse = (CustomPolicyResponse) o;
    return Objects.equals(this.customPolicies, customPolicyResponse.customPolicies) &&
        Objects.equals(this.href, customPolicyResponse.href) &&
        Objects.equals(this.limit, customPolicyResponse.limit) &&
        Objects.equals(this.next, customPolicyResponse.next) &&
        Objects.equals(this.offset, customPolicyResponse.offset) &&
        Objects.equals(this.prev, customPolicyResponse.prev) &&
        Objects.equals(this.total, customPolicyResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customPolicies, href, limit, next, offset, prev, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPolicyResponse {\n");
    sb.append("    customPolicies: ").append(toIndentedString(customPolicies)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

