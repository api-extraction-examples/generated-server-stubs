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
	"time"
)



// ApiRequest - Represents a request that was made to the API. Including what Token was used and what resource was accessed.
type ApiRequest struct {

	Action string `json:"action,omitempty"`

	Actor ApiRequestActor `json:"actor,omitempty"`

	// The unique id used to identify a single request.
	RequestId string `json:"requestId,omitempty"`

	Resource ApiRequestResource `json:"resource,omitempty"`

	Result string `json:"result,omitempty"`

	// The time at which the request was processed by the server.
	Timestamp time.Time `json:"timestamp,omitempty"`
}

// AssertApiRequestRequired checks if the required fields are not zero-ed
func AssertApiRequestRequired(obj ApiRequest) error {
	if err := AssertApiRequestActorRequired(obj.Actor); err != nil {
		return err
	}
	if err := AssertApiRequestResourceRequired(obj.Resource); err != nil {
		return err
	}
	return nil
}

// AssertApiRequestConstraints checks if the values respects the defined constraints
func AssertApiRequestConstraints(obj ApiRequest) error {
	return nil
}
