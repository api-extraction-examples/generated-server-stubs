/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Preset Prime Time percentage
* Preset a Prime Time percentage in the region surrounding the specified location. This Prime Time percentage will be applied when requesting cost, or when requesting a ride in sandbox mode. 
*
* request SandboxPrimetime Prime Time to be preset in the region surrounding the lat, lng
* no response value expected for this operation
* */
const setPrimeTime = ({ request }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        request,
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
* Propagate ride through ride status
* Propagate a sandbox-ride through various ride status 
*
* id String The ID of the ride
* request SandboxRideStatus status to propagate the ride into
* returns SandboxRideUpdate
* */
const setRideStatus = ({ id, request }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        request,
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
* Driver availability for processing ride request
* Set driver availability for the provided ride_type in the city/region surrounding the specified location 
*
* rideUnderscoretype String 
* request SandboxDriverAvailability Driver availability to be preset in the region surrounding the lat, lng
* no response value expected for this operation
* */
const setRideTypeAvailability = ({ rideUnderscoretype, request }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        rideUnderscoretype,
        request,
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
* Preset types of rides for sandbox
* The sandbox-ridetypes endpoint allows you to preset the ridetypes in the region surrounding the specified latitude and longitude to allow testing different scenarios 
*
* request SandboxRideType Ridetypes to be preset in the region surrounding the lat, lng
* returns SandboxRideType
* */
const setRideTypes = ({ request }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        request,
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
  setPrimeTime,
  setRideStatus,
  setRideTypeAvailability,
  setRideTypes,
};
