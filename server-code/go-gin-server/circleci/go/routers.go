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
	"net/http"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name		string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method		string
	// Pattern is the pattern of the URI.
	Pattern	 	string
	// HandlerFunc is the handler function of this route.
	HandlerFunc	gin.HandlerFunc
}

// NewRouter returns a new router.
func NewRouter(handleFunctions ApiHandleFunctions) *gin.Engine {
	router := gin.Default()
	for _, route := range getRoutes(handleFunctions) {
		if route.HandlerFunc == nil {
			route.HandlerFunc = DefaultHandleFunc
		}
		switch route.Method {
		case http.MethodGet:
			router.GET(route.Pattern, route.HandlerFunc)
		case http.MethodPost:
			router.POST(route.Pattern, route.HandlerFunc)
		case http.MethodPut:
			router.PUT(route.Pattern, route.HandlerFunc)
		case http.MethodPatch:
			router.PATCH(route.Pattern, route.HandlerFunc)
		case http.MethodDelete:
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Default handler for not yet implemented routes
func DefaultHandleFunc(c *gin.Context) {
	c.String(http.StatusNotImplemented, "501 not implemented")
}

type ApiHandleFunctions struct {

	// Routes for the DefaultAPI part of the API
	DefaultAPI DefaultAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"MeGet",
			http.MethodGet,
			"/api/v1/me",
			handleFunctions.DefaultAPI.MeGet,
		},
		{
			"ProjectUsernameProjectBuildCacheDelete",
			http.MethodDelete,
			"/api/v1/project/:username/:project/build-cache",
			handleFunctions.DefaultAPI.ProjectUsernameProjectBuildCacheDelete,
		},
		{
			"ProjectUsernameProjectBuildNumArtifactsGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/:build_num/artifacts",
			handleFunctions.DefaultAPI.ProjectUsernameProjectBuildNumArtifactsGet,
		},
		{
			"ProjectUsernameProjectBuildNumCancelPost",
			http.MethodPost,
			"/api/v1/project/:username/:project/:build_num/cancel",
			handleFunctions.DefaultAPI.ProjectUsernameProjectBuildNumCancelPost,
		},
		{
			"ProjectUsernameProjectBuildNumGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/:build_num",
			handleFunctions.DefaultAPI.ProjectUsernameProjectBuildNumGet,
		},
		{
			"ProjectUsernameProjectBuildNumRetryPost",
			http.MethodPost,
			"/api/v1/project/:username/:project/:build_num/retry",
			handleFunctions.DefaultAPI.ProjectUsernameProjectBuildNumRetryPost,
		},
		{
			"ProjectUsernameProjectBuildNumTestsGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/:build_num/tests",
			handleFunctions.DefaultAPI.ProjectUsernameProjectBuildNumTestsGet,
		},
		{
			"ProjectUsernameProjectCheckoutKeyFingerprintDelete",
			http.MethodDelete,
			"/api/v1/project/:username/:project/checkout-key/:fingerprint",
			handleFunctions.DefaultAPI.ProjectUsernameProjectCheckoutKeyFingerprintDelete,
		},
		{
			"ProjectUsernameProjectCheckoutKeyFingerprintGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/checkout-key/:fingerprint",
			handleFunctions.DefaultAPI.ProjectUsernameProjectCheckoutKeyFingerprintGet,
		},
		{
			"ProjectUsernameProjectCheckoutKeyGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/checkout-key",
			handleFunctions.DefaultAPI.ProjectUsernameProjectCheckoutKeyGet,
		},
		{
			"ProjectUsernameProjectCheckoutKeyPost",
			http.MethodPost,
			"/api/v1/project/:username/:project/checkout-key",
			handleFunctions.DefaultAPI.ProjectUsernameProjectCheckoutKeyPost,
		},
		{
			"ProjectUsernameProjectEnvvarGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/envvar",
			handleFunctions.DefaultAPI.ProjectUsernameProjectEnvvarGet,
		},
		{
			"ProjectUsernameProjectEnvvarNameDelete",
			http.MethodDelete,
			"/api/v1/project/:username/:project/envvar/:name",
			handleFunctions.DefaultAPI.ProjectUsernameProjectEnvvarNameDelete,
		},
		{
			"ProjectUsernameProjectEnvvarNameGet",
			http.MethodGet,
			"/api/v1/project/:username/:project/envvar/:name",
			handleFunctions.DefaultAPI.ProjectUsernameProjectEnvvarNameGet,
		},
		{
			"ProjectUsernameProjectEnvvarPost",
			http.MethodPost,
			"/api/v1/project/:username/:project/envvar",
			handleFunctions.DefaultAPI.ProjectUsernameProjectEnvvarPost,
		},
		{
			"ProjectUsernameProjectGet",
			http.MethodGet,
			"/api/v1/project/:username/:project",
			handleFunctions.DefaultAPI.ProjectUsernameProjectGet,
		},
		{
			"ProjectUsernameProjectPost",
			http.MethodPost,
			"/api/v1/project/:username/:project",
			handleFunctions.DefaultAPI.ProjectUsernameProjectPost,
		},
		{
			"ProjectUsernameProjectSshKeyPost",
			http.MethodPost,
			"/api/v1/project/:username/:project/ssh-key",
			handleFunctions.DefaultAPI.ProjectUsernameProjectSshKeyPost,
		},
		{
			"ProjectUsernameProjectTreeBranchPost",
			http.MethodPost,
			"/api/v1/project/:username/:project/tree/:branch",
			handleFunctions.DefaultAPI.ProjectUsernameProjectTreeBranchPost,
		},
		{
			"ProjectsGet",
			http.MethodGet,
			"/api/v1/projects",
			handleFunctions.DefaultAPI.ProjectsGet,
		},
		{
			"RecentBuildsGet",
			http.MethodGet,
			"/api/v1/recent-builds",
			handleFunctions.DefaultAPI.RecentBuildsGet,
		},
		{
			"UserHerokuKeyPost",
			http.MethodPost,
			"/api/v1/user/heroku-key",
			handleFunctions.DefaultAPI.UserHerokuKeyPost,
		},
	}
}