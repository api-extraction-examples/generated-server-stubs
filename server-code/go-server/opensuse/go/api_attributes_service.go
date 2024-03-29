/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// AttributesAPIService is a service that implements the logic for the AttributesAPIServicer
// This service should implement the business logic for every endpoint for the AttributesAPI API.
// Include any external packages or services that will be required by this service.
type AttributesAPIService struct {
}

// NewAttributesAPIService creates a default api service
func NewAttributesAPIService() AttributesAPIServicer {
	return &AttributesAPIService{}
}

// AttributeNamespaceAttributeNameDelete - Delete an attribute and all its values in projects or packages.
func (s *AttributesAPIService) AttributeNamespaceAttributeNameDelete(ctx context.Context, attributeName string) (ImplResponse, error) {
	// TODO - update AttributeNamespaceAttributeNameDelete with the required logic for this service method.
	// Add api_attributes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AttributeNamespaceAttributeNameDelete method not implemented")
}

// AttributeNamespaceAttributeNameMetaDelete - Delete an attribute and all its values in projects or packages.
func (s *AttributesAPIService) AttributeNamespaceAttributeNameMetaDelete(ctx context.Context) (ImplResponse, error) {
	// TODO - update AttributeNamespaceAttributeNameMetaDelete with the required logic for this service method.
	// Add api_attributes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AttributeNamespaceAttributeNameMetaDelete method not implemented")
}

// AttributeNamespaceAttributeNameMetaGet - Shows attribute.
func (s *AttributesAPIService) AttributeNamespaceAttributeNameMetaGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update AttributeNamespaceAttributeNameMetaGet with the required logic for this service method.
	// Add api_attributes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AttributeNamespaceAttributeNameMetaGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, AttributeNamespaceAttributeNameMetaGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AttributeNamespaceAttributeNameMetaGet method not implemented")
}

// AttributeNamespaceAttributeNameMetaPost - Change attribute data. Create an attribute if it doesn&#39;t exist.
func (s *AttributesAPIService) AttributeNamespaceAttributeNameMetaPost(ctx context.Context, body Object) (ImplResponse, error) {
	// TODO - update AttributeNamespaceAttributeNameMetaPost with the required logic for this service method.
	// Add api_attributes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AttributeNamespaceAttributeNameMetaPost method not implemented")
}

// AttributeNamespaceAttributeNameMetaPut - Change attribute data. Create an attribute if it doesn&#39;t exist.
func (s *AttributesAPIService) AttributeNamespaceAttributeNameMetaPut(ctx context.Context, body Object) (ImplResponse, error) {
	// TODO - update AttributeNamespaceAttributeNameMetaPut with the required logic for this service method.
	// Add api_attributes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AttributeNamespaceAttributeNameMetaPut method not implemented")
}
