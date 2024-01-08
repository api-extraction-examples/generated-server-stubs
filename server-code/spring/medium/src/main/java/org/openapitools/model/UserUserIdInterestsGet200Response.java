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
 * UserUserIdInterestsGet200Response
 */

@JsonTypeName("_user__user_id__interests_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class UserUserIdInterestsGet200Response {

  @Valid
  private List<String> tagsFollowed;

  public UserUserIdInterestsGet200Response tagsFollowed(List<String> tagsFollowed) {
    this.tagsFollowed = tagsFollowed;
    return this;
  }

  public UserUserIdInterestsGet200Response addTagsFollowedItem(String tagsFollowedItem) {
    if (this.tagsFollowed == null) {
      this.tagsFollowed = new ArrayList<>();
    }
    this.tagsFollowed.add(tagsFollowedItem);
    return this;
  }

  /**
   * Get tagsFollowed
   * @return tagsFollowed
  */
  
  @Schema(name = "tags_followed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags_followed")
  public List<String> getTagsFollowed() {
    return tagsFollowed;
  }

  public void setTagsFollowed(List<String> tagsFollowed) {
    this.tagsFollowed = tagsFollowed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserIdInterestsGet200Response userUserIdInterestsGet200Response = (UserUserIdInterestsGet200Response) o;
    return Objects.equals(this.tagsFollowed, userUserIdInterestsGet200Response.tagsFollowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagsFollowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserIdInterestsGet200Response {\n");
    sb.append("    tagsFollowed: ").append(toIndentedString(tagsFollowed)).append("\n");
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

