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
 * ProgrammeTitles
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class ProgrammeTitles {

  private String displayTitle;

  private String entityTitle;

  private String primaryTitle;

  private String secondaryTitle;

  private String type;

  public ProgrammeTitles() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProgrammeTitles(String type) {
    this.type = type;
  }

  public ProgrammeTitles displayTitle(String displayTitle) {
    this.displayTitle = displayTitle;
    return this;
  }

  /**
   * Get displayTitle
   * @return displayTitle
  */
  
  @Schema(name = "display_title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_title")
  public String getDisplayTitle() {
    return displayTitle;
  }

  public void setDisplayTitle(String displayTitle) {
    this.displayTitle = displayTitle;
  }

  public ProgrammeTitles entityTitle(String entityTitle) {
    this.entityTitle = entityTitle;
    return this;
  }

  /**
   * Get entityTitle
   * @return entityTitle
  */
  
  @Schema(name = "entity_title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_title")
  public String getEntityTitle() {
    return entityTitle;
  }

  public void setEntityTitle(String entityTitle) {
    this.entityTitle = entityTitle;
  }

  public ProgrammeTitles primaryTitle(String primaryTitle) {
    this.primaryTitle = primaryTitle;
    return this;
  }

  /**
   * Get primaryTitle
   * @return primaryTitle
  */
  
  @Schema(name = "primary_title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primary_title")
  public String getPrimaryTitle() {
    return primaryTitle;
  }

  public void setPrimaryTitle(String primaryTitle) {
    this.primaryTitle = primaryTitle;
  }

  public ProgrammeTitles secondaryTitle(String secondaryTitle) {
    this.secondaryTitle = secondaryTitle;
    return this;
  }

  /**
   * Get secondaryTitle
   * @return secondaryTitle
  */
  
  @Schema(name = "secondary_title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondary_title")
  public String getSecondaryTitle() {
    return secondaryTitle;
  }

  public void setSecondaryTitle(String secondaryTitle) {
    this.secondaryTitle = secondaryTitle;
  }

  public ProgrammeTitles type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammeTitles programmeTitles = (ProgrammeTitles) o;
    return Objects.equals(this.displayTitle, programmeTitles.displayTitle) &&
        Objects.equals(this.entityTitle, programmeTitles.entityTitle) &&
        Objects.equals(this.primaryTitle, programmeTitles.primaryTitle) &&
        Objects.equals(this.secondaryTitle, programmeTitles.secondaryTitle) &&
        Objects.equals(this.type, programmeTitles.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayTitle, entityTitle, primaryTitle, secondaryTitle, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammeTitles {\n");
    sb.append("    displayTitle: ").append(toIndentedString(displayTitle)).append("\n");
    sb.append("    entityTitle: ").append(toIndentedString(entityTitle)).append("\n");
    sb.append("    primaryTitle: ").append(toIndentedString(primaryTitle)).append("\n");
    sb.append("    secondaryTitle: ").append(toIndentedString(secondaryTitle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

