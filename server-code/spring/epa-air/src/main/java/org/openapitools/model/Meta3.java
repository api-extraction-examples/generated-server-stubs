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
 * Results Column Object
 */

@Schema(name = "meta3", description = "Results Column Object")
@JsonTypeName("meta3")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Meta3 {

  private String columnID;

  private String columnName;

  private String dataLength;

  private String dataType;

  private String description;

  private String objectName;

  public Meta3() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Meta3(String columnID, String columnName, String dataLength, String dataType, String description, String objectName) {
    this.columnID = columnID;
    this.columnName = columnName;
    this.dataLength = dataLength;
    this.dataType = dataType;
    this.description = description;
    this.objectName = objectName;
  }

  public Meta3 columnID(String columnID) {
    this.columnID = columnID;
    return this;
  }

  /**
   * Get columnID
   * @return columnID
  */
  @NotNull 
  @Schema(name = "ColumnID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ColumnID")
  public String getColumnID() {
    return columnID;
  }

  public void setColumnID(String columnID) {
    this.columnID = columnID;
  }

  public Meta3 columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Get columnName
   * @return columnName
  */
  @NotNull 
  @Schema(name = "ColumnName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ColumnName")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public Meta3 dataLength(String dataLength) {
    this.dataLength = dataLength;
    return this;
  }

  /**
   * Data length for EPA program database column.
   * @return dataLength
  */
  @NotNull 
  @Schema(name = "DataLength", example = "10", description = "Data length for EPA program database column.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("DataLength")
  public String getDataLength() {
    return dataLength;
  }

  public void setDataLength(String dataLength) {
    this.dataLength = dataLength;
  }

  public Meta3 dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Data type for EPA program database column.
   * @return dataType
  */
  @NotNull 
  @Schema(name = "DataType", example = "NUMBER", description = "Data type for EPA program database column.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("DataType")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public Meta3 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Meta3 objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * The JSON name used for the database column.
   * @return objectName
  */
  @NotNull 
  @Schema(name = "ObjectName", example = "CaseName", description = "The JSON name used for the database column.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ObjectName")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta3 meta3 = (Meta3) o;
    return Objects.equals(this.columnID, meta3.columnID) &&
        Objects.equals(this.columnName, meta3.columnName) &&
        Objects.equals(this.dataLength, meta3.dataLength) &&
        Objects.equals(this.dataType, meta3.dataType) &&
        Objects.equals(this.description, meta3.description) &&
        Objects.equals(this.objectName, meta3.objectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnID, columnName, dataLength, dataType, description, objectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta3 {\n");
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    dataLength: ").append(toIndentedString(dataLength)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
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

