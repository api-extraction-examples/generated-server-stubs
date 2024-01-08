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
 * Gets or Sets summaryKeyType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public enum SummaryKeyType {
  
  USERS("Users"),
  
  USERSQUOTA("UsersQuota"),
  
  GROUPS("Groups"),
  
  GROUPSQUOTA("GroupsQuota"),
  
  SERVERCERTIFICATES("ServerCertificates"),
  
  SERVERCERTIFICATESQUOTA("ServerCertificatesQuota"),
  
  USERPOLICYSIZEQUOTA("UserPolicySizeQuota"),
  
  GROUPPOLICYSIZEQUOTA("GroupPolicySizeQuota"),
  
  GROUPSPERUSERQUOTA("GroupsPerUserQuota"),
  
  SIGNINGCERTIFICATESPERUSERQUOTA("SigningCertificatesPerUserQuota"),
  
  ACCESSKEYSPERUSERQUOTA("AccessKeysPerUserQuota"),
  
  MFADEVICES("MFADevices"),
  
  MFADEVICESINUSE("MFADevicesInUse"),
  
  ACCOUNTMFAENABLED("AccountMFAEnabled"),
  
  ACCOUNTACCESSKEYSPRESENT("AccountAccessKeysPresent"),
  
  ACCOUNTSIGNINGCERTIFICATESPRESENT("AccountSigningCertificatesPresent"),
  
  ATTACHEDPOLICIESPERGROUPQUOTA("AttachedPoliciesPerGroupQuota"),
  
  ATTACHEDPOLICIESPERROLEQUOTA("AttachedPoliciesPerRoleQuota"),
  
  ATTACHEDPOLICIESPERUSERQUOTA("AttachedPoliciesPerUserQuota"),
  
  POLICIES("Policies"),
  
  POLICIESQUOTA("PoliciesQuota"),
  
  POLICYSIZEQUOTA("PolicySizeQuota"),
  
  POLICYVERSIONSINUSE("PolicyVersionsInUse"),
  
  POLICYVERSIONSINUSEQUOTA("PolicyVersionsInUseQuota"),
  
  VERSIONSPERPOLICYQUOTA("VersionsPerPolicyQuota"),
  
  GLOBALENDPOINTTOKENVERSION("GlobalEndpointTokenVersion");

  private String value;

  SummaryKeyType(String value) {
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
  public static SummaryKeyType fromValue(String value) {
    for (SummaryKeyType b : SummaryKeyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

