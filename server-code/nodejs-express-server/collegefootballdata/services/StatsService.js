/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Advanced team metrics by game
* Advanced team game stats
*
* year Integer Year filter (required if no team specified) (optional)
* week Integer Week filter (optional)
* team String Team filter (required if no year specified) (optional)
* opponent String Opponent filter (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* seasonType String Season type filter (regular, postseason, or both) (optional)
* returns List
* */
const getAdvancedTeamGameStats = ({ year, week, team, opponent, excludeGarbageTime, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        team,
        opponent,
        excludeGarbageTime,
        seasonType,
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
* Advanced team metrics by season
* Advanced team season stats
*
* year Integer Year filter (required if no team specified) (optional)
* team String Team filter (required if no year specified) (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* startWeek Integer Starting week filter (optional)
* endWeek Integer Starting week filter (optional)
* returns List
* */
const getAdvancedTeamSeasonStats = ({ year, team, excludeGarbageTime, startWeek, endWeek }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        excludeGarbageTime,
        startWeek,
        endWeek,
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
* Team stat categories
* Stat category list
*
* returns List
* */
const getStatCategories = () => new Promise(
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
* Team statistics by season
* Team season stats
*
* year Integer Year filter (required if no team specified) (optional)
* team String Team filter (required if no year specified) (optional)
* conference String Conference abbreviation filter (optional)
* startWeek Integer Starting week filter (optional)
* endWeek Integer Starting week filter (optional)
* returns List
* */
const getTeamSeasonStats = ({ year, team, conference, startWeek, endWeek }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        conference,
        startWeek,
        endWeek,
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
  getAdvancedTeamGameStats,
  getAdvancedTeamSeasonStats,
  getStatCategories,
  getTeamSeasonStats,
};
