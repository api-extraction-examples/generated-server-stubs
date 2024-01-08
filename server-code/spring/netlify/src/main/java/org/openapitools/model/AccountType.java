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
 * AccountType
 */

@JsonTypeName("accountType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountType {

  private Object capabilities;

  private String description;

  private String id;

  private Integer monthlyDollarPrice;

  private Integer monthlySeatsAddonDollarPrice;

  private String name;

  private Integer yearlyDollarPrice;

  private Integer yearlySeatsAddonDollarPrice;

  public AccountType capabilities(Object capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
  
  @Schema(name = "capabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capabilities")
  public Object getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Object capabilities) {
    this.capabilities = capabilities;
  }

  public AccountType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountType monthlyDollarPrice(Integer monthlyDollarPrice) {
    this.monthlyDollarPrice = monthlyDollarPrice;
    return this;
  }

  /**
   * Get monthlyDollarPrice
   * @return monthlyDollarPrice
  */
  
  @Schema(name = "monthly_dollar_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthly_dollar_price")
  public Integer getMonthlyDollarPrice() {
    return monthlyDollarPrice;
  }

  public void setMonthlyDollarPrice(Integer monthlyDollarPrice) {
    this.monthlyDollarPrice = monthlyDollarPrice;
  }

  public AccountType monthlySeatsAddonDollarPrice(Integer monthlySeatsAddonDollarPrice) {
    this.monthlySeatsAddonDollarPrice = monthlySeatsAddonDollarPrice;
    return this;
  }

  /**
   * Get monthlySeatsAddonDollarPrice
   * @return monthlySeatsAddonDollarPrice
  */
  
  @Schema(name = "monthly_seats_addon_dollar_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthly_seats_addon_dollar_price")
  public Integer getMonthlySeatsAddonDollarPrice() {
    return monthlySeatsAddonDollarPrice;
  }

  public void setMonthlySeatsAddonDollarPrice(Integer monthlySeatsAddonDollarPrice) {
    this.monthlySeatsAddonDollarPrice = monthlySeatsAddonDollarPrice;
  }

  public AccountType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountType yearlyDollarPrice(Integer yearlyDollarPrice) {
    this.yearlyDollarPrice = yearlyDollarPrice;
    return this;
  }

  /**
   * Get yearlyDollarPrice
   * @return yearlyDollarPrice
  */
  
  @Schema(name = "yearly_dollar_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearly_dollar_price")
  public Integer getYearlyDollarPrice() {
    return yearlyDollarPrice;
  }

  public void setYearlyDollarPrice(Integer yearlyDollarPrice) {
    this.yearlyDollarPrice = yearlyDollarPrice;
  }

  public AccountType yearlySeatsAddonDollarPrice(Integer yearlySeatsAddonDollarPrice) {
    this.yearlySeatsAddonDollarPrice = yearlySeatsAddonDollarPrice;
    return this;
  }

  /**
   * Get yearlySeatsAddonDollarPrice
   * @return yearlySeatsAddonDollarPrice
  */
  
  @Schema(name = "yearly_seats_addon_dollar_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearly_seats_addon_dollar_price")
  public Integer getYearlySeatsAddonDollarPrice() {
    return yearlySeatsAddonDollarPrice;
  }

  public void setYearlySeatsAddonDollarPrice(Integer yearlySeatsAddonDollarPrice) {
    this.yearlySeatsAddonDollarPrice = yearlySeatsAddonDollarPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountType accountType = (AccountType) o;
    return Objects.equals(this.capabilities, accountType.capabilities) &&
        Objects.equals(this.description, accountType.description) &&
        Objects.equals(this.id, accountType.id) &&
        Objects.equals(this.monthlyDollarPrice, accountType.monthlyDollarPrice) &&
        Objects.equals(this.monthlySeatsAddonDollarPrice, accountType.monthlySeatsAddonDollarPrice) &&
        Objects.equals(this.name, accountType.name) &&
        Objects.equals(this.yearlyDollarPrice, accountType.yearlyDollarPrice) &&
        Objects.equals(this.yearlySeatsAddonDollarPrice, accountType.yearlySeatsAddonDollarPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, description, id, monthlyDollarPrice, monthlySeatsAddonDollarPrice, name, yearlyDollarPrice, yearlySeatsAddonDollarPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountType {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    monthlyDollarPrice: ").append(toIndentedString(monthlyDollarPrice)).append("\n");
    sb.append("    monthlySeatsAddonDollarPrice: ").append(toIndentedString(monthlySeatsAddonDollarPrice)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    yearlyDollarPrice: ").append(toIndentedString(yearlyDollarPrice)).append("\n");
    sb.append("    yearlySeatsAddonDollarPrice: ").append(toIndentedString(yearlySeatsAddonDollarPrice)).append("\n");
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

