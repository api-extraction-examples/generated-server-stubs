package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SiteProcessingSettingsHtml
 */

@JsonTypeName("site_processing_settings_html")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class SiteProcessingSettingsHtml {

  private Boolean prettyUrls;

  public SiteProcessingSettingsHtml prettyUrls(Boolean prettyUrls) {
    this.prettyUrls = prettyUrls;
    return this;
  }

  /**
   * Get prettyUrls
   * @return prettyUrls
  */
  
  @Schema(name = "pretty_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pretty_urls")
  public Boolean getPrettyUrls() {
    return prettyUrls;
  }

  public void setPrettyUrls(Boolean prettyUrls) {
    this.prettyUrls = prettyUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteProcessingSettingsHtml siteProcessingSettingsHtml = (SiteProcessingSettingsHtml) o;
    return Objects.equals(this.prettyUrls, siteProcessingSettingsHtml.prettyUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prettyUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteProcessingSettingsHtml {\n");
    sb.append("    prettyUrls: ").append(toIndentedString(prettyUrls)).append("\n");
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

