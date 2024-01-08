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
	"reflect"
)

// PlaylistsAPIService is a service that implements the logic for the PlaylistsAPIServicer
// This service should implement the business logic for every endpoint for the PlaylistsAPI API.
// Include any external packages or services that will be required by this service.
type PlaylistsAPIService struct {
}

// NewPlaylistsAPIService creates a default api service
func NewPlaylistsAPIService() PlaylistsAPIServicer {
	return &PlaylistsAPIService{}
}

// AddToPlaylist - Adds items to a playlist.
func (s *PlaylistsAPIService) AddToPlaylist(ctx context.Context, playlistId string, ids *[]string, userId *string) (ImplResponse, error) {
	// TODO - update AddToPlaylist with the required logic for this service method.
	// Add api_playlists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddToPlaylist method not implemented")
}

// CreatePlaylist - Creates a new playlist.
func (s *PlaylistsAPIService) CreatePlaylist(ctx context.Context, name *string, ids *[]string, userId *string, mediaType *string, createPlaylistDto CreatePlaylistDto) (ImplResponse, error) {
	// TODO - update CreatePlaylist with the required logic for this service method.
	// Add api_playlists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PlaylistCreationResult{}) or use other options such as http.Ok ...
	// return Response(200, PlaylistCreationResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreatePlaylist method not implemented")
}

// GetPlaylistItems - Gets the original items of a playlist.
func (s *PlaylistsAPIService) GetPlaylistItems(ctx context.Context, playlistId string, userId string, startIndex *int32, limit *int32, fields *[]ItemFields, enableImages *bool, enableUserData *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType) (ImplResponse, error) {
	// TODO - update GetPlaylistItems with the required logic for this service method.
	// Add api_playlists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPlaylistItems method not implemented")
}

// MoveItem - Moves a playlist item.
func (s *PlaylistsAPIService) MoveItem(ctx context.Context, playlistId string, itemId string, newIndex int32) (ImplResponse, error) {
	// TODO - update MoveItem with the required logic for this service method.
	// Add api_playlists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("MoveItem method not implemented")
}

// RemoveFromPlaylist - Removes items from a playlist.
func (s *PlaylistsAPIService) RemoveFromPlaylist(ctx context.Context, playlistId string, entryIds *[]string) (ImplResponse, error) {
	// TODO - update RemoveFromPlaylist with the required logic for this service method.
	// Add api_playlists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveFromPlaylist method not implemented")
}