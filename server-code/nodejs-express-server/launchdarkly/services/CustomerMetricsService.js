/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get events usage by event id and the feature flag key.
*
* envId String The environment id for the flag evaluations in question.
* flagKey String The key of the flag we want metrics for.
* returns StreamSDKVersion
* */
const getEvaluations = ({ envId, flagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        envId,
        flagKey,
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
* Get events usage by event type.
*
* type String The type of event we would like to track.
* returns StreamSDKVersion
* */
const getEvent = ({ type }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
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
* Get events usage endpoints.
*
* returns Events
* */
const getEvents = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get monthly active user data.
*
* returns MAU
* */
const getMAU = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get monthly active user data by category.
*
* returns MAUbyCategory
* */
const getMAUByCategory = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get a stream endpoint and return timeseries data.
*
* source String The source of where the stream comes from.
* returns Stream
* */
const getStream = ({ source }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        source,
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
* Get a stream timeseries data by source show sdk version metadata.
*
* source String The source of where the stream comes from.
* returns StreamBySDK
* */
const getStreamBySDK = ({ source }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        source,
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
* Get a stream timeseries data by source and show all sdk version associated.
*
* source String The source of where the stream comes from.
* returns StreamSDKVersion
* */
const getStreamSDKVersion = ({ source }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        source,
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
* Returns a list of all streams.
*
* returns Streams
* */
const getStreams = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Returns of the usage endpoints available.
*
* returns Usage
* */
const getUsage = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  getEvaluations,
  getEvent,
  getEvents,
  getMAU,
  getMAUByCategory,
  getStream,
  getStreamBySDK,
  getStreamSDKVersion,
  getStreams,
  getUsage,
};
