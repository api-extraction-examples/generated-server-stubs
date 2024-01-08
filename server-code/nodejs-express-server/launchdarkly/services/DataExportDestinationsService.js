/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a single data export destination by ID
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* destinationId String The data export destination ID.
* no response value expected for this operation
* */
const deleteDestination = ({ projectKey, environmentKey, destinationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        destinationId,
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
* Get a single data export destination by ID
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* destinationId String The data export destination ID.
* returns Destination
* */
const getDestination = ({ projectKey, environmentKey, destinationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        destinationId,
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
* Returns a list of all data export destinations.
*
* returns Destinations
* */
const getDestinations = () => new Promise(
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
* Perform a partial update to a data export destination.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* destinationId String The data export destination ID.
* patchOnly List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/' Feature flag patches also support JSON Merge Patch format. 'https://tools.ietf.org/html/rfc7386' The addition of comments is also supported.
* returns Destination
* */
const patchDestination = ({ projectKey, environmentKey, destinationId, patchOnly }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        destinationId,
        patchOnly,
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
* Create a new data export destination
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* destinationBody PostDestinationRequest Create a new data export destination.
* returns Destination
* */
const postDestination = ({ projectKey, environmentKey, destinationBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        destinationBody,
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
  deleteDestination,
  getDestination,
  getDestinations,
  patchDestination,
  postDestination,
};
