/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cost estimates
* Estimate the cost of taking a Lyft between two points. 
*
* startUnderscorelat Double Latitude of the starting location
* startUnderscorelng Double Longitude of the starting location
* rideUnderscoretype String ID of a ride type (optional)
* endUnderscorelat Double Latitude of the ending location (optional)
* endUnderscorelng Double Longitude of the ending location (optional)
* returns CostEstimateResponse
* */
const getCost = ({ startUnderscorelat, startUnderscorelng, rideUnderscoretype, endUnderscorelat, endUnderscorelng }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscorelat,
        startUnderscorelng,
        rideUnderscoretype,
        endUnderscorelat,
        endUnderscorelng,
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
* Available drivers nearby
* The drivers endpoint returns a list of nearby drivers' lat and lng at a given location. 
*
* lat Double Latitude of a location
* lng Double Longitude of a location
* returns NearbyDriversResponse
* */
const getDrivers = ({ lat, lng }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        lat,
        lng,
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
* Pickup ETAs
* The ETA endpoint lets you know how quickly a Lyft driver can come get you 
*
* lat Double Latitude of a location
* lng Double Longitude of a location
* destinationUnderscorelat Double Latitude of destination location (optional)
* destinationUnderscorelng Double Longitude of destination location (optional)
* rideUnderscoretype String ID of a ride type (optional)
* returns EtaEstimateResponse
* */
const getETA = ({ lat, lng, destinationUnderscorelat, destinationUnderscorelng, rideUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        lat,
        lng,
        destinationUnderscorelat,
        destinationUnderscorelng,
        rideUnderscoretype,
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
* Types of rides
* The ride types endpoint returns information about what kinds of Lyft rides you can request at a given location. 
*
* lat Double Latitude of a location
* lng Double Longitude of a location
* rideUnderscoretype String ID of a ride type (optional)
* returns RideTypesResponse
* */
const getRideTypes = ({ lat, lng, rideUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        lat,
        lng,
        rideUnderscoretype,
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
  getCost,
  getDrivers,
  getETA,
  getRideTypes,
};
