/**
 * The DefaultController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DefaultService');
const allstarballotpredictorGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.allstarballotpredictorGET);
};

const boxscoreGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoreGET);
};

const boxscoreadvancedGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoreadvancedGET);
};

const boxscoreadvancedv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoreadvancedv2GET);
};

const boxscorefourfactorsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscorefourfactorsGET);
};

const boxscorefourfactorsv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscorefourfactorsv2GET);
};

const boxscoremiscGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoremiscGET);
};

const boxscoremiscv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoremiscv2GET);
};

const boxscoreplayertrackv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoreplayertrackv2GET);
};

const boxscorescoringGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscorescoringGET);
};

const boxscorescoringv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscorescoringv2GET);
};

const boxscoresummaryv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoresummaryv2GET);
};

const boxscoretraditionalv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoretraditionalv2GET);
};

const boxscoreusageGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoreusageGET);
};

const boxscoreusagev2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.boxscoreusagev2GET);
};

const commonTeamYearsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.commonTeamYearsGET);
};

const commonallplayersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.commonallplayersGET);
};

const commonplayerinfoGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.commonplayerinfoGET);
};

const commonplayoffseriesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.commonplayoffseriesGET);
};

const commonteamrosterGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.commonteamrosterGET);
};

const draftcombinedrillresultsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.draftcombinedrillresultsGET);
};

const draftcombinenonstationaryshootingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.draftcombinenonstationaryshootingGET);
};

const draftcombineplayeranthroGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.draftcombineplayeranthroGET);
};

const draftcombinespotshootingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.draftcombinespotshootingGET);
};

const draftcombinestatsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.draftcombinestatsGET);
};

const drafthistoryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.drafthistoryGET);
};

const franchisehistoryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.franchisehistoryGET);
};

const homepageleadersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.homepageleadersGET);
};

const homepagev2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.homepagev2GET);
};

const leaderstilesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaderstilesGET);
};

const leaguedashlineupsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashlineupsGET);
};

const leaguedashplayerbiostatsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashplayerbiostatsGET);
};

const leaguedashplayerclutchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashplayerclutchGET);
};

const leaguedashplayerptshotGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashplayerptshotGET);
};

const leaguedashplayershotlocationsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashplayershotlocationsGET);
};

const leaguedashplayerstatsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashplayerstatsGET);
};

const leaguedashptdefendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashptdefendGET);
};

const leaguedashptteamdefendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashptteamdefendGET);
};

const leaguedashteamclutchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashteamclutchGET);
};

const leaguedashteamptshotGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashteamptshotGET);
};

const leaguedashteamshotlocationsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashteamshotlocationsGET);
};

const leaguedashteamstatsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leaguedashteamstatsGET);
};

const leagueleadersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.leagueleadersGET);
};

const playbyplayGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playbyplayGET);
};

const playbyplayv2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playbyplayv2GET);
};

const playercareerstatsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playercareerstatsGET);
};

const playercompareGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playercompareGET);
};

const playerdashboardbyclutchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbyclutchGET);
};

const playerdashboardbygamesplitsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbygamesplitsGET);
};

const playerdashboardbygeneralsplitsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbygeneralsplitsGET);
};

const playerdashboardbylastngamesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbylastngamesGET);
};

const playerdashboardbyopponentGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbyopponentGET);
};

const playerdashboardbyshootingsplitsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbyshootingsplitsGET);
};

const playerdashboardbyteamperformanceGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbyteamperformanceGET);
};

const playerdashboardbyyearoveryearGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashboardbyyearoveryearGET);
};

const playerdashptpassGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashptpassGET);
};

const playerdashptrebGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashptrebGET);
};

const playerdashptreboundlogsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashptreboundlogsGET);
};

const playerdashptshotdefendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashptshotdefendGET);
};

const playerdashptshotlogGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashptshotlogGET);
};

const playerdashptshotsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerdashptshotsGET);
};

const playergamelogGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playergamelogGET);
};

const playerprofileGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerprofileGET);
};

const playerprofilev2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerprofilev2GET);
};

const playersvsplayersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playersvsplayersGET);
};

const playervsplayerGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playervsplayerGET);
};

const playoffpictureGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.playoffpictureGET);
};

const scoreboardGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.scoreboardGET);
};

const scoreboardV2GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.scoreboardV2GET);
};

const shotchartdetailGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.shotchartdetailGET);
};

const shotchartlineupdetailGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.shotchartlineupdetailGET);
};

const teamdashboardbyclutchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbyclutchGET);
};

const teamdashboardbygamesplitsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbygamesplitsGET);
};

const teamdashboardbygeneralsplitsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbygeneralsplitsGET);
};

const teamdashboardbylastngamesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbylastngamesGET);
};

const teamdashboardbyopponentGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbyopponentGET);
};

const teamdashboardbyshootingsplitsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbyshootingsplitsGET);
};

const teamdashboardbyteamperformanceGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbyteamperformanceGET);
};

const teamdashboardbyyearoveryearGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashboardbyyearoveryearGET);
};

const teamdashlineupsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashlineupsGET);
};

const teamdashptpassGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashptpassGET);
};

const teamdashptrebGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashptrebGET);
};

const teamdashptshotsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamdashptshotsGET);
};

const teamgamelogGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamgamelogGET);
};

const teaminfocommonGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teaminfocommonGET);
};

const teamplayerdashboardGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamplayerdashboardGET);
};

const teamplayeronoffdetailsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamplayeronoffdetailsGET);
};

const teamplayeronoffsummaryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamplayeronoffsummaryGET);
};

const teamvsplayerGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamvsplayerGET);
};

const teamyearbyyearstatsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.teamyearbyyearstatsGET);
};

const videoStatusGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.videoStatusGET);
};


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
