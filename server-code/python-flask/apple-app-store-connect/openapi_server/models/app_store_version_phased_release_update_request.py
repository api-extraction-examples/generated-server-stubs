from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_phased_release_update_request_data import AppStoreVersionPhasedReleaseUpdateRequestData
from openapi_server import util

from openapi_server.models.app_store_version_phased_release_update_request_data import AppStoreVersionPhasedReleaseUpdateRequestData  # noqa: E501

class AppStoreVersionPhasedReleaseUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppStoreVersionPhasedReleaseUpdateRequest - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionPhasedReleaseUpdateRequest.  # noqa: E501
        :type data: AppStoreVersionPhasedReleaseUpdateRequestData
        """
        self.openapi_types = {
            'data': AppStoreVersionPhasedReleaseUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionPhasedReleaseUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionPhasedReleaseUpdateRequest of this AppStoreVersionPhasedReleaseUpdateRequest.  # noqa: E501
        :rtype: AppStoreVersionPhasedReleaseUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreVersionPhasedReleaseUpdateRequestData:
        """Gets the data of this AppStoreVersionPhasedReleaseUpdateRequest.


        :return: The data of this AppStoreVersionPhasedReleaseUpdateRequest.
        :rtype: AppStoreVersionPhasedReleaseUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreVersionPhasedReleaseUpdateRequestData):
        """Sets the data of this AppStoreVersionPhasedReleaseUpdateRequest.


        :param data: The data of this AppStoreVersionPhasedReleaseUpdateRequest.
        :type data: AppStoreVersionPhasedReleaseUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
