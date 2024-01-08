/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Refreshes metadata for an item.
*
* itemId UUID Item id.
* metadataRefreshMode MetadataRefreshMode (Optional) Specifies the metadata refresh mode. (optional)
* imageRefreshMode MetadataRefreshMode (Optional) Specifies the image refresh mode. (optional)
* replaceAllMetadata Boolean (Optional) Determines if metadata should be replaced. Only applicable if mode is FullRefresh. (optional)
* replaceAllImages Boolean (Optional) Determines if images should be replaced. Only applicable if mode is FullRefresh. (optional)
* no response value expected for this operation
* */
const post = ({ itemId, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        metadataRefreshMode,
        imageRefreshMode,
        replaceAllMetadata,
        replaceAllImages,
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
  post,
};
