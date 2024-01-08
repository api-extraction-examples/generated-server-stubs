/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewDetails (optional)
* fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewAttachments (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppStoreReviewAttachmentsResponse
* */
const appStoreReviewDetailsAppStoreReviewAttachmentsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket,
        limit,
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
* appStoreReviewDetailCreateRequest AppStoreReviewDetailCreateRequest AppStoreReviewDetail representation
* returns AppStoreReviewDetailResponse
* */
const appStoreReviewDetailsCreate_instance = ({ appStoreReviewDetailCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appStoreReviewDetailCreateRequest,
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
* fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewDetails (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewAttachments (optional)
* limitLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket Integer maximum number of related appStoreReviewAttachments returned (when they are included) (optional)
* returns AppStoreReviewDetailResponse
* */
const appStoreReviewDetailsGet_instance = ({ id, fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket, include, fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket, limitLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket,
        limitLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket,
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
* appStoreReviewDetailUpdateRequest AppStoreReviewDetailUpdateRequest AppStoreReviewDetail representation
* returns AppStoreReviewDetailResponse
* */
const appStoreReviewDetailsUpdate_instance = ({ id, appStoreReviewDetailUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appStoreReviewDetailUpdateRequest,
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
  appStoreReviewDetailsAppStoreReviewAttachmentsGet_to_many_related,
  appStoreReviewDetailsCreate_instance,
  appStoreReviewDetailsGet_instance,
  appStoreReviewDetailsUpdate_instance,
};
