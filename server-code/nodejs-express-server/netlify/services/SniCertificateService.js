/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* certificate String  (optional)
* key String  (optional)
* caUnderscorecertificates String  (optional)
* returns sniCertificate
* */
const provisionSiteTLSCertificate = ({ siteUnderscoreid, certificate, key, caUnderscorecertificates }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        certificate,
        key,
        caUnderscorecertificates,
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
* returns sniCertificate
* */
const showSiteTLSCertificate = ({ siteUnderscoreid }) => new Promise(
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

module.exports = {
  provisionSiteTLSCertificate,
  showSiteTLSCertificate,
};
