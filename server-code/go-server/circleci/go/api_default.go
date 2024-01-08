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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// DefaultAPIController binds http requests to an api service and writes the service results to the http response
type DefaultAPIController struct {
	service DefaultAPIServicer
	errorHandler ErrorHandler
}

// DefaultAPIOption for how the controller is set up.
type DefaultAPIOption func(*DefaultAPIController)

// WithDefaultAPIErrorHandler inject ErrorHandler into controller
func WithDefaultAPIErrorHandler(h ErrorHandler) DefaultAPIOption {
	return func(c *DefaultAPIController) {
		c.errorHandler = h
	}
}

// NewDefaultAPIController creates a default api controller
func NewDefaultAPIController(s DefaultAPIServicer, opts ...DefaultAPIOption) Router {
	controller := &DefaultAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DefaultAPIController
func (c *DefaultAPIController) Routes() Routes {
	return Routes{
		"MeGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/me",
			c.MeGet,
		},
		"ProjectUsernameProjectBuildCacheDelete": Route{
			strings.ToUpper("Delete"),
			"/api/v1/project/{username}/{project}/build-cache",
			c.ProjectUsernameProjectBuildCacheDelete,
		},
		"ProjectUsernameProjectBuildNumArtifactsGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/{build_num}/artifacts",
			c.ProjectUsernameProjectBuildNumArtifactsGet,
		},
		"ProjectUsernameProjectBuildNumCancelPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}/{build_num}/cancel",
			c.ProjectUsernameProjectBuildNumCancelPost,
		},
		"ProjectUsernameProjectBuildNumGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/{build_num}",
			c.ProjectUsernameProjectBuildNumGet,
		},
		"ProjectUsernameProjectBuildNumRetryPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}/{build_num}/retry",
			c.ProjectUsernameProjectBuildNumRetryPost,
		},
		"ProjectUsernameProjectBuildNumTestsGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/{build_num}/tests",
			c.ProjectUsernameProjectBuildNumTestsGet,
		},
		"ProjectUsernameProjectCheckoutKeyFingerprintDelete": Route{
			strings.ToUpper("Delete"),
			"/api/v1/project/{username}/{project}/checkout-key/{fingerprint}",
			c.ProjectUsernameProjectCheckoutKeyFingerprintDelete,
		},
		"ProjectUsernameProjectCheckoutKeyFingerprintGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/checkout-key/{fingerprint}",
			c.ProjectUsernameProjectCheckoutKeyFingerprintGet,
		},
		"ProjectUsernameProjectCheckoutKeyGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/checkout-key",
			c.ProjectUsernameProjectCheckoutKeyGet,
		},
		"ProjectUsernameProjectCheckoutKeyPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}/checkout-key",
			c.ProjectUsernameProjectCheckoutKeyPost,
		},
		"ProjectUsernameProjectEnvvarGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/envvar",
			c.ProjectUsernameProjectEnvvarGet,
		},
		"ProjectUsernameProjectEnvvarNameDelete": Route{
			strings.ToUpper("Delete"),
			"/api/v1/project/{username}/{project}/envvar/{name}",
			c.ProjectUsernameProjectEnvvarNameDelete,
		},
		"ProjectUsernameProjectEnvvarNameGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}/envvar/{name}",
			c.ProjectUsernameProjectEnvvarNameGet,
		},
		"ProjectUsernameProjectEnvvarPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}/envvar",
			c.ProjectUsernameProjectEnvvarPost,
		},
		"ProjectUsernameProjectGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/project/{username}/{project}",
			c.ProjectUsernameProjectGet,
		},
		"ProjectUsernameProjectPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}",
			c.ProjectUsernameProjectPost,
		},
		"ProjectUsernameProjectSshKeyPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}/ssh-key",
			c.ProjectUsernameProjectSshKeyPost,
		},
		"ProjectUsernameProjectTreeBranchPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/project/{username}/{project}/tree/{branch}",
			c.ProjectUsernameProjectTreeBranchPost,
		},
		"ProjectsGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/projects",
			c.ProjectsGet,
		},
		"RecentBuildsGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/recent-builds",
			c.RecentBuildsGet,
		},
		"UserHerokuKeyPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/user/heroku-key",
			c.UserHerokuKeyPost,
		},
	}
}

// MeGet - 
func (c *DefaultAPIController) MeGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.MeGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectBuildCacheDelete - 
func (c *DefaultAPIController) ProjectUsernameProjectBuildCacheDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectBuildCacheDelete(r.Context(), usernameParam, projectParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectBuildNumArtifactsGet - 
func (c *DefaultAPIController) ProjectUsernameProjectBuildNumArtifactsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	buildNumParam, err := parseNumericParameter[int32](
		params["build_num"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectBuildNumArtifactsGet(r.Context(), usernameParam, projectParam, buildNumParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectBuildNumCancelPost - 
func (c *DefaultAPIController) ProjectUsernameProjectBuildNumCancelPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	buildNumParam, err := parseNumericParameter[int32](
		params["build_num"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectBuildNumCancelPost(r.Context(), usernameParam, projectParam, buildNumParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectBuildNumGet - 
func (c *DefaultAPIController) ProjectUsernameProjectBuildNumGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	buildNumParam, err := parseNumericParameter[int32](
		params["build_num"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectBuildNumGet(r.Context(), usernameParam, projectParam, buildNumParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectBuildNumRetryPost - 
func (c *DefaultAPIController) ProjectUsernameProjectBuildNumRetryPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	buildNumParam, err := parseNumericParameter[int32](
		params["build_num"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectBuildNumRetryPost(r.Context(), usernameParam, projectParam, buildNumParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectBuildNumTestsGet - 
func (c *DefaultAPIController) ProjectUsernameProjectBuildNumTestsGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	buildNumParam, err := parseNumericParameter[int32](
		params["build_num"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectBuildNumTestsGet(r.Context(), usernameParam, projectParam, buildNumParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectCheckoutKeyFingerprintDelete - 
func (c *DefaultAPIController) ProjectUsernameProjectCheckoutKeyFingerprintDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	fingerprintParam := params["fingerprint"]
	if fingerprintParam == "" {
		c.errorHandler(w, r, &RequiredError{"fingerprint"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectCheckoutKeyFingerprintDelete(r.Context(), usernameParam, projectParam, fingerprintParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectCheckoutKeyFingerprintGet - 
func (c *DefaultAPIController) ProjectUsernameProjectCheckoutKeyFingerprintGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	fingerprintParam := params["fingerprint"]
	if fingerprintParam == "" {
		c.errorHandler(w, r, &RequiredError{"fingerprint"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectCheckoutKeyFingerprintGet(r.Context(), usernameParam, projectParam, fingerprintParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectCheckoutKeyGet - 
func (c *DefaultAPIController) ProjectUsernameProjectCheckoutKeyGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectCheckoutKeyGet(r.Context(), usernameParam, projectParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectCheckoutKeyPost - 
func (c *DefaultAPIController) ProjectUsernameProjectCheckoutKeyPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	bodyParam := string{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectCheckoutKeyPost(r.Context(), usernameParam, projectParam, bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectEnvvarGet - 
func (c *DefaultAPIController) ProjectUsernameProjectEnvvarGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectEnvvarGet(r.Context(), usernameParam, projectParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectEnvvarNameDelete - 
func (c *DefaultAPIController) ProjectUsernameProjectEnvvarNameDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectEnvvarNameDelete(r.Context(), usernameParam, projectParam, nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectEnvvarNameGet - 
func (c *DefaultAPIController) ProjectUsernameProjectEnvvarNameGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectEnvvarNameGet(r.Context(), usernameParam, projectParam, nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectEnvvarPost - 
func (c *DefaultAPIController) ProjectUsernameProjectEnvvarPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectEnvvarPost(r.Context(), usernameParam, projectParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectGet - 
func (c *DefaultAPIController) ProjectUsernameProjectGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](100),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 30
		limitParam = param
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
		var param int32 = 0
		offsetParam = param
	}
	var filterParam string
	if query.Has("filter") {
		param := query.Get("filter")

		filterParam = param
	} else {
	}
	result, err := c.service.ProjectUsernameProjectGet(r.Context(), usernameParam, projectParam, limitParam, offsetParam, filterParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectPost - 
func (c *DefaultAPIController) ProjectUsernameProjectPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	projectUsernameProjectPostRequestParam := ProjectUsernameProjectPostRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&projectUsernameProjectPostRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertProjectUsernameProjectPostRequestRequired(projectUsernameProjectPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertProjectUsernameProjectPostRequestConstraints(projectUsernameProjectPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectPost(r.Context(), usernameParam, projectParam, projectUsernameProjectPostRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectSshKeyPost - 
func (c *DefaultAPIController) ProjectUsernameProjectSshKeyPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	contentTypeParam := r.Header.Get("Content-Type")
	projectUsernameProjectSshKeyPostRequestParam := ProjectUsernameProjectSshKeyPostRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&projectUsernameProjectSshKeyPostRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertProjectUsernameProjectSshKeyPostRequestRequired(projectUsernameProjectSshKeyPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertProjectUsernameProjectSshKeyPostRequestConstraints(projectUsernameProjectSshKeyPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectSshKeyPost(r.Context(), usernameParam, projectParam, contentTypeParam, projectUsernameProjectSshKeyPostRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectUsernameProjectTreeBranchPost - 
func (c *DefaultAPIController) ProjectUsernameProjectTreeBranchPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	usernameParam := params["username"]
	if usernameParam == "" {
		c.errorHandler(w, r, &RequiredError{"username"}, nil)
		return
	}
	projectParam := params["project"]
	if projectParam == "" {
		c.errorHandler(w, r, &RequiredError{"project"}, nil)
		return
	}
	branchParam := params["branch"]
	if branchParam == "" {
		c.errorHandler(w, r, &RequiredError{"branch"}, nil)
		return
	}
	projectUsernameProjectTreeBranchPostRequestParam := ProjectUsernameProjectTreeBranchPostRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&projectUsernameProjectTreeBranchPostRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertProjectUsernameProjectTreeBranchPostRequestRequired(projectUsernameProjectTreeBranchPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertProjectUsernameProjectTreeBranchPostRequestConstraints(projectUsernameProjectTreeBranchPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ProjectUsernameProjectTreeBranchPost(r.Context(), usernameParam, projectParam, branchParam, projectUsernameProjectTreeBranchPostRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ProjectsGet - 
func (c *DefaultAPIController) ProjectsGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ProjectsGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RecentBuildsGet - 
func (c *DefaultAPIController) RecentBuildsGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](100),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 30
		limitParam = param
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
		var param int32 = 0
		offsetParam = param
	}
	result, err := c.service.RecentBuildsGet(r.Context(), limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UserHerokuKeyPost - 
func (c *DefaultAPIController) UserHerokuKeyPost(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.UserHerokuKeyPost(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}