package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IssueCommentListRequestBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueCommentListRequestBean {

  @Valid
  private Set<Long> ids = new LinkedHashSet<>();

  public IssueCommentListRequestBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueCommentListRequestBean(Set<Long> ids) {
    this.ids = ids;
  }

  public IssueCommentListRequestBean ids(Set<Long> ids) {
    this.ids = ids;
    return this;
  }

  public IssueCommentListRequestBean addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * The list of comment IDs. A maximum of 1000 IDs can be specified.
   * @return ids
  */
  @NotNull 
  @Schema(name = "ids", description = "The list of comment IDs. A maximum of 1000 IDs can be specified.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ids")
  public Set<Long> getIds() {
    return ids;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIds(Set<Long> ids) {
    this.ids = ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueCommentListRequestBean issueCommentListRequestBean = (IssueCommentListRequestBean) o;
    return Objects.equals(this.ids, issueCommentListRequestBean.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCommentListRequestBean {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

