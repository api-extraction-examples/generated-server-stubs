package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TestsTestsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Tests
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class Tests {

  @Valid
  private List<@Valid TestsTestsInner> tests;

  public Tests tests(List<@Valid TestsTestsInner> tests) {
    this.tests = tests;
    return this;
  }

  public Tests addTestsItem(TestsTestsInner testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

  /**
   * Get tests
   * @return tests
  */
  @Valid 
  @Schema(name = "tests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tests")
  public List<@Valid TestsTestsInner> getTests() {
    return tests;
  }

  public void setTests(List<@Valid TestsTestsInner> tests) {
    this.tests = tests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tests tests = (Tests) o;
    return Objects.equals(this.tests, tests.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tests {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

