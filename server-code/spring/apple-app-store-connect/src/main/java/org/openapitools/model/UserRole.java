package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UserRole
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public enum UserRole {
  
  ADMIN("ADMIN"),
  
  FINANCE("FINANCE"),
  
  TECHNICAL("TECHNICAL"),
  
  ACCOUNT_HOLDER("ACCOUNT_HOLDER"),
  
  READ_ONLY("READ_ONLY"),
  
  SALES("SALES"),
  
  MARKETING("MARKETING"),
  
  APP_MANAGER("APP_MANAGER"),
  
  DEVELOPER("DEVELOPER"),
  
  ACCESS_TO_REPORTS("ACCESS_TO_REPORTS"),
  
  CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"),
  
  CREATE_APPS("CREATE_APPS"),
  
  CLOUD_MANAGED_DEVELOPER_ID("CLOUD_MANAGED_DEVELOPER_ID"),
  
  CLOUD_MANAGED_APP_DISTRIBUTION("CLOUD_MANAGED_APP_DISTRIBUTION");

  private String value;

  UserRole(String value) {
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
  public static UserRole fromValue(String value) {
    for (UserRole b : UserRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

