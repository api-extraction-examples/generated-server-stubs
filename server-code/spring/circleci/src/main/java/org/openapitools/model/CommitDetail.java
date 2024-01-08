package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CommitDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class CommitDetail {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime authorDate;

  private String authorEmail;

  private String authorLogin;

  private String authorName;

  private String body;

  private String commit;

  private URI commitUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime committerDate;

  private String committerEmail;

  private String committerLogin;

  private String committerName;

  private String subject;

  public CommitDetail authorDate(OffsetDateTime authorDate) {
    this.authorDate = authorDate;
    return this;
  }

  /**
   * Get authorDate
   * @return authorDate
  */
  @Valid 
  @Schema(name = "author_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author_date")
  public OffsetDateTime getAuthorDate() {
    return authorDate;
  }

  public void setAuthorDate(OffsetDateTime authorDate) {
    this.authorDate = authorDate;
  }

  public CommitDetail authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

  /**
   * Get authorEmail
   * @return authorEmail
  */
  @javax.validation.constraints.Email 
  @Schema(name = "author_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author_email")
  public String getAuthorEmail() {
    return authorEmail;
  }

  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }

  public CommitDetail authorLogin(String authorLogin) {
    this.authorLogin = authorLogin;
    return this;
  }

  /**
   * Get authorLogin
   * @return authorLogin
  */
  
  @Schema(name = "author_login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author_login")
  public String getAuthorLogin() {
    return authorLogin;
  }

  public void setAuthorLogin(String authorLogin) {
    this.authorLogin = authorLogin;
  }

  public CommitDetail authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * Get authorName
   * @return authorName
  */
  
  @Schema(name = "author_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author_name")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public CommitDetail body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  */
  
  @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CommitDetail commit(String commit) {
    this.commit = commit;
    return this;
  }

  /**
   * Get commit
   * @return commit
  */
  
  @Schema(name = "commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commit")
  public String getCommit() {
    return commit;
  }

  public void setCommit(String commit) {
    this.commit = commit;
  }

  public CommitDetail commitUrl(URI commitUrl) {
    this.commitUrl = commitUrl;
    return this;
  }

  /**
   * Get commitUrl
   * @return commitUrl
  */
  @Valid 
  @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commit_url")
  public URI getCommitUrl() {
    return commitUrl;
  }

  public void setCommitUrl(URI commitUrl) {
    this.commitUrl = commitUrl;
  }

  public CommitDetail committerDate(OffsetDateTime committerDate) {
    this.committerDate = committerDate;
    return this;
  }

  /**
   * Get committerDate
   * @return committerDate
  */
  @Valid 
  @Schema(name = "committer_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committer_date")
  public OffsetDateTime getCommitterDate() {
    return committerDate;
  }

  public void setCommitterDate(OffsetDateTime committerDate) {
    this.committerDate = committerDate;
  }

  public CommitDetail committerEmail(String committerEmail) {
    this.committerEmail = committerEmail;
    return this;
  }

  /**
   * Get committerEmail
   * @return committerEmail
  */
  @javax.validation.constraints.Email 
  @Schema(name = "committer_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committer_email")
  public String getCommitterEmail() {
    return committerEmail;
  }

  public void setCommitterEmail(String committerEmail) {
    this.committerEmail = committerEmail;
  }

  public CommitDetail committerLogin(String committerLogin) {
    this.committerLogin = committerLogin;
    return this;
  }

  /**
   * Get committerLogin
   * @return committerLogin
  */
  
  @Schema(name = "committer_login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committer_login")
  public String getCommitterLogin() {
    return committerLogin;
  }

  public void setCommitterLogin(String committerLogin) {
    this.committerLogin = committerLogin;
  }

  public CommitDetail committerName(String committerName) {
    this.committerName = committerName;
    return this;
  }

  /**
   * Get committerName
   * @return committerName
  */
  
  @Schema(name = "committer_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committer_name")
  public String getCommitterName() {
    return committerName;
  }

  public void setCommitterName(String committerName) {
    this.committerName = committerName;
  }

  public CommitDetail subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitDetail commitDetail = (CommitDetail) o;
    return Objects.equals(this.authorDate, commitDetail.authorDate) &&
        Objects.equals(this.authorEmail, commitDetail.authorEmail) &&
        Objects.equals(this.authorLogin, commitDetail.authorLogin) &&
        Objects.equals(this.authorName, commitDetail.authorName) &&
        Objects.equals(this.body, commitDetail.body) &&
        Objects.equals(this.commit, commitDetail.commit) &&
        Objects.equals(this.commitUrl, commitDetail.commitUrl) &&
        Objects.equals(this.committerDate, commitDetail.committerDate) &&
        Objects.equals(this.committerEmail, commitDetail.committerEmail) &&
        Objects.equals(this.committerLogin, commitDetail.committerLogin) &&
        Objects.equals(this.committerName, commitDetail.committerName) &&
        Objects.equals(this.subject, commitDetail.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorDate, authorEmail, authorLogin, authorName, body, commit, commitUrl, committerDate, committerEmail, committerLogin, committerName, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitDetail {\n");
    sb.append("    authorDate: ").append(toIndentedString(authorDate)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    authorLogin: ").append(toIndentedString(authorLogin)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
    sb.append("    committerDate: ").append(toIndentedString(committerDate)).append("\n");
    sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
    sb.append("    committerLogin: ").append(toIndentedString(committerLogin)).append("\n");
    sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

