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
 * InAppPurchaseAttributes
 */

@JsonTypeName("InAppPurchase_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class InAppPurchaseAttributes {

  /**
   * Gets or Sets inAppPurchaseType
   */
  public enum InAppPurchaseTypeEnum {
    AUTOMATICALLY_RENEWABLE_SUBSCRIPTION("AUTOMATICALLY_RENEWABLE_SUBSCRIPTION"),
    
    NON_CONSUMABLE("NON_CONSUMABLE"),
    
    CONSUMABLE("CONSUMABLE"),
    
    NON_RENEWING_SUBSCRIPTION("NON_RENEWING_SUBSCRIPTION"),
    
    FREE_SUBSCRIPTION("FREE_SUBSCRIPTION");

    private String value;

    InAppPurchaseTypeEnum(String value) {
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
    public static InAppPurchaseTypeEnum fromValue(String value) {
      for (InAppPurchaseTypeEnum b : InAppPurchaseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private InAppPurchaseTypeEnum inAppPurchaseType;

  private String productId;

  private String referenceName;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    CREATED("CREATED"),
    
    DEVELOPER_SIGNED_OFF("DEVELOPER_SIGNED_OFF"),
    
    DEVELOPER_ACTION_NEEDED("DEVELOPER_ACTION_NEEDED"),
    
    DELETION_IN_PROGRESS("DELETION_IN_PROGRESS"),
    
    APPROVED("APPROVED"),
    
    DELETED("DELETED"),
    
    REMOVED_FROM_SALE("REMOVED_FROM_SALE"),
    
    DEVELOPER_REMOVED_FROM_SALE("DEVELOPER_REMOVED_FROM_SALE"),
    
    WAITING_FOR_UPLOAD("WAITING_FOR_UPLOAD"),
    
    PROCESSING_CONTENT("PROCESSING_CONTENT"),
    
    REPLACED("REPLACED"),
    
    REJECTED("REJECTED"),
    
    WAITING_FOR_SCREENSHOT("WAITING_FOR_SCREENSHOT"),
    
    PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"),
    
    MISSING_METADATA("MISSING_METADATA"),
    
    READY_TO_SUBMIT("READY_TO_SUBMIT"),
    
    WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"),
    
    IN_REVIEW("IN_REVIEW"),
    
    PENDING_DEVELOPER_RELEASE("PENDING_DEVELOPER_RELEASE");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  public InAppPurchaseAttributes inAppPurchaseType(InAppPurchaseTypeEnum inAppPurchaseType) {
    this.inAppPurchaseType = inAppPurchaseType;
    return this;
  }

  /**
   * Get inAppPurchaseType
   * @return inAppPurchaseType
  */
  
  @Schema(name = "inAppPurchaseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inAppPurchaseType")
  public InAppPurchaseTypeEnum getInAppPurchaseType() {
    return inAppPurchaseType;
  }

  public void setInAppPurchaseType(InAppPurchaseTypeEnum inAppPurchaseType) {
    this.inAppPurchaseType = inAppPurchaseType;
  }

  public InAppPurchaseAttributes productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public InAppPurchaseAttributes referenceName(String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

  /**
   * Get referenceName
   * @return referenceName
  */
  
  @Schema(name = "referenceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceName")
  public String getReferenceName() {
    return referenceName;
  }

  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }

  public InAppPurchaseAttributes state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InAppPurchaseAttributes inAppPurchaseAttributes = (InAppPurchaseAttributes) o;
    return Objects.equals(this.inAppPurchaseType, inAppPurchaseAttributes.inAppPurchaseType) &&
        Objects.equals(this.productId, inAppPurchaseAttributes.productId) &&
        Objects.equals(this.referenceName, inAppPurchaseAttributes.referenceName) &&
        Objects.equals(this.state, inAppPurchaseAttributes.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inAppPurchaseType, productId, referenceName, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InAppPurchaseAttributes {\n");
    sb.append("    inAppPurchaseType: ").append(toIndentedString(inAppPurchaseType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

