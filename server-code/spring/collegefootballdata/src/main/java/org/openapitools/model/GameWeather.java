package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameWeather
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class GameWeather {

  private String awayConference;

  private String awayTeam;

  private BigDecimal dewPoint;

  private Boolean gameIndoors;

  private String homeConference;

  private String homeTeam;

  private BigDecimal humidity;

  private Integer id;

  private BigDecimal precipitation;

  private BigDecimal pressure;

  private Integer season;

  private String seasonType;

  private BigDecimal snowfall;

  private String startTime;

  private BigDecimal temperature;

  private String venue;

  private Integer venueId;

  private String weatherCondition;

  private Integer weatherConditionCode;

  private Integer week;

  private BigDecimal windDirection;

  private BigDecimal windSpeed;

  public GameWeather awayConference(String awayConference) {
    this.awayConference = awayConference;
    return this;
  }

  /**
   * Get awayConference
   * @return awayConference
  */
  
  @Schema(name = "awayConference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayConference")
  public String getAwayConference() {
    return awayConference;
  }

  public void setAwayConference(String awayConference) {
    this.awayConference = awayConference;
  }

  public GameWeather awayTeam(String awayTeam) {
    this.awayTeam = awayTeam;
    return this;
  }

  /**
   * Get awayTeam
   * @return awayTeam
  */
  
  @Schema(name = "awayTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayTeam")
  public String getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(String awayTeam) {
    this.awayTeam = awayTeam;
  }

  public GameWeather dewPoint(BigDecimal dewPoint) {
    this.dewPoint = dewPoint;
    return this;
  }

  /**
   * Get dewPoint
   * @return dewPoint
  */
  @Valid 
  @Schema(name = "dewPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dewPoint")
  public BigDecimal getDewPoint() {
    return dewPoint;
  }

  public void setDewPoint(BigDecimal dewPoint) {
    this.dewPoint = dewPoint;
  }

  public GameWeather gameIndoors(Boolean gameIndoors) {
    this.gameIndoors = gameIndoors;
    return this;
  }

  /**
   * Get gameIndoors
   * @return gameIndoors
  */
  
  @Schema(name = "gameIndoors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameIndoors")
  public Boolean getGameIndoors() {
    return gameIndoors;
  }

  public void setGameIndoors(Boolean gameIndoors) {
    this.gameIndoors = gameIndoors;
  }

  public GameWeather homeConference(String homeConference) {
    this.homeConference = homeConference;
    return this;
  }

  /**
   * Get homeConference
   * @return homeConference
  */
  
  @Schema(name = "homeConference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeConference")
  public String getHomeConference() {
    return homeConference;
  }

  public void setHomeConference(String homeConference) {
    this.homeConference = homeConference;
  }

  public GameWeather homeTeam(String homeTeam) {
    this.homeTeam = homeTeam;
    return this;
  }

  /**
   * Get homeTeam
   * @return homeTeam
  */
  
  @Schema(name = "homeTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeTeam")
  public String getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(String homeTeam) {
    this.homeTeam = homeTeam;
  }

  public GameWeather humidity(BigDecimal humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * @return humidity
  */
  @Valid 
  @Schema(name = "humidity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("humidity")
  public BigDecimal getHumidity() {
    return humidity;
  }

  public void setHumidity(BigDecimal humidity) {
    this.humidity = humidity;
  }

  public GameWeather id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GameWeather precipitation(BigDecimal precipitation) {
    this.precipitation = precipitation;
    return this;
  }

  /**
   * Get precipitation
   * @return precipitation
  */
  @Valid 
  @Schema(name = "precipitation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precipitation")
  public BigDecimal getPrecipitation() {
    return precipitation;
  }

  public void setPrecipitation(BigDecimal precipitation) {
    this.precipitation = precipitation;
  }

  public GameWeather pressure(BigDecimal pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
  */
  @Valid 
  @Schema(name = "pressure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pressure")
  public BigDecimal getPressure() {
    return pressure;
  }

  public void setPressure(BigDecimal pressure) {
    this.pressure = pressure;
  }

  public GameWeather season(Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
  */
  
  @Schema(name = "season", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("season")
  public Integer getSeason() {
    return season;
  }

  public void setSeason(Integer season) {
    this.season = season;
  }

  public GameWeather seasonType(String seasonType) {
    this.seasonType = seasonType;
    return this;
  }

  /**
   * Get seasonType
   * @return seasonType
  */
  
  @Schema(name = "seasonType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seasonType")
  public String getSeasonType() {
    return seasonType;
  }

  public void setSeasonType(String seasonType) {
    this.seasonType = seasonType;
  }

  public GameWeather snowfall(BigDecimal snowfall) {
    this.snowfall = snowfall;
    return this;
  }

  /**
   * Get snowfall
   * @return snowfall
  */
  @Valid 
  @Schema(name = "snowfall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snowfall")
  public BigDecimal getSnowfall() {
    return snowfall;
  }

  public void setSnowfall(BigDecimal snowfall) {
    this.snowfall = snowfall;
  }

  public GameWeather startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public GameWeather temperature(BigDecimal temperature) {
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

  public GameWeather venue(String venue) {
    this.venue = venue;
    return this;
  }

  /**
   * Get venue
   * @return venue
  */
  
  @Schema(name = "venue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venue")
  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public GameWeather venueId(Integer venueId) {
    this.venueId = venueId;
    return this;
  }

  /**
   * Get venueId
   * @return venueId
  */
  
  @Schema(name = "venueId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venueId")
  public Integer getVenueId() {
    return venueId;
  }

  public void setVenueId(Integer venueId) {
    this.venueId = venueId;
  }

  public GameWeather weatherCondition(String weatherCondition) {
    this.weatherCondition = weatherCondition;
    return this;
  }

  /**
   * Get weatherCondition
   * @return weatherCondition
  */
  
  @Schema(name = "weatherCondition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherCondition")
  public String getWeatherCondition() {
    return weatherCondition;
  }

  public void setWeatherCondition(String weatherCondition) {
    this.weatherCondition = weatherCondition;
  }

  public GameWeather weatherConditionCode(Integer weatherConditionCode) {
    this.weatherConditionCode = weatherConditionCode;
    return this;
  }

  /**
   * Get weatherConditionCode
   * @return weatherConditionCode
  */
  
  @Schema(name = "weatherConditionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherConditionCode")
  public Integer getWeatherConditionCode() {
    return weatherConditionCode;
  }

  public void setWeatherConditionCode(Integer weatherConditionCode) {
    this.weatherConditionCode = weatherConditionCode;
  }

  public GameWeather week(Integer week) {
    this.week = week;
    return this;
  }

  /**
   * Get week
   * @return week
  */
  
  @Schema(name = "week", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("week")
  public Integer getWeek() {
    return week;
  }

  public void setWeek(Integer week) {
    this.week = week;
  }

  public GameWeather windDirection(BigDecimal windDirection) {
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

  public GameWeather windSpeed(BigDecimal windSpeed) {
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
    GameWeather gameWeather = (GameWeather) o;
    return Objects.equals(this.awayConference, gameWeather.awayConference) &&
        Objects.equals(this.awayTeam, gameWeather.awayTeam) &&
        Objects.equals(this.dewPoint, gameWeather.dewPoint) &&
        Objects.equals(this.gameIndoors, gameWeather.gameIndoors) &&
        Objects.equals(this.homeConference, gameWeather.homeConference) &&
        Objects.equals(this.homeTeam, gameWeather.homeTeam) &&
        Objects.equals(this.humidity, gameWeather.humidity) &&
        Objects.equals(this.id, gameWeather.id) &&
        Objects.equals(this.precipitation, gameWeather.precipitation) &&
        Objects.equals(this.pressure, gameWeather.pressure) &&
        Objects.equals(this.season, gameWeather.season) &&
        Objects.equals(this.seasonType, gameWeather.seasonType) &&
        Objects.equals(this.snowfall, gameWeather.snowfall) &&
        Objects.equals(this.startTime, gameWeather.startTime) &&
        Objects.equals(this.temperature, gameWeather.temperature) &&
        Objects.equals(this.venue, gameWeather.venue) &&
        Objects.equals(this.venueId, gameWeather.venueId) &&
        Objects.equals(this.weatherCondition, gameWeather.weatherCondition) &&
        Objects.equals(this.weatherConditionCode, gameWeather.weatherConditionCode) &&
        Objects.equals(this.week, gameWeather.week) &&
        Objects.equals(this.windDirection, gameWeather.windDirection) &&
        Objects.equals(this.windSpeed, gameWeather.windSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayConference, awayTeam, dewPoint, gameIndoors, homeConference, homeTeam, humidity, id, precipitation, pressure, season, seasonType, snowfall, startTime, temperature, venue, venueId, weatherCondition, weatherConditionCode, week, windDirection, windSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameWeather {\n");
    sb.append("    awayConference: ").append(toIndentedString(awayConference)).append("\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    dewPoint: ").append(toIndentedString(dewPoint)).append("\n");
    sb.append("    gameIndoors: ").append(toIndentedString(gameIndoors)).append("\n");
    sb.append("    homeConference: ").append(toIndentedString(homeConference)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    precipitation: ").append(toIndentedString(precipitation)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    snowfall: ").append(toIndentedString(snowfall)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    venueId: ").append(toIndentedString(venueId)).append("\n");
    sb.append("    weatherCondition: ").append(toIndentedString(weatherCondition)).append("\n");
    sb.append("    weatherConditionCode: ").append(toIndentedString(weatherConditionCode)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

