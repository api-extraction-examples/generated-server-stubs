package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DiagnosticSignatureAttributes
 */

@JsonTypeName("DiagnosticSignature_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class DiagnosticSignatureAttributes {

  /**
   * Gets or Sets diagnosticType
   */
  public enum DiagnosticTypeEnum {
    DISK_WRITES("DISK_WRITES");

    private String value;

    DiagnosticTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiagnosticTypeEnum fromValue(String value) {
      for (DiagnosticTypeEnum b : DiagnosticTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DiagnosticTypeEnum diagnosticType;

  private String signature;

  private BigDecimal weight;

  public DiagnosticSignatureAttributes diagnosticType(DiagnosticTypeEnum diagnosticType) {
    this.diagnosticType = diagnosticType;
    return this;
  }

  /**
   * Get diagnosticType
   * @return diagnosticType
  */
  
  @Schema(name = "diagnosticType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diagnosticType")
  public DiagnosticTypeEnum getDiagnosticType() {
    return diagnosticType;
  }

  public void setDiagnosticType(DiagnosticTypeEnum diagnosticType) {
    this.diagnosticType = diagnosticType;
  }

  public DiagnosticSignatureAttributes signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  */
  
  @Schema(name = "signature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signature")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public DiagnosticSignatureAttributes weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  @Valid 
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticSignatureAttributes diagnosticSignatureAttributes = (DiagnosticSignatureAttributes) o;
    return Objects.equals(this.diagnosticType, diagnosticSignatureAttributes.diagnosticType) &&
        Objects.equals(this.signature, diagnosticSignatureAttributes.signature) &&
        Objects.equals(this.weight, diagnosticSignatureAttributes.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosticType, signature, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticSignatureAttributes {\n");
    sb.append("    diagnosticType: ").append(toIndentedString(diagnosticType)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

