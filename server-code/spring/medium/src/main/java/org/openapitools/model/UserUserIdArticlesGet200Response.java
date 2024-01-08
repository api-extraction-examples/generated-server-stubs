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
 * UserUserIdArticlesGet200Response
 */

@JsonTypeName("_user__user_id__articles_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class UserUserIdArticlesGet200Response {

  @Valid
  private List<String> associatedArticles;

  public UserUserIdArticlesGet200Response associatedArticles(List<String> associatedArticles) {
    this.associatedArticles = associatedArticles;
    return this;
  }

  public UserUserIdArticlesGet200Response addAssociatedArticlesItem(String associatedArticlesItem) {
    if (this.associatedArticles == null) {
      this.associatedArticles = new ArrayList<>();
    }
    this.associatedArticles.add(associatedArticlesItem);
    return this;
  }

  /**
   * Get associatedArticles
   * @return associatedArticles
  */
  
  @Schema(name = "associated_articles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associated_articles")
  public List<String> getAssociatedArticles() {
    return associatedArticles;
  }

  public void setAssociatedArticles(List<String> associatedArticles) {
    this.associatedArticles = associatedArticles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUserIdArticlesGet200Response userUserIdArticlesGet200Response = (UserUserIdArticlesGet200Response) o;
    return Objects.equals(this.associatedArticles, userUserIdArticlesGet200Response.associatedArticles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedArticles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUserIdArticlesGet200Response {\n");
    sb.append("    associatedArticles: ").append(toIndentedString(associatedArticles)).append("\n");
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

