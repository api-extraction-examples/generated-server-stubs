/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// NotificationsAPIService is a service that implements the logic for the NotificationsAPIServicer
// This service should implement the business logic for every endpoint for the NotificationsAPI API.
// Include any external packages or services that will be required by this service.
type NotificationsAPIService struct {
}

// NewNotificationsAPIService creates a default api service
func NewNotificationsAPIService() NotificationsAPIServicer {
	return &NotificationsAPIService{}
}

// CreateAdminNotification - Sends a notification to all admins.
func (s *NotificationsAPIService) CreateAdminNotification(ctx context.Context, url *string, level NotificationLevel, name *string, description *string) (ImplResponse, error) {
	// TODO - update CreateAdminNotification with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateAdminNotification method not implemented")
}

// GetNotificationServices - Gets notification services.
func (s *NotificationsAPIService) GetNotificationServices(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetNotificationServices with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []NameIdPair{}) or use other options such as http.Ok ...
	// return Response(200, []NameIdPair{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNotificationServices method not implemented")
}

// GetNotificationTypes - Gets notification types.
func (s *NotificationsAPIService) GetNotificationTypes(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetNotificationTypes with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []NotificationTypeInfo{}) or use other options such as http.Ok ...
	// return Response(200, []NotificationTypeInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNotificationTypes method not implemented")
}

// GetNotifications - Gets a user&#39;s notifications.
func (s *NotificationsAPIService) GetNotifications(ctx context.Context, userId string) (ImplResponse, error) {
	// TODO - update GetNotifications with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, NotificationResultDto{}) or use other options such as http.Ok ...
	// return Response(200, NotificationResultDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNotifications method not implemented")
}

// GetNotificationsSummary - Gets a user&#39;s notification summary.
func (s *NotificationsAPIService) GetNotificationsSummary(ctx context.Context, userId string) (ImplResponse, error) {
	// TODO - update GetNotificationsSummary with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, NotificationsSummaryDto{}) or use other options such as http.Ok ...
	// return Response(200, NotificationsSummaryDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNotificationsSummary method not implemented")
}

// SetRead - Sets notifications as read.
func (s *NotificationsAPIService) SetRead(ctx context.Context, userId string) (ImplResponse, error) {
	// TODO - update SetRead with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetRead method not implemented")
}

// SetUnread - Sets notifications as unread.
func (s *NotificationsAPIService) SetUnread(ctx context.Context, userId string) (ImplResponse, error) {
	// TODO - update SetUnread with the required logic for this service method.
	// Add api_notifications_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetUnread method not implemented")
}
