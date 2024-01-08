package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Country;
import org.openapitools.model.DefaultLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * countries and navigation links for additional results.
 */

@Schema(name = "HalifiedCountries", description = "countries and navigation links for additional results.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class HalifiedCountries {

  private DefaultLinks links;

  @Valid
  private List<@Valid Country> countries;

  public HalifiedCountries() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HalifiedCountries(DefaultLinks links) {
    this.links = links;
  }

  public HalifiedCountries links(DefaultLinks links) {
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

  public HalifiedCountries countries(List<@Valid Country> countries) {
    this.countries = countries;
    return this;
  }

  public HalifiedCountries addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * countries
   * @return countries
  */
  @Valid 
  @Schema(name = "countries", description = "countries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countries")
  public List<@Valid Country> getCountries() {
    return countries;
  }

  public void setCountries(List<@Valid Country> countries) {
    this.countries = countries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HalifiedCountries halifiedCountries = (HalifiedCountries) o;
    return Objects.equals(this.links, halifiedCountries.links) &&
        Objects.equals(this.countries, halifiedCountries.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalifiedCountries {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

