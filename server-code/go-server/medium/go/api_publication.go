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

// PublicationAPIController binds http requests to an api service and writes the service results to the http response
type PublicationAPIController struct {
	service PublicationAPIServicer
	errorHandler ErrorHandler
}

// PublicationAPIOption for how the controller is set up.
type PublicationAPIOption func(*PublicationAPIController)

// WithPublicationAPIErrorHandler inject ErrorHandler into controller
func WithPublicationAPIErrorHandler(h ErrorHandler) PublicationAPIOption {
	return func(c *PublicationAPIController) {
		c.errorHandler = h
	}
}

// NewPublicationAPIController creates a default api controller
func NewPublicationAPIController(s PublicationAPIServicer, opts ...PublicationAPIOption) Router {
	controller := &PublicationAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PublicationAPIController
func (c *PublicationAPIController) Routes() Routes {
	return Routes{
		"PublicationIdForPublicationSlugGet": Route{
			strings.ToUpper("Get"),
			"/publication/id_for/{publication_slug}",
			c.PublicationIdForPublicationSlugGet,
		},
		"PublicationPublicationIdArticlesGet": Route{
			strings.ToUpper("Get"),
			"/publication/{publication_id}/articles",
			c.PublicationPublicationIdArticlesGet,
		},
		"PublicationPublicationIdGet": Route{
			strings.ToUpper("Get"),
			"/publication/{publication_id}",
			c.PublicationPublicationIdGet,
		},
		"PublicationPublicationIdNewsletterGet": Route{
			strings.ToUpper("Get"),
			"/publication/{publication_id}/newsletter",
			c.PublicationPublicationIdNewsletterGet,
		},
	}
}

// PublicationIdForPublicationSlugGet - Get Publication ID
func (c *PublicationAPIController) PublicationIdForPublicationSlugGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	publicationSlugParam := params["publication_slug"]
	if publicationSlugParam == "" {
		c.errorHandler(w, r, &RequiredError{"publication_slug"}, nil)
		return
	}
	result, err := c.service.PublicationIdForPublicationSlugGet(r.Context(), publicationSlugParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublicationPublicationIdArticlesGet - Get Publication Articles
func (c *PublicationAPIController) PublicationPublicationIdArticlesGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	publicationIdParam := params["publication_id"]
	if publicationIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"publication_id"}, nil)
		return
	}
	var fromParam string
	if query.Has("from") {
		param := query.Get("from")

		fromParam = param
	} else {
	}
	result, err := c.service.PublicationPublicationIdArticlesGet(r.Context(), publicationIdParam, fromParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublicationPublicationIdGet - Get Publication Info
func (c *PublicationAPIController) PublicationPublicationIdGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	publicationIdParam := params["publication_id"]
	if publicationIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"publication_id"}, nil)
		return
	}
	result, err := c.service.PublicationPublicationIdGet(r.Context(), publicationIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PublicationPublicationIdNewsletterGet - Get Publication Newsletter
func (c *PublicationAPIController) PublicationPublicationIdNewsletterGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	publicationIdParam := params["publication_id"]
	if publicationIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"publication_id"}, nil)
		return
	}
	result, err := c.service.PublicationPublicationIdNewsletterGet(r.Context(), publicationIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}