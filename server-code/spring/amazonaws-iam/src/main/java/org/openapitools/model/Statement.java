package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PolicySourceType;
import org.openapitools.model.StatementEndPosition;
import org.openapitools.model.StatementStartPosition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains a reference to a &lt;code&gt;Statement&lt;/code&gt; element in a policy document that determines the result of the simulation.&lt;/p&gt; &lt;p&gt;This data type is used by the &lt;code&gt;MatchedStatements&lt;/code&gt; member of the &lt;code&gt; &lt;a&gt;EvaluationResult&lt;/a&gt; &lt;/code&gt; type.&lt;/p&gt;
 */

@Schema(name = "Statement", description = "<p>Contains a reference to a <code>Statement</code> element in a policy document that determines the result of the simulation.</p> <p>This data type is used by the <code>MatchedStatements</code> member of the <code> <a>EvaluationResult</a> </code> type.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class Statement {

  private String sourcePolicyId;

  private PolicySourceType sourcePolicyType;

  private StatementStartPosition startPosition;

  private StatementEndPosition endPosition;

  public Statement sourcePolicyId(String sourcePolicyId) {
    this.sourcePolicyId = sourcePolicyId;
    return this;
  }

  /**
   * Get sourcePolicyId
   * @return sourcePolicyId
  */
  
  @Schema(name = "SourcePolicyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SourcePolicyId")
  public String getSourcePolicyId() {
    return sourcePolicyId;
  }

  public void setSourcePolicyId(String sourcePolicyId) {
    this.sourcePolicyId = sourcePolicyId;
  }

  public Statement sourcePolicyType(PolicySourceType sourcePolicyType) {
    this.sourcePolicyType = sourcePolicyType;
    return this;
  }

  /**
   * Get sourcePolicyType
   * @return sourcePolicyType
  */
  @Valid 
  @Schema(name = "SourcePolicyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SourcePolicyType")
  public PolicySourceType getSourcePolicyType() {
    return sourcePolicyType;
  }

  public void setSourcePolicyType(PolicySourceType sourcePolicyType) {
    this.sourcePolicyType = sourcePolicyType;
  }

  public Statement startPosition(StatementStartPosition startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition
   * @return startPosition
  */
  @Valid 
  @Schema(name = "StartPosition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartPosition")
  public StatementStartPosition getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(StatementStartPosition startPosition) {
    this.startPosition = startPosition;
  }

  public Statement endPosition(StatementEndPosition endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * Get endPosition
   * @return endPosition
  */
  @Valid 
  @Schema(name = "EndPosition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndPosition")
  public StatementEndPosition getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(StatementEndPosition endPosition) {
    this.endPosition = endPosition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.sourcePolicyId, statement.sourcePolicyId) &&
        Objects.equals(this.sourcePolicyType, statement.sourcePolicyType) &&
        Objects.equals(this.startPosition, statement.startPosition) &&
        Objects.equals(this.endPosition, statement.endPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourcePolicyId, sourcePolicyType, startPosition, endPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    sb.append("    sourcePolicyId: ").append(toIndentedString(sourcePolicyId)).append("\n");
    sb.append("    sourcePolicyType: ").append(toIndentedString(sourcePolicyType)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
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

