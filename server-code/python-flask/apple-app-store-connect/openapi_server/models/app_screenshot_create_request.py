from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot_create_request_data import AppScreenshotCreateRequestData
from openapi_server import util

from openapi_server.models.app_screenshot_create_request_data import AppScreenshotCreateRequestData  # noqa: E501

class AppScreenshotCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppScreenshotCreateRequest - a model defined in OpenAPI

        :param data: The data of this AppScreenshotCreateRequest.  # noqa: E501
        :type data: AppScreenshotCreateRequestData
        """
        self.openapi_types = {
            'data': AppScreenshotCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppScreenshotCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshotCreateRequest of this AppScreenshotCreateRequest.  # noqa: E501
        :rtype: AppScreenshotCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppScreenshotCreateRequestData:
        """Gets the data of this AppScreenshotCreateRequest.


        :return: The data of this AppScreenshotCreateRequest.
        :rtype: AppScreenshotCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppScreenshotCreateRequestData):
        """Sets the data of this AppScreenshotCreateRequest.


        :param data: The data of this AppScreenshotCreateRequest.
        :type data: AppScreenshotCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data