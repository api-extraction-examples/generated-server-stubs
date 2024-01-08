/**
 * The StatisticsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/StatisticsService');
const targetsAllAverageFixTimeGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllAverageFixTimeGET);
};

const targetsAllNeedsAttentionPieGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllNeedsAttentionPieGET);
};

const targetsAllNeedsAttentionTopGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllNeedsAttentionTopGET);
};

const targetsAllRiskTrendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllRiskTrendGET);
};

const targetsAllSeverityTrendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllSeverityTrendGET);
};

const targetsAllTopVulnsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllTopVulnsGET);
};

const targetsTargetIdAverageFixTimeGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdAverageFixTimeGET);
};

const targetsTargetIdRiskTrendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdRiskTrendGET);
};

const targetsTargetIdSeverityTrendGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdSeverityTrendGET);
};

const targetsTargetIdTopVulnsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdTopVulnsGET);
};


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
