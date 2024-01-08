from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_review_attachment_update_request_data import AppStoreReviewAttachmentUpdateRequestData
from openapi_server import util

from openapi_server.models.app_store_review_attachment_update_request_data import AppStoreReviewAttachmentUpdateRequestData  # noqa: E501

class AppStoreReviewAttachmentUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppStoreReviewAttachmentUpdateRequest - a model defined in OpenAPI

        :param data: The data of this AppStoreReviewAttachmentUpdateRequest.  # noqa: E501
        :type data: AppStoreReviewAttachmentUpdateRequestData
        """
        self.openapi_types = {
            'data': AppStoreReviewAttachmentUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreReviewAttachmentUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewAttachmentUpdateRequest of this AppStoreReviewAttachmentUpdateRequest.  # noqa: E501
        :rtype: AppStoreReviewAttachmentUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreReviewAttachmentUpdateRequestData:
        """Gets the data of this AppStoreReviewAttachmentUpdateRequest.


        :return: The data of this AppStoreReviewAttachmentUpdateRequest.
        :rtype: AppStoreReviewAttachmentUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreReviewAttachmentUpdateRequestData):
        """Sets the data of this AppStoreReviewAttachmentUpdateRequest.


        :param data: The data of this AppStoreReviewAttachmentUpdateRequest.
        :type data: AppStoreReviewAttachmentUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
