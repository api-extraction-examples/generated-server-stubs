/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* fileUnderscorepath String 
* returns File
* */
const getSiteFileByPathName = ({ siteUnderscoreid, fileUnderscorepath }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        fileUnderscorepath,
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
const listSiteFiles = ({ siteUnderscoreid }) => new Promise(
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
* deployUnderscoreid String 
* path String 
* fileUnderscorebody File 
* size Integer  (optional)
* returns File
* */
const uploadDeployFile = ({ deployUnderscoreid, path, fileUnderscorebody, size }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
        path,
        fileUnderscorebody,
        size,
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
  getSiteFileByPathName,
  listSiteFiles,
  uploadDeployFile,
};
