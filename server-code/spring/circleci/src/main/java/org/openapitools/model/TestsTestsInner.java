package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Status;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TestsTestsInner
 */

@JsonTypeName("Tests_tests_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class TestsTestsInner {

  private String classname;

  private String file;

  private String message;

  private String name;

  private Status result;

  private BigDecimal runTime;

  private String source;

  public TestsTestsInner classname(String classname) {
    this.classname = classname;
    return this;
  }

  /**
   * Get classname
   * @return classname
  */
  
  @Schema(name = "classname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("classname")
  public String getClassname() {
    return classname;
  }

  public void setClassname(String classname) {
    this.classname = classname;
  }

  public TestsTestsInner file(String file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  
  @Schema(name = "file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public TestsTestsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TestsTestsInner name(String name) {
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

  public TestsTestsInner result(Status result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @Valid 
  @Schema(name = "result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public Status getResult() {
    return result;
  }

  public void setResult(Status result) {
    this.result = result;
  }

  public TestsTestsInner runTime(BigDecimal runTime) {
    this.runTime = runTime;
    return this;
  }

  /**
   * Get runTime
   * @return runTime
  */
  @Valid 
  @Schema(name = "run_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("run_time")
  public BigDecimal getRunTime() {
    return runTime;
  }

  public void setRunTime(BigDecimal runTime) {
    this.runTime = runTime;
  }

  public TestsTestsInner source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsTestsInner testsTestsInner = (TestsTestsInner) o;
    return Objects.equals(this.classname, testsTestsInner.classname) &&
        Objects.equals(this.file, testsTestsInner.file) &&
        Objects.equals(this.message, testsTestsInner.message) &&
        Objects.equals(this.name, testsTestsInner.name) &&
        Objects.equals(this.result, testsTestsInner.result) &&
        Objects.equals(this.runTime, testsTestsInner.runTime) &&
        Objects.equals(this.source, testsTestsInner.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classname, file, message, name, result, runTime, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsTestsInner {\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

