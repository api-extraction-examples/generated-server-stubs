package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum GroupUpdateType.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum GroupUpdateType {
  
  USERJOINED("UserJoined"),
  
  USERLEFT("UserLeft"),
  
  GROUPJOINED("GroupJoined"),
  
  GROUPLEFT("GroupLeft"),
  
  STATEUPDATE("StateUpdate"),
  
  PLAYQUEUE("PlayQueue"),
  
  NOTINGROUP("NotInGroup"),
  
  GROUPDOESNOTEXIST("GroupDoesNotExist"),
  
  CREATEGROUPDENIED("CreateGroupDenied"),
  
  JOINGROUPDENIED("JoinGroupDenied"),
  
  LIBRARYACCESSDENIED("LibraryAccessDenied");

  private String value;

  GroupUpdateType(String value) {
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
  public static GroupUpdateType fromValue(String value) {
    for (GroupUpdateType b : GroupUpdateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

