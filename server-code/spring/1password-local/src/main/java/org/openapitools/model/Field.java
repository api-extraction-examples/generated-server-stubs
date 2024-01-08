package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.FieldSection;
import org.openapitools.model.GeneratorRecipe;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Field
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class Field {

  private BigDecimal entropy;

  private Boolean generate = false;

  private String id;

  private String label;

  /**
   * Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.
   */
  public enum PurposeEnum {
    EMPTY(""),
    
    USERNAME("USERNAME"),
    
    PASSWORD("PASSWORD"),
    
    NOTES("NOTES");

    private String value;

    PurposeEnum(String value) {
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
    public static PurposeEnum fromValue(String value) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PurposeEnum purpose;

  private GeneratorRecipe recipe;

  private FieldSection section;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    STRING("STRING"),
    
    EMAIL("EMAIL"),
    
    CONCEALED("CONCEALED"),
    
    URL("URL"),
    
    TOTP("TOTP"),
    
    DATE("DATE"),
    
    MONTH_YEAR("MONTH_YEAR"),
    
    MENU("MENU");

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

  private TypeEnum type = TypeEnum.STRING;

  private String value;

  public Field() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Field(String id, TypeEnum type) {
    this.id = id;
    this.type = type;
  }

  public Field entropy(BigDecimal entropy) {
    this.entropy = entropy;
    return this;
  }

  /**
   * For fields with a purpose of `PASSWORD` this is the entropy of the value
   * @return entropy
  */
  @Valid 
  @Schema(name = "entropy", accessMode = Schema.AccessMode.READ_ONLY, description = "For fields with a purpose of `PASSWORD` this is the entropy of the value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entropy")
  public BigDecimal getEntropy() {
    return entropy;
  }

  public void setEntropy(BigDecimal entropy) {
    this.entropy = entropy;
  }

  public Field generate(Boolean generate) {
    this.generate = generate;
    return this;
  }

  /**
   * If value is not present then a new value should be generated for this field
   * @return generate
  */
  
  @Schema(name = "generate", description = "If value is not present then a new value should be generated for this field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generate")
  public Boolean getGenerate() {
    return generate;
  }

  public void setGenerate(Boolean generate) {
    this.generate = generate;
  }

  public Field id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Field label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Field purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.
   * @return purpose
  */
  
  @Schema(name = "purpose", description = "Some item types, Login and Password, have fields used for autofill. This property indicates that purpose and is required for some item types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public Field recipe(GeneratorRecipe recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * Get recipe
   * @return recipe
  */
  @Valid 
  @Schema(name = "recipe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recipe")
  public GeneratorRecipe getRecipe() {
    return recipe;
  }

  public void setRecipe(GeneratorRecipe recipe) {
    this.recipe = recipe;
  }

  public Field section(FieldSection section) {
    this.section = section;
    return this;
  }

  /**
   * Get section
   * @return section
  */
  @Valid 
  @Schema(name = "section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public FieldSection getSection() {
    return section;
  }

  public void setSection(FieldSection section) {
    this.section = section;
  }

  public Field type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Field value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.entropy, field.entropy) &&
        Objects.equals(this.generate, field.generate) &&
        Objects.equals(this.id, field.id) &&
        Objects.equals(this.label, field.label) &&
        Objects.equals(this.purpose, field.purpose) &&
        Objects.equals(this.recipe, field.recipe) &&
        Objects.equals(this.section, field.section) &&
        Objects.equals(this.type, field.type) &&
        Objects.equals(this.value, field.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entropy, generate, id, label, purpose, recipe, section, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    entropy: ").append(toIndentedString(entropy)).append("\n");
    sb.append("    generate: ").append(toIndentedString(generate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

