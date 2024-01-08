package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SecuritySchemeLevelBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AddSecuritySchemeLevelsRequestBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AddSecuritySchemeLevelsRequestBean {

  @Valid
  private List<@Valid SecuritySchemeLevelBean> levels;

  public AddSecuritySchemeLevelsRequestBean levels(List<@Valid SecuritySchemeLevelBean> levels) {
    this.levels = levels;
    return this;
  }

  public AddSecuritySchemeLevelsRequestBean addLevelsItem(SecuritySchemeLevelBean levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * The list of scheme levels which should be added to the security scheme.
   * @return levels
  */
  @Valid 
  @Schema(name = "levels", description = "The list of scheme levels which should be added to the security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levels")
  public List<@Valid SecuritySchemeLevelBean> getLevels() {
    return levels;
  }

  public void setLevels(List<@Valid SecuritySchemeLevelBean> levels) {
    this.levels = levels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSecuritySchemeLevelsRequestBean addSecuritySchemeLevelsRequestBean = (AddSecuritySchemeLevelsRequestBean) o;
    return Objects.equals(this.levels, addSecuritySchemeLevelsRequestBean.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSecuritySchemeLevelsRequestBean {\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

