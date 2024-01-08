package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.JqlQueryClause;
import org.openapitools.model.JqlQueryOrderByClause;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A parsed JQL query.
 */

@Schema(name = "JqlQuery", description = "A parsed JQL query.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQuery {

  private JqlQueryOrderByClause orderBy;

  private JqlQueryClause where;

  public JqlQuery orderBy(JqlQueryOrderByClause orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
  */
  @Valid 
  @Schema(name = "orderBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderBy")
  public JqlQueryOrderByClause getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(JqlQueryOrderByClause orderBy) {
    this.orderBy = orderBy;
  }

  public JqlQuery where(JqlQueryClause where) {
    this.where = where;
    return this;
  }

  /**
   * Get where
   * @return where
  */
  @Valid 
  @Schema(name = "where", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("where")
  public JqlQueryClause getWhere() {
    return where;
  }

  public void setWhere(JqlQueryClause where) {
    this.where = where;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQuery jqlQuery = (JqlQuery) o;
    return Objects.equals(this.orderBy, jqlQuery.orderBy) &&
        Objects.equals(this.where, jqlQuery.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQuery {\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

