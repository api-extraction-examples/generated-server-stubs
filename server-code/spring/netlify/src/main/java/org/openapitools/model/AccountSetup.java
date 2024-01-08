package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountSetup
 */

@JsonTypeName("accountSetup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountSetup {

  private Integer extraSeatsBlock;

  private String name;

  private String paymentMethodId;

  /**
   * Gets or Sets period
   */
  public enum PeriodEnum {
    MONTHLY("monthly"),
    
    YEARLY("yearly");

    private String value;

    PeriodEnum(String value) {
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
    public static PeriodEnum fromValue(String value) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PeriodEnum period;

  private String typeId;

  public AccountSetup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountSetup(String name, String typeId) {
    this.name = name;
    this.typeId = typeId;
  }

  public AccountSetup extraSeatsBlock(Integer extraSeatsBlock) {
    this.extraSeatsBlock = extraSeatsBlock;
    return this;
  }

  /**
   * Get extraSeatsBlock
   * @return extraSeatsBlock
  */
  
  @Schema(name = "extra_seats_block", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra_seats_block")
  public Integer getExtraSeatsBlock() {
    return extraSeatsBlock;
  }

  public void setExtraSeatsBlock(Integer extraSeatsBlock) {
    this.extraSeatsBlock = extraSeatsBlock;
  }

  public AccountSetup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountSetup paymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

  /**
   * Get paymentMethodId
   * @return paymentMethodId
  */
  
  @Schema(name = "payment_method_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment_method_id")
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public AccountSetup period(PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public AccountSetup typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  */
  @NotNull 
  @Schema(name = "type_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type_id")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSetup accountSetup = (AccountSetup) o;
    return Objects.equals(this.extraSeatsBlock, accountSetup.extraSeatsBlock) &&
        Objects.equals(this.name, accountSetup.name) &&
        Objects.equals(this.paymentMethodId, accountSetup.paymentMethodId) &&
        Objects.equals(this.period, accountSetup.period) &&
        Objects.equals(this.typeId, accountSetup.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraSeatsBlock, name, paymentMethodId, period, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSetup {\n");
    sb.append("    extraSeatsBlock: ").append(toIndentedString(extraSeatsBlock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

