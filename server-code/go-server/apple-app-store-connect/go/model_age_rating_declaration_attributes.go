/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AgeRatingDeclarationAttributes struct {

	AlcoholTobaccoOrDrugUseOrReferences string `json:"alcoholTobaccoOrDrugUseOrReferences,omitempty"`

	Contests string `json:"contests,omitempty"`

	Gambling bool `json:"gambling,omitempty"`

	// Deprecated
	GamblingAndContests bool `json:"gamblingAndContests,omitempty"`

	GamblingSimulated string `json:"gamblingSimulated,omitempty"`

	HorrorOrFearThemes string `json:"horrorOrFearThemes,omitempty"`

	KidsAgeBand KidsAgeBand `json:"kidsAgeBand,omitempty"`

	MatureOrSuggestiveThemes string `json:"matureOrSuggestiveThemes,omitempty"`

	MedicalOrTreatmentInformation string `json:"medicalOrTreatmentInformation,omitempty"`

	ProfanityOrCrudeHumor string `json:"profanityOrCrudeHumor,omitempty"`

	SeventeenPlus bool `json:"seventeenPlus,omitempty"`

	SexualContentGraphicAndNudity string `json:"sexualContentGraphicAndNudity,omitempty"`

	SexualContentOrNudity string `json:"sexualContentOrNudity,omitempty"`

	UnrestrictedWebAccess bool `json:"unrestrictedWebAccess,omitempty"`

	ViolenceCartoonOrFantasy string `json:"violenceCartoonOrFantasy,omitempty"`

	ViolenceRealistic string `json:"violenceRealistic,omitempty"`

	ViolenceRealisticProlongedGraphicOrSadistic string `json:"violenceRealisticProlongedGraphicOrSadistic,omitempty"`
}

// AssertAgeRatingDeclarationAttributesRequired checks if the required fields are not zero-ed
func AssertAgeRatingDeclarationAttributesRequired(obj AgeRatingDeclarationAttributes) error {
	return nil
}

// AssertAgeRatingDeclarationAttributesConstraints checks if the values respects the defined constraints
func AssertAgeRatingDeclarationAttributesConstraints(obj AgeRatingDeclarationAttributes) error {
	return nil
}
