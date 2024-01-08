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




type CancellationRequest struct {

	// Token affirming the user accepts the cancellation fee. Required if a cancellation fee is in effect.
	CancelConfirmationToken string `json:"cancel_confirmation_token,omitempty"`
}

// AssertCancellationRequestRequired checks if the required fields are not zero-ed
func AssertCancellationRequestRequired(obj CancellationRequest) error {
	return nil
}

// AssertCancellationRequestConstraints checks if the values respects the defined constraints
func AssertCancellationRequestConstraints(obj CancellationRequest) error {
	return nil
}
