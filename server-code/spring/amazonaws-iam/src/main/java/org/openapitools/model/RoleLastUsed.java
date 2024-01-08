package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period\&quot;&gt;Regions where data is tracked&lt;/a&gt; in the &lt;i&gt;IAM user Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;This data type is returned as a response element in the &lt;a&gt;GetRole&lt;/a&gt; and &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; operations.&lt;/p&gt;
 */

@Schema(name = "RoleLastUsed", description = "<p>Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period\">Regions where data is tracked</a> in the <i>IAM user Guide</i>.</p> <p>This data type is returned as a response element in the <a>GetRole</a> and <a>GetAccountAuthorizationDetails</a> operations.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RoleLastUsed {

  private OffsetDateTime lastUsedDate;

  private String region;

  public RoleLastUsed lastUsedDate(OffsetDateTime lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
    return this;
  }

  /**
   * Get lastUsedDate
   * @return lastUsedDate
  */
  @Valid 
  @Schema(name = "LastUsedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUsedDate")
  public OffsetDateTime getLastUsedDate() {
    return lastUsedDate;
  }

  public void setLastUsedDate(OffsetDateTime lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
  }

  public RoleLastUsed region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  
  @Schema(name = "Region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleLastUsed roleLastUsed = (RoleLastUsed) o;
    return Objects.equals(this.lastUsedDate, roleLastUsed.lastUsedDate) &&
        Objects.equals(this.region, roleLastUsed.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUsedDate, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleLastUsed {\n");
    sb.append("    lastUsedDate: ").append(toIndentedString(lastUsedDate)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

