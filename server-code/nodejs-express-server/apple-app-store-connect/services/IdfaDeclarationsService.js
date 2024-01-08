/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* idfaDeclarationCreateRequest IdfaDeclarationCreateRequest IdfaDeclaration representation
* returns IdfaDeclarationResponse
* */
const idfaDeclarationsCreate_instance = ({ idfaDeclarationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        idfaDeclarationCreateRequest,
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
* id String the id of the requested resource
* no response value expected for this operation
* */
const idfaDeclarationsDelete_instance = ({ id }) => new Promise(
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
*
* id String the id of the requested resource
* idfaDeclarationUpdateRequest IdfaDeclarationUpdateRequest IdfaDeclaration representation
* returns IdfaDeclarationResponse
* */
const idfaDeclarationsUpdate_instance = ({ id, idfaDeclarationUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        idfaDeclarationUpdateRequest,
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
  idfaDeclarationsCreate_instance,
  idfaDeclarationsDelete_instance,
  idfaDeclarationsUpdate_instance,
};
