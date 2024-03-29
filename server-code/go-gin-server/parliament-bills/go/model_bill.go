/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"time"
)

type Bill struct {

	Agent BillAgent `json:"agent,omitempty"`

	BillId int32 `json:"billId,omitempty"`

	BillTypeId int32 `json:"billTypeId,omitempty"`

	BillWithdrawn *time.Time `json:"billWithdrawn,omitempty"`

	CurrentHouse House `json:"currentHouse,omitempty"`

	CurrentStage StageSummary `json:"currentStage,omitempty"`

	IncludedSessionIds *[]int32 `json:"includedSessionIds,omitempty"`

	IntroducedSessionId int32 `json:"introducedSessionId,omitempty"`

	IsAct bool `json:"isAct,omitempty"`

	IsDefeated bool `json:"isDefeated,omitempty"`

	LastUpdate time.Time `json:"lastUpdate,omitempty"`

	LongTitle *string `json:"longTitle,omitempty"`

	OriginatingHouse House `json:"originatingHouse,omitempty"`

	PetitionInformation *string `json:"petitionInformation,omitempty"`

	PetitioningPeriod *string `json:"petitioningPeriod,omitempty"`

	Promoters *[]Promoter `json:"promoters,omitempty"`

	ShortTitle *string `json:"shortTitle,omitempty"`

	Sponsors *[]Sponsor `json:"sponsors,omitempty"`

	Summary *string `json:"summary,omitempty"`
}
