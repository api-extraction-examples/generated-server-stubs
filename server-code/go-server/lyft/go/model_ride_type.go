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




type RideType struct {

	// A human readable description of the ride type
	DisplayName string `json:"display_name,omitempty"`

	// The URL of an image representing this ride type
	ImageUrl string `json:"image_url,omitempty"`

	PricingDetails PricingDetails `json:"pricing_details,omitempty"`

	RideType RideTypeEnum `json:"ride_type,omitempty"`

	ScheduledPricingDetails PricingDetails `json:"scheduled_pricing_details,omitempty"`

	// The maximum number of seats available for rides requested with this ride type
	Seats int32 `json:"seats,omitempty"`
}

// AssertRideTypeRequired checks if the required fields are not zero-ed
func AssertRideTypeRequired(obj RideType) error {
	if err := AssertPricingDetailsRequired(obj.PricingDetails); err != nil {
		return err
	}
	if err := AssertPricingDetailsRequired(obj.ScheduledPricingDetails); err != nil {
		return err
	}
	return nil
}

// AssertRideTypeConstraints checks if the values respects the defined constraints
func AssertRideTypeConstraints(obj RideType) error {
	return nil
}