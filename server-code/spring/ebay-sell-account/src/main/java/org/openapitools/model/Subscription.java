package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TimeDuration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the &lt;strong&gt;getSubscription&lt;/strong&gt; response container, which defines the subscription types and levels for the seller account.
 */

@Schema(name = "Subscription", description = "This type is used by the <strong>getSubscription</strong> response container, which defines the subscription types and levels for the seller account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class Subscription {

  private String marketplaceId;

  private String subscriptionId;

  private String subscriptionLevel;

  private String subscriptionType;

  private TimeDuration term;

  public Subscription marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The marketplace with which the subscription is associated. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The marketplace with which the subscription is associated. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public Subscription subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * The subscription ID.
   * @return subscriptionId
  */
  
  @Schema(name = "subscriptionId", description = "The subscription ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public Subscription subscriptionLevel(String subscriptionLevel) {
    this.subscriptionLevel = subscriptionLevel;
    return this;
  }

  /**
   * The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.
   * @return subscriptionLevel
  */
  
  @Schema(name = "subscriptionLevel", description = "The subscription level. For example, subscription levels for an eBay store include Starter, Basic, Featured, Anchor, and Enterprise levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionLevel")
  public String getSubscriptionLevel() {
    return subscriptionLevel;
  }

  public void setSubscriptionLevel(String subscriptionLevel) {
    this.subscriptionLevel = subscriptionLevel;
  }

  public Subscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * The kind of entity with which the subscription is associated, such as an eBay store. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:SubscriptionTypeEnum'>eBay API documentation</a>
   * @return subscriptionType
  */
  
  @Schema(name = "subscriptionType", description = "The kind of entity with which the subscription is associated, such as an eBay store. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:SubscriptionTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionType")
  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public Subscription term(TimeDuration term) {
    this.term = term;
    return this;
  }

  /**
   * Get term
   * @return term
  */
  @Valid 
  @Schema(name = "term", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public TimeDuration getTerm() {
    return term;
  }

  public void setTerm(TimeDuration term) {
    this.term = term;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.marketplaceId, subscription.marketplaceId) &&
        Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.subscriptionLevel, subscription.subscriptionLevel) &&
        Objects.equals(this.subscriptionType, subscription.subscriptionType) &&
        Objects.equals(this.term, subscription.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, subscriptionId, subscriptionLevel, subscriptionType, term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionLevel: ").append(toIndentedString(subscriptionLevel)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

