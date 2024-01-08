/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancel a ongoing requested ride
* Cancel a ongoing ride which was requested earlier by providing the ride id. 
*
* id String The ID of the ride
* request CancellationRequest  (optional)
* no response value expected for this operation
* */
const cancelRide = ({ id, request }) => new Promise(
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
* The user's general info
* The v1 of this endpoint returns the user's ID, v2 will return more general info about the user. We require authentication for this endpoint, so we extract the user ID from the access token. 
*
* returns Profile
* */
const getProfile = () => new Promise(
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
* Get the ride detail of a given ride ID
* Get the status of a ride along with information about the driver, vehicle and price of a given ride ID 
*
* id String The ID of the ride
* returns RideDetail
* */
const getRide = ({ id }) => new Promise(
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
* Get the receipt of the rides.
* Get the receipt information of a processed ride by providing the ride id. Receipts will only be available to view once the payment has been processed. In the case of canceled ride, cancellation penalty is included if applicable. 
*
* id String The ID of the ride
* returns RideReceipt
* */
const getRideReceipt = ({ id }) => new Promise(
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
* List rides
* Get a list of past & current rides for this passenger. 
*
* startUnderscoretime Date Restrict to rides starting after this point in time. The earliest supported date is 2015-01-01T00:00:00+00:00 
* endUnderscoretime Date Restrict to rides starting before this point in time. The earliest supported date is 2015-01-01T00:00:00+00:00  (optional)
* limit Integer The maximum number of rides to return. The default limit is 10 if not specified. The maximum allowed value is 50, an integer greater that 50 will return at most 50 results.  (optional)
* returns RidesResponse
* */
const getRides = ({ startUnderscoretime, endUnderscoretime, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        limit,
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
* Request a Lyft
* Request a Lyft come pick you up at the given location. 
*
* request Ride Ride request information
* returns RideRequest
* */
const newRide = ({ request }) => new Promise(
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
* Update the destination of the ride
* Add or update the ride's destination. Note that the ride must still be active (not droppedOff or canceled), and that destinations on Lyft Line rides can not be changed. 
*
* id String The ID of the ride
* request Location The coordinates and optional address of the destination
* returns Location
* */
const setRideDestination = ({ id, request }) => new Promise(
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
* Add the passenger's rating, feedback, and tip
* Add the passenger's 1 to 5 star rating of the ride, optional written feedback, and optional tip amount in minor units and currency. The ride must already be dropped off, and ratings must be given within 24 hours of drop off. For purposes of display, 5 is considered the default rating. When this endpoint is successfully called, payment processing will begin. 
*
* id String The ID of the ride
* request RatingRequest The rating and optional feedback
* no response value expected for this operation
* */
const setRideRating = ({ id, request }) => new Promise(
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

module.exports = {
  cancelRide,
  getProfile,
  getRide,
  getRideReceipt,
  getRides,
  newRide,
  setRideDestination,
  setRideRating,
};
