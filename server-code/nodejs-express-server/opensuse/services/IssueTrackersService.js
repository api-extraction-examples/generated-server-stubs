/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get the list of issue trackers.
* Get the list of issue trackers.
*
* returns List
* */
const issue_trackersGET = () => new Promise(
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
* Delete an issue tracker.
* Delete an issue tracker.
*
* no response value expected for this operation
* */
const issue_trackersIssueTrackerNameDELETE = () => new Promise(
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
* Show an issue tracker.
* Show an issue tracker.
*
* issueUnderscoretrackerUnderscorename String Issue tracker name
* returns Object
* */
const issue_trackersIssueTrackerNameGET = ({ issueUnderscoretrackerUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueUnderscoretrackerUnderscorename,
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
* Show an issue of an issue tracker.
* Show an issue of an issue tracker.
*
* issueUnderscorename String Issue name.
* returns _issue_trackers__issue_tracker_name__issues__issue_name__get_200_response
* */
const issue_trackersIssueTrackerNameIssuesIssueNameGET = ({ issueUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueUnderscorename,
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
* Update or create an issue tracker.
* Update the issue tracker given as path parameter. If it is not found, create it.
*
* body Object Issue tracker definition.  XML Schema used for body validation: [issue_tracker.rng](../schema/issue_tracker.rng) 
* no response value expected for this operation
* */
const issue_trackersIssueTrackerNamePUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
* Create an issue tracker.
* Create an issue tracker.
*
* body Object Issue tracker definition.  XML Schema used for body validation: [issue_tracker.rng](../schema/issue_tracker.rng) 
* no response value expected for this operation
* */
const issue_trackersPOST = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
  issue_trackersGET,
  issue_trackersIssueTrackerNameDELETE,
  issue_trackersIssueTrackerNameGET,
  issue_trackersIssueTrackerNameIssuesIssueNameGET,
  issue_trackersIssueTrackerNamePUT,
  issue_trackersPOST,
};
