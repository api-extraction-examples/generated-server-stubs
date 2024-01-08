package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Asset;
import org.openapitools.model.AssetForm;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AssetSignature
 */

@JsonTypeName("assetSignature")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AssetSignature {

  private Asset asset;

  private AssetForm form;

  public AssetSignature asset(Asset asset) {
    this.asset = asset;
    return this;
  }

  /**
   * Get asset
   * @return asset
  */
  @Valid 
  @Schema(name = "asset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset")
  public Asset getAsset() {
    return asset;
  }

  public void setAsset(Asset asset) {
    this.asset = asset;
  }

  public AssetSignature form(AssetForm form) {
    this.form = form;
    return this;
  }

  /**
   * Get form
   * @return form
  */
  @Valid 
  @Schema(name = "form", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("form")
  public AssetForm getForm() {
    return form;
  }

  public void setForm(AssetForm form) {
    this.form = form;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetSignature assetSignature = (AssetSignature) o;
    return Objects.equals(this.asset, assetSignature.asset) &&
        Objects.equals(this.form, assetSignature.form);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, form);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetSignature {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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

