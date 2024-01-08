/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * API version: 0.1.0
 * Contact: pim.360.team@intel.com
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

	// Routes for the ProductsAPI part of the API
	ProductsAPI ProductsAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"GetCodeName",
			http.MethodGet,
			"/api/products/get-codename",
			handleFunctions.ProductsAPI.GetCodeName,
		},
		{
			"GetProductInfo",
			http.MethodGet,
			"/api/products/get-products-info",
			handleFunctions.ProductsAPI.GetProductInfo,
		},
		{
			"GetProductList",
			http.MethodGet,
			"/api/products/get-products",
			handleFunctions.ProductsAPI.GetProductList,
		},
		{
			"Getorderinginfo",
			http.MethodGet,
			"/api/products/get-ordering-info",
			handleFunctions.ProductsAPI.Getorderinginfo,
		},
	}
}