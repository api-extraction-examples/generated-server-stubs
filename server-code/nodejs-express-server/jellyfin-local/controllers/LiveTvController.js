/**
 * The LiveTvController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LiveTvService');
const addListingProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.addListingProvider);
};

const addTunerHost = async (request, response) => {
  await Controller.handleRequest(request, response, service.addTunerHost);
};

const cancelSeriesTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelSeriesTimer);
};

const cancelTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelTimer);
};

const createSeriesTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSeriesTimer);
};

const createTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTimer);
};

const deleteListingProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteListingProvider);
};

const deleteRecording = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteRecording);
};

const deleteTunerHost = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteTunerHost);
};

const discoverTuners = async (request, response) => {
  await Controller.handleRequest(request, response, service.discoverTuners);
};

const discvoverTuners = async (request, response) => {
  await Controller.handleRequest(request, response, service.discvoverTuners);
};

const getChannel = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChannel);
};

const getChannelMappingOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChannelMappingOptions);
};

const getDefaultListingProvider = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultListingProvider);
};

const getDefaultTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultTimer);
};

const getGuideInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGuideInfo);
};

const getLineups = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLineups);
};

const getLiveRecordingFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLiveRecordingFile);
};

const getLiveStreamFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLiveStreamFile);
};

const getLiveTvChannels = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLiveTvChannels);
};

const getLiveTvInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLiveTvInfo);
};

const getLiveTvPrograms = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLiveTvPrograms);
};

const getProgram = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProgram);
};

const getPrograms = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPrograms);
};

const getRecommendedPrograms = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecommendedPrograms);
};

const getRecording = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecording);
};

const getRecordingFolders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecordingFolders);
};

const getRecordingGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecordingGroup);
};

const getRecordingGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecordingGroups);
};

const getRecordings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecordings);
};

const getRecordingsSeries = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecordingsSeries);
};

const getSchedulesDirectCountries = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSchedulesDirectCountries);
};

const getSeriesTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSeriesTimer);
};

const getSeriesTimers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSeriesTimers);
};

const getTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTimer);
};

const getTimers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTimers);
};

const getTunerHostTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTunerHostTypes);
};

const resetTuner = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetTuner);
};

const setChannelMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.setChannelMapping);
};

const updateSeriesTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSeriesTimer);
};

const updateTimer = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateTimer);
};


module.exports = {
  addListingProvider,
  addTunerHost,
  cancelSeriesTimer,
  cancelTimer,
  createSeriesTimer,
  createTimer,
  deleteListingProvider,
  deleteRecording,
  deleteTunerHost,
  discoverTuners,
  discvoverTuners,
  getChannel,
  getChannelMappingOptions,
  getDefaultListingProvider,
  getDefaultTimer,
  getGuideInfo,
  getLineups,
  getLiveRecordingFile,
  getLiveStreamFile,
  getLiveTvChannels,
  getLiveTvInfo,
  getLiveTvPrograms,
  getProgram,
  getPrograms,
  getRecommendedPrograms,
  getRecording,
  getRecordingFolders,
  getRecordingGroup,
  getRecordingGroups,
  getRecordings,
  getRecordingsSeries,
  getSchedulesDirectCountries,
  getSeriesTimer,
  getSeriesTimers,
  getTimer,
  getTimers,
  getTunerHostTypes,
  resetTuner,
  setChannelMapping,
  updateSeriesTimer,
  updateTimer,
};
