package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * product media asset
 */

@Schema(name = "Detailed_product_information_result_inner_allOf_media_asset", description = "product media asset")
@JsonTypeName("Detailed_product_information_result_inner_allOf_media_asset")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedProductInformationResultInnerAllOfMediaAsset {

  private String picture1;

  private String picture2;

  private String picture3;

  private String picture4;

  private String picture5;

  public DetailedProductInformationResultInnerAllOfMediaAsset picture1(String picture1) {
    this.picture1 = picture1;
    return this;
  }

  /**
   * Get picture1
   * @return picture1
  */
  
  @Schema(name = "picture_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture_1")
  public String getPicture1() {
    return picture1;
  }

  public void setPicture1(String picture1) {
    this.picture1 = picture1;
  }

  public DetailedProductInformationResultInnerAllOfMediaAsset picture2(String picture2) {
    this.picture2 = picture2;
    return this;
  }

  /**
   * Get picture2
   * @return picture2
  */
  
  @Schema(name = "picture_2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture_2")
  public String getPicture2() {
    return picture2;
  }

  public void setPicture2(String picture2) {
    this.picture2 = picture2;
  }

  public DetailedProductInformationResultInnerAllOfMediaAsset picture3(String picture3) {
    this.picture3 = picture3;
    return this;
  }

  /**
   * Get picture3
   * @return picture3
  */
  
  @Schema(name = "picture_3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture_3")
  public String getPicture3() {
    return picture3;
  }

  public void setPicture3(String picture3) {
    this.picture3 = picture3;
  }

  public DetailedProductInformationResultInnerAllOfMediaAsset picture4(String picture4) {
    this.picture4 = picture4;
    return this;
  }

  /**
   * Get picture4
   * @return picture4
  */
  
  @Schema(name = "picture_4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture_4")
  public String getPicture4() {
    return picture4;
  }

  public void setPicture4(String picture4) {
    this.picture4 = picture4;
  }

  public DetailedProductInformationResultInnerAllOfMediaAsset picture5(String picture5) {
    this.picture5 = picture5;
    return this;
  }

  /**
   * Get picture5
   * @return picture5
  */
  
  @Schema(name = "picture_5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture_5")
  public String getPicture5() {
    return picture5;
  }

  public void setPicture5(String picture5) {
    this.picture5 = picture5;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedProductInformationResultInnerAllOfMediaAsset detailedProductInformationResultInnerAllOfMediaAsset = (DetailedProductInformationResultInnerAllOfMediaAsset) o;
    return Objects.equals(this.picture1, detailedProductInformationResultInnerAllOfMediaAsset.picture1) &&
        Objects.equals(this.picture2, detailedProductInformationResultInnerAllOfMediaAsset.picture2) &&
        Objects.equals(this.picture3, detailedProductInformationResultInnerAllOfMediaAsset.picture3) &&
        Objects.equals(this.picture4, detailedProductInformationResultInnerAllOfMediaAsset.picture4) &&
        Objects.equals(this.picture5, detailedProductInformationResultInnerAllOfMediaAsset.picture5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(picture1, picture2, picture3, picture4, picture5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedProductInformationResultInnerAllOfMediaAsset {\n");
    sb.append("    picture1: ").append(toIndentedString(picture1)).append("\n");
    sb.append("    picture2: ").append(toIndentedString(picture2)).append("\n");
    sb.append("    picture3: ").append(toIndentedString(picture3)).append("\n");
    sb.append("    picture4: ").append(toIndentedString(picture4)).append("\n");
    sb.append("    picture5: ").append(toIndentedString(picture5)).append("\n");
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

