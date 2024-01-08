/**
 * The DnsZoneController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DnsZoneService');
const configureDNSForSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.configureDNSForSite);
};

const createDnsRecord = async (request, response) => {
  await Controller.handleRequest(request, response, service.createDnsRecord);
};

const createDnsZone = async (request, response) => {
  await Controller.handleRequest(request, response, service.createDnsZone);
};

const deleteDnsRecord = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDnsRecord);
};

const deleteDnsZone = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDnsZone);
};

const getDNSForSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDNSForSite);
};

const getDnsRecords = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDnsRecords);
};

const getDnsZone = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDnsZone);
};

const getDnsZones = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDnsZones);
};

const getIndividualDnsRecord = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIndividualDnsRecord);
};

const transferDnsZone = async (request, response) => {
  await Controller.handleRequest(request, response, service.transferDnsZone);
};


module.exports = {
  configureDNSForSite,
  createDnsRecord,
  createDnsZone,
  deleteDnsRecord,
  deleteDnsZone,
  getDNSForSite,
  getDnsRecords,
  getDnsZone,
  getDnsZones,
  getIndividualDnsRecord,
  transferDnsZone,
};
