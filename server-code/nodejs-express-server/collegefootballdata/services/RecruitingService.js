/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Recruit position group ratings
* Gets a list of aggregated statistics by team and position grouping
*
* startYear Integer Starting year (optional)
* endYear Integer Ending year (optional)
* team String Team filter (optional)
* conference String conference filter (optional)
* returns List
* */
const getRecruitingGroups = ({ startYear, endYear, team, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startYear,
        endYear,
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
* Player recruiting ratings and rankings
* Get player recruiting rankings and data. Requires either a year or team to be specified.
*
* year Integer Recruiting class year (required if team no specified) (optional)
* classification String Type of recruit (HighSchool, JUCO, PrepSchool) (optional)
* position String Position abbreviation filter (optional)
* state String State or province abbreviation filter (optional)
* team String Committed team filter (required if year not specified) (optional)
* returns List
* */
const getRecruitingPlayers = ({ year, classification, position, state, team }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        classification,
        position,
        state,
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
* Team recruiting rankings and ratings
* Team recruiting rankings
*
* year Integer Recruiting class year (optional)
* team String Team filter (optional)
* returns List
* */
const getRecruitingTeams = ({ year, team }) => new Promise(
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

module.exports = {
  getRecruitingGroups,
  getRecruitingPlayers,
  getRecruitingTeams,
};
