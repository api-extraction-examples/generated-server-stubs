/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List of NFL Draft picks
* List of NFL Draft picks
*
* year Integer Year filter (optional)
* nflTeam String NFL team filter (optional)
* college String Player college filter (optional)
* conference String College confrence abbreviation filter (optional)
* position String NFL position filter (optional)
* returns List
* */
const getDraftPicks = ({ year, nflTeam, college, conference, position }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        nflTeam,
        college,
        conference,
        position,
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
* List of NFL positions
* List of NFL positions
*
* returns List
* */
const getNFLPositions = () => new Promise(
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
* List of NFL teams
* List of NFL teams
*
* returns List
* */
const getNFLTeams = () => new Promise(
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

module.exports = {
  getDraftPicks,
  getNFLPositions,
  getNFLTeams,
};
