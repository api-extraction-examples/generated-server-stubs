from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info_update_request_data import AppInfoUpdateRequestData
from openapi_server import util

from openapi_server.models.app_info_update_request_data import AppInfoUpdateRequestData  # noqa: E501

class AppInfoUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppInfoUpdateRequest - a model defined in OpenAPI

        :param data: The data of this AppInfoUpdateRequest.  # noqa: E501
        :type data: AppInfoUpdateRequestData
        """
        self.openapi_types = {
            'data': AppInfoUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppInfoUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfoUpdateRequest of this AppInfoUpdateRequest.  # noqa: E501
        :rtype: AppInfoUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppInfoUpdateRequestData:
        """Gets the data of this AppInfoUpdateRequest.


        :return: The data of this AppInfoUpdateRequest.
        :rtype: AppInfoUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppInfoUpdateRequestData):
        """Sets the data of this AppInfoUpdateRequest.


        :param data: The data of this AppInfoUpdateRequest.
        :type data: AppInfoUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data