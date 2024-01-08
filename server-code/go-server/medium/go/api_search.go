/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// SearchAPIController binds http requests to an api service and writes the service results to the http response
type SearchAPIController struct {
	service SearchAPIServicer
	errorHandler ErrorHandler
}

// SearchAPIOption for how the controller is set up.
type SearchAPIOption func(*SearchAPIController)

// WithSearchAPIErrorHandler inject ErrorHandler into controller
func WithSearchAPIErrorHandler(h ErrorHandler) SearchAPIOption {
	return func(c *SearchAPIController) {
		c.errorHandler = h
	}
}

// NewSearchAPIController creates a default api controller
func NewSearchAPIController(s SearchAPIServicer, opts ...SearchAPIOption) Router {
	controller := &SearchAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SearchAPIController
func (c *SearchAPIController) Routes() Routes {
	return Routes{
		"SearchArticlesqueryqueryGet": Route{
			strings.ToUpper("Get"),
			"/search/articles?query={query}",
			c.SearchArticlesqueryqueryGet,
		},
		"SearchListsqueryqueryGet": Route{
			strings.ToUpper("Get"),
			"/search/lists?query={query}",
			c.SearchListsqueryqueryGet,
		},
		"SearchPublicationsqueryqueryGet": Route{
			strings.ToUpper("Get"),
			"/search/publications?query={query}",
			c.SearchPublicationsqueryqueryGet,
		},
		"SearchTagsqueryqueryGet": Route{
			strings.ToUpper("Get"),
			"/search/tags?query={query}",
			c.SearchTagsqueryqueryGet,
		},
		"SearchUsersqueryqueryGet": Route{
			strings.ToUpper("Get"),
			"/search/users?query={query}",
			c.SearchUsersqueryqueryGet,
		},
	}
}

// SearchArticlesqueryqueryGet - Search Articles
func (c *SearchAPIController) SearchArticlesqueryqueryGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
		return
	}
	result, err := c.service.SearchArticlesqueryqueryGet(r.Context(), queryParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchListsqueryqueryGet - Search Lists
func (c *SearchAPIController) SearchListsqueryqueryGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
		return
	}
	result, err := c.service.SearchListsqueryqueryGet(r.Context(), queryParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchPublicationsqueryqueryGet - Search Publications
func (c *SearchAPIController) SearchPublicationsqueryqueryGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
		return
	}
	result, err := c.service.SearchPublicationsqueryqueryGet(r.Context(), queryParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchTagsqueryqueryGet - Search Tags
func (c *SearchAPIController) SearchTagsqueryqueryGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
		return
	}
	result, err := c.service.SearchTagsqueryqueryGet(r.Context(), queryParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchUsersqueryqueryGet - Search Users
func (c *SearchAPIController) SearchUsersqueryqueryGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
		return
	}
	result, err := c.service.SearchUsersqueryqueryGet(r.Context(), queryParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
