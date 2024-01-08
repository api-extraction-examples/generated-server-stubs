/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Team Predicated Points Added (PPA/EPA) by game
* Predicted Points Added (PPA) by game
*
* year Integer Year filter
* week Integer Week filter (optional)
* team String Team filter (optional)
* conference String Conference filter (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* returns List
* */
const getGamePPA = ({ year, week, team, conference, excludeGarbageTime, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        team,
        conference,
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
* Player Predicated Points Added (PPA/EPA) broken down by game
* Predicted Points Added (PPA) by player game
*
* year Integer Year filter (optional)
* week Integer Week filter (optional)
* team String Team filter (optional)
* position String Position abbreviation filter (optional)
* playerId Integer Player id filter (optional)
* threshold String Minimum play threshold filter (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* seasonType String Season type filter (regular or postseason) (optional)
* returns List
* */
const getPlayerGamePPA = ({ year, week, team, position, playerId, threshold, excludeGarbageTime, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        team,
        position,
        playerId,
        threshold,
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
* Player Predicated Points Added (PPA/EPA) broken down by season
* Predicted Points Added (PPA) by player season
*
* year Integer Year filter (optional)
* team String Team filter (optional)
* conference String Conference abbreviation filter (optional)
* position String Position abbreviation filter (optional)
* playerId Integer Player id filter (optional)
* threshold String Minimum play threshold filter (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* returns List
* */
const getPlayerSeasonPPA = ({ year, team, conference, position, playerId, threshold, excludeGarbageTime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        conference,
        position,
        playerId,
        threshold,
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
* Predicted Points (i.e. Expected Points or EP)
* Predicted Points
*
* down Integer Down filter
* distance Integer Distance filter
* returns List
* */
const getPredictedPoints = ({ down, distance }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        down,
        distance,
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
* Pregame win probability data
* Pregame win probabilities
*
* year Integer Year filter (optional)
* week Integer Week filter (optional)
* team String Team filter (optional)
* seasonType String regular or postseason (optional)
* returns List
* */
const getPregameWinProbabilities = ({ year, week, team, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        week,
        team,
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
* Predicted Points Added (PPA/EPA) data by team
* Predicted Points Added (PPA)
*
* year Integer Year filter (required if team not specified) (optional)
* team String Team filter (required if year not specified) (optional)
* conference String Conference filter (optional)
* excludeGarbageTime Boolean Filter to remove garbage time plays from calculations (optional)
* returns List
* */
const getTeamPPA = ({ year, team, conference, excludeGarbageTime }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        year,
        team,
        conference,
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
* Win probability chart data
* Win probability data
*
* gameId Integer Game id filter
* returns List
* */
const getWinProbabilityData = ({ gameId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameId,
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
  getGamePPA,
  getPlayerGamePPA,
  getPlayerSeasonPPA,
  getPredictedPoints,
  getPregameWinProbabilities,
  getTeamPPA,
  getWinProbabilityData,
};
