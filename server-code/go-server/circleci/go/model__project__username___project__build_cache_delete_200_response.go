/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ProjectUsernameProjectBuildCacheDelete200Response struct {

	Status string `json:"status,omitempty"`
}

// AssertProjectUsernameProjectBuildCacheDelete200ResponseRequired checks if the required fields are not zero-ed
func AssertProjectUsernameProjectBuildCacheDelete200ResponseRequired(obj ProjectUsernameProjectBuildCacheDelete200Response) error {
	return nil
}

// AssertProjectUsernameProjectBuildCacheDelete200ResponseConstraints checks if the values respects the defined constraints
func AssertProjectUsernameProjectBuildCacheDelete200ResponseConstraints(obj ProjectUsernameProjectBuildCacheDelete200Response) error {
	return nil
}