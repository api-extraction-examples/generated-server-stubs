package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ReturnPolicy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The response payload for the &lt;b&gt;getReturnPolicies&lt;/b&gt; method. &lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Pagination has not yet been enabled for &lt;b&gt;getReturnPolicies&lt;/b&gt;, so all of the pagination-related fields are for future use.&lt;/span&gt;
 */

@Schema(name = "ReturnPolicyResponse", description = "The response payload for the <b>getReturnPolicies</b> method. <br /><br /><span class=\"tablenote\"><b>Note</b>: Pagination has not yet been enabled for <b>getReturnPolicies</b>, so all of the pagination-related fields are for future use.</span>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class ReturnPolicyResponse {

  private String href;

  private Integer limit;

  private String next;

  private Integer offset;

  private String prev;

  @Valid
  private List<@Valid ReturnPolicy> returnPolicies;

  private Integer total;

  public ReturnPolicyResponse href(String href) {
    this.href = href;
    return this;
  }

  /**
   * This field is for future use.
   * @return href
  */
  
  @Schema(name = "href", description = "This field is for future use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ReturnPolicyResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * This field is for future use.
   * @return limit
  */
  
  @Schema(name = "limit", description = "This field is for future use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ReturnPolicyResponse next(String next) {
    this.next = next;
    return this;
  }

  /**
   * This field is for future use.
   * @return next
  */
  
  @Schema(name = "next", description = "This field is for future use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public ReturnPolicyResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * This field is for future use.
   * @return offset
  */
  
  @Schema(name = "offset", description = "This field is for future use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ReturnPolicyResponse prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * This field is for future use.
   * @return prev
  */
  
  @Schema(name = "prev", description = "This field is for future use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public ReturnPolicyResponse returnPolicies(List<@Valid ReturnPolicy> returnPolicies) {
    this.returnPolicies = returnPolicies;
    return this;
  }

  public ReturnPolicyResponse addReturnPoliciesItem(ReturnPolicy returnPoliciesItem) {
    if (this.returnPolicies == null) {
      this.returnPolicies = new ArrayList<>();
    }
    this.returnPolicies.add(returnPoliciesItem);
    return this;
  }

  /**
   * A list of all of the seller's return business policies defined for the specified marketplace. This array will be returned as empty if no return business policies are defined for the specified marketplace.
   * @return returnPolicies
  */
  @Valid 
  @Schema(name = "returnPolicies", description = "A list of all of the seller's return business policies defined for the specified marketplace. This array will be returned as empty if no return business policies are defined for the specified marketplace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnPolicies")
  public List<@Valid ReturnPolicy> getReturnPolicies() {
    return returnPolicies;
  }

  public void setReturnPolicies(List<@Valid ReturnPolicy> returnPolicies) {
    this.returnPolicies = returnPolicies;
  }

  public ReturnPolicyResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of return business policies retrieved in the result set.  <br/><br/>If no return business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.
   * @return total
  */
  
  @Schema(name = "total", description = "The total number of return business policies retrieved in the result set.  <br/><br/>If no return business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ReturnPolicyResponse returnPolicyResponse = (ReturnPolicyResponse) o;
    return Objects.equals(this.href, returnPolicyResponse.href) &&
        Objects.equals(this.limit, returnPolicyResponse.limit) &&
        Objects.equals(this.next, returnPolicyResponse.next) &&
        Objects.equals(this.offset, returnPolicyResponse.offset) &&
        Objects.equals(this.prev, returnPolicyResponse.prev) &&
        Objects.equals(this.returnPolicies, returnPolicyResponse.returnPolicies) &&
        Objects.equals(this.total, returnPolicyResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, offset, prev, returnPolicies, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicyResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    returnPolicies: ").append(toIndentedString(returnPolicies)).append("\n");
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

