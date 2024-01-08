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
 * ApiV1PushSubscriptionPostRequest
 */

@JsonTypeName("_api_v1_push_subscription_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1PushSubscriptionPostRequest {

  private String data;

  private String subscription;

  public ApiV1PushSubscriptionPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1PushSubscriptionPostRequest(String data, String subscription) {
    this.data = data;
    this.subscription = subscription;
  }

  public ApiV1PushSubscriptionPostRequest data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ApiV1PushSubscriptionPostRequest subscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
  */
  @NotNull 
  @Schema(name = "subscription", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscription")
  public String getSubscription() {
    return subscription;
  }

  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1PushSubscriptionPostRequest apiV1PushSubscriptionPostRequest = (ApiV1PushSubscriptionPostRequest) o;
    return Objects.equals(this.data, apiV1PushSubscriptionPostRequest.data) &&
        Objects.equals(this.subscription, apiV1PushSubscriptionPostRequest.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1PushSubscriptionPostRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

