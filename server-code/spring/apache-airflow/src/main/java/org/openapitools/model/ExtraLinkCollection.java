package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExtraLink;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The collection of extra links.
 */

@Schema(name = "ExtraLinkCollection", description = "The collection of extra links.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ExtraLinkCollection {

  @Valid
  private List<@Valid ExtraLink> extraLinks;

  public ExtraLinkCollection extraLinks(List<@Valid ExtraLink> extraLinks) {
    this.extraLinks = extraLinks;
    return this;
  }

  public ExtraLinkCollection addExtraLinksItem(ExtraLink extraLinksItem) {
    if (this.extraLinks == null) {
      this.extraLinks = new ArrayList<>();
    }
    this.extraLinks.add(extraLinksItem);
    return this;
  }

  /**
   * Get extraLinks
   * @return extraLinks
  */
  @Valid 
  @Schema(name = "extra_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra_links")
  public List<@Valid ExtraLink> getExtraLinks() {
    return extraLinks;
  }

  public void setExtraLinks(List<@Valid ExtraLink> extraLinks) {
    this.extraLinks = extraLinks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraLinkCollection extraLinkCollection = (ExtraLinkCollection) o;
    return Objects.equals(this.extraLinks, extraLinkCollection.extraLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraLinkCollection {\n");
    sb.append("    extraLinks: ").append(toIndentedString(extraLinks)).append("\n");
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

