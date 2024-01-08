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
 * An icon.
 */

@Schema(name = "IconBean", description = "An icon.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IconBean {

  private String link;

  private String title;

  private String url16x16;

  public IconBean link(String link) {
    this.link = link;
    return this;
  }

  /**
   * The URL of the tooltip, used only for a status icon.
   * @return link
  */
  
  @Schema(name = "link", description = "The URL of the tooltip, used only for a status icon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public IconBean title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the icon, for use as a tooltip on the icon.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the icon, for use as a tooltip on the icon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IconBean url16x16(String url16x16) {
    this.url16x16 = url16x16;
    return this;
  }

  /**
   * The URL of a 16x16 pixel icon.
   * @return url16x16
  */
  
  @Schema(name = "url16x16", description = "The URL of a 16x16 pixel icon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url16x16")
  public String getUrl16x16() {
    return url16x16;
  }

  public void setUrl16x16(String url16x16) {
    this.url16x16 = url16x16;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconBean iconBean = (IconBean) o;
    return Objects.equals(this.link, iconBean.link) &&
        Objects.equals(this.title, iconBean.title) &&
        Objects.equals(this.url16x16, iconBean.url16x16);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, title, url16x16);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconBean {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url16x16: ").append(toIndentedString(url16x16)).append("\n");
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

