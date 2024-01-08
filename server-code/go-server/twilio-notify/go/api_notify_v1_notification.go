/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * API version: 1.52.0
 * Contact: support@twilio.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// NotifyV1NotificationAPIController binds http requests to an api service and writes the service results to the http response
type NotifyV1NotificationAPIController struct {
	service NotifyV1NotificationAPIServicer
	errorHandler ErrorHandler
}

// NotifyV1NotificationAPIOption for how the controller is set up.
type NotifyV1NotificationAPIOption func(*NotifyV1NotificationAPIController)

// WithNotifyV1NotificationAPIErrorHandler inject ErrorHandler into controller
func WithNotifyV1NotificationAPIErrorHandler(h ErrorHandler) NotifyV1NotificationAPIOption {
	return func(c *NotifyV1NotificationAPIController) {
		c.errorHandler = h
	}
}

// NewNotifyV1NotificationAPIController creates a default api controller
func NewNotifyV1NotificationAPIController(s NotifyV1NotificationAPIServicer, opts ...NotifyV1NotificationAPIOption) Router {
	controller := &NotifyV1NotificationAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the NotifyV1NotificationAPIController
func (c *NotifyV1NotificationAPIController) Routes() Routes {
	return Routes{
		"CreateNotification": Route{
			strings.ToUpper("Post"),
			"/v1/Services/{ServiceSid}/Notifications",
			c.CreateNotification,
		},
	}
}

// CreateNotification - 
func (c *NotifyV1NotificationAPIController) CreateNotification(w http.ResponseWriter, r *http.Request) {
	if err := r.ParseForm(); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	params := mux.Vars(r)
	serviceSidParam := params["ServiceSid"]
	if serviceSidParam == "" {
		c.errorHandler(w, r, &RequiredError{"ServiceSid"}, nil)
		return
	}
	
	
	actionParam := r.FormValue("Action")
	
	
	alexaParam := r.FormValue("Alexa")
	
	
	apnParam := r.FormValue("Apn")
	
	
	bodyParam := r.FormValue("Body")
	
	
	dataParam := r.FormValue("Data")
	
	
	deliveryCallbackUrlParam := r.FormValue("DeliveryCallbackUrl")
	
	
	facebookMessengerParam := r.FormValue("FacebookMessenger")
	
	
	fcmParam := r.FormValue("Fcm")
	
	
	gcmParam := r.FormValue("Gcm")
	
	
	identityParam := strings.Split(r.FormValue("Identity"), ",")
	
	
	priorityParam := r.FormValue("Priority")
	
	
	segmentParam := strings.Split(r.FormValue("Segment"), ",")
	
	
	smsParam := r.FormValue("Sms")
	
	
	soundParam := r.FormValue("Sound")
	
	
	tagParam := strings.Split(r.FormValue("Tag"), ",")
	
	
	titleParam := r.FormValue("Title")
	
	
	toBindingParam := strings.Split(r.FormValue("ToBinding"), ",")
	
	
	ttlParam := r.FormValue("Ttl")
	result, err := c.service.CreateNotification(r.Context(), serviceSidParam, actionParam, alexaParam, apnParam, bodyParam, dataParam, deliveryCallbackUrlParam, facebookMessengerParam, fcmParam, gcmParam, identityParam, priorityParam, segmentParam, smsParam, soundParam, tagParam, titleParam, toBindingParam, ttlParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
