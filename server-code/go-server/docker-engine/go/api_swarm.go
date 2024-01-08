/*
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release of Docker, so API calls are versioned to ensure that clients don't break.  For Docker Engine 17.09, the API version is 1.32. To lock to this version, you prefix the URL with `/v1.32`. For example, calling `/info` is the same as calling `/v1.32/info`.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  In previous versions of Docker, it was possible to access the API without providing a version. This behaviour is now deprecated will be removed in a future version of Docker.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer Docker daemons.  This documentation is for version 1.33 of the API. Use this table to find documentation for previous versions of the API:  Docker version  | API version | Changes ----------------|-------------|--------- 17.09.x | [1.31](https://docs.docker.com/engine/api/v1.32/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-32-api-changes) 17.07.x | [1.31](https://docs.docker.com/engine/api/v1.31/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-31-api-changes) 17.06.x | [1.30](https://docs.docker.com/engine/api/v1.30/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-30-api-changes) 17.05.x | [1.29](https://docs.docker.com/engine/api/v1.29/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-29-api-changes) 17.04.x | [1.28](https://docs.docker.com/engine/api/v1.28/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-28-api-changes) 17.03.1 | [1.27](https://docs.docker.com/engine/api/v1.27/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-27-api-changes) 1.13.1 & 17.03.0 | [1.26](https://docs.docker.com/engine/api/v1.26/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-26-api-changes) 1.13.0 | [1.25](https://docs.docker.com/engine/api/v1.25/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-25-api-changes) 1.12.x | [1.24](https://docs.docker.com/engine/api/v1.24/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-24-api-changes) 1.11.x | [1.23](https://docs.docker.com/engine/api/v1.23/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-23-api-changes) 1.10.x | [1.22](https://docs.docker.com/engine/api/v1.22/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-22-api-changes) 1.9.x | [1.21](https://docs.docker.com/engine/api/v1.21/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-21-api-changes) 1.8.x | [1.20](https://docs.docker.com/engine/api/v1.20/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-20-api-changes) 1.7.x | [1.19](https://docs.docker.com/engine/api/v1.19/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-19-api-changes) 1.6.x | [1.18](https://docs.docker.com/engine/api/v1.18/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-18-api-changes)  # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a Base64 encoded (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * API version: 1.33
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// SwarmAPIController binds http requests to an api service and writes the service results to the http response
type SwarmAPIController struct {
	service SwarmAPIServicer
	errorHandler ErrorHandler
}

// SwarmAPIOption for how the controller is set up.
type SwarmAPIOption func(*SwarmAPIController)

// WithSwarmAPIErrorHandler inject ErrorHandler into controller
func WithSwarmAPIErrorHandler(h ErrorHandler) SwarmAPIOption {
	return func(c *SwarmAPIController) {
		c.errorHandler = h
	}
}

// NewSwarmAPIController creates a default api controller
func NewSwarmAPIController(s SwarmAPIServicer, opts ...SwarmAPIOption) Router {
	controller := &SwarmAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SwarmAPIController
func (c *SwarmAPIController) Routes() Routes {
	return Routes{
		"SwarmInit": Route{
			strings.ToUpper("Post"),
			"/v1.33/swarm/init",
			c.SwarmInit,
		},
		"SwarmInspect": Route{
			strings.ToUpper("Get"),
			"/v1.33/swarm",
			c.SwarmInspect,
		},
		"SwarmJoin": Route{
			strings.ToUpper("Post"),
			"/v1.33/swarm/join",
			c.SwarmJoin,
		},
		"SwarmLeave": Route{
			strings.ToUpper("Post"),
			"/v1.33/swarm/leave",
			c.SwarmLeave,
		},
		"SwarmUnlock": Route{
			strings.ToUpper("Post"),
			"/v1.33/swarm/unlock",
			c.SwarmUnlock,
		},
		"SwarmUnlockkey": Route{
			strings.ToUpper("Get"),
			"/v1.33/swarm/unlockkey",
			c.SwarmUnlockkey,
		},
		"SwarmUpdate": Route{
			strings.ToUpper("Post"),
			"/v1.33/swarm/update",
			c.SwarmUpdate,
		},
	}
}

// SwarmInit - Initialize a new swarm
func (c *SwarmAPIController) SwarmInit(w http.ResponseWriter, r *http.Request) {
	swarmInitRequestParam := SwarmInitRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&swarmInitRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSwarmInitRequestRequired(swarmInitRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSwarmInitRequestConstraints(swarmInitRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SwarmInit(r.Context(), swarmInitRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SwarmInspect - Inspect swarm
func (c *SwarmAPIController) SwarmInspect(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.SwarmInspect(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SwarmJoin - Join an existing swarm
func (c *SwarmAPIController) SwarmJoin(w http.ResponseWriter, r *http.Request) {
	swarmJoinRequestParam := SwarmJoinRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&swarmJoinRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSwarmJoinRequestRequired(swarmJoinRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSwarmJoinRequestConstraints(swarmJoinRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SwarmJoin(r.Context(), swarmJoinRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SwarmLeave - Leave a swarm
func (c *SwarmAPIController) SwarmLeave(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var forceParam bool
	if query.Has("force") {
		param, err := parseBoolParameter(
			query.Get("force"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		forceParam = param
	} else {
		var param bool = false
		forceParam = param
	}
	result, err := c.service.SwarmLeave(r.Context(), forceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SwarmUnlock - Unlock a locked manager
func (c *SwarmAPIController) SwarmUnlock(w http.ResponseWriter, r *http.Request) {
	swarmUnlockRequestParam := SwarmUnlockRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&swarmUnlockRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSwarmUnlockRequestRequired(swarmUnlockRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSwarmUnlockRequestConstraints(swarmUnlockRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SwarmUnlock(r.Context(), swarmUnlockRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SwarmUnlockkey - Get the unlock key
func (c *SwarmAPIController) SwarmUnlockkey(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.SwarmUnlockkey(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SwarmUpdate - Update a swarm
func (c *SwarmAPIController) SwarmUpdate(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var versionParam int64
	if query.Has("version") {
		param, err := parseNumericParameter[int64](
			query.Get("version"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		versionParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "version"}, nil)
		return
	}
	swarmSpecParam := SwarmSpec{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&swarmSpecParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSwarmSpecRequired(swarmSpecParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSwarmSpecConstraints(swarmSpecParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var rotateWorkerTokenParam bool
	if query.Has("rotateWorkerToken") {
		param, err := parseBoolParameter(
			query.Get("rotateWorkerToken"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		rotateWorkerTokenParam = param
	} else {
		var param bool = false
		rotateWorkerTokenParam = param
	}
	var rotateManagerTokenParam bool
	if query.Has("rotateManagerToken") {
		param, err := parseBoolParameter(
			query.Get("rotateManagerToken"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		rotateManagerTokenParam = param
	} else {
		var param bool = false
		rotateManagerTokenParam = param
	}
	var rotateManagerUnlockKeyParam bool
	if query.Has("rotateManagerUnlockKey") {
		param, err := parseBoolParameter(
			query.Get("rotateManagerUnlockKey"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		rotateManagerUnlockKeyParam = param
	} else {
		var param bool = false
		rotateManagerUnlockKeyParam = param
	}
	result, err := c.service.SwarmUpdate(r.Context(), versionParam, swarmSpecParam, rotateWorkerTokenParam, rotateManagerTokenParam, rotateManagerUnlockKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
