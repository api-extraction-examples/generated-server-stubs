/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* FBS team list
* Information on major division teams
*
* year Integer Year filter (optional)
* returns List
* */
const getFbsTeams = ({ year }) => new Promise(
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
* Team rosters
* Roster data
*
* team String Team name (optional)
* year Integer Season year (optional)
* returns List
* */
const getRoster = ({ team, year }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
/**
* Team talent composite rankings
* Team talent composite
*
* year Integer Year filter (optional)
* returns List
* */
const getTalent = ({ year }) => new Promise(
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
* Team matchup history
* Matchup history
*
* team1 String First team
* team2 String Second team
* minYear Integer Minimum year (optional)
* maxYear Integer Maximum year (optional)
* returns TeamMatchup
* */
const getTeamMatchup = ({ team1, team2, minYear, maxYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        team1,
        team2,
        minYear,
        maxYear,
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
* Team information
* Get team information
*
* conference String Conference abbreviation filter (optional)
* returns List
* */
const getTeams = ({ conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  getFbsTeams,
  getRoster,
  getTalent,
  getTeamMatchup,
  getTeams,
};
