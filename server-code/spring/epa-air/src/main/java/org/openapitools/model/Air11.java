package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Air02;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Map Output Object
 */

@Schema(name = "air11", description = "Map Output Object")
@JsonTypeName("air11")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air11 {

  private String iconBaseURL;

  @Valid
  private List<@Valid Air02> mapData = new ArrayList<>();

  private String popUpBaseURL;

  private String queryID;

  public Air11() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air11(String iconBaseURL, List<@Valid Air02> mapData, String popUpBaseURL, String queryID) {
    this.iconBaseURL = iconBaseURL;
    this.mapData = mapData;
    this.popUpBaseURL = popUpBaseURL;
    this.queryID = queryID;
  }

  public Air11 iconBaseURL(String iconBaseURL) {
    this.iconBaseURL = iconBaseURL;
    return this;
  }

  /**
   * URL where all the icons are located
   * @return iconBaseURL
  */
  @NotNull 
  @Schema(name = "IconBaseURL", example = "https://echo.epa.gov/app/map/icons/", description = "URL where all the icons are located", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("IconBaseURL")
  public String getIconBaseURL() {
    return iconBaseURL;
  }

  public void setIconBaseURL(String iconBaseURL) {
    this.iconBaseURL = iconBaseURL;
  }

  public Air11 mapData(List<@Valid Air02> mapData) {
    this.mapData = mapData;
    return this;
  }

  public Air11 addMapDataItem(Air02 mapDataItem) {
    if (this.mapData == null) {
      this.mapData = new ArrayList<>();
    }
    this.mapData.add(mapDataItem);
    return this;
  }

  /**
   * An array of facility geospatial information.
   * @return mapData
  */
  @NotNull @Valid 
  @Schema(name = "MapData", description = "An array of facility geospatial information.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MapData")
  public List<@Valid Air02> getMapData() {
    return mapData;
  }

  public void setMapData(List<@Valid Air02> mapData) {
    this.mapData = mapData;
  }

  public Air11 popUpBaseURL(String popUpBaseURL) {
    this.popUpBaseURL = popUpBaseURL;
    return this;
  }

  /**
   * Combine this URL with the PUC to get popup info
   * @return popUpBaseURL
  */
  @NotNull 
  @Schema(name = "PopUpBaseURL", example = "https://echodata.epa.gov/echo/cwa_rest_services.pop_up?p_id=", description = "Combine this URL with the PUC to get popup info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PopUpBaseURL")
  public String getPopUpBaseURL() {
    return popUpBaseURL;
  }

  public void setPopUpBaseURL(String popUpBaseURL) {
    this.popUpBaseURL = popUpBaseURL;
  }

  public Air11 queryID(String queryID) {
    this.queryID = queryID;
    return this;
  }

  /**
   * Sequential number assigned to entire search result
   * @return queryID
  */
  @NotNull 
  @Schema(name = "QueryID", example = "245", description = "Sequential number assigned to entire search result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("QueryID")
  public String getQueryID() {
    return queryID;
  }

  public void setQueryID(String queryID) {
    this.queryID = queryID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Air11 air11 = (Air11) o;
    return Objects.equals(this.iconBaseURL, air11.iconBaseURL) &&
        Objects.equals(this.mapData, air11.mapData) &&
        Objects.equals(this.popUpBaseURL, air11.popUpBaseURL) &&
        Objects.equals(this.queryID, air11.queryID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconBaseURL, mapData, popUpBaseURL, queryID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air11 {\n");
    sb.append("    iconBaseURL: ").append(toIndentedString(iconBaseURL)).append("\n");
    sb.append("    mapData: ").append(toIndentedString(mapData)).append("\n");
    sb.append("    popUpBaseURL: ").append(toIndentedString(popUpBaseURL)).append("\n");
    sb.append("    queryID: ").append(toIndentedString(queryID)).append("\n");
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

