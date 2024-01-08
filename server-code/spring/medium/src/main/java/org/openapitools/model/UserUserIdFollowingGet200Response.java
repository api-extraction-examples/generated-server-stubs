package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserUserIdFollowingGet200Response
 */

@JsonTypeName("_user__user_id__following_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class UserUserIdFollowingGet200Response {

  @Valid
  private List<String> following;

  private String id;

  public UserUserIdFollowingGet200Response following(List<String> following) {
    this.following = following;
    return this;
  }

  public UserUserIdFollowingGet200Response addFollowingItem(String followingItem) {
    if (this.following == null) {
      this.following = new ArrayList<>();
    }
    this.following.add(followingItem);
    return this;
  }

  /**
   * Get following
   * @return following
  */
  
  @Schema(name = "following", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("following")
  public List<String> getFollowing() {
    return following;
  }

  public void setFollowing(List<String> following) {
    this.following = following;
  }

  public UserUserIdFollowingGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "14d5c41e0264", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserIdFollowingGet200Response userUserIdFollowingGet200Response = (UserUserIdFollowingGet200Response) o;
    return Objects.equals(this.following, userUserIdFollowingGet200Response.following) &&
        Objects.equals(this.id, userUserIdFollowingGet200Response.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(following, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserIdFollowingGet200Response {\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

