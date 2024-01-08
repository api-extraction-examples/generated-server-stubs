/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
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

	// Routes for the ActivityAPI part of the API
	ActivityAPI ActivityAPI
	// Routes for the FilesAPI part of the API
	FilesAPI FilesAPI
	// Routes for the HealthAPI part of the API
	HealthAPI HealthAPI
	// Routes for the ItemsAPI part of the API
	ItemsAPI ItemsAPI
	// Routes for the MetricsAPI part of the API
	MetricsAPI MetricsAPI
	// Routes for the VaultsAPI part of the API
	VaultsAPI VaultsAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"GetApiActivity",
			http.MethodGet,
			"/activity",
			handleFunctions.ActivityAPI.GetApiActivity,
		},
		{
			"DownloadFileByID",
			http.MethodGet,
			"/vaults/:vaultUuid/items/:itemUuid/files/:fileUuid/content",
			handleFunctions.FilesAPI.DownloadFileByID,
		},
		{
			"GetDetailsOfFileById",
			http.MethodGet,
			"/vaults/:vaultUuid/items/:itemUuid/files/:fileUuid",
			handleFunctions.FilesAPI.GetDetailsOfFileById,
		},
		{
			"GetItemFiles",
			http.MethodGet,
			"/vaults/:vaultUuid/items/:itemUuid/files",
			handleFunctions.FilesAPI.GetItemFiles,
		},
		{
			"GetHeartbeat",
			http.MethodGet,
			"/heartbeat",
			handleFunctions.HealthAPI.GetHeartbeat,
		},
		{
			"GetServerHealth",
			http.MethodGet,
			"/health",
			handleFunctions.HealthAPI.GetServerHealth,
		},
		{
			"CreateVaultItem",
			http.MethodPost,
			"/vaults/:vaultUuid/items",
			handleFunctions.ItemsAPI.CreateVaultItem,
		},
		{
			"DeleteVaultItem",
			http.MethodDelete,
			"/vaults/:vaultUuid/items/:itemUuid",
			handleFunctions.ItemsAPI.DeleteVaultItem,
		},
		{
			"GetVaultItemById",
			http.MethodGet,
			"/vaults/:vaultUuid/items/:itemUuid",
			handleFunctions.ItemsAPI.GetVaultItemById,
		},
		{
			"GetVaultItems",
			http.MethodGet,
			"/vaults/:vaultUuid/items",
			handleFunctions.ItemsAPI.GetVaultItems,
		},
		{
			"PatchVaultItem",
			http.MethodPatch,
			"/vaults/:vaultUuid/items/:itemUuid",
			handleFunctions.ItemsAPI.PatchVaultItem,
		},
		{
			"UpdateVaultItem",
			http.MethodPut,
			"/vaults/:vaultUuid/items/:itemUuid",
			handleFunctions.ItemsAPI.UpdateVaultItem,
		},
		{
			"GetPrometheusMetrics",
			http.MethodGet,
			"/metrics",
			handleFunctions.MetricsAPI.GetPrometheusMetrics,
		},
		{
			"GetVaultById",
			http.MethodGet,
			"/vaults/:vaultUuid",
			handleFunctions.VaultsAPI.GetVaultById,
		},
		{
			"GetVaults",
			http.MethodGet,
			"/vaults",
			handleFunctions.VaultsAPI.GetVaults,
		},
	}
}
