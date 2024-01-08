/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type RadioError struct {

	Code string `json:"code"`

	Detail string `json:"detail"`

	Href string `json:"href"`

	Id string `json:"id"`

	Status int32 `json:"status"`

	Timestamp int32 `json:"timestamp"`

	Title string `json:"title"`
}

// AssertRadioErrorRequired checks if the required fields are not zero-ed
func AssertRadioErrorRequired(obj RadioError) error {
	elements := map[string]interface{}{
		"code": obj.Code,
		"detail": obj.Detail,
		"href": obj.Href,
		"id": obj.Id,
		"status": obj.Status,
		"timestamp": obj.Timestamp,
		"title": obj.Title,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRadioErrorConstraints checks if the values respects the defined constraints
func AssertRadioErrorConstraints(obj RadioError) error {
	return nil
}