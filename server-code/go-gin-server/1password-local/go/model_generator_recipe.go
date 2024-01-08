/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// GeneratorRecipe - The recipe is used in conjunction with the \"generate\" property to set the character set used to generate a new secure value
type GeneratorRecipe struct {

	CharacterSets []string `json:"characterSets,omitempty"`

	// List of all characters that should be excluded from generated passwords.
	ExcludeCharacters string `json:"excludeCharacters,omitempty"`

	// Length of the generated value
	Length int32 `json:"length,omitempty"`
}
