from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot_set_create_request_data import AppScreenshotSetCreateRequestData
from openapi_server import util

from openapi_server.models.app_screenshot_set_create_request_data import AppScreenshotSetCreateRequestData  # noqa: E501

class AppScreenshotSetCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppScreenshotSetCreateRequest - a model defined in OpenAPI

        :param data: The data of this AppScreenshotSetCreateRequest.  # noqa: E501
        :type data: AppScreenshotSetCreateRequestData
        """
        self.openapi_types = {
            'data': AppScreenshotSetCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppScreenshotSetCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshotSetCreateRequest of this AppScreenshotSetCreateRequest.  # noqa: E501
        :rtype: AppScreenshotSetCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppScreenshotSetCreateRequestData:
        """Gets the data of this AppScreenshotSetCreateRequest.


        :return: The data of this AppScreenshotSetCreateRequest.
        :rtype: AppScreenshotSetCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppScreenshotSetCreateRequestData):
        """Sets the data of this AppScreenshotSetCreateRequest.


        :param data: The data of this AppScreenshotSetCreateRequest.
        :type data: AppScreenshotSetCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
