/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
	"reflect"
)

// AccountsAPIService is a service that implements the logic for the AccountsAPIServicer
// This service should implement the business logic for every endpoint for the AccountsAPI API.
// Include any external packages or services that will be required by this service.
type AccountsAPIService struct {
}

// NewAccountsAPIService creates a default api service
func NewAccountsAPIService() AccountsAPIServicer {
	return &AccountsAPIService{}
}

// ApiV1AccountsIdBlockPost - 
func (s *AccountsAPIService) ApiV1AccountsIdBlockPost(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdBlockPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdBlockPost method not implemented")
}

// ApiV1AccountsIdFeaturedTagsGet - 
func (s *AccountsAPIService) ApiV1AccountsIdFeaturedTagsGet(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdFeaturedTagsGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []FeaturedTag{}) or use other options such as http.Ok ...
	// return Response(200, []FeaturedTag{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdFeaturedTagsGet method not implemented")
}

// ApiV1AccountsIdFollowPost - 
func (s *AccountsAPIService) ApiV1AccountsIdFollowPost(ctx context.Context, id string, apiV1AccountsIdFollowPostRequest ApiV1AccountsIdFollowPostRequest) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdFollowPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(403, Error{}) or use other options such as http.Ok ...
	// return Response(403, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdFollowPost method not implemented")
}

// ApiV1AccountsIdFollowersGet - 
func (s *AccountsAPIService) ApiV1AccountsIdFollowersGet(ctx context.Context, id string, maxId string, sinceId string, limit int32) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdFollowersGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Account{}) or use other options such as http.Ok ...
	// return Response(200, []Account{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(404, Error{}) or use other options such as http.Ok ...
	// return Response(404, Error{}), nil

	// TODO: Uncomment the next line to return response Response(410, {}) or use other options such as http.Ok ...
	// return Response(410, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdFollowersGet method not implemented")
}

// ApiV1AccountsIdFollowingGet - 
func (s *AccountsAPIService) ApiV1AccountsIdFollowingGet(ctx context.Context, id string, maxId string, sinceId string, limit int32) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdFollowingGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Account{}) or use other options such as http.Ok ...
	// return Response(200, []Account{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(404, Error{}) or use other options such as http.Ok ...
	// return Response(404, Error{}), nil

	// TODO: Uncomment the next line to return response Response(410, {}) or use other options such as http.Ok ...
	// return Response(410, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdFollowingGet method not implemented")
}

// ApiV1AccountsIdGet - 
func (s *AccountsAPIService) ApiV1AccountsIdGet(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Account{}) or use other options such as http.Ok ...
	// return Response(200, Account{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(404, Error{}) or use other options such as http.Ok ...
	// return Response(404, Error{}), nil

	// TODO: Uncomment the next line to return response Response(410, {}) or use other options such as http.Ok ...
	// return Response(410, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdGet method not implemented")
}

// ApiV1AccountsIdIdentityProofsGet - 
func (s *AccountsAPIService) ApiV1AccountsIdIdentityProofsGet(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdIdentityProofsGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []IdentityProof{}) or use other options such as http.Ok ...
	// return Response(200, []IdentityProof{}), nil

	// TODO: Uncomment the next line to return response Response(404, Error{}) or use other options such as http.Ok ...
	// return Response(404, Error{}), nil

	// TODO: Uncomment the next line to return response Response(410, {}) or use other options such as http.Ok ...
	// return Response(410, nil),nil

	// TODO: Uncomment the next line to return response Response(422, Error{}) or use other options such as http.Ok ...
	// return Response(422, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdIdentityProofsGet method not implemented")
}

// ApiV1AccountsIdListsGet - 
func (s *AccountsAPIService) ApiV1AccountsIdListsGet(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdListsGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []List{}) or use other options such as http.Ok ...
	// return Response(200, []List{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(404, Error{}) or use other options such as http.Ok ...
	// return Response(404, Error{}), nil

	// TODO: Uncomment the next line to return response Response(410, {}) or use other options such as http.Ok ...
	// return Response(410, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdListsGet method not implemented")
}

// ApiV1AccountsIdMutePost - 
func (s *AccountsAPIService) ApiV1AccountsIdMutePost(ctx context.Context, id string, apiV1AccountsIdMutePostRequest ApiV1AccountsIdMutePostRequest) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdMutePost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdMutePost method not implemented")
}

// ApiV1AccountsIdNotePost - 
func (s *AccountsAPIService) ApiV1AccountsIdNotePost(ctx context.Context, id string, apiV1AccountsIdNotePostRequest ApiV1AccountsIdNotePostRequest) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdNotePost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(422, {}) or use other options such as http.Ok ...
	// return Response(422, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdNotePost method not implemented")
}

// ApiV1AccountsIdPinPost - 
func (s *AccountsAPIService) ApiV1AccountsIdPinPost(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdPinPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(403, Error{}) or use other options such as http.Ok ...
	// return Response(403, Error{}), nil

	// TODO: Uncomment the next line to return response Response(422, Error{}) or use other options such as http.Ok ...
	// return Response(422, Error{}), nil

	// TODO: Uncomment the next line to return response Response(500, Error{}) or use other options such as http.Ok ...
	// return Response(500, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdPinPost method not implemented")
}

// ApiV1AccountsIdStatusesGet - 
func (s *AccountsAPIService) ApiV1AccountsIdStatusesGet(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdStatusesGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Status{}) or use other options such as http.Ok ...
	// return Response(200, []Status{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(404, Error{}) or use other options such as http.Ok ...
	// return Response(404, Error{}), nil

	// TODO: Uncomment the next line to return response Response(410, {}) or use other options such as http.Ok ...
	// return Response(410, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdStatusesGet method not implemented")
}

// ApiV1AccountsIdUnblockPost - 
func (s *AccountsAPIService) ApiV1AccountsIdUnblockPost(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdUnblockPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdUnblockPost method not implemented")
}

// ApiV1AccountsIdUnfollowPost - 
func (s *AccountsAPIService) ApiV1AccountsIdUnfollowPost(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdUnfollowPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdUnfollowPost method not implemented")
}

// ApiV1AccountsIdUnmutePost - 
func (s *AccountsAPIService) ApiV1AccountsIdUnmutePost(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdUnmutePost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdUnmutePost method not implemented")
}

// ApiV1AccountsIdUnpinPost - 
func (s *AccountsAPIService) ApiV1AccountsIdUnpinPost(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsIdUnpinPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Relationship{}) or use other options such as http.Ok ...
	// return Response(200, Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(422, {}) or use other options such as http.Ok ...
	// return Response(422, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsIdUnpinPost method not implemented")
}

// ApiV1AccountsPost - 
func (s *AccountsAPIService) ApiV1AccountsPost(ctx context.Context, apiV1AccountsPostRequest ApiV1AccountsPostRequest) (ImplResponse, error) {
	// TODO - update ApiV1AccountsPost with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsPost method not implemented")
}

// ApiV1AccountsRelationshipsGet - 
func (s *AccountsAPIService) ApiV1AccountsRelationshipsGet(ctx context.Context, id []string) (ImplResponse, error) {
	// TODO - update ApiV1AccountsRelationshipsGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Relationship{}) or use other options such as http.Ok ...
	// return Response(200, []Relationship{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(422, Error{}) or use other options such as http.Ok ...
	// return Response(422, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsRelationshipsGet method not implemented")
}

// ApiV1AccountsSearchGet - 
func (s *AccountsAPIService) ApiV1AccountsSearchGet(ctx context.Context, q string, limit int32, resolve string, following bool) (ImplResponse, error) {
	// TODO - update ApiV1AccountsSearchGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Account{}) or use other options such as http.Ok ...
	// return Response(200, []Account{}), nil

	// TODO: Uncomment the next line to return response Response(503, Error{}) or use other options such as http.Ok ...
	// return Response(503, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsSearchGet method not implemented")
}

// ApiV1AccountsUpdateCredentialsPatch - 
func (s *AccountsAPIService) ApiV1AccountsUpdateCredentialsPatch(ctx context.Context, apiV1AccountsUpdateCredentialsPatchRequest ApiV1AccountsUpdateCredentialsPatchRequest) (ImplResponse, error) {
	// TODO - update ApiV1AccountsUpdateCredentialsPatch with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Account{}) or use other options such as http.Ok ...
	// return Response(200, Account{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsUpdateCredentialsPatch method not implemented")
}

// ApiV1AccountsVerifyCredentialsGet - 
func (s *AccountsAPIService) ApiV1AccountsVerifyCredentialsGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update ApiV1AccountsVerifyCredentialsGet with the required logic for this service method.
	// Add api_accounts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Account{}) or use other options such as http.Ok ...
	// return Response(200, Account{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	// TODO: Uncomment the next line to return response Response(403, Error{}) or use other options such as http.Ok ...
	// return Response(403, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AccountsVerifyCredentialsGet method not implemented")
}
