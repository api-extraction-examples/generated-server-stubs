package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Miscellaneous;
import org.openapitools.model.Origin;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MetaData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MetaData {

  private Miscellaneous miscellaneous;

  private Origin origin;

  private String programmeType;

  private String type;

  public MetaData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MetaData(Miscellaneous miscellaneous, Origin origin, String programmeType, String type) {
    this.miscellaneous = miscellaneous;
    this.origin = origin;
    this.programmeType = programmeType;
    this.type = type;
  }

  public MetaData miscellaneous(Miscellaneous miscellaneous) {
    this.miscellaneous = miscellaneous;
    return this;
  }

  /**
   * Get miscellaneous
   * @return miscellaneous
  */
  @NotNull @Valid 
  @Schema(name = "miscellaneous", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("miscellaneous")
  public Miscellaneous getMiscellaneous() {
    return miscellaneous;
  }

  public void setMiscellaneous(Miscellaneous miscellaneous) {
    this.miscellaneous = miscellaneous;
  }

  public MetaData origin(Origin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  @NotNull @Valid 
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("origin")
  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  public MetaData programmeType(String programmeType) {
    this.programmeType = programmeType;
    return this;
  }

  /**
   * Get programmeType
   * @return programmeType
  */
  @NotNull 
  @Schema(name = "programme_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("programme_type")
  public String getProgrammeType() {
    return programmeType;
  }

  public void setProgrammeType(String programmeType) {
    this.programmeType = programmeType;
  }

  public MetaData type(String type) {
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
    MetaData metaData = (MetaData) o;
    return Objects.equals(this.miscellaneous, metaData.miscellaneous) &&
        Objects.equals(this.origin, metaData.origin) &&
        Objects.equals(this.programmeType, metaData.programmeType) &&
        Objects.equals(this.type, metaData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miscellaneous, origin, programmeType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaData {\n");
    sb.append("    miscellaneous: ").append(toIndentedString(miscellaneous)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    programmeType: ").append(toIndentedString(programmeType)).append("\n");
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

