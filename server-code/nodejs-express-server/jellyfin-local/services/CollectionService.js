/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Adds items to a collection.
*
* collectionId UUID The collection id.
* ids List Item ids, comma delimited.
* no response value expected for this operation
* */
const addToCollection = ({ collectionId, ids }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        collectionId,
        ids,
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
* Creates a new collection.
*
* name String The name of the collection. (optional)
* ids List Item Ids to add to the collection. (optional)
* parentId UUID Optional. Create the collection within a specific folder. (optional)
* isLocked Boolean Whether or not to lock the new collection. (optional)
* returns CollectionCreationResult
* */
const createCollection = ({ name, ids, parentId, isLocked }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        ids,
        parentId,
        isLocked,
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
* Removes items from a collection.
*
* collectionId UUID The collection id.
* ids List Item ids, comma delimited.
* no response value expected for this operation
* */
const removeFromCollection = ({ collectionId, ids }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        collectionId,
        ids,
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
  addToCollection,
  createCollection,
  removeFromCollection,
};
