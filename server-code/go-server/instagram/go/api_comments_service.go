/*
 * Instagram API
 *
 * Description of Instagram RESTful API.  Current limitations:   * Instagram service does not support [cross origin headers](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS)   for security reasons, therefore it is not possible to use Swagger UI and make API calls directly from browser.   * Modification API requests (`POST`, `DELETE`) require additional security [scopes](https://instagram.com/developer/authorization/)   that are available for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/review/) and   started in [Sandbox Mode](http://instagram.com/developer/sandbox/).   * Consider the [Instagram limitations](https://instagram.com/developer/limits/) for API calls that depends on App Mode.  **Warning:** For Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/) API responses containing media objects no longer return the `data` field in `comments` and `likes` nodes.  Last update: 2015-11-28 
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// CommentsAPIService is a service that implements the logic for the CommentsAPIServicer
// This service should implement the business logic for every endpoint for the CommentsAPI API.
// Include any external packages or services that will be required by this service.
type CommentsAPIService struct {
}

// NewCommentsAPIService creates a default api service
func NewCommentsAPIService() CommentsAPIServicer {
	return &CommentsAPIService{}
}

// MediaMediaIdCommentsCommentIdDelete - Remove a comment.
func (s *CommentsAPIService) MediaMediaIdCommentsCommentIdDelete(ctx context.Context, mediaId string, commentId string) (ImplResponse, error) {
	// TODO - update MediaMediaIdCommentsCommentIdDelete with the required logic for this service method.
	// Add api_comments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, StatusResponse{}) or use other options such as http.Ok ...
	// return Response(200, StatusResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MediaMediaIdCommentsCommentIdDelete method not implemented")
}

// MediaMediaIdCommentsGet - Get a list of recent comments on a media object.
func (s *CommentsAPIService) MediaMediaIdCommentsGet(ctx context.Context, mediaId string) (ImplResponse, error) {
	// TODO - update MediaMediaIdCommentsGet with the required logic for this service method.
	// Add api_comments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CommentsResponse{}) or use other options such as http.Ok ...
	// return Response(200, CommentsResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MediaMediaIdCommentsGet method not implemented")
}

// MediaMediaIdCommentsPost - Create a comment on a media object.
func (s *CommentsAPIService) MediaMediaIdCommentsPost(ctx context.Context, mediaId string, text string) (ImplResponse, error) {
	// TODO - update MediaMediaIdCommentsPost with the required logic for this service method.
	// Add api_comments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, StatusResponse{}) or use other options such as http.Ok ...
	// return Response(200, StatusResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MediaMediaIdCommentsPost method not implemented")
}
