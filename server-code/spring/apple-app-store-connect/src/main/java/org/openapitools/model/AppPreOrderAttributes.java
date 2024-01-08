package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreOrderAttributes
 */

@JsonTypeName("AppPreOrder_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreOrderAttributes {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate appReleaseDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate preOrderAvailableDate;

  public AppPreOrderAttributes appReleaseDate(LocalDate appReleaseDate) {
    this.appReleaseDate = appReleaseDate;
    return this;
  }

  /**
   * Get appReleaseDate
   * @return appReleaseDate
  */
  @Valid 
  @Schema(name = "appReleaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appReleaseDate")
  public LocalDate getAppReleaseDate() {
    return appReleaseDate;
  }

  public void setAppReleaseDate(LocalDate appReleaseDate) {
    this.appReleaseDate = appReleaseDate;
  }

  public AppPreOrderAttributes preOrderAvailableDate(LocalDate preOrderAvailableDate) {
    this.preOrderAvailableDate = preOrderAvailableDate;
    return this;
  }

  /**
   * Get preOrderAvailableDate
   * @return preOrderAvailableDate
  */
  @Valid 
  @Schema(name = "preOrderAvailableDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preOrderAvailableDate")
  public LocalDate getPreOrderAvailableDate() {
    return preOrderAvailableDate;
  }

  public void setPreOrderAvailableDate(LocalDate preOrderAvailableDate) {
    this.preOrderAvailableDate = preOrderAvailableDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreOrderAttributes appPreOrderAttributes = (AppPreOrderAttributes) o;
    return Objects.equals(this.appReleaseDate, appPreOrderAttributes.appReleaseDate) &&
        Objects.equals(this.preOrderAvailableDate, appPreOrderAttributes.preOrderAvailableDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appReleaseDate, preOrderAvailableDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreOrderAttributes {\n");
    sb.append("    appReleaseDate: ").append(toIndentedString(appReleaseDate)).append("\n");
    sb.append("    preOrderAvailableDate: ").append(toIndentedString(preOrderAvailableDate)).append("\n");
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

