package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.App;
import org.openapitools.model.AppEncryptionDeclaration;
import org.openapitools.model.AppStoreVersion;
import org.openapitools.model.AppStoreVersionRelationships;
import org.openapitools.model.BetaAppReviewSubmission;
import org.openapitools.model.BetaBuildLocalization;
import org.openapitools.model.BetaTester;
import org.openapitools.model.BuildBetaDetail;
import org.openapitools.model.BuildIcon;
import org.openapitools.model.DiagnosticSignature;
import org.openapitools.model.DiagnosticSignatureAttributes;
import org.openapitools.model.PerfPowerMetric;
import org.openapitools.model.PrereleaseVersion;
import org.openapitools.model.ResourceLinks;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public interface BuildResponseIncludedInner {
}
