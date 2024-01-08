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

	// Routes for the NotifyV1BindingAPI part of the API
	NotifyV1BindingAPI NotifyV1BindingAPI
	// Routes for the NotifyV1CredentialAPI part of the API
	NotifyV1CredentialAPI NotifyV1CredentialAPI
	// Routes for the NotifyV1NotificationAPI part of the API
	NotifyV1NotificationAPI NotifyV1NotificationAPI
	// Routes for the NotifyV1ServiceAPI part of the API
	NotifyV1ServiceAPI NotifyV1ServiceAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"CreateBinding",
			http.MethodPost,
			"/v1/Services/:ServiceSid/Bindings",
			handleFunctions.NotifyV1BindingAPI.CreateBinding,
		},
		{
			"DeleteBinding",
			http.MethodDelete,
			"/v1/Services/:ServiceSid/Bindings/:Sid",
			handleFunctions.NotifyV1BindingAPI.DeleteBinding,
		},
		{
			"FetchBinding",
			http.MethodGet,
			"/v1/Services/:ServiceSid/Bindings/:Sid",
			handleFunctions.NotifyV1BindingAPI.FetchBinding,
		},
		{
			"ListBinding",
			http.MethodGet,
			"/v1/Services/:ServiceSid/Bindings",
			handleFunctions.NotifyV1BindingAPI.ListBinding,
		},
		{
			"CreateCredential",
			http.MethodPost,
			"/v1/Credentials",
			handleFunctions.NotifyV1CredentialAPI.CreateCredential,
		},
		{
			"DeleteCredential",
			http.MethodDelete,
			"/v1/Credentials/:Sid",
			handleFunctions.NotifyV1CredentialAPI.DeleteCredential,
		},
		{
			"FetchCredential",
			http.MethodGet,
			"/v1/Credentials/:Sid",
			handleFunctions.NotifyV1CredentialAPI.FetchCredential,
		},
		{
			"ListCredential",
			http.MethodGet,
			"/v1/Credentials",
			handleFunctions.NotifyV1CredentialAPI.ListCredential,
		},
		{
			"UpdateCredential",
			http.MethodPost,
			"/v1/Credentials/:Sid",
			handleFunctions.NotifyV1CredentialAPI.UpdateCredential,
		},
		{
			"CreateNotification",
			http.MethodPost,
			"/v1/Services/:ServiceSid/Notifications",
			handleFunctions.NotifyV1NotificationAPI.CreateNotification,
		},
		{
			"CreateService",
			http.MethodPost,
			"/v1/Services",
			handleFunctions.NotifyV1ServiceAPI.CreateService,
		},
		{
			"DeleteService",
			http.MethodDelete,
			"/v1/Services/:Sid",
			handleFunctions.NotifyV1ServiceAPI.DeleteService,
		},
		{
			"FetchService",
			http.MethodGet,
			"/v1/Services/:Sid",
			handleFunctions.NotifyV1ServiceAPI.FetchService,
		},
		{
			"ListService",
			http.MethodGet,
			"/v1/Services",
			handleFunctions.NotifyV1ServiceAPI.ListService,
		},
		{
			"UpdateService",
			http.MethodPost,
			"/v1/Services/:Sid",
			handleFunctions.NotifyV1ServiceAPI.UpdateService,
		},
	}
}
