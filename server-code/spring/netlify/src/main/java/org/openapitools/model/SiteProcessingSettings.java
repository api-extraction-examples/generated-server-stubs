package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.MinifyOptions;
import org.openapitools.model.SiteProcessingSettingsHtml;
import org.openapitools.model.SiteProcessingSettingsImages;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SiteProcessingSettings
 */

@JsonTypeName("site_processing_settings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class SiteProcessingSettings {

  private MinifyOptions css;

  private SiteProcessingSettingsHtml html;

  private SiteProcessingSettingsImages images;

  private MinifyOptions js;

  private Boolean skip;

  public SiteProcessingSettings css(MinifyOptions css) {
    this.css = css;
    return this;
  }

  /**
   * Get css
   * @return css
  */
  @Valid 
  @Schema(name = "css", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("css")
  public MinifyOptions getCss() {
    return css;
  }

  public void setCss(MinifyOptions css) {
    this.css = css;
  }

  public SiteProcessingSettings html(SiteProcessingSettingsHtml html) {
    this.html = html;
    return this;
  }

  /**
   * Get html
   * @return html
  */
  @Valid 
  @Schema(name = "html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html")
  public SiteProcessingSettingsHtml getHtml() {
    return html;
  }

  public void setHtml(SiteProcessingSettingsHtml html) {
    this.html = html;
  }

  public SiteProcessingSettings images(SiteProcessingSettingsImages images) {
    this.images = images;
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public SiteProcessingSettingsImages getImages() {
    return images;
  }

  public void setImages(SiteProcessingSettingsImages images) {
    this.images = images;
  }

  public SiteProcessingSettings js(MinifyOptions js) {
    this.js = js;
    return this;
  }

  /**
   * Get js
   * @return js
  */
  @Valid 
  @Schema(name = "js", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("js")
  public MinifyOptions getJs() {
    return js;
  }

  public void setJs(MinifyOptions js) {
    this.js = js;
  }

  public SiteProcessingSettings skip(Boolean skip) {
    this.skip = skip;
    return this;
  }

  /**
   * Get skip
   * @return skip
  */
  
  @Schema(name = "skip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skip")
  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(Boolean skip) {
    this.skip = skip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteProcessingSettings siteProcessingSettings = (SiteProcessingSettings) o;
    return Objects.equals(this.css, siteProcessingSettings.css) &&
        Objects.equals(this.html, siteProcessingSettings.html) &&
        Objects.equals(this.images, siteProcessingSettings.images) &&
        Objects.equals(this.js, siteProcessingSettings.js) &&
        Objects.equals(this.skip, siteProcessingSettings.skip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(css, html, images, js, skip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteProcessingSettings {\n");
    sb.append("    css: ").append(toIndentedString(css)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    js: ").append(toIndentedString(js)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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

