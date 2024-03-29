/*
 * AltoroJ REST API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.2
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// Class4FeedbackAPIController binds http requests to an api service and writes the service results to the http response
type Class4FeedbackAPIController struct {
	service Class4FeedbackAPIServicer
	errorHandler ErrorHandler
}

// Class4FeedbackAPIOption for how the controller is set up.
type Class4FeedbackAPIOption func(*Class4FeedbackAPIController)

// WithClass4FeedbackAPIErrorHandler inject ErrorHandler into controller
func WithClass4FeedbackAPIErrorHandler(h ErrorHandler) Class4FeedbackAPIOption {
	return func(c *Class4FeedbackAPIController) {
		c.errorHandler = h
	}
}

// NewClass4FeedbackAPIController creates a default api controller
func NewClass4FeedbackAPIController(s Class4FeedbackAPIServicer, opts ...Class4FeedbackAPIOption) Router {
	controller := &Class4FeedbackAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the Class4FeedbackAPIController
func (c *Class4FeedbackAPIController) Routes() Routes {
	return Routes{
		"GetFeedback": Route{
			strings.ToUpper("Get"),
			"/api/feedback/{feedbackId}",
			c.GetFeedback,
		},
		"SendFeedback": Route{
			strings.ToUpper("Post"),
			"/api/feedback/submit",
			c.SendFeedback,
		},
	}
}

// GetFeedback - 
func (c *Class4FeedbackAPIController) GetFeedback(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	authorizationParam := r.Header.Get("Authorization")
	feedbackIdParam := params["feedbackId"]
	if feedbackIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"feedbackId"}, nil)
		return
	}
	result, err := c.service.GetFeedback(r.Context(), authorizationParam, feedbackIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SendFeedback - 
func (c *Class4FeedbackAPIController) SendFeedback(w http.ResponseWriter, r *http.Request) {
	bodyParam := Feedback{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFeedbackRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFeedbackConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SendFeedback(r.Context(), bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
