/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Historical SP+ ratings by conference
* Get average SP+ historical rating data by conference
*
* year Integer Season filter (optional)
* conference String Conference abbreviation filter (optional)
* returns List
* */
const getConferenceSPRatings = ({ year, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
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
* Historical Elo ratings
* Elo rating data
*
* year Integer Season filter (optional)
* week Integer Maximum week filter (optional)
* team String Team filter (optional)
* conference String Conference filter (optional)
* returns List
* */
const getEloRatings = ({ year, week, team, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
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
* Historical SP+ ratings
* SP+ rating data
*
* year Integer Season filter (required if team not specified) (optional)
* team String Team filter (required if year not specified) (optional)
* returns List
* */
const getSPRatings = ({ year, team }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
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
* Historical SRS ratings
* SRS rating data (requires either a year or team specified)
*
* year Integer Season filter (required if team not specified) (optional)
* team String Team filter (required if year not specified) (optional)
* conference String Conference filter (optional)
* returns List
* */
const getSRSRatings = ({ year, team, conference }) => new Promise(
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
  getConferenceSPRatings,
  getEloRatings,
  getSPRatings,
  getSRSRatings,
};
