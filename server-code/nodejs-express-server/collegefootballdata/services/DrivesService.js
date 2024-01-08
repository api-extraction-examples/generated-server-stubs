/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Drive data and results
* Get game drives
*
* year Integer Year filter
* seasonType String Season type filter (optional)
* week Integer Week filter (optional)
* team String Team filter (optional)
* offense String Offensive team filter (optional)
* defense String Defensive team filter (optional)
* conference String Conference filter (optional)
* offenseConference String Offensive conference filter (optional)
* defenseConference String Defensive conference filter (optional)
* classification String Division classification filter (fbs/fcs/ii/iii) (optional)
* returns List
* */
const getDrives = ({ year, seasonType, week, team, offense, defense, conference, offenseConference, defenseConference, classification }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        seasonType,
        week,
        team,
        offense,
        defense,
        conference,
        offenseConference,
        defenseConference,
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
  getDrives,
};
