/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* returns List
* */
const configureDNSForSite = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* zoneUnderscoreid String 
* dnsUnderscorerecord DnsRecordCreate 
* returns dnsRecord
* */
const createDnsRecord = ({ zoneUnderscoreid, dnsUnderscorerecord }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
        dnsUnderscorerecord,
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
* dnsZoneParams DnsZoneSetup 
* returns dnsZone
* */
const createDnsZone = ({ dnsZoneParams }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dnsZoneParams,
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
* zoneUnderscoreid String 
* dnsUnderscorerecordUnderscoreid String 
* no response value expected for this operation
* */
const deleteDnsRecord = ({ zoneUnderscoreid, dnsUnderscorerecordUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
        dnsUnderscorerecordUnderscoreid,
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
* zoneUnderscoreid String 
* no response value expected for this operation
* */
const deleteDnsZone = ({ zoneUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
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
* siteUnderscoreid String 
* returns List
* */
const getDNSForSite = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* zoneUnderscoreid String 
* returns List
* */
const getDnsRecords = ({ zoneUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
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
* zoneUnderscoreid String 
* returns dnsZone
* */
const getDnsZone = ({ zoneUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
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
* accountUnderscoreslug String  (optional)
* returns List
* */
const getDnsZones = ({ accountUnderscoreslug }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
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
* zoneUnderscoreid String 
* dnsUnderscorerecordUnderscoreid String 
* returns dnsRecord
* */
const getIndividualDnsRecord = ({ zoneUnderscoreid, dnsUnderscorerecordUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
        dnsUnderscorerecordUnderscoreid,
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
* zoneUnderscoreid String 
* accountUnderscoreid String the account of the dns zone
* transferUnderscoreaccountUnderscoreid String the account you want to transfer the dns zone to
* transferUnderscoreuserUnderscoreid String the user you want to transfer the dns zone to
* returns dnsZone
* */
const transferDnsZone = ({ zoneUnderscoreid, accountUnderscoreid, transferUnderscoreaccountUnderscoreid, transferUnderscoreuserUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        zoneUnderscoreid,
        accountUnderscoreid,
        transferUnderscoreaccountUnderscoreid,
        transferUnderscoreuserUnderscoreid,
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
