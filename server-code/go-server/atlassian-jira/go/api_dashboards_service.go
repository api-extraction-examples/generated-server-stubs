/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
	"reflect"
)

// DashboardsAPIService is a service that implements the logic for the DashboardsAPIServicer
// This service should implement the business logic for every endpoint for the DashboardsAPI API.
// Include any external packages or services that will be required by this service.
type DashboardsAPIService struct {
}

// NewDashboardsAPIService creates a default api service
func NewDashboardsAPIService() DashboardsAPIServicer {
	return &DashboardsAPIService{}
}

// AddGadget - Add gadget to dashboard
func (s *DashboardsAPIService) AddGadget(ctx context.Context, dashboardId int64, dashboardGadgetSettings DashboardGadgetSettings) (ImplResponse, error) {
	// TODO - update AddGadget with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DashboardGadget{}) or use other options such as http.Ok ...
	// return Response(200, DashboardGadget{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddGadget method not implemented")
}

// CopyDashboard - Copy dashboard
func (s *DashboardsAPIService) CopyDashboard(ctx context.Context, id string, dashboardDetails DashboardDetails) (ImplResponse, error) {
	// TODO - update CopyDashboard with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Dashboard{}) or use other options such as http.Ok ...
	// return Response(200, Dashboard{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CopyDashboard method not implemented")
}

// CreateDashboard - Create dashboard
func (s *DashboardsAPIService) CreateDashboard(ctx context.Context, dashboardDetails DashboardDetails) (ImplResponse, error) {
	// TODO - update CreateDashboard with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Dashboard{}) or use other options such as http.Ok ...
	// return Response(200, Dashboard{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateDashboard method not implemented")
}

// DeleteDashboard - Delete dashboard
func (s *DashboardsAPIService) DeleteDashboard(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update DeleteDashboard with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteDashboard method not implemented")
}

// DeleteDashboardItemProperty - Delete dashboard item property
func (s *DashboardsAPIService) DeleteDashboardItemProperty(ctx context.Context, dashboardId string, itemId string, propertyKey string) (ImplResponse, error) {
	// TODO - update DeleteDashboardItemProperty with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteDashboardItemProperty method not implemented")
}

// GetAllAvailableDashboardGadgets - Get available gadgets
func (s *DashboardsAPIService) GetAllAvailableDashboardGadgets(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetAllAvailableDashboardGadgets with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AvailableDashboardGadgetsResponse{}) or use other options such as http.Ok ...
	// return Response(200, AvailableDashboardGadgetsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllAvailableDashboardGadgets method not implemented")
}

// GetAllDashboards - Get all dashboards
func (s *DashboardsAPIService) GetAllDashboards(ctx context.Context, filter string, startAt int32, maxResults int32) (ImplResponse, error) {
	// TODO - update GetAllDashboards with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageOfDashboards{}) or use other options such as http.Ok ...
	// return Response(200, PageOfDashboards{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllDashboards method not implemented")
}

// GetAllGadgets - Get gadgets
func (s *DashboardsAPIService) GetAllGadgets(ctx context.Context, dashboardId int64, moduleKey []string, uri []string, gadgetId []int64) (ImplResponse, error) {
	// TODO - update GetAllGadgets with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DashboardGadgetResponse{}) or use other options such as http.Ok ...
	// return Response(200, DashboardGadgetResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllGadgets method not implemented")
}

// GetDashboard - Get dashboard
func (s *DashboardsAPIService) GetDashboard(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update GetDashboard with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Dashboard{}) or use other options such as http.Ok ...
	// return Response(200, Dashboard{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDashboard method not implemented")
}

// GetDashboardItemProperty - Get dashboard item property
func (s *DashboardsAPIService) GetDashboardItemProperty(ctx context.Context, dashboardId string, itemId string, propertyKey string) (ImplResponse, error) {
	// TODO - update GetDashboardItemProperty with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, EntityProperty{}) or use other options such as http.Ok ...
	// return Response(200, EntityProperty{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDashboardItemProperty method not implemented")
}

// GetDashboardItemPropertyKeys - Get dashboard item property keys
func (s *DashboardsAPIService) GetDashboardItemPropertyKeys(ctx context.Context, dashboardId string, itemId string) (ImplResponse, error) {
	// TODO - update GetDashboardItemPropertyKeys with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PropertyKeys{}) or use other options such as http.Ok ...
	// return Response(200, PropertyKeys{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDashboardItemPropertyKeys method not implemented")
}

// GetDashboardsPaginated - Search for dashboards
func (s *DashboardsAPIService) GetDashboardsPaginated(ctx context.Context, dashboardName string, accountId string, owner string, groupname string, groupId string, projectId int64, orderBy string, startAt int64, maxResults int32, status string, expand string) (ImplResponse, error) {
	// TODO - update GetDashboardsPaginated with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanDashboard{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanDashboard{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDashboardsPaginated method not implemented")
}

// RemoveGadget - Remove gadget from dashboard
func (s *DashboardsAPIService) RemoveGadget(ctx context.Context, dashboardId int64, gadgetId int64) (ImplResponse, error) {
	// TODO - update RemoveGadget with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveGadget method not implemented")
}

// SetDashboardItemProperty - Set dashboard item property
func (s *DashboardsAPIService) SetDashboardItemProperty(ctx context.Context, dashboardId string, itemId string, propertyKey string, body *interface{}) (ImplResponse, error) {
	// TODO - update SetDashboardItemProperty with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(201, interface{}{}) or use other options such as http.Ok ...
	// return Response(201, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetDashboardItemProperty method not implemented")
}

// UpdateDashboard - Update dashboard
func (s *DashboardsAPIService) UpdateDashboard(ctx context.Context, id string, dashboardDetails DashboardDetails) (ImplResponse, error) {
	// TODO - update UpdateDashboard with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Dashboard{}) or use other options such as http.Ok ...
	// return Response(200, Dashboard{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateDashboard method not implemented")
}

// UpdateGadget - Update gadget on dashboard
func (s *DashboardsAPIService) UpdateGadget(ctx context.Context, dashboardId int64, gadgetId int64, dashboardGadgetUpdateRequest DashboardGadgetUpdateRequest) (ImplResponse, error) {
	// TODO - update UpdateGadget with the required logic for this service method.
	// Add api_dashboards_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateGadget method not implemented")
}