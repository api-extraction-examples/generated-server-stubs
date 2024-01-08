package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillAgent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:54:38.614249-04:00[America/Lower_Princes]")
public class BillAgent {

  private JsonNullable<String> address = JsonNullable.<String>undefined();

  private JsonNullable<String> email = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> phoneNo = JsonNullable.<String>undefined();

  private JsonNullable<String> website = JsonNullable.<String>undefined();

  public BillAgent address(String address) {
    this.address = JsonNullable.of(address);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public JsonNullable<String> getAddress() {
    return address;
  }

  public void setAddress(JsonNullable<String> address) {
    this.address = address;
  }

  public BillAgent email(String email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public JsonNullable<String> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<String> email) {
    this.email = email;
  }

  public BillAgent name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public BillAgent phoneNo(String phoneNo) {
    this.phoneNo = JsonNullable.of(phoneNo);
    return this;
  }

  /**
   * Get phoneNo
   * @return phoneNo
  */
  
  @Schema(name = "phoneNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneNo")
  public JsonNullable<String> getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(JsonNullable<String> phoneNo) {
    this.phoneNo = phoneNo;
  }

  public BillAgent website(String website) {
    this.website = JsonNullable.of(website);
    return this;
  }

  /**
   * Get website
   * @return website
  */
  
  @Schema(name = "website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public JsonNullable<String> getWebsite() {
    return website;
  }

  public void setWebsite(JsonNullable<String> website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillAgent billAgent = (BillAgent) o;
    return equalsNullable(this.address, billAgent.address) &&
        equalsNullable(this.email, billAgent.email) &&
        equalsNullable(this.name, billAgent.name) &&
        equalsNullable(this.phoneNo, billAgent.phoneNo) &&
        equalsNullable(this.website, billAgent.website);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(address), hashCodeNullable(email), hashCodeNullable(name), hashCodeNullable(phoneNo), hashCodeNullable(website));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillAgent {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

