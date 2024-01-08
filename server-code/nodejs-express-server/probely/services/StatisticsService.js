/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Average fix time graph data (all targets)
*
* returns _targets_all_average_fix_time__get_200_response
* */
const targetsAllAverageFixTimeGET = () => new Promise(
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
* Targets with open vulnerabilities pie chart data
*
* returns _targets_all_needs_attention_pie__get_200_response
* */
const targetsAllNeedsAttentionPieGET = () => new Promise(
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
* Targets with open vulnerabilities
*
* returns List
* */
const targetsAllNeedsAttentionTopGET = () => new Promise(
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
* Risk trend graph data (all targets)
*
* returns List
* */
const targetsAllRiskTrendGET = () => new Promise(
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
* Severity trend graph data (all targets)
*
* returns _targets_all_severity_trend__get_200_response
* */
const targetsAllSeverityTrendGET = () => new Promise(
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
* Top 5 vulnerabilities (all targets).
*
* returns List
* */
const targetsAllTopVulnsGET = () => new Promise(
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
* Average vulnerability trend graph data
*
* targetUnderscoreid String Target id
* returns _targets_all_average_fix_time__get_200_response
* */
const targetsTargetIdAverageFixTimeGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Risk trend graph data
*
* targetUnderscoreid String Target id
* returns List
* */
const targetsTargetIdRiskTrendGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Severity trend graph data.
*
* targetUnderscoreid String Target id
* returns _targets_all_severity_trend__get_200_response
* */
const targetsTargetIdSeverityTrendGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Top 5 vulnerabilities
*
* targetUnderscoreid String Target id
* returns List
* */
const targetsTargetIdTopVulnsGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
  targetsAllAverageFixTimeGET,
  targetsAllNeedsAttentionPieGET,
  targetsAllNeedsAttentionTopGET,
  targetsAllRiskTrendGET,
  targetsAllSeverityTrendGET,
  targetsAllTopVulnsGET,
  targetsTargetIdAverageFixTimeGET,
  targetsTargetIdRiskTrendGET,
  targetsTargetIdSeverityTrendGET,
  targetsTargetIdTopVulnsGET,
};
