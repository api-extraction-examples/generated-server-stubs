from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_update_request_data import AppUpdateRequestData
from openapi_server import util

from openapi_server.models.app_update_request_data import AppUpdateRequestData  # noqa: E501

class AppUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppUpdateRequest - a model defined in OpenAPI

        :param data: The data of this AppUpdateRequest.  # noqa: E501
        :type data: AppUpdateRequestData
        """
        self.openapi_types = {
            'data': AppUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppUpdateRequest of this AppUpdateRequest.  # noqa: E501
        :rtype: AppUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppUpdateRequestData:
        """Gets the data of this AppUpdateRequest.


        :return: The data of this AppUpdateRequest.
        :rtype: AppUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppUpdateRequestData):
        """Sets the data of this AppUpdateRequest.


        :param data: The data of this AppUpdateRequest.
        :type data: AppUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
