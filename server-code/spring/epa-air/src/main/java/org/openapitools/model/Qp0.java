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
 * Query Parameters Object
 */

@Schema(name = "qp0", description = "Query Parameters Object")
@JsonTypeName("qp0")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Qp0 {

  private String QP;

  private String QV;

  public Qp0() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Qp0(String QP, String QV) {
    this.QP = QP;
    this.QV = QV;
  }

  public Qp0 QP(String QP) {
    this.QP = QP;
    return this;
  }

  /**
   * Query parameter
   * @return QP
  */
  @NotNull 
  @Schema(name = "QP", example = "output", description = "Query parameter", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("QP")
  public String getQP() {
    return QP;
  }

  public void setQP(String QP) {
    this.QP = QP;
  }

  public Qp0 QV(String QV) {
    this.QV = QV;
    return this;
  }

  /**
   * Query value
   * @return QV
  */
  @NotNull 
  @Schema(name = "QV", example = "JSON", description = "Query value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("QV")
  public String getQV() {
    return QV;
  }

  public void setQV(String QV) {
    this.QV = QV;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qp0 qp0 = (Qp0) o;
    return Objects.equals(this.QP, qp0.QP) &&
        Objects.equals(this.QV, qp0.QV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QP, QV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qp0 {\n");
    sb.append("    QP: ").append(toIndentedString(QP)).append("\n");
    sb.append("    QV: ").append(toIndentedString(QV)).append("\n");
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

