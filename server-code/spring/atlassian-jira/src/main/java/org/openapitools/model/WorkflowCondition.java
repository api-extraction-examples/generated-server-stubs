package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowCompoundCondition;
import org.openapitools.model.WorkflowSimpleCondition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@JsonIgnoreProperties(
  value = "nodeType", // ignore manually set nodeType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the nodeType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "nodeType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = WorkflowCompoundCondition.class, name = "compound"),
  @JsonSubTypes.Type(value = WorkflowSimpleCondition.class, name = "simple"),
  @JsonSubTypes.Type(value = WorkflowCompoundCondition.class, name = "WorkflowCompoundCondition"),
  @JsonSubTypes.Type(value = WorkflowSimpleCondition.class, name = "WorkflowSimpleCondition")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public interface WorkflowCondition {
    public String getNodeType();
}
