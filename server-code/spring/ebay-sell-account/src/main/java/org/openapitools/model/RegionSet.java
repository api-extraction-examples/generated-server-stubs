package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Region;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&#39;t ship.
 */

@Schema(name = "RegionSet", description = "This type consists of the <b>regionIncluded</b> and <b>regionExcluded</b> arrays, which indicate the areas to where the seller does and doesn't ship.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class RegionSet {

  @Valid
  private List<@Valid Region> regionExcluded;

  @Valid
  private List<@Valid Region> regionIncluded;

  public RegionSet regionExcluded(List<@Valid Region> regionExcluded) {
    this.regionExcluded = regionExcluded;
    return this;
  }

  public RegionSet addRegionExcludedItem(Region regionExcludedItem) {
    if (this.regionExcluded == null) {
      this.regionExcluded = new ArrayList<>();
    }
    this.regionExcluded.add(regionExcludedItem);
    return this;
  }

  /**
   * An array of one or more <b>regionName</b> values that specify the areas to where a seller does not ship. A <b>regionExcluded</b> list should only be set in the top-level <b>shipToLocations</b> container and not within the <b>shippingServices.shipToLocations</b> container used to specify which shipping regions are serviced by each available shipping service option. <p>Many sellers are willing to ship to many international locations, but they may want to exclude some world regions or some countries as places they are willing to ship to.<br/><br/>This array will be returned as empty if no shipping regions are excluded with the fulfillment business policy.<br /> <br /><span class=\"tablenote\"><b>Note: </b> The <b>regionExcluded</b> array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a <b>createFulfillmentPolicy</b> or <b>updateFulfillmentPolicy</b> request, it will be ignored.</span>
   * @return regionExcluded
  */
  @Valid 
  @Schema(name = "regionExcluded", description = "An array of one or more <b>regionName</b> values that specify the areas to where a seller does not ship. A <b>regionExcluded</b> list should only be set in the top-level <b>shipToLocations</b> container and not within the <b>shippingServices.shipToLocations</b> container used to specify which shipping regions are serviced by each available shipping service option. <p>Many sellers are willing to ship to many international locations, but they may want to exclude some world regions or some countries as places they are willing to ship to.<br/><br/>This array will be returned as empty if no shipping regions are excluded with the fulfillment business policy.<br /> <br /><span class=\"tablenote\"><b>Note: </b> The <b>regionExcluded</b> array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a <b>createFulfillmentPolicy</b> or <b>updateFulfillmentPolicy</b> request, it will be ignored.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionExcluded")
  public List<@Valid Region> getRegionExcluded() {
    return regionExcluded;
  }

  public void setRegionExcluded(List<@Valid Region> regionExcluded) {
    this.regionExcluded = regionExcluded;
  }

  public RegionSet regionIncluded(List<@Valid Region> regionIncluded) {
    this.regionIncluded = regionIncluded;
    return this;
  }

  public RegionSet addRegionIncludedItem(Region regionIncludedItem) {
    if (this.regionIncluded == null) {
      this.regionIncluded = new ArrayList<>();
    }
    this.regionIncluded.add(regionIncludedItem);
    return this;
  }

  /**
   * An array of one or more <b>regionName</b> fields that specify the areas to where a seller ships. <br />Each eBay marketplace supports its own set of allowable shipping locations.<br /> <br /><span class=\"tablenote\"><b>Note: </b> The <b>regionIncluded</b> array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a <b>createFulfillmentPolicy</b> or <b>updateFulfillmentPolicy</b> request, it will be ignored.</span>
   * @return regionIncluded
  */
  @Valid 
  @Schema(name = "regionIncluded", description = "An array of one or more <b>regionName</b> fields that specify the areas to where a seller ships. <br />Each eBay marketplace supports its own set of allowable shipping locations.<br /> <br /><span class=\"tablenote\"><b>Note: </b> The <b>regionIncluded</b> array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a <b>createFulfillmentPolicy</b> or <b>updateFulfillmentPolicy</b> request, it will be ignored.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionIncluded")
  public List<@Valid Region> getRegionIncluded() {
    return regionIncluded;
  }

  public void setRegionIncluded(List<@Valid Region> regionIncluded) {
    this.regionIncluded = regionIncluded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionSet regionSet = (RegionSet) o;
    return Objects.equals(this.regionExcluded, regionSet.regionExcluded) &&
        Objects.equals(this.regionIncluded, regionSet.regionIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionExcluded, regionIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionSet {\n");
    sb.append("    regionExcluded: ").append(toIndentedString(regionExcluded)).append("\n");
    sb.append("    regionIncluded: ").append(toIndentedString(regionIncluded)).append("\n");
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

