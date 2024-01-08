/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Return a document.
*
* publicationId Integer Document with publication Id specified
* documentId Integer Document with Id specified
* no response value expected for this operation
* */
const apiV1PublicationsPublicationIdDocumentsDocumentIdDownloadGET = ({ publicationId, documentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        publicationId,
        documentId,
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
* Return information on a document.
*
* publicationId Integer Document with publication Id specified
* documentId Integer Document with Id specified
* returns PublicationDocument
* */
const apiV1PublicationsPublicationIdDocumentsDocumentIdGET = ({ publicationId, documentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        publicationId,
        documentId,
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
  apiV1PublicationsPublicationIdDocumentsDocumentIdDownloadGET,
  apiV1PublicationsPublicationIdDocumentsDocumentIdGET,
};
