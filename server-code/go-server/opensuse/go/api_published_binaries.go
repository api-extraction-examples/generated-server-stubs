/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// PublishedBinariesAPIController binds http requests to an api service and writes the service results to the http response
type PublishedBinariesAPIController struct {
	service PublishedBinariesAPIServicer
	errorHandler ErrorHandler
}

// PublishedBinariesAPIOption for how the controller is set up.
type PublishedBinariesAPIOption func(*PublishedBinariesAPIController)

// WithPublishedBinariesAPIErrorHandler inject ErrorHandler into controller
func WithPublishedBinariesAPIErrorHandler(h ErrorHandler) PublishedBinariesAPIOption {
	return func(c *PublishedBinariesAPIController) {
		c.errorHandler = h
	}
}

// NewPublishedBinariesAPIController creates a default api controller
func NewPublishedBinariesAPIController(s PublishedBinariesAPIServicer, opts ...PublishedBinariesAPIOption) Router {
	controller := &PublishedBinariesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PublishedBinariesAPIController
func (c *PublishedBinariesAPIController) Routes() Routes {
	return Routes{
		"PublishedGet": Route{
			strings.ToUpper("Get"),
			"/published",
			c.PublishedGet,
		},
		"PublishedProjectNameGet": Route{
			strings.ToUpper("Get"),
			"/published/{project_name}",
			c.PublishedProjectNameGet,
		},
		"PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet": Route{
			strings.ToUpper("Get"),
			"/published/{project_name}/{repository_name}/{architecture_name}/{binary_filename}",
			c.PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet,
		},
		"PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet": Route{
			strings.ToUpper("Get"),
			"/published/{project_name}/{repository_name}/{architecture_name}/{binary_filename}?view=ymp",
			c.PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet,
		},
		"PublishedProjectNameRepositoryNameArchitectureNameGet": Route{
			strings.ToUpper("Get"),
			"/published/{project_name}/{repository_name}/{architecture_name}",
			c.PublishedProjectNameRepositoryNameArchitectureNameGet,
		},
		"PublishedProjectNameRepositoryNameGet": Route{
			strings.ToUpper("Get"),
			"/published/{project_name}/{repository_name}",
			c.PublishedProjectNameRepositoryNameGet,
		},
		"PublishedProjectNameRepositoryNameviewstatusGet": Route{
			strings.ToUpper("Get"),
			"/published/{project_name}/{repository_name}?view=status",
			c.PublishedProjectNameRepositoryNameviewstatusGet,
		},
	}
}

// PublishedGet - List all the published projects.
func (c *PublishedBinariesAPIController) PublishedGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PublishedGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublishedProjectNameGet - List the repositories of a project with published binaries
func (c *PublishedBinariesAPIController) PublishedProjectNameGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PublishedProjectNameGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet - Return the binary file itself.
func (c *PublishedBinariesAPIController) PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	binaryFilenameParam := params["binary_filename"]
	if binaryFilenameParam == "" {
		c.errorHandler(w, r, &RequiredError{"binary_filename"}, nil)
		return
	}
	result, err := c.service.PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet(r.Context(), binaryFilenameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet - Generate a ymp pattern that includes the needed repositories to install the given binary.
func (c *PublishedBinariesAPIController) PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublishedProjectNameRepositoryNameArchitectureNameGet - List the content of the directory tree where the binaries are published at the level project/repository/architecture.
func (c *PublishedBinariesAPIController) PublishedProjectNameRepositoryNameArchitectureNameGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PublishedProjectNameRepositoryNameArchitectureNameGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublishedProjectNameRepositoryNameGet - List the content of the directory tree where the binaries are published at the level project/repository.
func (c *PublishedBinariesAPIController) PublishedProjectNameRepositoryNameGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PublishedProjectNameRepositoryNameGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublishedProjectNameRepositoryNameviewstatusGet - Present information about the last publication of the pair project and repository.
func (c *PublishedBinariesAPIController) PublishedProjectNameRepositoryNameviewstatusGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var viewParam string
	if query.Has("view") {
		param := query.Get("view")

		viewParam = param
	} else {
	}
	result, err := c.service.PublishedProjectNameRepositoryNameviewstatusGet(r.Context(), viewParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}