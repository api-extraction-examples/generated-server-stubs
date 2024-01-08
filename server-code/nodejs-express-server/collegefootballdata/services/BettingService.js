/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Betting lines
* Closing betting lines
*
* gameId Integer Game id filter (optional)
* year Integer Year/season filter for games (optional)
* week Integer Week filter (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* team String Team (optional)
* home String Home team filter (optional)
* away String Away team filter (optional)
* conference String Conference abbreviation filter (optional)
* returns List
* */
const getLines = ({ gameId, year, week, seasonType, team, home, away, conference }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameId,
        year,
        week,
        seasonType,
        team,
        home,
        away,
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
  getLines,
};
