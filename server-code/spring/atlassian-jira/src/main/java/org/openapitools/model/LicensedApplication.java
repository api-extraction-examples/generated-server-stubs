package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a licensed Jira application.
 */

@Schema(name = "LicensedApplication", description = "Details about a licensed Jira application.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class LicensedApplication {

  private String id;

  /**
   * The licensing plan.
   */
  public enum PlanEnum {
    UNLICENSED("UNLICENSED"),
    
    FREE("FREE"),
    
    PAID("PAID");

    private String value;

    PlanEnum(String value) {
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
    public static PlanEnum fromValue(String value) {
      for (PlanEnum b : PlanEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PlanEnum plan;

  public LicensedApplication() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LicensedApplication(String id, PlanEnum plan) {
    this.id = id;
    this.plan = plan;
  }

  public LicensedApplication id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the application.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the application.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LicensedApplication plan(PlanEnum plan) {
    this.plan = plan;
    return this;
  }

  /**
   * The licensing plan.
   * @return plan
  */
  
  @Schema(name = "plan", accessMode = Schema.AccessMode.READ_ONLY, description = "The licensing plan.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("plan")
  public PlanEnum getPlan() {
    return plan;
  }

  public void setPlan(PlanEnum plan) {
    this.plan = plan;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicensedApplication licensedApplication = (LicensedApplication) o;
    return Objects.equals(this.id, licensedApplication.id) &&
        Objects.equals(this.plan, licensedApplication.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicensedApplication {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

