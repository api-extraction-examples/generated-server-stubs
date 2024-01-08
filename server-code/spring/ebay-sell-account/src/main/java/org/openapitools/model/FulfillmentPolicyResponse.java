package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FulfillmentPolicy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The response payload for the &lt;b&gt;getFulfillmentPolicies&lt;/b&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Pagination has not yet been enabled for &lt;b&gt;getFulfillmentPolicies&lt;/b&gt;, so all of the pagination-related fields are for future use.&lt;/span&gt;
 */

@Schema(name = "FulfillmentPolicyResponse", description = "The response payload for the <b>getFulfillmentPolicies</b> method.<br /><br /><span class=\"tablenote\"><b>Note</b>: Pagination has not yet been enabled for <b>getFulfillmentPolicies</b>, so all of the pagination-related fields are for future use.</span>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class FulfillmentPolicyResponse {

  @Valid
  private List<@Valid FulfillmentPolicy> fulfillmentPolicies;

  private String href;

  private Integer limit;

  private String next;

  private Integer offset;

  private String prev;

  private Integer total;

  public FulfillmentPolicyResponse fulfillmentPolicies(List<@Valid FulfillmentPolicy> fulfillmentPolicies) {
    this.fulfillmentPolicies = fulfillmentPolicies;
    return this;
  }

  public FulfillmentPolicyResponse addFulfillmentPoliciesItem(FulfillmentPolicy fulfillmentPoliciesItem) {
    if (this.fulfillmentPolicies == null) {
      this.fulfillmentPolicies = new ArrayList<>();
    }
    this.fulfillmentPolicies.add(fulfillmentPoliciesItem);
    return this;
  }

  /**
   * A list of all of the seller's fulfillment policies defined for the specified marketplace. This array will be returned as empty if no fulfillment policies are defined for the specified marketplace.
   * @return fulfillmentPolicies
  */
  @Valid 
  @Schema(name = "fulfillmentPolicies", description = "A list of all of the seller's fulfillment policies defined for the specified marketplace. This array will be returned as empty if no fulfillment policies are defined for the specified marketplace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulfillmentPolicies")
  public List<@Valid FulfillmentPolicy> getFulfillmentPolicies() {
    return fulfillmentPolicies;
  }

  public void setFulfillmentPolicies(List<@Valid FulfillmentPolicy> fulfillmentPolicies) {
    this.fulfillmentPolicies = fulfillmentPolicies;
  }

  public FulfillmentPolicyResponse href(String href) {
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

  public FulfillmentPolicyResponse limit(Integer limit) {
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

  public FulfillmentPolicyResponse next(String next) {
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

  public FulfillmentPolicyResponse offset(Integer offset) {
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

  public FulfillmentPolicyResponse prev(String prev) {
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

  public FulfillmentPolicyResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of fulfillment policies retrieved in the result set.  <br/><br/>If no fulfillment policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.
   * @return total
  */
  
  @Schema(name = "total", description = "The total number of fulfillment policies retrieved in the result set.  <br/><br/>If no fulfillment policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    FulfillmentPolicyResponse fulfillmentPolicyResponse = (FulfillmentPolicyResponse) o;
    return Objects.equals(this.fulfillmentPolicies, fulfillmentPolicyResponse.fulfillmentPolicies) &&
        Objects.equals(this.href, fulfillmentPolicyResponse.href) &&
        Objects.equals(this.limit, fulfillmentPolicyResponse.limit) &&
        Objects.equals(this.next, fulfillmentPolicyResponse.next) &&
        Objects.equals(this.offset, fulfillmentPolicyResponse.offset) &&
        Objects.equals(this.prev, fulfillmentPolicyResponse.prev) &&
        Objects.equals(this.total, fulfillmentPolicyResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentPolicies, href, limit, next, offset, prev, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentPolicyResponse {\n");
    sb.append("    fulfillmentPolicies: ").append(toIndentedString(fulfillmentPolicies)).append("\n");
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

