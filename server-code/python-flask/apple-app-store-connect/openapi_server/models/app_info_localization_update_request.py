from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info_localization_update_request_data import AppInfoLocalizationUpdateRequestData
from openapi_server import util

from openapi_server.models.app_info_localization_update_request_data import AppInfoLocalizationUpdateRequestData  # noqa: E501

class AppInfoLocalizationUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppInfoLocalizationUpdateRequest - a model defined in OpenAPI

        :param data: The data of this AppInfoLocalizationUpdateRequest.  # noqa: E501
        :type data: AppInfoLocalizationUpdateRequestData
        """
        self.openapi_types = {
            'data': AppInfoLocalizationUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppInfoLocalizationUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfoLocalizationUpdateRequest of this AppInfoLocalizationUpdateRequest.  # noqa: E501
        :rtype: AppInfoLocalizationUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppInfoLocalizationUpdateRequestData:
        """Gets the data of this AppInfoLocalizationUpdateRequest.


        :return: The data of this AppInfoLocalizationUpdateRequest.
        :rtype: AppInfoLocalizationUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppInfoLocalizationUpdateRequestData):
        """Sets the data of this AppInfoLocalizationUpdateRequest.


        :param data: The data of this AppInfoLocalizationUpdateRequest.
        :type data: AppInfoLocalizationUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
