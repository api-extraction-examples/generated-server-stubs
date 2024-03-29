from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_pre_order_update_request_data import AppPreOrderUpdateRequestData
from openapi_server import util

from openapi_server.models.app_pre_order_update_request_data import AppPreOrderUpdateRequestData  # noqa: E501

class AppPreOrderUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppPreOrderUpdateRequest - a model defined in OpenAPI

        :param data: The data of this AppPreOrderUpdateRequest.  # noqa: E501
        :type data: AppPreOrderUpdateRequestData
        """
        self.openapi_types = {
            'data': AppPreOrderUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppPreOrderUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreOrderUpdateRequest of this AppPreOrderUpdateRequest.  # noqa: E501
        :rtype: AppPreOrderUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppPreOrderUpdateRequestData:
        """Gets the data of this AppPreOrderUpdateRequest.


        :return: The data of this AppPreOrderUpdateRequest.
        :rtype: AppPreOrderUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppPreOrderUpdateRequestData):
        """Sets the data of this AppPreOrderUpdateRequest.


        :param data: The data of this AppPreOrderUpdateRequest.
        :type data: AppPreOrderUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
