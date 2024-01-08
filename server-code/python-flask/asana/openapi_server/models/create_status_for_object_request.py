from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.status_update_request import StatusUpdateRequest
from openapi_server import util

from openapi_server.models.status_update_request import StatusUpdateRequest  # noqa: E501

class CreateStatusForObjectRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """CreateStatusForObjectRequest - a model defined in OpenAPI

        :param data: The data of this CreateStatusForObjectRequest.  # noqa: E501
        :type data: StatusUpdateRequest
        """
        self.openapi_types = {
            'data': StatusUpdateRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'CreateStatusForObjectRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createStatusForObject_request of this CreateStatusForObjectRequest.  # noqa: E501
        :rtype: CreateStatusForObjectRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> StatusUpdateRequest:
        """Gets the data of this CreateStatusForObjectRequest.


        :return: The data of this CreateStatusForObjectRequest.
        :rtype: StatusUpdateRequest
        """
        return self._data

    @data.setter
    def data(self, data: StatusUpdateRequest):
        """Sets the data of this CreateStatusForObjectRequest.


        :param data: The data of this CreateStatusForObjectRequest.
        :type data: StatusUpdateRequest
        """

        self._data = data