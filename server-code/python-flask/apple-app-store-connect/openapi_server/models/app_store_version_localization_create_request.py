from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_localization_create_request_data import AppStoreVersionLocalizationCreateRequestData
from openapi_server import util

from openapi_server.models.app_store_version_localization_create_request_data import AppStoreVersionLocalizationCreateRequestData  # noqa: E501

class AppStoreVersionLocalizationCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppStoreVersionLocalizationCreateRequest - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionLocalizationCreateRequest.  # noqa: E501
        :type data: AppStoreVersionLocalizationCreateRequestData
        """
        self.openapi_types = {
            'data': AppStoreVersionLocalizationCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionLocalizationCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersionLocalizationCreateRequest of this AppStoreVersionLocalizationCreateRequest.  # noqa: E501
        :rtype: AppStoreVersionLocalizationCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppStoreVersionLocalizationCreateRequestData:
        """Gets the data of this AppStoreVersionLocalizationCreateRequest.


        :return: The data of this AppStoreVersionLocalizationCreateRequest.
        :rtype: AppStoreVersionLocalizationCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppStoreVersionLocalizationCreateRequestData):
        """Sets the data of this AppStoreVersionLocalizationCreateRequest.


        :param data: The data of this AppStoreVersionLocalizationCreateRequest.
        :type data: AppStoreVersionLocalizationCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
