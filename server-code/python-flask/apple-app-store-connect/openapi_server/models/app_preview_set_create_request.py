from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_preview_set_create_request_data import AppPreviewSetCreateRequestData
from openapi_server import util

from openapi_server.models.app_preview_set_create_request_data import AppPreviewSetCreateRequestData  # noqa: E501

class AppPreviewSetCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppPreviewSetCreateRequest - a model defined in OpenAPI

        :param data: The data of this AppPreviewSetCreateRequest.  # noqa: E501
        :type data: AppPreviewSetCreateRequestData
        """
        self.openapi_types = {
            'data': AppPreviewSetCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppPreviewSetCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreviewSetCreateRequest of this AppPreviewSetCreateRequest.  # noqa: E501
        :rtype: AppPreviewSetCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppPreviewSetCreateRequestData:
        """Gets the data of this AppPreviewSetCreateRequest.


        :return: The data of this AppPreviewSetCreateRequest.
        :rtype: AppPreviewSetCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: AppPreviewSetCreateRequestData):
        """Sets the data of this AppPreviewSetCreateRequest.


        :param data: The data of this AppPreviewSetCreateRequest.
        :type data: AppPreviewSetCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data