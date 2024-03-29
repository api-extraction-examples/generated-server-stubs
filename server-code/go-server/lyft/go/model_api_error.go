/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// ApiError - Details about why a request failed, such as missing or invalid parameters
type ApiError struct {

	// A \"slug\" that serves as the error code (eg. \"bad_parameter\")
	Error string `json:"error,omitempty"`

	// A user-friendly description of the error (appropriate to show to an end-user)
	ErrorDescription string `json:"error_description,omitempty"`

	ErrorDetail []ErrorDetail `json:"error_detail,omitempty"`
}

// AssertApiErrorRequired checks if the required fields are not zero-ed
func AssertApiErrorRequired(obj ApiError) error {
	for _, el := range obj.ErrorDetail {
		if err := AssertErrorDetailRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertApiErrorConstraints checks if the values respects the defined constraints
func AssertApiErrorConstraints(obj ApiError) error {
	return nil
}
