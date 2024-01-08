/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
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

	// Routes for the PublicAPI part of the API
	PublicAPI PublicAPI
	// Routes for the SandboxAPI part of the API
	SandboxAPI SandboxAPI
	// Routes for the UserAPI part of the API
	UserAPI UserAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"GetCost",
			http.MethodGet,
			"/v1/cost",
			handleFunctions.PublicAPI.GetCost,
		},
		{
			"GetDrivers",
			http.MethodGet,
			"/v1/drivers",
			handleFunctions.PublicAPI.GetDrivers,
		},
		{
			"GetETA",
			http.MethodGet,
			"/v1/eta",
			handleFunctions.PublicAPI.GetETA,
		},
		{
			"GetRideTypes",
			http.MethodGet,
			"/v1/ridetypes",
			handleFunctions.PublicAPI.GetRideTypes,
		},
		{
			"SetPrimeTime",
			http.MethodPut,
			"/v1/sandbox/primetime",
			handleFunctions.SandboxAPI.SetPrimeTime,
		},
		{
			"SetRideStatus",
			http.MethodPut,
			"/v1/sandbox/rides/:id",
			handleFunctions.SandboxAPI.SetRideStatus,
		},
		{
			"SetRideTypeAvailability",
			http.MethodPut,
			"/v1/sandbox/ridetypes/:ride_type",
			handleFunctions.SandboxAPI.SetRideTypeAvailability,
		},
		{
			"SetRideTypes",
			http.MethodPut,
			"/v1/sandbox/ridetypes",
			handleFunctions.SandboxAPI.SetRideTypes,
		},
		{
			"CancelRide",
			http.MethodPost,
			"/v1/rides/:id/cancel",
			handleFunctions.UserAPI.CancelRide,
		},
		{
			"GetProfile",
			http.MethodGet,
			"/v1/profile",
			handleFunctions.UserAPI.GetProfile,
		},
		{
			"GetRide",
			http.MethodGet,
			"/v1/rides/:id",
			handleFunctions.UserAPI.GetRide,
		},
		{
			"GetRideReceipt",
			http.MethodGet,
			"/v1/rides/:id/receipt",
			handleFunctions.UserAPI.GetRideReceipt,
		},
		{
			"GetRides",
			http.MethodGet,
			"/v1/rides",
			handleFunctions.UserAPI.GetRides,
		},
		{
			"NewRide",
			http.MethodPost,
			"/v1/rides",
			handleFunctions.UserAPI.NewRide,
		},
		{
			"SetRideDestination",
			http.MethodPut,
			"/v1/rides/:id/destination",
			handleFunctions.UserAPI.SetRideDestination,
		},
		{
			"SetRideRating",
			http.MethodPut,
			"/v1/rides/:id/rating",
			handleFunctions.UserAPI.SetRideRating,
		},
	}
}