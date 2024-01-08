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
 * UserUserIdPublicationsGet200Response
 */

@JsonTypeName("_user__user_id__publications_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class UserUserIdPublicationsGet200Response {

  @Valid
  private List<String> publications;

  private String userId;

  public UserUserIdPublicationsGet200Response publications(List<String> publications) {
    this.publications = publications;
    return this;
  }

  public UserUserIdPublicationsGet200Response addPublicationsItem(String publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

  /**
   * Get publications
   * @return publications
  */
  
  @Schema(name = "publications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publications")
  public List<String> getPublications() {
    return publications;
  }

  public void setPublications(List<String> publications) {
    this.publications = publications;
  }

  public UserUserIdPublicationsGet200Response userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", example = "14d5c41e0264", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserIdPublicationsGet200Response userUserIdPublicationsGet200Response = (UserUserIdPublicationsGet200Response) o;
    return Objects.equals(this.publications, userUserIdPublicationsGet200Response.publications) &&
        Objects.equals(this.userId, userUserIdPublicationsGet200Response.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publications, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserIdPublicationsGet200Response {\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

