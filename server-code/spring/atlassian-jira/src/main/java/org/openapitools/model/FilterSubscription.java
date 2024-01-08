package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FilterSubscriptionGroup;
import org.openapitools.model.FilterSubscriptionUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a user or group subscribing to a filter.
 */

@Schema(name = "FilterSubscription", description = "Details of a user or group subscribing to a filter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FilterSubscription {

  private FilterSubscriptionGroup group;

  private Long id;

  private FilterSubscriptionUser user;

  public FilterSubscription group(FilterSubscriptionGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @Valid 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public FilterSubscriptionGroup getGroup() {
    return group;
  }

  public void setGroup(FilterSubscriptionGroup group) {
    this.group = group;
  }

  public FilterSubscription id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the filter subscription.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the filter subscription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FilterSubscription user(FilterSubscriptionUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public FilterSubscriptionUser getUser() {
    return user;
  }

  public void setUser(FilterSubscriptionUser user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSubscription filterSubscription = (FilterSubscription) o;
    return Objects.equals(this.group, filterSubscription.group) &&
        Objects.equals(this.id, filterSubscription.id) &&
        Objects.equals(this.user, filterSubscription.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, id, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSubscription {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

