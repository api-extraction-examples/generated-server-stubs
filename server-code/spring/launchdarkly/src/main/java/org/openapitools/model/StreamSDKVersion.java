package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StreamBySDKLinks;
import org.openapitools.model.StreamSDKVersionData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StreamSDKVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class StreamSDKVersion {

  private StreamBySDKLinks links;

  @Valid
  private List<@Valid StreamSDKVersionData> sdkVersions;

  public StreamSDKVersion links(StreamBySDKLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public StreamBySDKLinks getLinks() {
    return links;
  }

  public void setLinks(StreamBySDKLinks links) {
    this.links = links;
  }

  public StreamSDKVersion sdkVersions(List<@Valid StreamSDKVersionData> sdkVersions) {
    this.sdkVersions = sdkVersions;
    return this;
  }

  public StreamSDKVersion addSdkVersionsItem(StreamSDKVersionData sdkVersionsItem) {
    if (this.sdkVersions == null) {
      this.sdkVersions = new ArrayList<>();
    }
    this.sdkVersions.add(sdkVersionsItem);
    return this;
  }

  /**
   * Get sdkVersions
   * @return sdkVersions
  */
  @Valid 
  @Schema(name = "sdkVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sdkVersions")
  public List<@Valid StreamSDKVersionData> getSdkVersions() {
    return sdkVersions;
  }

  public void setSdkVersions(List<@Valid StreamSDKVersionData> sdkVersions) {
    this.sdkVersions = sdkVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamSDKVersion streamSDKVersion = (StreamSDKVersion) o;
    return Objects.equals(this.links, streamSDKVersion.links) &&
        Objects.equals(this.sdkVersions, streamSDKVersion.sdkVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, sdkVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamSDKVersion {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    sdkVersions: ").append(toIndentedString(sdkVersions)).append("\n");
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

