/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
)



// DefaultAPIRouter defines the required methods for binding the api requests to a responses for the DefaultAPI
// The DefaultAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DefaultAPIServicer to perform the required actions, then write the service results to the http response.
type DefaultAPIRouter interface { 
	MeGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectBuildCacheDelete(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectBuildNumArtifactsGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectBuildNumCancelPost(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectBuildNumGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectBuildNumRetryPost(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectBuildNumTestsGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectCheckoutKeyFingerprintDelete(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectCheckoutKeyFingerprintGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectCheckoutKeyGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectCheckoutKeyPost(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectEnvvarGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectEnvvarNameDelete(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectEnvvarNameGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectEnvvarPost(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectGet(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectPost(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectSshKeyPost(http.ResponseWriter, *http.Request)
	ProjectUsernameProjectTreeBranchPost(http.ResponseWriter, *http.Request)
	ProjectsGet(http.ResponseWriter, *http.Request)
	RecentBuildsGet(http.ResponseWriter, *http.Request)
	UserHerokuKeyPost(http.ResponseWriter, *http.Request)
}


// DefaultAPIServicer defines the api actions for the DefaultAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DefaultAPIServicer interface { 
	MeGet(context.Context) (ImplResponse, error)
	ProjectUsernameProjectBuildCacheDelete(context.Context, string, string) (ImplResponse, error)
	ProjectUsernameProjectBuildNumArtifactsGet(context.Context, string, string, int32) (ImplResponse, error)
	ProjectUsernameProjectBuildNumCancelPost(context.Context, string, string, int32) (ImplResponse, error)
	ProjectUsernameProjectBuildNumGet(context.Context, string, string, int32) (ImplResponse, error)
	ProjectUsernameProjectBuildNumRetryPost(context.Context, string, string, int32) (ImplResponse, error)
	ProjectUsernameProjectBuildNumTestsGet(context.Context, string, string, int32) (ImplResponse, error)
	ProjectUsernameProjectCheckoutKeyFingerprintDelete(context.Context, string, string, string) (ImplResponse, error)
	ProjectUsernameProjectCheckoutKeyFingerprintGet(context.Context, string, string, string) (ImplResponse, error)
	ProjectUsernameProjectCheckoutKeyGet(context.Context, string, string) (ImplResponse, error)
	ProjectUsernameProjectCheckoutKeyPost(context.Context, string, string, string) (ImplResponse, error)
	ProjectUsernameProjectEnvvarGet(context.Context, string, string) (ImplResponse, error)
	ProjectUsernameProjectEnvvarNameDelete(context.Context, string, string, string) (ImplResponse, error)
	ProjectUsernameProjectEnvvarNameGet(context.Context, string, string, string) (ImplResponse, error)
	ProjectUsernameProjectEnvvarPost(context.Context, string, string) (ImplResponse, error)
	ProjectUsernameProjectGet(context.Context, string, string, int32, int32, string) (ImplResponse, error)
	ProjectUsernameProjectPost(context.Context, string, string, ProjectUsernameProjectPostRequest) (ImplResponse, error)
	ProjectUsernameProjectSshKeyPost(context.Context, string, string, string, ProjectUsernameProjectSshKeyPostRequest) (ImplResponse, error)
	ProjectUsernameProjectTreeBranchPost(context.Context, string, string, string, ProjectUsernameProjectTreeBranchPostRequest) (ImplResponse, error)
	ProjectsGet(context.Context) (ImplResponse, error)
	RecentBuildsGet(context.Context, int32, int32) (ImplResponse, error)
	UserHerokuKeyPost(context.Context) (ImplResponse, error)
}
