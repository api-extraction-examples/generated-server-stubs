package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The recipe is used in conjunction with the \&quot;generate\&quot; property to set the character set used to generate a new secure value
 */

@Schema(name = "GeneratorRecipe", description = "The recipe is used in conjunction with the \"generate\" property to set the character set used to generate a new secure value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class GeneratorRecipe {

  /**
   * Gets or Sets characterSets
   */
  public enum CharacterSetsEnum {
    LETTERS("LETTERS"),
    
    DIGITS("DIGITS"),
    
    SYMBOLS("SYMBOLS");

    private String value;

    CharacterSetsEnum(String value) {
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
    public static CharacterSetsEnum fromValue(String value) {
      for (CharacterSetsEnum b : CharacterSetsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private Set<CharacterSetsEnum> characterSets;

  private String excludeCharacters;

  private Integer length = 32;

  public GeneratorRecipe characterSets(Set<CharacterSetsEnum> characterSets) {
    this.characterSets = characterSets;
    return this;
  }

  public GeneratorRecipe addCharacterSetsItem(CharacterSetsEnum characterSetsItem) {
    if (this.characterSets == null) {
      this.characterSets = new LinkedHashSet<>();
    }
    this.characterSets.add(characterSetsItem);
    return this;
  }

  /**
   * Get characterSets
   * @return characterSets
  */
  
  @Schema(name = "characterSets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characterSets")
  public Set<CharacterSetsEnum> getCharacterSets() {
    return characterSets;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setCharacterSets(Set<CharacterSetsEnum> characterSets) {
    this.characterSets = characterSets;
  }

  public GeneratorRecipe excludeCharacters(String excludeCharacters) {
    this.excludeCharacters = excludeCharacters;
    return this;
  }

  /**
   * List of all characters that should be excluded from generated passwords.
   * @return excludeCharacters
  */
  
  @Schema(name = "excludeCharacters", example = "abc1", description = "List of all characters that should be excluded from generated passwords.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludeCharacters")
  public String getExcludeCharacters() {
    return excludeCharacters;
  }

  public void setExcludeCharacters(String excludeCharacters) {
    this.excludeCharacters = excludeCharacters;
  }

  public GeneratorRecipe length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Length of the generated value
   * minimum: 1
   * maximum: 64
   * @return length
  */
  @Min(1) @Max(64) 
  @Schema(name = "length", description = "Length of the generated value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratorRecipe generatorRecipe = (GeneratorRecipe) o;
    return Objects.equals(this.characterSets, generatorRecipe.characterSets) &&
        Objects.equals(this.excludeCharacters, generatorRecipe.excludeCharacters) &&
        Objects.equals(this.length, generatorRecipe.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterSets, excludeCharacters, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratorRecipe {\n");
    sb.append("    characterSets: ").append(toIndentedString(characterSets)).append("\n");
    sb.append("    excludeCharacters: ").append(toIndentedString(excludeCharacters)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

