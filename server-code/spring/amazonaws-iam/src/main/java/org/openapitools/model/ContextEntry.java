package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.model.ContextKeyTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about a condition context key. It includes the name of the key and specifies the value (or values, if the context key supports multiple values) to use in the simulation. This information is used when evaluating the &lt;code&gt;Condition&lt;/code&gt; elements of the input policies.&lt;/p&gt; &lt;p&gt;This data type is used as an input parameter to &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; and &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt;.&lt;/p&gt;
 */

@Schema(name = "ContextEntry", description = "<p>Contains information about a condition context key. It includes the name of the key and specifies the value (or values, if the context key supports multiple values) to use in the simulation. This information is used when evaluating the <code>Condition</code> elements of the input policies.</p> <p>This data type is used as an input parameter to <a>SimulateCustomPolicy</a> and <a>SimulatePrincipalPolicy</a>.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ContextEntry {

  private String contextKeyName;

  private List contextKeyValues;

  private ContextKeyTypeEnum contextKeyType;

  public ContextEntry contextKeyName(String contextKeyName) {
    this.contextKeyName = contextKeyName;
    return this;
  }

  /**
   * Get contextKeyName
   * @return contextKeyName
  */
  
  @Schema(name = "ContextKeyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContextKeyName")
  public String getContextKeyName() {
    return contextKeyName;
  }

  public void setContextKeyName(String contextKeyName) {
    this.contextKeyName = contextKeyName;
  }

  public ContextEntry contextKeyValues(List contextKeyValues) {
    this.contextKeyValues = contextKeyValues;
    return this;
  }

  /**
   * Get contextKeyValues
   * @return contextKeyValues
  */
  @Valid 
  @Schema(name = "ContextKeyValues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContextKeyValues")
  public List getContextKeyValues() {
    return contextKeyValues;
  }

  public void setContextKeyValues(List contextKeyValues) {
    this.contextKeyValues = contextKeyValues;
  }

  public ContextEntry contextKeyType(ContextKeyTypeEnum contextKeyType) {
    this.contextKeyType = contextKeyType;
    return this;
  }

  /**
   * Get contextKeyType
   * @return contextKeyType
  */
  @Valid 
  @Schema(name = "ContextKeyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContextKeyType")
  public ContextKeyTypeEnum getContextKeyType() {
    return contextKeyType;
  }

  public void setContextKeyType(ContextKeyTypeEnum contextKeyType) {
    this.contextKeyType = contextKeyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextEntry contextEntry = (ContextEntry) o;
    return Objects.equals(this.contextKeyName, contextEntry.contextKeyName) &&
        Objects.equals(this.contextKeyValues, contextEntry.contextKeyValues) &&
        Objects.equals(this.contextKeyType, contextEntry.contextKeyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextKeyName, contextKeyValues, contextKeyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextEntry {\n");
    sb.append("    contextKeyName: ").append(toIndentedString(contextKeyName)).append("\n");
    sb.append("    contextKeyValues: ").append(toIndentedString(contextKeyValues)).append("\n");
    sb.append("    contextKeyType: ").append(toIndentedString(contextKeyType)).append("\n");
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

