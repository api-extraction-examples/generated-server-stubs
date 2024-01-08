/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* 
*
* type credential_enum_push_service 
* apiKey String [GCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging. (optional)
* certificate String [APN only] The URL-encoded representation of the certificate. Strip everything outside of the headers, e.g. `-----BEGIN CERTIFICATE-----MIIFnTCCBIWgAwIBAgIIAjy9H849+E8wDQYJKoZIhvcNAQEFBQAwgZYxCzAJBgNV.....A==-----END CERTIFICATE-----` (optional)
* friendlyName String A descriptive string that you create to describe the resource. It can be up to 64 characters long. (optional)
* privateKey String [APN only] The URL-encoded representation of the private key. Strip everything outside of the headers, e.g. `-----BEGIN RSA PRIVATE KEY-----MIIEpQIBAAKCAQEAuyf/lNrH9ck8DmNyo3fGgvCI1l9s+cmBY3WIz+cUDqmxiieR\\\\n.-----END RSA PRIVATE KEY-----` (optional)
* sandbox Boolean [APN only] Whether to send the credential to sandbox APNs. Can be `true` to send to sandbox APNs or `false` to send to production. (optional)
* secret String [FCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging. (optional)
* returns notify.v1.credential
* */
const createCredential = ({ type, apiKey, certificate, friendlyName, privateKey, sandbox, secret }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        type,
        apiKey,
        certificate,
        friendlyName,
        privateKey,
        sandbox,
        secret,
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
*
* sid String The Twilio-provided string that uniquely identifies the Credential resource to delete.
* no response value expected for this operation
* */
const deleteCredential = ({ sid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sid,
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
*
* sid String The Twilio-provided string that uniquely identifies the Credential resource to fetch.
* returns notify.v1.credential
* */
const fetchCredential = ({ sid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sid,
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
*
* pageSize Integer How many resources to return in each list page. The default is 50, and the maximum is 1000. (optional)
* page Integer The page index. This value is simply for client state. (optional)
* pageToken String The page token. This is provided by the API. (optional)
* returns ListCredentialResponse
* */
const listCredential = ({ pageSize, page, pageToken }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pageSize,
        page,
        pageToken,
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
*
* sid String The Twilio-provided string that uniquely identifies the Credential resource to update.
* apiKey String [GCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging. (optional)
* certificate String [APN only] The URL-encoded representation of the certificate. Strip everything outside of the headers, e.g. `-----BEGIN CERTIFICATE-----MIIFnTCCBIWgAwIBAgIIAjy9H849+E8wDQYJKoZIhvcNAQEFBQAwgZYxCzAJBgNV.....A==-----END CERTIFICATE-----` (optional)
* friendlyName String A descriptive string that you create to describe the resource. It can be up to 64 characters long. (optional)
* privateKey String [APN only] The URL-encoded representation of the private key. Strip everything outside of the headers, e.g. `-----BEGIN RSA PRIVATE KEY-----MIIEpQIBAAKCAQEAuyf/lNrH9ck8DmNyo3fGgvCI1l9s+cmBY3WIz+cUDqmxiieR\\\\n.-----END RSA PRIVATE KEY-----` (optional)
* sandbox Boolean [APN only] Whether to send the credential to sandbox APNs. Can be `true` to send to sandbox APNs or `false` to send to production. (optional)
* secret String [FCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging. (optional)
* returns notify.v1.credential
* */
const updateCredential = ({ sid, apiKey, certificate, friendlyName, privateKey, sandbox, secret }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sid,
        apiKey,
        certificate,
        friendlyName,
        privateKey,
        sandbox,
        secret,
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
  createCredential,
  deleteCredential,
  fetchCredential,
  listCredential,
  updateCredential,
};
