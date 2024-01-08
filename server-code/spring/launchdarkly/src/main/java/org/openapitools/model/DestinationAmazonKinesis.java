package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DestinationAmazonKinesis
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class DestinationAmazonKinesis {

  private String region;

  private String roleArn;

  private String streamName;

  public DestinationAmazonKinesis region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  
  @Schema(name = "region", example = "us-east-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public DestinationAmazonKinesis roleArn(String roleArn) {
    this.roleArn = roleArn;
    return this;
  }

  /**
   * Get roleArn
   * @return roleArn
  */
  
  @Schema(name = "roleArn", example = "arn:aws:iam::123456789012:role/marketingadmin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleArn")
  public String getRoleArn() {
    return roleArn;
  }

  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }

  public DestinationAmazonKinesis streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

  /**
   * Get streamName
   * @return streamName
  */
  
  @Schema(name = "streamName", example = "cat-stream", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streamName")
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationAmazonKinesis destinationAmazonKinesis = (DestinationAmazonKinesis) o;
    return Objects.equals(this.region, destinationAmazonKinesis.region) &&
        Objects.equals(this.roleArn, destinationAmazonKinesis.roleArn) &&
        Objects.equals(this.streamName, destinationAmazonKinesis.streamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, roleArn, streamName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationAmazonKinesis {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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

