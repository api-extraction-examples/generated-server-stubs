/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
	"reflect"
)

// FeatureFlagsAPIService is a service that implements the logic for the FeatureFlagsAPIServicer
// This service should implement the business logic for every endpoint for the FeatureFlagsAPI API.
// Include any external packages or services that will be required by this service.
type FeatureFlagsAPIService struct {
}

// NewFeatureFlagsAPIService creates a default api service
func NewFeatureFlagsAPIService() FeatureFlagsAPIServicer {
	return &FeatureFlagsAPIService{}
}

// CopyFeatureFlag - Copies the feature flag configuration from one environment to the same feature flag in another environment.
func (s *FeatureFlagsAPIService) CopyFeatureFlag(ctx context.Context, projectKey string, featureFlagKey string, featureFlagCopyBody CopyFeatureFlagRequest) (ImplResponse, error) {
	// TODO - update CopyFeatureFlag with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, FeatureFlag{}) or use other options such as http.Ok ...
	// return Response(201, FeatureFlag{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CopyFeatureFlag method not implemented")
}

// DeleteApprovalRequest - Delete an approval request for a feature flag config
func (s *FeatureFlagsAPIService) DeleteApprovalRequest(ctx context.Context, projectKey string, environmentKey string, featureFlagKey string, approvalRequestId string, approvalRequestConfigBody PostApprovalRequestRequest) (ImplResponse, error) {
	// TODO - update DeleteApprovalRequest with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteApprovalRequest method not implemented")
}

// DeleteFeatureFlag - Delete a feature flag in all environments. Be careful-- only delete feature flags that are no longer being used by your application.
func (s *FeatureFlagsAPIService) DeleteFeatureFlag(ctx context.Context, projectKey string, featureFlagKey string) (ImplResponse, error) {
	// TODO - update DeleteFeatureFlag with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteFeatureFlag method not implemented")
}

// DeleteFlagConfigScheduledChanges - Delete a scheduled change on a feature flag in an environment.
func (s *FeatureFlagsAPIService) DeleteFlagConfigScheduledChanges(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, scheduledChangeId string) (ImplResponse, error) {
	// TODO - update DeleteFlagConfigScheduledChanges with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteFlagConfigScheduledChanges method not implemented")
}

// FlagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGet - Get dependent flags for the flag in the environment specified in path parameters
func (s *FeatureFlagsAPIService) FlagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGet(ctx context.Context, projectKey string, environmentKey string, featureFlagKey string) (ImplResponse, error) {
	// TODO - update FlagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGet with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DependentFlagsByEnvironment{}) or use other options such as http.Ok ...
	// return Response(200, DependentFlagsByEnvironment{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FlagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGet method not implemented")
}

// FlagsProjectKeyFeatureFlagKeyDependentFlagsGet - Get dependent flags across all environments for the flag specified in the path parameters
func (s *FeatureFlagsAPIService) FlagsProjectKeyFeatureFlagKeyDependentFlagsGet(ctx context.Context, projectKey string, featureFlagKey string) (ImplResponse, error) {
	// TODO - update FlagsProjectKeyFeatureFlagKeyDependentFlagsGet with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MultiEnvironmentDependentFlags{}) or use other options such as http.Ok ...
	// return Response(200, MultiEnvironmentDependentFlags{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FlagsProjectKeyFeatureFlagKeyDependentFlagsGet method not implemented")
}

// GetApprovalRequest - Get a single approval request for a feature flag config
func (s *FeatureFlagsAPIService) GetApprovalRequest(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, approvalRequestId string) (ImplResponse, error) {
	// TODO - update GetApprovalRequest with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ApprovalRequests{}) or use other options such as http.Ok ...
	// return Response(200, ApprovalRequests{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApprovalRequest method not implemented")
}

// GetApprovalRequests - Get all approval requests for a feature flag config
func (s *FeatureFlagsAPIService) GetApprovalRequests(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string) (ImplResponse, error) {
	// TODO - update GetApprovalRequests with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ApprovalRequests{}) or use other options such as http.Ok ...
	// return Response(200, ApprovalRequests{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApprovalRequests method not implemented")
}

// GetExpiringUserTargets - Get expiring user targets for feature flag
func (s *FeatureFlagsAPIService) GetExpiringUserTargets(ctx context.Context, projectKey string, environmentKey string, featureFlagKey string) (ImplResponse, error) {
	// TODO - update GetExpiringUserTargets with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UserTargetingExpirationForFlags{}) or use other options such as http.Ok ...
	// return Response(200, UserTargetingExpirationForFlags{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetExpiringUserTargets method not implemented")
}

// GetFeatureFlag - Get a single feature flag by key.
func (s *FeatureFlagsAPIService) GetFeatureFlag(ctx context.Context, projectKey string, featureFlagKey string, env []string) (ImplResponse, error) {
	// TODO - update GetFeatureFlag with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlag{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlag{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFeatureFlag method not implemented")
}

// GetFeatureFlagStatus - Get the status for a particular feature flag.
func (s *FeatureFlagsAPIService) GetFeatureFlagStatus(ctx context.Context, projectKey string, environmentKey string, featureFlagKey string) (ImplResponse, error) {
	// TODO - update GetFeatureFlagStatus with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlagStatus{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlagStatus{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFeatureFlagStatus method not implemented")
}

// GetFeatureFlagStatusAcrossEnvironments - Get the status for a particular feature flag across environments
func (s *FeatureFlagsAPIService) GetFeatureFlagStatusAcrossEnvironments(ctx context.Context, projectKey string, featureFlagKey string) (ImplResponse, error) {
	// TODO - update GetFeatureFlagStatusAcrossEnvironments with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlagStatusAcrossEnvironments{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlagStatusAcrossEnvironments{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFeatureFlagStatusAcrossEnvironments method not implemented")
}

// GetFeatureFlagStatuses - Get a list of statuses for all feature flags. The status includes the last time the feature flag was requested, as well as the state of the flag.
func (s *FeatureFlagsAPIService) GetFeatureFlagStatuses(ctx context.Context, projectKey string, environmentKey string) (ImplResponse, error) {
	// TODO - update GetFeatureFlagStatuses with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlagStatuses{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlagStatuses{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFeatureFlagStatuses method not implemented")
}

// GetFeatureFlags - Get a list of all features in the given project.
func (s *FeatureFlagsAPIService) GetFeatureFlags(ctx context.Context, projectKey string, env []string, summary bool, archived bool, limit float32, offset float32, filter string, sort string, tag string) (ImplResponse, error) {
	// TODO - update GetFeatureFlags with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlags{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlags{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFeatureFlags method not implemented")
}

// GetFlagConfigScheduledChange - Get a scheduled change on a feature flag by id.
func (s *FeatureFlagsAPIService) GetFlagConfigScheduledChange(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, scheduledChangeId string) (ImplResponse, error) {
	// TODO - update GetFlagConfigScheduledChange with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlagScheduledChange{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlagScheduledChange{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFlagConfigScheduledChange method not implemented")
}

// GetFlagConfigScheduledChanges - Get all scheduled workflows for a feature flag by key.
func (s *FeatureFlagsAPIService) GetFlagConfigScheduledChanges(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string) (ImplResponse, error) {
	// TODO - update GetFlagConfigScheduledChanges with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlagScheduledChanges{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlagScheduledChanges{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFlagConfigScheduledChanges method not implemented")
}

// GetFlagConfigScheduledChangesConflicts - Lists conflicts between the given instructions and any existing scheduled changes for the feature flag. The actual HTTP verb should be REPORT, not POST.
func (s *FeatureFlagsAPIService) GetFlagConfigScheduledChangesConflicts(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, flagConfigScheduledChangesConflictsBody GetFlagConfigScheduledChangesConflictsRequest) (ImplResponse, error) {
	// TODO - update GetFlagConfigScheduledChangesConflicts with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlagScheduledChangesConflicts{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlagScheduledChangesConflicts{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFlagConfigScheduledChangesConflicts method not implemented")
}

// PatchExpiringUserTargets - Update, add, or delete expiring user targets on feature flag
func (s *FeatureFlagsAPIService) PatchExpiringUserTargets(ctx context.Context, projectKey string, environmentKey string, featureFlagKey string, semanticPatchWithComment []SemanticPatchOperation) (ImplResponse, error) {
	// TODO - update PatchExpiringUserTargets with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UserTargetingExpirationForFlags{}) or use other options such as http.Ok ...
	// return Response(200, UserTargetingExpirationForFlags{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchExpiringUserTargets method not implemented")
}

// PatchFeatureFlag - Perform a partial update to a feature.
func (s *FeatureFlagsAPIService) PatchFeatureFlag(ctx context.Context, projectKey string, featureFlagKey string, patchComment PatchFeatureFlagRequest) (ImplResponse, error) {
	// TODO - update PatchFeatureFlag with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FeatureFlag{}) or use other options such as http.Ok ...
	// return Response(200, FeatureFlag{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchFeatureFlag method not implemented")
}

// PatchFlagConfigScheduledChange - Updates an existing scheduled-change on a feature flag in an environment.
func (s *FeatureFlagsAPIService) PatchFlagConfigScheduledChange(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, scheduledChangeId string, flagConfigScheduledChangesPatchBody PatchFlagConfigScheduledChangeRequest) (ImplResponse, error) {
	// TODO - update PatchFlagConfigScheduledChange with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, FeatureFlagScheduledChange{}) or use other options such as http.Ok ...
	// return Response(201, FeatureFlagScheduledChange{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchFlagConfigScheduledChange method not implemented")
}

// PostApplyApprovalRequest - Apply approval request for a feature flag config
func (s *FeatureFlagsAPIService) PostApplyApprovalRequest(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, approvalRequestId string, approvalRequestApplyConfigBody PostApplyApprovalRequestRequest) (ImplResponse, error) {
	// TODO - update PostApplyApprovalRequest with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ApprovalRequests{}) or use other options such as http.Ok ...
	// return Response(200, ApprovalRequests{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostApplyApprovalRequest method not implemented")
}

// PostApprovalRequest - Create an approval request for a feature flag config
func (s *FeatureFlagsAPIService) PostApprovalRequest(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, approvalRequestId string, approvalRequestConfigBody PostApprovalRequestRequest) (ImplResponse, error) {
	// TODO - update PostApprovalRequest with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ApprovalRequest{}) or use other options such as http.Ok ...
	// return Response(200, ApprovalRequest{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostApprovalRequest method not implemented")
}

// PostFeatureFlag - Creates a new feature flag.
func (s *FeatureFlagsAPIService) PostFeatureFlag(ctx context.Context, projectKey string, featureFlagBody PostFeatureFlagRequest, clone string) (ImplResponse, error) {
	// TODO - update PostFeatureFlag with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, FeatureFlag{}) or use other options such as http.Ok ...
	// return Response(201, FeatureFlag{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostFeatureFlag method not implemented")
}

// PostFlagConfigScheduledChanges - Creates a new scheduled change for a feature flag.
func (s *FeatureFlagsAPIService) PostFlagConfigScheduledChanges(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, flagConfigScheduledChangesPostBody PostFlagConfigScheduledChangesRequest) (ImplResponse, error) {
	// TODO - update PostFlagConfigScheduledChanges with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, FeatureFlagScheduledChange{}) or use other options such as http.Ok ...
	// return Response(201, FeatureFlagScheduledChange{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostFlagConfigScheduledChanges method not implemented")
}

// PostReviewApprovalRequest - Review approval request for a feature flag config
func (s *FeatureFlagsAPIService) PostReviewApprovalRequest(ctx context.Context, projectKey string, featureFlagKey string, environmentKey string, approvalRequestId string, approvalRequestReviewConfigBody PostReviewApprovalRequestRequest) (ImplResponse, error) {
	// TODO - update PostReviewApprovalRequest with the required logic for this service method.
	// Add api_feature_flags_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ApprovalRequests{}) or use other options such as http.Ok ...
	// return Response(200, ApprovalRequests{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostReviewApprovalRequest method not implemented")
}
