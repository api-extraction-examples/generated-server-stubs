package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScoreboardGameWeather
 */

@JsonTypeName("ScoreboardGame_weather")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ScoreboardGameWeather {

  private String description;

  private BigDecimal temperature;

  private BigDecimal windDirection;

  private BigDecimal windSpeed;

  public ScoreboardGameWeather description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ScoreboardGameWeather temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
  */
  @Valid 
  @Schema(name = "temperature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public ScoreboardGameWeather windDirection(BigDecimal windDirection) {
    this.windDirection = windDirection;
    return this;
  }

  /**
   * Get windDirection
   * @return windDirection
  */
  @Valid 
  @Schema(name = "windDirection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windDirection")
  public BigDecimal getWindDirection() {
    return windDirection;
  }

  public void setWindDirection(BigDecimal windDirection) {
    this.windDirection = windDirection;
  }

  public ScoreboardGameWeather windSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }

  /**
   * Get windSpeed
   * @return windSpeed
  */
  @Valid 
  @Schema(name = "windSpeed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windSpeed")
  public BigDecimal getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(BigDecimal windSpeed) {
    this.windSpeed = windSpeed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreboardGameWeather scoreboardGameWeather = (ScoreboardGameWeather) o;
    return Objects.equals(this.description, scoreboardGameWeather.description) &&
        Objects.equals(this.temperature, scoreboardGameWeather.temperature) &&
        Objects.equals(this.windDirection, scoreboardGameWeather.windDirection) &&
        Objects.equals(this.windSpeed, scoreboardGameWeather.windSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, temperature, windDirection, windSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreboardGameWeather {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    windDirection: ").append(toIndentedString(windDirection)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
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

