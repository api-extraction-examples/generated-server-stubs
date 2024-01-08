package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used to define specific shipping regions. There are four &#39;levels&#39; of shipping regions, including large geographical regions (like &#39;Asia&#39;, &#39;Europe&#39;, or &#39;Middle East&#39;), individual countries, US states or Canadian provinces, and special locations/domestic regions within a country (like &#39;Alaska/Hawaii&#39; or &#39;PO Box&#39;).
 */

@Schema(name = "Region", description = "This type is used to define specific shipping regions. There are four 'levels' of shipping regions, including large geographical regions (like 'Asia', 'Europe', or 'Middle East'), individual countries, US states or Canadian provinces, and special locations/domestic regions within a country (like 'Alaska/Hawaii' or 'PO Box').")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class Region {

  private String regionName;

  private String regionType;

  public Region regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

  /**
   * A string that indicates the name of a region, as defined by eBay. A \"region\" can be either a 'world region' (e.g., the \"Middle East\" or \"Southeast Asia\"), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. <br /><br />The <b>GeteBayDetails</b> call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call <b>GeteBayDetails</b> with the <b>DetailName</b> value set to <b>ExcludeShippingLocationDetails</b>.
   * @return regionName
  */
  
  @Schema(name = "regionName", description = "A string that indicates the name of a region, as defined by eBay. A \"region\" can be either a 'world region' (e.g., the \"Middle East\" or \"Southeast Asia\"), a country (represented with a two-letter country code), a state or province (represented with a two-letter code), or a special domestic region within a country. <br /><br />The <b>GeteBayDetails</b> call in the Trading API can be used to retrieve the world regions and special domestic regions within a specific country. To get these enumeration values, call <b>GeteBayDetails</b> with the <b>DetailName</b> value set to <b>ExcludeShippingLocationDetails</b>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionName")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Region regionType(String regionType) {
    this.regionType = regionType;
    return this;
  }

  /**
   * Reserved for future use. <!--The region's type, which can be one of the following: 'COUNTRY', 'COUNTRY_REGION', 'STATE_OR_PROVINCE', 'WORLD_REGION', or 'WORLDWIDE'.--> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:RegionTypeEnum'>eBay API documentation</a>
   * @return regionType
  */
  
  @Schema(name = "regionType", description = "Reserved for future use. <!--The region's type, which can be one of the following: 'COUNTRY', 'COUNTRY_REGION', 'STATE_OR_PROVINCE', 'WORLD_REGION', or 'WORLDWIDE'.--> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:RegionTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionType")
  public String getRegionType() {
    return regionType;
  }

  public void setRegionType(String regionType) {
    this.regionType = regionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Region region = (Region) o;
    return Objects.equals(this.regionName, region.regionName) &&
        Objects.equals(this.regionType, region.regionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionName, regionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Region {\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
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

