/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type PostAspspsOkBodyAspspsItems struct {

	// Provided services, AIS - account information, PIS - payment initiation
	AspspServices []string `json:"aspspServices,omitempty"`

	// Capabilities related to api profile assigned to ASPSP
	Capabilities map[string]bool `json:"capabilities,omitempty"`

	// Country code
	Country string `json:"country,omitempty"`

	// Identification of the ASPSP
	Id string `json:"id,omitempty"`

	Logo LogoObject `json:"logo,omitempty"`

	// Name of the ASPSP
	Name string `json:"name,omitempty"`

	// ASPSP profile
	Profile string `json:"profile,omitempty"`
}

// AssertPostAspspsOkBodyAspspsItemsRequired checks if the required fields are not zero-ed
func AssertPostAspspsOkBodyAspspsItemsRequired(obj PostAspspsOkBodyAspspsItems) error {
	if err := AssertLogoObjectRequired(obj.Logo); err != nil {
		return err
	}
	return nil
}

// AssertPostAspspsOkBodyAspspsItemsConstraints checks if the values respects the defined constraints
func AssertPostAspspsOkBodyAspspsItemsConstraints(obj PostAspspsOkBodyAspspsItems) error {
	return nil
}
