/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CopyActions string

// List of CopyActions
const (
	UPDATE_ON CopyActions = "updateOn"
	UPDATE_PREREQUISITES CopyActions = "updatePrerequisites"
	UPDATE_TARGETS CopyActions = "updateTargets"
	UPDATE_RULES CopyActions = "updateRules"
	UPDATE_FALLTHROUGH CopyActions = "updateFallthrough"
	UPDATE_OFF_VARIATION CopyActions = "updateOffVariation"
)