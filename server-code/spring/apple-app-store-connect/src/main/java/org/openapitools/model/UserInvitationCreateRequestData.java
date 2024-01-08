package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.UserInvitationCreateRequestDataAttributes;
import org.openapitools.model.UserInvitationCreateRequestDataRelationships;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserInvitationCreateRequestData
 */

@JsonTypeName("UserInvitationCreateRequest_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class UserInvitationCreateRequestData {

  private UserInvitationCreateRequestDataAttributes attributes;

  private UserInvitationCreateRequestDataRelationships relationships;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    USERINVITATIONS("userInvitations");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public UserInvitationCreateRequestData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserInvitationCreateRequestData(UserInvitationCreateRequestDataAttributes attributes, TypeEnum type) {
    this.attributes = attributes;
    this.type = type;
  }

  public UserInvitationCreateRequestData attributes(UserInvitationCreateRequestDataAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @NotNull @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public UserInvitationCreateRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UserInvitationCreateRequestDataAttributes attributes) {
    this.attributes = attributes;
  }

  public UserInvitationCreateRequestData relationships(UserInvitationCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  */
  @Valid 
  @Schema(name = "relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationships")
  public UserInvitationCreateRequestDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(UserInvitationCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
  }

  public UserInvitationCreateRequestData type(TypeEnum type) {
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
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    UserInvitationCreateRequestData userInvitationCreateRequestData = (UserInvitationCreateRequestData) o;
    return Objects.equals(this.attributes, userInvitationCreateRequestData.attributes) &&
        Objects.equals(this.relationships, userInvitationCreateRequestData.relationships) &&
        Objects.equals(this.type, userInvitationCreateRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInvitationCreateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

