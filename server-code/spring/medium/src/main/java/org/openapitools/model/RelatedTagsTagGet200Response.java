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
 * RelatedTagsTagGet200Response
 */

@JsonTypeName("_related_tags__tag__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class RelatedTagsTagGet200Response {

  private String givenTag;

  @Valid
  private List<String> relatedTags;

  public RelatedTagsTagGet200Response givenTag(String givenTag) {
    this.givenTag = givenTag;
    return this;
  }

  /**
   * Get givenTag
   * @return givenTag
  */
  
  @Schema(name = "given_tag", example = "blockchain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("given_tag")
  public String getGivenTag() {
    return givenTag;
  }

  public void setGivenTag(String givenTag) {
    this.givenTag = givenTag;
  }

  public RelatedTagsTagGet200Response relatedTags(List<String> relatedTags) {
    this.relatedTags = relatedTags;
    return this;
  }

  public RelatedTagsTagGet200Response addRelatedTagsItem(String relatedTagsItem) {
    if (this.relatedTags == null) {
      this.relatedTags = new ArrayList<>();
    }
    this.relatedTags.add(relatedTagsItem);
    return this;
  }

  /**
   * Get relatedTags
   * @return relatedTags
  */
  
  @Schema(name = "related_tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_tags")
  public List<String> getRelatedTags() {
    return relatedTags;
  }

  public void setRelatedTags(List<String> relatedTags) {
    this.relatedTags = relatedTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTagsTagGet200Response relatedTagsTagGet200Response = (RelatedTagsTagGet200Response) o;
    return Objects.equals(this.givenTag, relatedTagsTagGet200Response.givenTag) &&
        Objects.equals(this.relatedTags, relatedTagsTagGet200Response.relatedTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenTag, relatedTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTagsTagGet200Response {\n");
    sb.append("    givenTag: ").append(toIndentedString(givenTag)).append("\n");
    sb.append("    relatedTags: ").append(toIndentedString(relatedTags)).append("\n");
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

