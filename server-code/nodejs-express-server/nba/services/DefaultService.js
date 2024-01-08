/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* westPlayer1 String 
* westPlayer2 String 
* westPlayer3 String 
* westPlayer4 String 
* westPlayer5 String 
* eastPlayer1 String 
* eastPlayer2 String 
* eastPlayer3 String 
* eastPlayer4 String 
* eastPlayer5 String 
* pointCap String  (optional)
* no response value expected for this operation
* */
const allstarballotpredictorGET = ({ westPlayer1, westPlayer2, westPlayer3, westPlayer4, westPlayer5, eastPlayer1, eastPlayer2, eastPlayer3, eastPlayer4, eastPlayer5, pointCap }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        westPlayer1,
        westPlayer2,
        westPlayer3,
        westPlayer4,
        westPlayer5,
        eastPlayer1,
        eastPlayer2,
        eastPlayer3,
        eastPlayer4,
        eastPlayer5,
        pointCap,
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
*
* gameID String  (optional)
* startPeriod String  (optional)
* endPeriod String  (optional)
* startRange String  (optional)
* endRange String  (optional)
* rangeType String  (optional)
* no response value expected for this operation
* */
const boxscoreGET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String  (optional)
* startPeriod String  (optional)
* endPeriod String  (optional)
* startRange String  (optional)
* endRange String  (optional)
* rangeType String  (optional)
* no response value expected for this operation
* */
const boxscoreadvancedGET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* startRange String 
* endRange String 
* rangeType String 
* no response value expected for this operation
* */
const boxscoreadvancedv2GET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String  (optional)
* startPeriod String  (optional)
* endPeriod String  (optional)
* startRange String  (optional)
* endRange String  (optional)
* rangeType String  (optional)
* no response value expected for this operation
* */
const boxscorefourfactorsGET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* startRange String 
* endRange String 
* rangeType String 
* no response value expected for this operation
* */
const boxscorefourfactorsv2GET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String  (optional)
* startPeriod String  (optional)
* endPeriod String  (optional)
* startRange String  (optional)
* endRange String  (optional)
* rangeType String  (optional)
* no response value expected for this operation
* */
const boxscoremiscGET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* startRange String 
* endRange String 
* rangeType String 
* no response value expected for this operation
* */
const boxscoremiscv2GET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* no response value expected for this operation
* */
const boxscoreplayertrackv2GET = ({ gameID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
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
*
* gameID String  (optional)
* startPeriod String  (optional)
* endPeriod String  (optional)
* startRange String  (optional)
* endRange String  (optional)
* rangeType String  (optional)
* no response value expected for this operation
* */
const boxscorescoringGET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* startRange String 
* endRange String 
* rangeType String 
* no response value expected for this operation
* */
const boxscorescoringv2GET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* no response value expected for this operation
* */
const boxscoresummaryv2GET = ({ gameID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* startRange String 
* endRange String 
* rangeType String 
* no response value expected for this operation
* */
const boxscoretraditionalv2GET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String  (optional)
* startPeriod String  (optional)
* endPeriod String  (optional)
* startRange String  (optional)
* endRange String  (optional)
* rangeType String  (optional)
* no response value expected for this operation
* */
const boxscoreusageGET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* startRange String 
* endRange String 
* rangeType String 
* no response value expected for this operation
* */
const boxscoreusagev2GET = ({ gameID, startPeriod, endPeriod, startRange, endRange, rangeType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
        startRange,
        endRange,
        rangeType,
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
*
* leagueID String 
* no response value expected for this operation
* */
const commonTeamYearsGET = ({ leagueID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
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
*
* leagueID String 
* season String 
* isOnlyCurrentSeason String 
* no response value expected for this operation
* */
const commonallplayersGET = ({ leagueID, season, isOnlyCurrentSeason }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        season,
        isOnlyCurrentSeason,
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
*
* playerID String 
* no response value expected for this operation
* */
const commonplayerinfoGET = ({ playerID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playerID,
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
*
* leagueID String 
* season String 
* no response value expected for this operation
* */
const commonplayoffseriesGET = ({ leagueID, season }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        season,
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
*
* season String 
* teamID String 
* no response value expected for this operation
* */
const commonteamrosterGET = ({ season, teamID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        season,
        teamID,
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
*
* leagueID String 
* seasonYear String 
* no response value expected for this operation
* */
const draftcombinedrillresultsGET = ({ leagueID, seasonYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonYear,
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
*
* leagueID String 
* seasonYear String 
* no response value expected for this operation
* */
const draftcombinenonstationaryshootingGET = ({ leagueID, seasonYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonYear,
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
*
* leagueID String 
* seasonYear String 
* no response value expected for this operation
* */
const draftcombineplayeranthroGET = ({ leagueID, seasonYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonYear,
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
*
* leagueID String 
* seasonYear String 
* no response value expected for this operation
* */
const draftcombinespotshootingGET = ({ leagueID, seasonYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonYear,
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
*
* leagueID String 
* seasonYear String 
* no response value expected for this operation
* */
const draftcombinestatsGET = ({ leagueID, seasonYear }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonYear,
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
*
* leagueID String 
* no response value expected for this operation
* */
const drafthistoryGET = ({ leagueID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
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
*
* leagueID String 
* no response value expected for this operation
* */
const franchisehistoryGET = ({ leagueID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
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
*
* statCategory String 
* leagueID String 
* season String 
* seasonType String 
* playerOrTeam String 
* playerScope String 
* gameScope String 
* game String  (optional)
* player String  (optional)
* no response value expected for this operation
* */
const homepageleadersGET = ({ statCategory, leagueID, season, seasonType, playerOrTeam, playerScope, gameScope, game, player }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        statCategory,
        leagueID,
        season,
        seasonType,
        playerOrTeam,
        playerScope,
        gameScope,
        game,
        player,
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
*
* statType String 
* leagueID String 
* season String 
* seasonType String 
* playerOrTeam String 
* playerScope String 
* gameScope String 
* game String  (optional)
* player String  (optional)
* no response value expected for this operation
* */
const homepagev2GET = ({ statType, leagueID, season, seasonType, playerOrTeam, playerScope, gameScope, game, player }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        statType,
        leagueID,
        season,
        seasonType,
        playerOrTeam,
        playerScope,
        gameScope,
        game,
        player,
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
*
* stat String 
* leagueID String 
* season String 
* seasonType String 
* playerOrTeam String 
* playerScope String 
* gameScope String 
* game String  (optional)
* player String  (optional)
* no response value expected for this operation
* */
const leaderstilesGET = ({ stat, leagueID, season, seasonType, playerOrTeam, playerScope, gameScope, game, player }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        stat,
        leagueID,
        season,
        seasonType,
        playerOrTeam,
        playerScope,
        gameScope,
        game,
        player,
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
*
* groupQuantity String 
* seasonType String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const leaguedashlineupsGET = ({ groupQuantity, seasonType, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupQuantity,
        seasonType,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* perMode String 
* leagueID String 
* season String 
* seasonType String 
* no response value expected for this operation
* */
const leaguedashplayerbiostatsGET = ({ perMode, leagueID, season, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        leagueID,
        season,
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
*
* clutchTime String 
* aheadBehind String 
* pointDiff String 
* gameScope String 
* playerExperience String 
* playerPosition String 
* starterBench String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const leaguedashplayerclutchGET = ({ clutchTime, aheadBehind, pointDiff, gameScope, playerExperience, playerPosition, starterBench, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        clutchTime,
        aheadBehind,
        pointDiff,
        gameScope,
        playerExperience,
        playerPosition,
        starterBench,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String 
* perMode String 
* season String 
* seasonType String 
* no response value expected for this operation
* */
const leaguedashplayerptshotGET = ({ leagueID, perMode, season, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        perMode,
        season,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* distanceRange String 
* gameScope String 
* playerExperience String 
* playerPosition String 
* starterBench String 
* no response value expected for this operation
* */
const leaguedashplayershotlocationsGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames, distanceRange, gameScope, playerExperience, playerPosition, starterBench }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
        distanceRange,
        gameScope,
        playerExperience,
        playerPosition,
        starterBench,
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
*
* gameScope String 
* playerExperience String 
* playerPosition String 
* starterBench String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const leaguedashplayerstatsGET = ({ gameScope, playerExperience, playerPosition, starterBench, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameScope,
        playerExperience,
        playerPosition,
        starterBench,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String 
* perMode String 
* season String 
* seasonType String 
* defenseCategory String 
* no response value expected for this operation
* */
const leaguedashptdefendGET = ({ leagueID, perMode, season, seasonType, defenseCategory }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        perMode,
        season,
        seasonType,
        defenseCategory,
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
*
* leagueID String 
* perMode String 
* season String 
* seasonType String 
* defenseCategory String 
* no response value expected for this operation
* */
const leaguedashptteamdefendGET = ({ leagueID, perMode, season, seasonType, defenseCategory }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        perMode,
        season,
        seasonType,
        defenseCategory,
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
*
* clutchTime String 
* aheadBehind String 
* pointDiff String 
* gameScope String 
* playerExperience String 
* playerPosition String 
* starterBench String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const leaguedashteamclutchGET = ({ clutchTime, aheadBehind, pointDiff, gameScope, playerExperience, playerPosition, starterBench, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        clutchTime,
        aheadBehind,
        pointDiff,
        gameScope,
        playerExperience,
        playerPosition,
        starterBench,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String 
* perMode String 
* season String 
* seasonType String 
* no response value expected for this operation
* */
const leaguedashteamptshotGET = ({ leagueID, perMode, season, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        perMode,
        season,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* distanceRange String 
* gameScope String 
* playerExperience String 
* playerPosition String 
* starterBench String 
* no response value expected for this operation
* */
const leaguedashteamshotlocationsGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames, distanceRange, gameScope, playerExperience, playerPosition, starterBench }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
        distanceRange,
        gameScope,
        playerExperience,
        playerPosition,
        starterBench,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const leaguedashteamstatsGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String 
* perMode String 
* season String 
* seasonType String 
* scope String 
* statCategory String  (optional)
* no response value expected for this operation
* */
const leagueleadersGET = ({ leagueID, perMode, season, seasonType, scope, statCategory }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        perMode,
        season,
        seasonType,
        scope,
        statCategory,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* no response value expected for this operation
* */
const playbyplayGET = ({ gameID, startPeriod, endPeriod }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
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
*
* gameID String 
* startPeriod String 
* endPeriod String 
* no response value expected for this operation
* */
const playbyplayv2GET = ({ gameID, startPeriod, endPeriod }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameID,
        startPeriod,
        endPeriod,
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
*
* perMode String 
* playerID String 
* no response value expected for this operation
* */
const playercareerstatsGET = ({ perMode, playerID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        playerID,
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
*
* playerIDList String 
* vsPlayerIDList String 
* seasonType String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playercompareGET = ({ playerIDList, vsPlayerIDList, seasonType, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playerIDList,
        vsPlayerIDList,
        seasonType,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbyclutchGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbygamesplitsGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbygeneralsplitsGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbylastngamesGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbyopponentGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbyshootingsplitsGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbyteamperformanceGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* playerID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashboardbyyearoveryearGET = ({ measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, playerID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        playerID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* perMode String 
* season String 
* seasonType String 
* playerID String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashptpassGET = ({ perMode, season, seasonType, playerID, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        playerID,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        lastNGames,
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
*
* perMode String 
* season String 
* seasonType String 
* playerID String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashptrebGET = ({ perMode, season, seasonType, playerID, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        playerID,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* season String  (optional)
* seasonType String  (optional)
* playerID String  (optional)
* teamID String  (optional)
* outcome String  (optional)
* location String  (optional)
* month String  (optional)
* seasonSegment String  (optional)
* dateFrom String  (optional)
* dateTo String  (optional)
* opponentTeamID String  (optional)
* vsConference String  (optional)
* vsDivision String  (optional)
* gameSegment String  (optional)
* period String  (optional)
* lastNGames String  (optional)
* no response value expected for this operation
* */
const playerdashptreboundlogsGET = ({ season, seasonType, playerID, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        season,
        seasonType,
        playerID,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* perMode String 
* season String 
* seasonType String 
* playerID String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashptshotdefendGET = ({ perMode, season, seasonType, playerID, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        playerID,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String  (optional)
* season String  (optional)
* seasonType String  (optional)
* playerID String  (optional)
* teamID String  (optional)
* no response value expected for this operation
* */
const playerdashptshotlogGET = ({ leagueID, season, seasonType, playerID, teamID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        season,
        seasonType,
        playerID,
        teamID,
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
*
* perMode String 
* season String 
* seasonType String 
* playerID String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playerdashptshotsGET = ({ perMode, season, seasonType, playerID, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        playerID,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* playerID String 
* season String 
* seasonType String 
* no response value expected for this operation
* */
const playergamelogGET = ({ playerID, season, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playerID,
        season,
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
*
* leagueID String 
* playerID String 
* season String 
* seasonType String 
* graphStartSeason String 
* graphEndSeason String 
* graphStat String 
* no response value expected for this operation
* */
const playerprofileGET = ({ leagueID, playerID, season, seasonType, graphStartSeason, graphEndSeason, graphStat }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        playerID,
        season,
        seasonType,
        graphStartSeason,
        graphEndSeason,
        graphStat,
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
*
* perMode String 
* playerID String 
* no response value expected for this operation
* */
const playerprofilev2GET = ({ perMode, playerID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        playerID,
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
*
* playerTeamID String 
* playerID1 String 
* playerID2 String 
* playerID3 String 
* playerID4 String 
* playerID5 String 
* vsTeamID String 
* vsPlayerID1 String 
* vsPlayerID2 String 
* vsPlayerID3 String 
* vsPlayerID4 String 
* vsPlayerID5 String 
* seasonType String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playersvsplayersGET = ({ playerTeamID, playerID1, playerID2, playerID3, playerID4, playerID5, vsTeamID, vsPlayerID1, vsPlayerID2, vsPlayerID3, vsPlayerID4, vsPlayerID5, seasonType, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playerTeamID,
        playerID1,
        playerID2,
        playerID3,
        playerID4,
        playerID5,
        vsTeamID,
        vsPlayerID1,
        vsPlayerID2,
        vsPlayerID3,
        vsPlayerID4,
        vsPlayerID5,
        seasonType,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* playerID String 
* vsPlayerID String 
* seasonType String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const playervsplayerGET = ({ playerID, vsPlayerID, seasonType, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playerID,
        vsPlayerID,
        seasonType,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String 
* seasonID String 
* no response value expected for this operation
* */
const playoffpictureGET = ({ leagueID, seasonID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonID,
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
*
* gameDate String 
* leagueID String 
* dayOffset String 
* no response value expected for this operation
* */
const scoreboardGET = ({ gameDate, leagueID, dayOffset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameDate,
        leagueID,
        dayOffset,
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
*
* gameDate String 
* leagueID String 
* dayOffset String 
* no response value expected for this operation
* */
const scoreboardV2GET = ({ gameDate, leagueID, dayOffset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        gameDate,
        leagueID,
        dayOffset,
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
*
* seasonType String 
* teamID String 
* playerID String 
* gameID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* position String 
* rookieYear String 
* gameSegment String 
* period String 
* lastNGames String 
* contextMeasure String 
* no response value expected for this operation
* */
const shotchartdetailGET = ({ seasonType, teamID, playerID, gameID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, position, rookieYear, gameSegment, period, lastNGames, contextMeasure }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seasonType,
        teamID,
        playerID,
        gameID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        position,
        rookieYear,
        gameSegment,
        period,
        lastNGames,
        contextMeasure,
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
*
* leagueID String 
* season String 
* seasonType String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* gameID String 
* gROUPUnderscoreID String 
* contextMeasure String 
* contextFilter String 
* no response value expected for this operation
* */
const shotchartlineupdetailGET = ({ leagueID, season, seasonType, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames, gameID, gROUPUnderscoreID, contextMeasure, contextFilter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        season,
        seasonType,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
        gameID,
        gROUPUnderscoreID,
        contextMeasure,
        contextFilter,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbyclutchGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbygamesplitsGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* seasonType String 
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbygeneralsplitsGET = ({ seasonType, teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seasonType,
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbylastngamesGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbyopponentGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbyshootingsplitsGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbyteamperformanceGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashboardbyyearoveryearGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* groupQuantity String 
* gameID String 
* seasonType String 
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashlineupsGET = ({ groupQuantity, gameID, seasonType, teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupQuantity,
        gameID,
        seasonType,
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* perMode String 
* season String 
* seasonType String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashptpassGET = ({ perMode, season, seasonType, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        lastNGames,
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
*
* perMode String 
* season String 
* seasonType String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashptrebGET = ({ perMode, season, seasonType, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* perMode String 
* season String 
* seasonType String 
* teamID String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamdashptshotsGET = ({ perMode, season, seasonType, teamID, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        perMode,
        season,
        seasonType,
        teamID,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* season String 
* seasonType String 
* no response value expected for this operation
* */
const teamgamelogGET = ({ teamID, season, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        season,
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
*
* season String 
* teamID String 
* leagueID String 
* seasonType String 
* no response value expected for this operation
* */
const teaminfocommonGET = ({ season, teamID, leagueID, seasonType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        season,
        teamID,
        leagueID,
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
*
* seasonType String 
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamplayerdashboardGET = ({ seasonType, teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seasonType,
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamplayeronoffdetailsGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* seasonType String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamplayeronoffsummaryGET = ({ teamID, measureType, perMode, plusMinus, paceAdjust, rank, season, seasonType, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        seasonType,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* teamID String 
* vsPlayerID String 
* seasonType String 
* measureType String 
* perMode String 
* plusMinus String 
* paceAdjust String 
* rank String 
* season String 
* outcome String 
* location String 
* month String 
* seasonSegment String 
* dateFrom String 
* dateTo String 
* opponentTeamID String 
* vsConference String 
* vsDivision String 
* gameSegment String 
* period String 
* lastNGames String 
* no response value expected for this operation
* */
const teamvsplayerGET = ({ teamID, vsPlayerID, seasonType, measureType, perMode, plusMinus, paceAdjust, rank, season, outcome, location, month, seasonSegment, dateFrom, dateTo, opponentTeamID, vsConference, vsDivision, gameSegment, period, lastNGames }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamID,
        vsPlayerID,
        seasonType,
        measureType,
        perMode,
        plusMinus,
        paceAdjust,
        rank,
        season,
        outcome,
        location,
        month,
        seasonSegment,
        dateFrom,
        dateTo,
        opponentTeamID,
        vsConference,
        vsDivision,
        gameSegment,
        period,
        lastNGames,
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
*
* leagueID String 
* seasonType String 
* perMode String 
* teamID String 
* no response value expected for this operation
* */
const teamyearbyyearstatsGET = ({ leagueID, seasonType, perMode, teamID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        seasonType,
        perMode,
        teamID,
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
*
* leagueID String 
* gameDate String 
* no response value expected for this operation
* */
const videoStatusGET = ({ leagueID, gameDate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        leagueID,
        gameDate,
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
  allstarballotpredictorGET,
  boxscoreGET,
  boxscoreadvancedGET,
  boxscoreadvancedv2GET,
  boxscorefourfactorsGET,
  boxscorefourfactorsv2GET,
  boxscoremiscGET,
  boxscoremiscv2GET,
  boxscoreplayertrackv2GET,
  boxscorescoringGET,
  boxscorescoringv2GET,
  boxscoresummaryv2GET,
  boxscoretraditionalv2GET,
  boxscoreusageGET,
  boxscoreusagev2GET,
  commonTeamYearsGET,
  commonallplayersGET,
  commonplayerinfoGET,
  commonplayoffseriesGET,
  commonteamrosterGET,
  draftcombinedrillresultsGET,
  draftcombinenonstationaryshootingGET,
  draftcombineplayeranthroGET,
  draftcombinespotshootingGET,
  draftcombinestatsGET,
  drafthistoryGET,
  franchisehistoryGET,
  homepageleadersGET,
  homepagev2GET,
  leaderstilesGET,
  leaguedashlineupsGET,
  leaguedashplayerbiostatsGET,
  leaguedashplayerclutchGET,
  leaguedashplayerptshotGET,
  leaguedashplayershotlocationsGET,
  leaguedashplayerstatsGET,
  leaguedashptdefendGET,
  leaguedashptteamdefendGET,
  leaguedashteamclutchGET,
  leaguedashteamptshotGET,
  leaguedashteamshotlocationsGET,
  leaguedashteamstatsGET,
  leagueleadersGET,
  playbyplayGET,
  playbyplayv2GET,
  playercareerstatsGET,
  playercompareGET,
  playerdashboardbyclutchGET,
  playerdashboardbygamesplitsGET,
  playerdashboardbygeneralsplitsGET,
  playerdashboardbylastngamesGET,
  playerdashboardbyopponentGET,
  playerdashboardbyshootingsplitsGET,
  playerdashboardbyteamperformanceGET,
  playerdashboardbyyearoveryearGET,
  playerdashptpassGET,
  playerdashptrebGET,
  playerdashptreboundlogsGET,
  playerdashptshotdefendGET,
  playerdashptshotlogGET,
  playerdashptshotsGET,
  playergamelogGET,
  playerprofileGET,
  playerprofilev2GET,
  playersvsplayersGET,
  playervsplayerGET,
  playoffpictureGET,
  scoreboardGET,
  scoreboardV2GET,
  shotchartdetailGET,
  shotchartlineupdetailGET,
  teamdashboardbyclutchGET,
  teamdashboardbygamesplitsGET,
  teamdashboardbygeneralsplitsGET,
  teamdashboardbylastngamesGET,
  teamdashboardbyopponentGET,
  teamdashboardbyshootingsplitsGET,
  teamdashboardbyteamperformanceGET,
  teamdashboardbyyearoveryearGET,
  teamdashlineupsGET,
  teamdashptpassGET,
  teamdashptrebGET,
  teamdashptshotsGET,
  teamgamelogGET,
  teaminfocommonGET,
  teamplayerdashboardGET,
  teamplayeronoffdetailsGET,
  teamplayeronoffsummaryGET,
  teamvsplayerGET,
  teamyearbyyearstatsGET,
  videoStatusGET,
};
