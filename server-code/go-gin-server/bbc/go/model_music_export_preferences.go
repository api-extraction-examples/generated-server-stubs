/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type MusicExportPreferences struct {

	AccessExpiresAt string `json:"access_expires_at"`

	AccessToken string `json:"access_token"`

	AddPlusExport bool `json:"add_plus_export"`

	AuthorizationCode string `json:"authorization_code"`

	LastExport string `json:"last_export"`

	LegacyState string `json:"legacy_state"`

	PartnerId string `json:"partner_id"`

	RefreshToken string `json:"refresh_token"`

	Terms bool `json:"terms"`

	Vendor string `json:"vendor"`
}
