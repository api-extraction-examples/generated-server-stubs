/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Live metrics and PBP (Patreon only)
* Get live metrics and PBP
*
* id Integer Game id
* returns LivePlayByPlay
* */
const getLivePlays = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Types of player play stats
* Type of play stats
*
* returns List
* */
const getPlayStatTypes = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Play stats by play
* Gets player stats associated by play (limit 1000)
*
* year Integer Year filter (optional)
* week Integer Week filter (optional)
* team String Team filter (optional)
* gameId Integer gameId filter (from /games endpoint) (optional)
* athleteId Integer athleteId filter (from /roster endpoint) (optional)
* statTypeId Integer statTypeId filter (from /play/stat/types endpoint) (optional)
* seasonType String regular, postseason, or both (optional)
* conference String conference abbreviation filter (optional)
* returns List
* */
const getPlayStats = ({ year, week, team, gameId, athleteId, statTypeId, seasonType, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        team,
        gameId,
        athleteId,
        statTypeId,
        seasonType,
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
* Play types
* Types of plays
*
* returns List
* */
const getPlayTypes = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Play by play data
* Get play data and results
*
* year Integer Year filter
* week Integer Week filter (required if team, offense, or defense, not specified)
* seasonType String Season type filter (optional)
* team String Team filter (optional)
* offense String Offensive team filter (optional)
* defense String Defensive team filter (optional)
* conference String Conference filter (optional)
* offenseConference String Offensive conference filter (optional)
* defenseConference String Defensive conference filter (optional)
* playType Integer Play type filter (optional)
* classification String Division classification filter (fbs/fcs/ii/iii) (optional)
* returns List
* */
const getPlays = ({ year, week, seasonType, team, offense, defense, conference, offenseConference, defenseConference, playType, classification }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        seasonType,
        team,
        offense,
        defense,
        conference,
        offenseConference,
        defenseConference,
        playType,
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

module.exports = {
  getLivePlays,
  getPlayStatTypes,
  getPlayStats,
  getPlayTypes,
  getPlays,
};
