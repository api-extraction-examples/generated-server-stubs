/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type TaskRemoveFollowersRequest struct {

	// An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
	Followers []string `json:"followers"`
}
