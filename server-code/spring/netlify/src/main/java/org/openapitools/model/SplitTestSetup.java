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
 * SplitTestSetup
 */

@JsonTypeName("splitTestSetup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class SplitTestSetup {

  private Object branchTests;

  public SplitTestSetup branchTests(Object branchTests) {
    this.branchTests = branchTests;
    return this;
  }

  /**
   * Get branchTests
   * @return branchTests
  */
  
  @Schema(name = "branch_tests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branch_tests")
  public Object getBranchTests() {
    return branchTests;
  }

  public void setBranchTests(Object branchTests) {
    this.branchTests = branchTests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTestSetup splitTestSetup = (SplitTestSetup) o;
    return Objects.equals(this.branchTests, splitTestSetup.branchTests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchTests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTestSetup {\n");
    sb.append("    branchTests: ").append(toIndentedString(branchTests)).append("\n");
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

