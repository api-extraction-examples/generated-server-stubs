/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets metadata editor info for an item.
*
* itemId UUID The item id.
* returns MetadataEditorInfo
* */
const getMetadataEditorInfo = ({ itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
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
* Updates an item.
*
* itemId UUID The item id.
* baseItemDto BaseItemDto The new item properties.
* no response value expected for this operation
* */
const updateItem = ({ itemId, baseItemDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        baseItemDto,
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
* Updates an item's content type.
*
* itemId UUID The item id.
* contentType String The content type of the item. (optional)
* no response value expected for this operation
* */
const updateItemContentType = ({ itemId, contentType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        contentType,
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
  getMetadataEditorInfo,
  updateItem,
  updateItemContentType,
};
