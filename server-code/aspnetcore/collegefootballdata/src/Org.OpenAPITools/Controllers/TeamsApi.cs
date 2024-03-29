/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * The version of the OpenAPI document: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class TeamsApiController : ControllerBase
    { 
        /// <summary>
        /// FBS team list
        /// </summary>
        /// <remarks>Information on major division teams</remarks>
        /// <param name="year">Year filter</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">error</response>
        [HttpGet]
        [Route("/teams/fbs")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("GetFbsTeams")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Team>), description: "successful operation")]
        public virtual IActionResult GetFbsTeams([FromQuery (Name = "year")]int? year)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Team>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"conference\" : \"conference\",\n  \"color\" : \"color\",\n  \"mascot\" : \"mascot\",\n  \"abbreviation\" : \"abbreviation\",\n  \"classification\" : \"classification\",\n  \"logos\" : [ \"logos\", \"logos\" ],\n  \"alt_color\" : \"alt_color\",\n  \"division\" : \"division\",\n  \"twitter\" : \"twitter\",\n  \"school\" : \"school\",\n  \"alt_name_1\" : \"alt_name_1\",\n  \"location\" : {\n    \"elevation\" : 1.4658129805029452,\n    \"zip\" : \"zip\",\n    \"city\" : \"city\",\n    \"timezone\" : \"timezone\",\n    \"latitude\" : 5.962133916683182,\n    \"dome\" : true,\n    \"capacity\" : 6.027456183070403,\n    \"year_constructed\" : 7.061401241503109,\n    \"country_code\" : \"country_code\",\n    \"grass\" : true,\n    \"name\" : \"name\",\n    \"state\" : \"state\",\n    \"venue_id\" : 2,\n    \"longitude\" : 5.637376656633329\n  },\n  \"id\" : 0,\n  \"alt_name_2\" : \"alt_name_2\",\n  \"alt_name_3\" : \"alt_name_3\"\n}, {\n  \"conference\" : \"conference\",\n  \"color\" : \"color\",\n  \"mascot\" : \"mascot\",\n  \"abbreviation\" : \"abbreviation\",\n  \"classification\" : \"classification\",\n  \"logos\" : [ \"logos\", \"logos\" ],\n  \"alt_color\" : \"alt_color\",\n  \"division\" : \"division\",\n  \"twitter\" : \"twitter\",\n  \"school\" : \"school\",\n  \"alt_name_1\" : \"alt_name_1\",\n  \"location\" : {\n    \"elevation\" : 1.4658129805029452,\n    \"zip\" : \"zip\",\n    \"city\" : \"city\",\n    \"timezone\" : \"timezone\",\n    \"latitude\" : 5.962133916683182,\n    \"dome\" : true,\n    \"capacity\" : 6.027456183070403,\n    \"year_constructed\" : 7.061401241503109,\n    \"country_code\" : \"country_code\",\n    \"grass\" : true,\n    \"name\" : \"name\",\n    \"state\" : \"state\",\n    \"venue_id\" : 2,\n    \"longitude\" : 5.637376656633329\n  },\n  \"id\" : 0,\n  \"alt_name_2\" : \"alt_name_2\",\n  \"alt_name_3\" : \"alt_name_3\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Team>>(exampleJson)
            : default(List<Team>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Team rosters
        /// </summary>
        /// <remarks>Roster data</remarks>
        /// <param name="team">Team name</param>
        /// <param name="year">Season year</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">error</response>
        [HttpGet]
        [Route("/roster")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("GetRoster")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Player>), description: "successful operation")]
        public virtual IActionResult GetRoster([FromQuery (Name = "team")]string team, [FromQuery (Name = "year")]int? year)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Player>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"home_county_fips\" : \"home_county_fips\",\n  \"year\" : 9,\n  \"home_latitude\" : 6.027456183070403,\n  \"last_name\" : \"last_name\",\n  \"weight\" : 7,\n  \"team\" : \"team\",\n  \"home_state\" : \"home_state\",\n  \"home_city\" : \"home_city\",\n  \"recruit_ids\" : [ 2, 2 ],\n  \"home_country\" : \"home_country\",\n  \"jersey\" : 5,\n  \"home_longitude\" : 1.4658129805029452,\n  \"id\" : 5,\n  \"position\" : \"position\",\n  \"first_name\" : \"first_name\",\n  \"height\" : 0\n}, {\n  \"home_county_fips\" : \"home_county_fips\",\n  \"year\" : 9,\n  \"home_latitude\" : 6.027456183070403,\n  \"last_name\" : \"last_name\",\n  \"weight\" : 7,\n  \"team\" : \"team\",\n  \"home_state\" : \"home_state\",\n  \"home_city\" : \"home_city\",\n  \"recruit_ids\" : [ 2, 2 ],\n  \"home_country\" : \"home_country\",\n  \"jersey\" : 5,\n  \"home_longitude\" : 1.4658129805029452,\n  \"id\" : 5,\n  \"position\" : \"position\",\n  \"first_name\" : \"first_name\",\n  \"height\" : 0\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Player>>(exampleJson)
            : default(List<Player>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Team talent composite rankings
        /// </summary>
        /// <remarks>Team talent composite</remarks>
        /// <param name="year">Year filter</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">error</response>
        [HttpGet]
        [Route("/talent")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("GetTalent")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<TeamTalent>), description: "successful operation")]
        public virtual IActionResult GetTalent([FromQuery (Name = "year")]int? year)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<TeamTalent>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"school\" : \"school\",\n  \"year\" : 6,\n  \"talent\" : 0.8008281904610115\n}, {\n  \"school\" : \"school\",\n  \"year\" : 6,\n  \"talent\" : 0.8008281904610115\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<TeamTalent>>(exampleJson)
            : default(List<TeamTalent>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Team matchup history
        /// </summary>
        /// <remarks>Matchup history</remarks>
        /// <param name="team1">First team</param>
        /// <param name="team2">Second team</param>
        /// <param name="minYear">Minimum year</param>
        /// <param name="maxYear">Maximum year</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">error</response>
        [HttpGet]
        [Route("/teams/matchup")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("GetTeamMatchup")]
        [SwaggerResponse(statusCode: 200, type: typeof(TeamMatchup), description: "successful operation")]
        public virtual IActionResult GetTeamMatchup([FromQuery (Name = "team1")][Required()]string team1, [FromQuery (Name = "team2")][Required()]string team2, [FromQuery (Name = "minYear")]int? minYear, [FromQuery (Name = "maxYear")]int? maxYear)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TeamMatchup));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "{\n  \"team2Wins\" : 9,\n  \"ties\" : 3,\n  \"team1\" : \"team1\",\n  \"team2\" : \"team2\",\n  \"games\" : [ {\n    \"date\" : \"date\",\n    \"venue\" : \"venue\",\n    \"homeScore\" : 1,\n    \"season_type\" : \"season_type\",\n    \"week\" : 5,\n    \"winner\" : \"winner\",\n    \"awayScore\" : 6,\n    \"awayTeam\" : \"awayTeam\",\n    \"homeTeam\" : \"homeTeam\",\n    \"season\" : 5,\n    \"neutralSite\" : true\n  }, {\n    \"date\" : \"date\",\n    \"venue\" : \"venue\",\n    \"homeScore\" : 1,\n    \"season_type\" : \"season_type\",\n    \"week\" : 5,\n    \"winner\" : \"winner\",\n    \"awayScore\" : 6,\n    \"awayTeam\" : \"awayTeam\",\n    \"homeTeam\" : \"homeTeam\",\n    \"season\" : 5,\n    \"neutralSite\" : true\n  } ],\n  \"startYear\" : 2,\n  \"team1Wins\" : 7,\n  \"endYear\" : 0\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TeamMatchup>(exampleJson)
            : default(TeamMatchup);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Team information
        /// </summary>
        /// <remarks>Get team information</remarks>
        /// <param name="conference">Conference abbreviation filter</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">error</response>
        [HttpGet]
        [Route("/teams")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("GetTeams")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Team>), description: "successful operation")]
        public virtual IActionResult GetTeams([FromQuery (Name = "conference")]string conference)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Team>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"conference\" : \"conference\",\n  \"color\" : \"color\",\n  \"mascot\" : \"mascot\",\n  \"abbreviation\" : \"abbreviation\",\n  \"classification\" : \"classification\",\n  \"logos\" : [ \"logos\", \"logos\" ],\n  \"alt_color\" : \"alt_color\",\n  \"division\" : \"division\",\n  \"twitter\" : \"twitter\",\n  \"school\" : \"school\",\n  \"alt_name_1\" : \"alt_name_1\",\n  \"location\" : {\n    \"elevation\" : 1.4658129805029452,\n    \"zip\" : \"zip\",\n    \"city\" : \"city\",\n    \"timezone\" : \"timezone\",\n    \"latitude\" : 5.962133916683182,\n    \"dome\" : true,\n    \"capacity\" : 6.027456183070403,\n    \"year_constructed\" : 7.061401241503109,\n    \"country_code\" : \"country_code\",\n    \"grass\" : true,\n    \"name\" : \"name\",\n    \"state\" : \"state\",\n    \"venue_id\" : 2,\n    \"longitude\" : 5.637376656633329\n  },\n  \"id\" : 0,\n  \"alt_name_2\" : \"alt_name_2\",\n  \"alt_name_3\" : \"alt_name_3\"\n}, {\n  \"conference\" : \"conference\",\n  \"color\" : \"color\",\n  \"mascot\" : \"mascot\",\n  \"abbreviation\" : \"abbreviation\",\n  \"classification\" : \"classification\",\n  \"logos\" : [ \"logos\", \"logos\" ],\n  \"alt_color\" : \"alt_color\",\n  \"division\" : \"division\",\n  \"twitter\" : \"twitter\",\n  \"school\" : \"school\",\n  \"alt_name_1\" : \"alt_name_1\",\n  \"location\" : {\n    \"elevation\" : 1.4658129805029452,\n    \"zip\" : \"zip\",\n    \"city\" : \"city\",\n    \"timezone\" : \"timezone\",\n    \"latitude\" : 5.962133916683182,\n    \"dome\" : true,\n    \"capacity\" : 6.027456183070403,\n    \"year_constructed\" : 7.061401241503109,\n    \"country_code\" : \"country_code\",\n    \"grass\" : true,\n    \"name\" : \"name\",\n    \"state\" : \"state\",\n    \"venue_id\" : 2,\n    \"longitude\" : 5.637376656633329\n  },\n  \"id\" : 0,\n  \"alt_name_2\" : \"alt_name_2\",\n  \"alt_name_3\" : \"alt_name_3\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Team>>(exampleJson)
            : default(List<Team>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
