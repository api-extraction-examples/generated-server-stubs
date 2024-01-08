package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Dealer;
import org.openapitools.model.DefaultLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * dealer with navigation links.
 */

@Schema(name = "HalifiedDealers", description = "dealer with navigation links.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class HalifiedDealers {

  private DefaultLinks links;

  @Valid
  private List<@Valid Dealer> dealers;

  public HalifiedDealers() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HalifiedDealers(DefaultLinks links) {
    this.links = links;
  }

  public HalifiedDealers links(DefaultLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @NotNull @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("_links")
  public DefaultLinks getLinks() {
    return links;
  }

  public void setLinks(DefaultLinks links) {
    this.links = links;
  }

  public HalifiedDealers dealers(List<@Valid Dealer> dealers) {
    this.dealers = dealers;
    return this;
  }

  public HalifiedDealers addDealersItem(Dealer dealersItem) {
    if (this.dealers == null) {
      this.dealers = new ArrayList<>();
    }
    this.dealers.add(dealersItem);
    return this;
  }

  /**
   * dealers
   * @return dealers
  */
  @Valid 
  @Schema(name = "dealers", description = "dealers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dealers")
  public List<@Valid Dealer> getDealers() {
    return dealers;
  }

  public void setDealers(List<@Valid Dealer> dealers) {
    this.dealers = dealers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HalifiedDealers halifiedDealers = (HalifiedDealers) o;
    return Objects.equals(this.links, halifiedDealers.links) &&
        Objects.equals(this.dealers, halifiedDealers.dealers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, dealers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalifiedDealers {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    dealers: ").append(toIndentedString(dealers)).append("\n");
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

