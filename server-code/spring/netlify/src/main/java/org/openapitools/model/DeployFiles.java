package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.FunctionConfig;
import org.openapitools.model.FunctionSchedule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeployFiles
 */

@JsonTypeName("deployFiles")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class DeployFiles {

  private Boolean async;

  private String branch;

  private Boolean draft;

  private Object files;

  private String framework;

  @Valid
  private List<@Valid FunctionSchedule> functionSchedules;

  private Object functions;

  @Valid
  private Map<String, FunctionConfig> functionsConfig = new HashMap<>();

  public DeployFiles async(Boolean async) {
    this.async = async;
    return this;
  }

  /**
   * Get async
   * @return async
  */
  
  @Schema(name = "async", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("async")
  public Boolean getAsync() {
    return async;
  }

  public void setAsync(Boolean async) {
    this.async = async;
  }

  public DeployFiles branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  */
  
  @Schema(name = "branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public DeployFiles draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

  /**
   * Get draft
   * @return draft
  */
  
  @Schema(name = "draft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("draft")
  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public DeployFiles files(Object files) {
    this.files = files;
    return this;
  }

  /**
   * Get files
   * @return files
  */
  
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public Object getFiles() {
    return files;
  }

  public void setFiles(Object files) {
    this.files = files;
  }

  public DeployFiles framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Get framework
   * @return framework
  */
  
  @Schema(name = "framework", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("framework")
  public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }

  public DeployFiles functionSchedules(List<@Valid FunctionSchedule> functionSchedules) {
    this.functionSchedules = functionSchedules;
    return this;
  }

  public DeployFiles addFunctionSchedulesItem(FunctionSchedule functionSchedulesItem) {
    if (this.functionSchedules == null) {
      this.functionSchedules = new ArrayList<>();
    }
    this.functionSchedules.add(functionSchedulesItem);
    return this;
  }

  /**
   * Get functionSchedules
   * @return functionSchedules
  */
  @Valid 
  @Schema(name = "function_schedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function_schedules")
  public List<@Valid FunctionSchedule> getFunctionSchedules() {
    return functionSchedules;
  }

  public void setFunctionSchedules(List<@Valid FunctionSchedule> functionSchedules) {
    this.functionSchedules = functionSchedules;
  }

  public DeployFiles functions(Object functions) {
    this.functions = functions;
    return this;
  }

  /**
   * Get functions
   * @return functions
  */
  
  @Schema(name = "functions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions")
  public Object getFunctions() {
    return functions;
  }

  public void setFunctions(Object functions) {
    this.functions = functions;
  }

  public DeployFiles functionsConfig(Map<String, FunctionConfig> functionsConfig) {
    this.functionsConfig = functionsConfig;
    return this;
  }

  public DeployFiles putFunctionsConfigItem(String key, FunctionConfig functionsConfigItem) {
    if (this.functionsConfig == null) {
      this.functionsConfig = new HashMap<>();
    }
    this.functionsConfig.put(key, functionsConfigItem);
    return this;
  }

  /**
   * Get functionsConfig
   * @return functionsConfig
  */
  @Valid 
  @Schema(name = "functions_config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions_config")
  public Map<String, FunctionConfig> getFunctionsConfig() {
    return functionsConfig;
  }

  public void setFunctionsConfig(Map<String, FunctionConfig> functionsConfig) {
    this.functionsConfig = functionsConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployFiles deployFiles = (DeployFiles) o;
    return Objects.equals(this.async, deployFiles.async) &&
        Objects.equals(this.branch, deployFiles.branch) &&
        Objects.equals(this.draft, deployFiles.draft) &&
        Objects.equals(this.files, deployFiles.files) &&
        Objects.equals(this.framework, deployFiles.framework) &&
        Objects.equals(this.functionSchedules, deployFiles.functionSchedules) &&
        Objects.equals(this.functions, deployFiles.functions) &&
        Objects.equals(this.functionsConfig, deployFiles.functionsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(async, branch, draft, files, framework, functionSchedules, functions, functionsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployFiles {\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    functionSchedules: ").append(toIndentedString(functionSchedules)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    functionsConfig: ").append(toIndentedString(functionsConfig)).append("\n");
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

