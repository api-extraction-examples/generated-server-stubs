from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.device_update_request_data import DeviceUpdateRequestData
from openapi_server import util

from openapi_server.models.device_update_request_data import DeviceUpdateRequestData  # noqa: E501

class DeviceUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """DeviceUpdateRequest - a model defined in OpenAPI

        :param data: The data of this DeviceUpdateRequest.  # noqa: E501
        :type data: DeviceUpdateRequestData
        """
        self.openapi_types = {
            'data': DeviceUpdateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'DeviceUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeviceUpdateRequest of this DeviceUpdateRequest.  # noqa: E501
        :rtype: DeviceUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> DeviceUpdateRequestData:
        """Gets the data of this DeviceUpdateRequest.


        :return: The data of this DeviceUpdateRequest.
        :rtype: DeviceUpdateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: DeviceUpdateRequestData):
        """Sets the data of this DeviceUpdateRequest.


        :param data: The data of this DeviceUpdateRequest.
        :type data: DeviceUpdateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
