from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_tester_create_request_data import BetaTesterCreateRequestData
from openapi_server import util

from openapi_server.models.beta_tester_create_request_data import BetaTesterCreateRequestData  # noqa: E501

class BetaTesterCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BetaTesterCreateRequest - a model defined in OpenAPI

        :param data: The data of this BetaTesterCreateRequest.  # noqa: E501
        :type data: BetaTesterCreateRequestData
        """
        self.openapi_types = {
            'data': BetaTesterCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BetaTesterCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTesterCreateRequest of this BetaTesterCreateRequest.  # noqa: E501
        :rtype: BetaTesterCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BetaTesterCreateRequestData:
        """Gets the data of this BetaTesterCreateRequest.


        :return: The data of this BetaTesterCreateRequest.
        :rtype: BetaTesterCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: BetaTesterCreateRequestData):
        """Sets the data of this BetaTesterCreateRequest.


        :param data: The data of this BetaTesterCreateRequest.
        :type data: BetaTesterCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
