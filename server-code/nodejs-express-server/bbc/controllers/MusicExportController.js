/**
 * The MusicExportController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MusicExportService');
const deleteMusicPreferencesExport = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteMusicPreferencesExport);
};

const deleteMusicPreferencesExportVendor = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteMusicPreferencesExportVendor);
};

const getMusicExport = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicExport);
};

const getMusicExportJobs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicExportJobs);
};

const getMusicExportTracks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicExportTracks);
};

const getMusicPreferencesExport = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPreferencesExport);
};

const getMusicPreferencesExportVendor = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPreferencesExportVendor);
};

const postMusicExportJob = async (request, response) => {
  await Controller.handleRequest(request, response, service.postMusicExportJob);
};

const postMusicPreferencesExport = async (request, response) => {
  await Controller.handleRequest(request, response, service.postMusicPreferencesExport);
};

const postMusicPreferencesExportVendor = async (request, response) => {
  await Controller.handleRequest(request, response, service.postMusicPreferencesExportVendor);
};

const putMusicPreferencesExportVendor = async (request, response) => {
  await Controller.handleRequest(request, response, service.putMusicPreferencesExportVendor);
};


module.exports = {
  deleteMusicPreferencesExport,
  deleteMusicPreferencesExportVendor,
  getMusicExport,
  getMusicExportJobs,
  getMusicExportTracks,
  getMusicPreferencesExport,
  getMusicPreferencesExportVendor,
  postMusicExportJob,
  postMusicPreferencesExport,
  postMusicPreferencesExportVendor,
  putMusicPreferencesExportVendor,
};
