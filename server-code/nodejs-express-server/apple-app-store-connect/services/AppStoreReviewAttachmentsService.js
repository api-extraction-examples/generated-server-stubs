/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appStoreReviewAttachmentCreateRequest AppStoreReviewAttachmentCreateRequest AppStoreReviewAttachment representation
* returns AppStoreReviewAttachmentResponse
* */
const appStoreReviewAttachmentsCreate_instance = ({ appStoreReviewAttachmentCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appStoreReviewAttachmentCreateRequest,
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
const appStoreReviewAttachmentsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewAttachments (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppStoreReviewAttachmentResponse
* */
const appStoreReviewAttachmentsGet_instance = ({ id, fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket,
        include,
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
* appStoreReviewAttachmentUpdateRequest AppStoreReviewAttachmentUpdateRequest AppStoreReviewAttachment representation
* returns AppStoreReviewAttachmentResponse
* */
const appStoreReviewAttachmentsUpdate_instance = ({ id, appStoreReviewAttachmentUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appStoreReviewAttachmentUpdateRequest,
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
  appStoreReviewAttachmentsCreate_instance,
  appStoreReviewAttachmentsDelete_instance,
  appStoreReviewAttachmentsGet_instance,
  appStoreReviewAttachmentsUpdate_instance,
};
