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

import (
	"time"
)

// RideDetail - Detail information about a ride
type RideDetail struct {

	// Hex color code of the driver AMP device.
	BeaconColor string `json:"beacon_color,omitempty"`

	CanCancel []string `json:"can_cancel,omitempty"`

	// The role of user who canceled the ride (if applicable)
	CanceledBy string `json:"canceled_by,omitempty"`

	CancellationPrice CancellationCost `json:"cancellation_price,omitempty"`

	Destination RideLocation `json:"destination,omitempty"`

	// The distance, in miles, that this ride traveled. This field is only present after drop-off
	DistanceMiles float32 `json:"distance_miles,omitempty"`

	Driver DriverDetail `json:"driver,omitempty"`

	Dropoff PickupDropoffLocation `json:"dropoff,omitempty"`

	// Duration of the ride in seconds from pickup to drop-off. This field is only present after drop-off.
	DurationSeconds int32 `json:"duration_seconds,omitempty"`

	// The written feedback the user left for this ride
	Feedback string `json:"feedback,omitempty"`

	// The request timestamp in date and time
	GeneratedAt time.Time `json:"generated_at,omitempty"`

	// The break down of cost
	LineItems []LineItem `json:"line_items,omitempty"`

	Location CurrentRideLocation `json:"location,omitempty"`

	Origin RideLocation `json:"origin,omitempty"`

	Passenger PassengerDetail `json:"passenger,omitempty"`

	Pickup PickupDropoffLocation `json:"pickup,omitempty"`

	Price Cost `json:"price,omitempty"`

	// The web view showing the pricing structure for the geographic area where the ride was taken 
	PricingDetailsUrl string `json:"pricing_details_url,omitempty"`

	// The Prime Time percentage applied to the base price
	PrimetimePercentage string `json:"primetime_percentage,omitempty"`

	// The rating the user left for this ride, from 1 to 5
	Rating int32 `json:"rating,omitempty"`

	// The ride requested timestamp in date and time
	RequestedAt time.Time `json:"requested_at,omitempty"`

	// The unique ID of this ride
	RideId string `json:"ride_id,omitempty"`

	RideProfile RideProfileEnum `json:"ride_profile,omitempty"`

	RideType RideTypeEnumWithOther `json:"ride_type,omitempty"`

	// The web view showing the passenger, driver, and route for this ride. This field will only be present for rides created through this API, or that have been shared through the \"Share my Route\" feature 
	RouteUrl string `json:"route_url,omitempty"`

	Status RideStatusEnum `json:"status,omitempty"`

	Vehicle VehicleDetail `json:"vehicle,omitempty"`
}