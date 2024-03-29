/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * API version: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AdvancedGameStat struct {

	Defense AdvancedGameStatDefense `json:"defense,omitempty"`

	GameId int32 `json:"gameId,omitempty"`

	Offense AdvancedGameStatDefense `json:"offense,omitempty"`

	Opponent string `json:"opponent,omitempty"`

	Season int32 `json:"season,omitempty"`

	Team string `json:"team,omitempty"`

	Week int32 `json:"week,omitempty"`
}

// AssertAdvancedGameStatRequired checks if the required fields are not zero-ed
func AssertAdvancedGameStatRequired(obj AdvancedGameStat) error {
	if err := AssertAdvancedGameStatDefenseRequired(obj.Defense); err != nil {
		return err
	}
	if err := AssertAdvancedGameStatDefenseRequired(obj.Offense); err != nil {
		return err
	}
	return nil
}

// AssertAdvancedGameStatConstraints checks if the values respects the defined constraints
func AssertAdvancedGameStatConstraints(obj AdvancedGameStat) error {
	return nil
}
