/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* routingAppCoverageCreateRequest RoutingAppCoverageCreateRequest RoutingAppCoverage representation
* returns RoutingAppCoverageResponse
* */
const routingAppCoveragesCreate_instance = ({ routingAppCoverageCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        routingAppCoverageCreateRequest,
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
* id String the id of the requested resource
* no response value expected for this operation
* */
const routingAppCoveragesDelete_instance = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* id String the id of the requested resource
* fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket List the fields to include for returned resources of type routingAppCoverages (optional)
* include List comma-separated list of relationships to include (optional)
* returns RoutingAppCoverageResponse
* */
const routingAppCoveragesGet_instance = ({ id, fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket,
        include,
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
* id String the id of the requested resource
* routingAppCoverageUpdateRequest RoutingAppCoverageUpdateRequest RoutingAppCoverage representation
* returns RoutingAppCoverageResponse
* */
const routingAppCoveragesUpdate_instance = ({ id, routingAppCoverageUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        routingAppCoverageUpdateRequest,
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
  routingAppCoveragesCreate_instance,
  routingAppCoveragesDelete_instance,
  routingAppCoveragesGet_instance,
  routingAppCoveragesUpdate_instance,
};
