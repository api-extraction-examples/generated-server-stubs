/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Coaching records and history
* Coaching history
*
* firstName String First name filter (optional)
* lastName String Last name filter (optional)
* team String Team name filter (optional)
* year Integer Year filter (optional)
* minYear Integer Minimum year filter (inclusive) (optional)
* maxYear Integer Maximum year filter (inclusive) (optional)
* returns List
* */
const getCoaches = ({ firstName, lastName, team, year, minYear, maxYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        firstName,
        lastName,
        team,
        year,
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

module.exports = {
  getCoaches,
};
