/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Player stats by season
* Season player stats
*
* year Integer Year filter
* team String Team filter (optional)
* conference String Conference abbreviation filter (optional)
* startWeek Integer Start week filter (optional)
* endWeek Integer Start week filter (optional)
* seasonType String Season type filter (regular, postseason, or both) (optional)
* category String Stat category filter (e.g. passing) (optional)
* returns List
* */
const getPlayerSeasonStats = ({ year, team, conference, startWeek, endWeek, seasonType, category }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        conference,
        startWeek,
        endWeek,
        seasonType,
        category,
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
* Player usage metrics broken down by season
* Player usage metrics by season
*
* year Integer Year filter
* team String Team filter (optional)
* conference String Conference abbreviation filter (optional)
* position String Position abbreviation filter (optional)
* playerId Integer Player id filter (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* returns List
* */
const getPlayerUsage = ({ year, team, conference, position, playerId, excludeGarbageTime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        conference,
        position,
        playerId,
        excludeGarbageTime,
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
* Team returning production metrics
* Returning production metrics
*
* year Integer Year filter (optional)
* team String Team filter (optional)
* conference String Conference abbreviation filter (optional)
* returns List
* */
const getReturningProduction = ({ year, team, conference }) => new Promise(
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
/**
* Transfer portal by season
* Transfer portal by season
*
* year Integer Year filter
* returns List
* */
const getTransferPortal = ({ year }) => new Promise(
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
* Search for player information
* Search for players
*
* searchTerm String Term to search on
* position String Position abbreviation filter (optional)
* team String Team filter (optional)
* year Integer Year filter (optional)
* returns List
* */
const playerSearch = ({ searchTerm, position, team, year }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        searchTerm,
        position,
        team,
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

module.exports = {
  getPlayerSeasonStats,
  getPlayerUsage,
  getReturningProduction,
  getTransferPortal,
  playerSearch,
};
