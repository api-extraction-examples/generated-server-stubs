/**
 * The SyncPlayController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SyncPlayService');
const syncPlayBuffering = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayBuffering);
};

const syncPlayCreateGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayCreateGroup);
};

const syncPlayGetGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayGetGroups);
};

const syncPlayJoinGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayJoinGroup);
};

const syncPlayLeaveGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayLeaveGroup);
};

const syncPlayMovePlaylistItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayMovePlaylistItem);
};

const syncPlayNextItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayNextItem);
};

const syncPlayPause = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayPause);
};

const syncPlayPing = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayPing);
};

const syncPlayPreviousItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayPreviousItem);
};

const syncPlayQueue = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayQueue);
};

const syncPlayReady = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayReady);
};

const syncPlayRemoveFromPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayRemoveFromPlaylist);
};

const syncPlaySeek = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlaySeek);
};

const syncPlaySetIgnoreWait = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlaySetIgnoreWait);
};

const syncPlaySetNewQueue = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlaySetNewQueue);
};

const syncPlaySetPlaylistItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlaySetPlaylistItem);
};

const syncPlaySetRepeatMode = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlaySetRepeatMode);
};

const syncPlaySetShuffleMode = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlaySetShuffleMode);
};

const syncPlayStop = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayStop);
};

const syncPlayUnpause = async (request, response) => {
  await Controller.handleRequest(request, response, service.syncPlayUnpause);
};


module.exports = {
  syncPlayBuffering,
  syncPlayCreateGroup,
  syncPlayGetGroups,
  syncPlayJoinGroup,
  syncPlayLeaveGroup,
  syncPlayMovePlaylistItem,
  syncPlayNextItem,
  syncPlayPause,
  syncPlayPing,
  syncPlayPreviousItem,
  syncPlayQueue,
  syncPlayReady,
  syncPlayRemoveFromPlaylist,
  syncPlaySeek,
  syncPlaySetIgnoreWait,
  syncPlaySetNewQueue,
  syncPlaySetPlaylistItem,
  syncPlaySetRepeatMode,
  syncPlaySetShuffleMode,
  syncPlayStop,
  syncPlayUnpause,
};
