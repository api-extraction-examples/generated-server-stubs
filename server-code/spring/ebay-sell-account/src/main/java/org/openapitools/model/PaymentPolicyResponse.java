package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PaymentPolicy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The response payload for the &lt;b&gt;getPaymentPolicies&lt;/b&gt; method. &lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Pagination has not yet been enabled for &lt;b&gt;getPaymentPolicies&lt;/b&gt;, so all of the pagination-related fields are for future use.&lt;/span&gt;
 */

@Schema(name = "PaymentPolicyResponse", description = "The response payload for the <b>getPaymentPolicies</b> method. <br /><br /><span class=\"tablenote\"><b>Note</b>: Pagination has not yet been enabled for <b>getPaymentPolicies</b>, so all of the pagination-related fields are for future use.</span>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentPolicyResponse {

  private String href;

  private Integer limit;

  private String next;

  private Integer offset;

  @Valid
  private List<@Valid PaymentPolicy> paymentPolicies;

  private String prev;

  private Integer total;

  public PaymentPolicyResponse href(String href) {
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

  public PaymentPolicyResponse limit(Integer limit) {
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

  public PaymentPolicyResponse next(String next) {
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

  public PaymentPolicyResponse offset(Integer offset) {
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

  public PaymentPolicyResponse paymentPolicies(List<@Valid PaymentPolicy> paymentPolicies) {
    this.paymentPolicies = paymentPolicies;
    return this;
  }

  public PaymentPolicyResponse addPaymentPoliciesItem(PaymentPolicy paymentPoliciesItem) {
    if (this.paymentPolicies == null) {
      this.paymentPolicies = new ArrayList<>();
    }
    this.paymentPolicies.add(paymentPoliciesItem);
    return this;
  }

  /**
   * A list of all of the seller's payment business policies defined for the specified marketplace. This array will be returned as empty if no payment business policies are defined for the specified marketplace.
   * @return paymentPolicies
  */
  @Valid 
  @Schema(name = "paymentPolicies", description = "A list of all of the seller's payment business policies defined for the specified marketplace. This array will be returned as empty if no payment business policies are defined for the specified marketplace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentPolicies")
  public List<@Valid PaymentPolicy> getPaymentPolicies() {
    return paymentPolicies;
  }

  public void setPaymentPolicies(List<@Valid PaymentPolicy> paymentPolicies) {
    this.paymentPolicies = paymentPolicies;
  }

  public PaymentPolicyResponse prev(String prev) {
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

  public PaymentPolicyResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of payment business policies retrieved in the result set.  <br/><br/>If no payment business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.
   * @return total
  */
  
  @Schema(name = "total", description = "The total number of payment business policies retrieved in the result set.  <br/><br/>If no payment business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PaymentPolicyResponse paymentPolicyResponse = (PaymentPolicyResponse) o;
    return Objects.equals(this.href, paymentPolicyResponse.href) &&
        Objects.equals(this.limit, paymentPolicyResponse.limit) &&
        Objects.equals(this.next, paymentPolicyResponse.next) &&
        Objects.equals(this.offset, paymentPolicyResponse.offset) &&
        Objects.equals(this.paymentPolicies, paymentPolicyResponse.paymentPolicies) &&
        Objects.equals(this.prev, paymentPolicyResponse.prev) &&
        Objects.equals(this.total, paymentPolicyResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, offset, paymentPolicies, prev, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPolicyResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    paymentPolicies: ").append(toIndentedString(paymentPolicies)).append("\n");
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

