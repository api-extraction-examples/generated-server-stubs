package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TransitionScreenDetails;
import org.openapitools.model.WorkflowRules;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a workflow transition.
 */

@Schema(name = "Transition", description = "Details of a workflow transition.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Transition {

  private String description;

  @Valid
  private List<String> from = new ArrayList<>();

  private String id;

  private String name;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  private WorkflowRules rules;

  private TransitionScreenDetails screen;

  private String to;

  /**
   * The type of the transition.
   */
  public enum TypeEnum {
    GLOBAL("global"),
    
    INITIAL("initial"),
    
    DIRECTED("directed");

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

  public Transition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Transition(String description, List<String> from, String id, String name, String to, TypeEnum type) {
    this.description = description;
    this.from = from;
    this.id = id;
    this.name = name;
    this.to = to;
    this.type = type;
  }

  public Transition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the transition.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "The description of the transition.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transition from(List<String> from) {
    this.from = from;
    return this;
  }

  public Transition addFromItem(String fromItem) {
    if (this.from == null) {
      this.from = new ArrayList<>();
    }
    this.from.add(fromItem);
    return this;
  }

  /**
   * The statuses the transition can start from.
   * @return from
  */
  @NotNull 
  @Schema(name = "from", description = "The statuses the transition can start from.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("from")
  public List<String> getFrom() {
    return from;
  }

  public void setFrom(List<String> from) {
    this.from = from;
  }

  public Transition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the transition.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the transition.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Transition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the transition.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the transition.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Transition properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public Transition putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * The properties of the transition.
   * @return properties
  */
  
  @Schema(name = "properties", description = "The properties of the transition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public Transition rules(WorkflowRules rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Get rules
   * @return rules
  */
  @Valid 
  @Schema(name = "rules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rules")
  public WorkflowRules getRules() {
    return rules;
  }

  public void setRules(WorkflowRules rules) {
    this.rules = rules;
  }

  public Transition screen(TransitionScreenDetails screen) {
    this.screen = screen;
    return this;
  }

  /**
   * Get screen
   * @return screen
  */
  @Valid 
  @Schema(name = "screen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screen")
  public TransitionScreenDetails getScreen() {
    return screen;
  }

  public void setScreen(TransitionScreenDetails screen) {
    this.screen = screen;
  }

  public Transition to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The status the transition goes to.
   * @return to
  */
  @NotNull 
  @Schema(name = "to", description = "The status the transition goes to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Transition type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transition.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the transition.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Transition transition = (Transition) o;
    return Objects.equals(this.description, transition.description) &&
        Objects.equals(this.from, transition.from) &&
        Objects.equals(this.id, transition.id) &&
        Objects.equals(this.name, transition.name) &&
        Objects.equals(this.properties, transition.properties) &&
        Objects.equals(this.rules, transition.rules) &&
        Objects.equals(this.screen, transition.screen) &&
        Objects.equals(this.to, transition.to) &&
        Objects.equals(this.type, transition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, from, id, name, properties, rules, screen, to, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

