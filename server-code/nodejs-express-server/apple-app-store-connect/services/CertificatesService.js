/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* certificateCreateRequest CertificateCreateRequest Certificate representation
* returns CertificateResponse
* */
const certificatesCreate_instance = ({ certificateCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        certificateCreateRequest,
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
const certificatesDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketcertificateTypeRight_Square_Bracket List filter by attribute 'certificateType' (optional)
* filterLeft_Square_BracketdisplayNameRight_Square_Bracket List filter by attribute 'displayName' (optional)
* filterLeft_Square_BracketserialNumberRight_Square_Bracket List filter by attribute 'serialNumber' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketcertificatesRight_Square_Bracket List the fields to include for returned resources of type certificates (optional)
* limit Integer maximum resources per page (optional)
* returns CertificatesResponse
* */
const certificatesGet_collection = ({ filterLeft_Square_BracketcertificateTypeRight_Square_Bracket, filterLeft_Square_BracketdisplayNameRight_Square_Bracket, filterLeft_Square_BracketserialNumberRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketcertificatesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketcertificateTypeRight_Square_Bracket,
        filterLeft_Square_BracketdisplayNameRight_Square_Bracket,
        filterLeft_Square_BracketserialNumberRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketcertificatesRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketcertificatesRight_Square_Bracket List the fields to include for returned resources of type certificates (optional)
* returns CertificateResponse
* */
const certificatesGet_instance = ({ id, fieldsLeft_Square_BracketcertificatesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketcertificatesRight_Square_Bracket,
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
  certificatesCreate_instance,
  certificatesDelete_instance,
  certificatesGet_collection,
  certificatesGet_instance,
};
