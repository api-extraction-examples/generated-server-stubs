/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AppStoreReviewDetailResponse struct {

	Data AppStoreReviewDetail `json:"data"`

	Included []AppStoreReviewAttachment `json:"included,omitempty"`

	Links DocumentLinks `json:"links"`
}
