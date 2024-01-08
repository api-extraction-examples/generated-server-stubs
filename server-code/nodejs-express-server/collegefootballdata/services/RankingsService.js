/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Historical polls and rankings
* Poll rankings
*
* year Integer Year/season filter for games
* week Integer Week filter (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* returns List
* */
const getRankings = ({ year, week, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
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

module.exports = {
  getRankings,
};
