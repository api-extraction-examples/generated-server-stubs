package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Subscription;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the response payload for the &lt;b&gt;getSubscription&lt;/b&gt; method.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: Pagination has not yet been enabled for &lt;b&gt;getSubscription&lt;/b&gt;, so all of the pagination-related fields are for future use.&lt;/span&gt;
 */

@Schema(name = "SubscriptionResponse", description = "This type is used by the response payload for the <b>getSubscription</b> method.<br /><br /><span class=\"tablenote\"><b>Note</b>: Pagination has not yet been enabled for <b>getSubscription</b>, so all of the pagination-related fields are for future use.</span>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SubscriptionResponse {

  private String href;

  private Integer limit;

  private String next;

  @Valid
  private List<@Valid Subscription> subscriptions;

  private Integer total;

  public SubscriptionResponse href(String href) {
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

  public SubscriptionResponse limit(Integer limit) {
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

  public SubscriptionResponse next(String next) {
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

  public SubscriptionResponse subscriptions(List<@Valid Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionResponse addSubscriptionsItem(Subscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * An array of subscriptions associated with the seller account.
   * @return subscriptions
  */
  @Valid 
  @Schema(name = "subscriptions", description = "An array of subscriptions associated with the seller account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptions")
  public List<@Valid Subscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<@Valid Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public SubscriptionResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of subscriptions displayed on the current page of results.
   * @return total
  */
  
  @Schema(name = "total", description = "The total number of subscriptions displayed on the current page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.href, subscriptionResponse.href) &&
        Objects.equals(this.limit, subscriptionResponse.limit) &&
        Objects.equals(this.next, subscriptionResponse.next) &&
        Objects.equals(this.subscriptions, subscriptionResponse.subscriptions) &&
        Objects.equals(this.total, subscriptionResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, subscriptions, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

