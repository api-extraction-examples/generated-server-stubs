/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Advanced box scores
* Get advanced box score data
*
* gameId Integer Game id parameters
* returns BoxScore
* */
const getAdvancedBoxScore = ({ gameId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Season calendar
* Get calendar of weeks by season
*
* year Integer Year filter
* returns List
* */
const getCalendar = ({ year }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Game media information and schedules
* Game media information (TV, radio, etc)
*
* year Integer Year filter
* week Integer Week filter (optional)
* seasonType String Season type filter (regular, postseason, or both) (optional)
* team String Team filter (optional)
* conference String Conference filter (optional)
* mediaType String Media type filter (tv, radio, web, ppv, or mobile) (optional)
* classification String Division classification filter (fbs/fcs/ii/iii) (optional)
* returns List
* */
const getGameMedia = ({ year, week, seasonType, team, conference, mediaType, classification }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        seasonType,
        team,
        conference,
        mediaType,
        classification,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Game weather information (Patreon only)
* Weather information for the hour of kickoff
*
* gameId Integer Game id filter (required if no year) (optional)
* year Integer Year filter (required if no game id) (optional)
* week Integer Week filter (optional)
* seasonType String Season type filter (regular, postseason, or both) (optional)
* team String Team filter (optional)
* conference String Conference filter (optional)
* classification String Division classification filter (fbs/fcs/ii/iii) (optional)
* returns List
* */
const getGameWeather = ({ gameId, year, week, seasonType, team, conference, classification }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameId,
        year,
        week,
        seasonType,
        team,
        conference,
        classification,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Games and results
* Get game results
*
* year Integer Year/season filter for games
* week Integer Week filter (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* team String Team (optional)
* home String Home team filter (optional)
* away String Away team filter (optional)
* conference String Conference abbreviation filter (optional)
* division String Division classification filter (fbs/fcs/ii/iii) (optional)
* id Integer id filter for querying a single game (optional)
* returns List
* */
const getGames = ({ year, week, seasonType, team, home, away, conference, division, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        seasonType,
        team,
        home,
        away,
        conference,
        division,
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Player game stats
* Player stats broken down by game
*
* year Integer Year/season filter for games
* week Integer Week filter (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* team String Team filter (optional)
* conference String Conference abbreviation filter (optional)
* category String Category filter (e.g defensive) (optional)
* gameId Integer Game id filter (optional)
* returns List
* */
const getPlayerGameStats = ({ year, week, seasonType, team, conference, category, gameId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        seasonType,
        team,
        conference,
        category,
        gameId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Live game results (Patreon only)
* Get live game results
*
* classification String Classification filter (fbs, fcs, ii, or iii). Defaults to fbs. (optional)
* conference String Conference abbreviation filter. (optional)
* returns List
* */
const getScoreboard = ({ classification, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        classification,
        conference,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Team game stats
* Team stats broken down by game
*
* year Integer Year/season filter for games
* week Integer Week filter (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* team String Team filter (optional)
* conference String Conference abbreviation filter (optional)
* gameId Integer Game id filter (optional)
* classification String Division classification filter (fbs/fcs/ii/iii) (optional)
* returns List
* */
const getTeamGameStats = ({ year, week, seasonType, team, conference, gameId, classification }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        seasonType,
        team,
        conference,
        gameId,
        classification,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Team records
* Get team records by year
*
* year Integer Year filter (optional)
* team String Team filter (optional)
* conference String Conference filter (optional)
* returns List
* */
const getTeamRecords = ({ year, team, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        conference,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getAdvancedBoxScore,
  getCalendar,
  getGameMedia,
  getGameWeather,
  getGames,
  getPlayerGameStats,
  getScoreboard,
  getTeamGameStats,
  getTeamRecords,
};
